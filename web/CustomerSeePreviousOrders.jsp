
<%@page import="PojoPackage.* , daoPackage.*" %>
<%@ page import="java.util.HashMap , java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Previous Orders Page</title>
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
        function ho()
        {
            window.location="CustomerOptions.jsp";
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
              String username = (String) session.getAttribute("username");
              System.out.println("The Username We Got: "+username);
              ArrayList<String> order_id = OrdersDao.getAllOrdersIdByUsername(username);
              System.out.println("The Orders ArrayList We Got :"+order_id);
              StringBuilder sb = new StringBuilder();
                sb.append("<table class='table table-success  mt-5 text-center table-hover'>");
                sb.append("<tr class='text-success table-secondary'><th>Order-ID</th><th>Restuarant-Name</th><th>Owner-Name</th><th>Order-Status</th><th></See-Order></tr>");
                int sum=0;
            for(String s: order_id)
            {
               // int price = DishDao.getPriceByDishName(s);
               // System.out.println(s+" "+price);   
                String supplier = OrdersDao.getSupplierNameByOrder_Id(s);
                String restuarant_name = RestuarantDao.getRestuarantNameByUsername(supplier);
                int status = OrdersDao.getStatusOfOrder(s);
                String sta = "";
                if(status==0)
                {
                    sta = "Order Placed";
                }
                else
                {
                    sta = "Order Completed";
                }
                    sb.append("<tr>");
                    sb.append("<td>"+s+"</td>");
                    sb.append("<td>"+ restuarant_name +"</td>");
                    sb.append("<td>"+supplier+"</td>");
                    sb.append("<td>"+sta+"</td>");
                    sb.append("<td><a href='SeePlacedOrder.jsp?order_id="+s+"'>See-Order</a></th>");
                    sb.append("</tr>");
                   
             }
                
                out.println(sb.toString());
            
            %>
         

    </div>
    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>