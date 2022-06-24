
<%@page import="daoPackage.DishDao"%>
<%@ page import="java.util.* , PojoPackage.RestuarantPojo , daoPackage.RestuarantDao , PojoPackage.DishPojo , daoPackage.OrdersDao"%>
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
       String order_id = request.getParameter("order_id");
       System.out.println("Going To Fetch Order Details For: "+order_id);
       ArrayList<HashMap<String , Integer>> al  = OrdersDao.getAllDishByOrderId(order_id);
       if(al.size()==0)
       {
           
       }
       else
       {
           System.out.println("we Got the List: "+al);
            StringBuilder sb = new StringBuilder();
           sb.append(" <div class='container  d-flex justify-content-center mt-5'><div class='row  justify-content-center col-lg-12'>");
           
                
               
                
                for(HashMap<String , Integer> hm : al)
                {
                    
                    for(Map.Entry<String , Integer> set : hm.entrySet())
                    {
                        System.out.println("Inner for Loop Iteration");
                        System.out.println(set.getKey() +" "+set.getValue());
                        String dish_name = set.getKey();
                        int quantity = set.getValue();
                    
                        DishPojo dp = DishDao.getDishByName(dish_name);
                        System.out.println("Here We Are With The Dish Pojo: "+dp);
                              
                
                  
                    sb.append("<div class='col-lg-4 mt-3 d-flex justify-content-center '><div class='card col-lg-12 bg-dark'>");
                    sb.append("<img class='card-img-top rounded-circle' src='images/"+dp.getImage()+"'>");
                    sb.append("<div class='card-body text-warning'><div class='card-title text-center text-danger'>"+dp.getDish_name()+"</div>");
                    //sb.append("<div class='card-subtitle text-muted mb-3 text-center'>"+state+", "+city+"</div>");
                    sb.append("<div class='card-text text-center'><div class='des'>"+dp.getDescription()+"</div><div class='mt-3 text-primary price'>Price :"+dp.getPrice()+"</div><div>Quantity: "+quantity+"</div></div></div></div></div>");
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