
<%@page import="daoPackage.DishDao"%>
<%@ page import="java.util.* , PojoPackage.RestuarantPojo , daoPackage.RestuarantDao , PojoPackage.DishPojo"%>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="bootstrap.css" rel="stylesheet">
    <title>Document</title>
    <style>
        body {
            background-image: url(bg8.jpg);
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
            font-family: 'Dancing Script', cursive;
            background-attachment: fixed;
        }
        
        image {
            width: 200px;
        }
        
        td {
            text-align: center;
        }
    </style>
    
    <script>
        var ajax;
        
        function add(a) {
            alert(a);
            ajax = new XMLHttpRequest();
            ajax.onreadystatechange = processResponse;
            ajax.open("Get" , a , true);
            ajax.send(null);
        }
        function processResponse()
        {
            if(ajax.readyState == 4)
            {
                alert(ajax.responseText);
                window.location = "CustomersSeeMenu.jsp?username="+ajax.responseText;
            }
        }
    </script>
</head>

<body>

    <nav class=" fixed-top navbar  bg-warning navbar-expand-sm">
        <a class="navbar-brand btn btn-danger ">Food Application</a>
        <ul class="navbar-nav ml-auto">
            <li class="navbar-item active"><a href="SeeCart.jsp?username=<%=request.getParameter("username")%>" class="navbar-link btn-danger btn">See Cart</a></li>
            <li class="navbar-item active"><a href="#" class="navbar-link btn-danger btn">Back</a></li>
            <li class="navbar-item"><a href="#" class="navbar-link btn btn-danger">Logout</a></li>


        </ul>

    </nav>
    
    
    <%
        String username = request.getParameter("username");
        System.out.println("Username We Got : "+username);
        ArrayList<DishPojo> al = DishDao.getAllDishByUsername(username);
        HashSet<String> list = (HashSet)session.getAttribute("list");
        System.out.println("A List From The Session : "+list);
        
        if(al.size()==0)
        {
            
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            sb.append("<div class='container d-flex justify-content-center mt-5'> <div class='row justify-content-center  col-lg-12'>");
           
                
               
                
                for(DishPojo dp : al)
                {
                    
                  
                    sb.append("<div class='col-lg-4 mt-3 d-flex justify-content-center '><div class='card col-lg-12 bg-dark'>");
                    sb.append("<img class='card-img-top rounded-circle' src='images/"+dp.getImage()+"'>");
                    sb.append("<div class='card-body text-warning text-center'><div class='card-title text-center text-danger'>"+dp.getDish_name()+"</div>");
                  
                    sb.append("<div class='card-text'><div class='des'>"+dp.getDescription()+"</div><div class='mt-3 text-primary price'>Price :"+dp.getPrice()+"</div></div></div>");
                    if(list.contains(dp.getDish_name()))
                       sb.append("<div class='text-center'><button class='btn btn-primary' disabled>Added To Card</button></div></div></div>");
                    else
                    {
                        String url = "CustomerAddToCartControllerServlet?dish_name="+dp.getDish_name()+"&Supplier="+username;
                        sb.append("<div class='text-center mb-2'><button class='btn btn-primary' onclick='add(\""+url+"\")'>Add To Card</button></div></div></div>");
                    }
                                    
                }
                sb.append("</div></div>");
                out.println(sb);
            
        }
    %>
        
    
            
          

            
            


       

    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>