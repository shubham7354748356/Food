
<%@ page import="java.util.* , PojoPackage.RestuarantPojo , daoPackage.RestuarantDao"%>
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
        function del(a) {
            alert(a);
            document.getElementById(a).remove();
            alert(" Parent Element Count: " + document.querySelector("table")[0].childElementCount);
        }
    </script>
</head>

<body>

    <nav class=" fixed-top navbar  bg-warning navbar-expand-sm">
        <a class="navbar-brand btn btn-danger ">Food Application</a>
        <ul class="navbar-nav ml-auto">
            <li class="navbar-item active"><a href="CustomerSeePreviousOrders.jsp" class="navbar-link btn-danger btn">Orders</a></li>
            <li class="navbar-item active"><a href="#" class="navbar-link btn-danger btn">Back</a></li>
            <li class="navbar-item"><a href="#" class="navbar-link btn btn-danger">Logout</a></li>


        </ul>

    </nav>
    
    <%
        String state = (String) session.getAttribute("state");
        String city = (String) session.getAttribute("city");
        System.out.println("Customer Options: "+state);
        System.out.println("Customer Options: "+city);
        HashSet<String> hs = new HashSet<>();
        session.setAttribute("list" , hs);
        System.out.println("A session for the list is setted successfully");
        
        ArrayList<RestuarantPojo> al = RestuarantDao.getAllRestuarantByStateAndCity(state , city);
            if(al.size()==0)
            {
                
            }
            else
            {
                StringBuilder sb = new StringBuilder();
                sb.append("<div class='container mt-3 pt-5'><table id='table1' class='table table-success table-bordered  table-hover text-center col-lg-12'><tr class='table-secondary text-success col-lg-12'>");
                sb.append("<th class='col-lg-5'>Restuarant Image</th> <th class='col-lg-2'>Restuarant Name</th><th class='col-lg-3'>Description</th><th class='col-lg-2'>See Menu</th></tr>");
                for(RestuarantPojo rp : al)
                {
                    sb.append("<tr id='1'> <td class='col-lg-5'>  <image src='images/"+rp.getImage()+"' class='col-lg-12'></image></td>");
                    sb.append("<td class='col-lg-2 pt-5'>"+rp.getRestuarant_name()+"</td>");
                    sb.append(" <td class='col-lg-3 pt-5'>"+rp.getDescription()+"</td><td class='col-lg-2 pt-5'><a href='CustomersSeeMenu.jsp?username="+rp.getUsername()+"'>See Menu</a></td>");
                }
                sb.append(" </table></div>");
                out.println(sb.toString());
                
            }
    %>
        
    
            
          

            
            


       

    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>