
<%@page import="PojoPackage.*,java.util.* , daoPackage.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="bootstrap.css" rel="stylesheet">
    <style>
        body,
        html {
            height: 100%;
        }
        
        body {
            background-image: url(bg8.jpg);
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
            background-attachment: fixed;
            font-family: 'Dancing Script', cursive;
        }
        
        img {
            height: 250px;
        }
        
        .card-img-top {
            width: 100%;
        }
        
        .card {
            background-color: #f1f1f1;
            width: 100%;
        }
        
        button {
            margin: 2px;
        }
        
        .des {
            text-align: center;
            height: 100px;
        }
        .price
        {
            text-align: center;
        }
        
        li {
            margin-left: 20px;
            margin-right: 20px;
        }
        .card-img{
            height: 400px;
            width: 100%;
            
        }
    </style>
    <script>
        username;
        ajax;
        function verify(a) {
            username = a;
           ajax = new XMLHttpRequest();
           ajax.onreadystatechange = processResponse;
           ajax.open("GET", "AdminVerifyRestuarantControllerServlet?username="+username , true);
           ajax.send(null);
        }
        function processResponse()
        {
            if(ajax.readyState ==4)
            {
                alert("The Response Has Come "+ajax.responseText);
                document.getElementById(username).remove();
            }
        }
    </script>
</head>

<body>
    <nav class=" fixed-top navbar  bg-warning navbar-expand-sm">
        <a class="navbar-brand btn btn-danger ">Food Application</a>
        <ul class="navbar-nav ml-auto">
            <li class="navbar-item active"><a href="#" class="navbar-link btn-danger btn">Back</a></li>
            <li class="navbar-item"><a href="#" class="navbar-link btn btn-danger">Logout</a></li>


        </ul>

    </nav>
    
    


    <%
       
            ArrayList<RestuarantPojo> al = RestuarantDao.getAllRestuarant();
            if(al.size()==0)
            {
                
            }
            else
            {
                int id=1;
                StringBuilder sb = new StringBuilder();
                sb.append(" <div class='container  d-flex justify-content-center mt-5'><div class='row  justify-content-center col-lg-12'>");
                for(RestuarantPojo rp : al)
                {
                    
                    
                    sb.append("<div class='col-lg-4 mt-3 d-flex justify-content-center ' id='"+rp.getUsername()+"'><div class='card col-lg-12 bg-dark'>");
                    sb.append("<img class='card-img-top rounded-circle' src='images/"+rp.getImage()+"'>");
                    sb.append("<div class='card-body text-warning'><div class='card-title text-center text-danger'>"+rp.getRestuarant_name()+"</div>");
                    sb.append("<div class='card-subtitle text-muted mb-3 text-center'>"+rp.getUsername()+"</div>");
                    sb.append("<div class='card-text'><div class='des'>"+rp.getDescription()+"</div>");
                    String ver = "'verify(\""+rp.getUsername()+"\")'";
                    sb.append("<div class='text-center'><input type='button' value='Verify Restuarant' class='btn btn-primary' onclick="+ver+"></div>");
                    sb.append("</div></div></div></div>");
                 
                 
                    
                            
                }
                sb.append("</div></div>");
                 out.println(sb);
            }
           
            
            
        
    
    %> 
    
     
    
    
    
    
    

    <script src="Jquery.js">
    </script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>