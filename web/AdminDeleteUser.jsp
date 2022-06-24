<%@ page import="java.util.*"%>
<%@page import="PojoPackage.* , daoPackage.*" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Options Page</title>
    <link rel="stylesheet" href="bootstrap.css">
    <style>
        img {
            height: 80%;
            border: 3px solid black;
        }
        
        body {
            background-image: url(bg8.jpg);
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
            font-family: 'Dancing Script', cursive;
            height: 90vh;
        }
          li {
            margin-left: 20px;
            margin-right: 20px;
        }
        
         a:hover {
            text-decoration: none;
        }
        .btn-warning{
            margin-top: 10px;
            margin-bottom: 10px;
        }
    </style>
    <script>
        var ajax;
        function del(a)
        {
            alert(a);
            name = a;
            ajax = new XMLHttpRequest();
            ajax.onreadystatechange = processResponse;
            ajax.open("GET" , "AdminDeleteUserControllerServlet?username="+a , false);
            ajax.send(null);
        }
        function con()
        {
            alert("In The con :"+name);
            document.getElementById(name).remove();
        }
       function processResponse()
        {
            if(ajax.readyState==4)
            {
                if(ajax.responseText)
                {
                    alert(ajax.responseText);
                    
                    con();
                    
                }
            }
        }
    </script>

</head>

 <nav class=" fixed-top navbar  bg-warning navbar-expand-sm">
        <a class="navbar-brand btn btn-danger ">Food Application</a>
        <ul class="navbar-nav ml-auto">
            <li class="navbar-item active"><a href="#" class="navbar-link btn-danger btn">Back</a></li>
            <li class="navbar-item"><a href="#" class="navbar-link btn btn-danger">Logout</a></li>


        </ul>

    </nav>


<body>
    <nav class=" fixed-top navbar  bg-warning navbar-expand-sm">
        <a class="navbar-brand btn btn-danger ">Food Application</a>
        <ul class="navbar-nav ml-auto">
            <li class="navbar-item active"><a href="#" class="navbar-link btn-danger btn">Back</a></li>
            <li class="navbar-item"><a href="#" class="navbar-link btn btn-danger">Logout</a></li>


        </ul>

    </nav>
    <div class="container mt-5 pt-5">
        <%
            String type = request.getParameter("type");
            System.out.println("type received in the admin delete user jsp : "+type);
            ArrayList<LoginPojo> al = LoginDao.getAllByType(type);
            if(al.size()==0)
            {
                
            }
            else
            {
                int total = al.size();
                StringBuilder sb = new StringBuilder();
                sb.append("<table class='table table-success  text-center table-hover'>");
                sb.append("<tr class='text-success table-secondary'><th>Username</th><th>State</th><th>City</th><th>Type</th><th>Delete</th></tr>");
                for(LoginPojo lp : al)
                {
                    sb.append("<tr id='"+lp.getUsername()+"'>");
                    sb.append("<td>"+lp.getUsername()+"</td>");
                    sb.append("<td>"+lp.getState()+"</td>");
                    sb.append("<td>"+lp.getCity()+"</td>");
                    sb.append("<td>"+lp.getType()+"</td>");
                    String f="'del(\""+lp.getUsername()+"\")'";
                    System.out.println("function to call as : "+f);
                    sb.append("<td class='btn btn-warning' onclick="+f+"> Click To Delete</td>");
                    sb.append("</tr>");
                }
                sb.append("</table>");
                out.println(sb.toString());
            }
            %>
         

    </div>
    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>