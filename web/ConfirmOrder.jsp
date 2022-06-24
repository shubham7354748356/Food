
<%@page import="PojoPackage.* , daoPackage.*" %>
<%@ page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Confimr Order Page</title>
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
        var ajax;
        function orderConfirmed(a)
        {
            alert('Order Confirmed');
            alert('received value of a: '+a);
            ajax = new XMLHttpRequest();
            ajax.onreadystatechange = processResponse;
            ajax.open("GET" , "CustomerOrderReceivedServlet?str="+a+"&username=<%=request.getParameter("username")%>" , false);
            ajax.send(null);
            document.getElementById("popper").innerHTML="";
            document.getElementById("popper").innerHTML = "<span class=' btn btn-success text-white' disbaled>Order Confirmed</span><br><br><span class=' btn btn-success text-white' onclick='ho()'>Visit Home Page:</span>";
        }
       
       function processResponse()
        {
            if(ajax.readyState==4)
            {
                if(ajax.responseText)
                {
                    alert(ajax.responseText);
                    
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
            String str = request.getParameter("str");
            System.out.println("Received Value Of str: "+str);
            HashMap<String , Integer> hm = new HashMap<>();
            String [] arr = str.split("-");
            for(int i=0;i<arr.length;i++)
            {
                String x = arr[i].trim();
                if(x.equals(""))
                {
                    continue;
                }
                else
                {
                    hm.put(x , Integer.parseInt(arr[i+1]));
                    i++;
                }
            }
            System.out.println(hm);
           // out.println(hm);
              StringBuilder sb = new StringBuilder();
                sb.append("<table class='table table-success  mt-5 text-center table-hover'>");
                sb.append("<tr class='text-success table-secondary'><th>Dish Name</th><th>Price</th><th>Quantity</th><th>Total</th></tr>");
                int sum=0;
            for(String s:hm.keySet())
            {
                int price = DishDao.getPriceByDishName(s);
                System.out.println(s+" "+price);   
                    sb.append("<tr>");
                    sb.append("<td>"+s+"</td>");
                    sb.append("<td>"+price+"</td>");
                    sb.append("<td>"+hm.get(s)+"</td>");
                    sb.append("<td>"+(price*hm.get(s))+"</td>");
                    sb.append("</tr>");
                    sum+= (price*hm.get(s));
                }
                 sb.append("<tr class='table-secondary'>");
                    sb.append("<td>Total></td>");
                    sb.append("<td></td>");
                    sb.append("<td></td>");
                    sb.append("<td>"+(sum)+"</td>");
                    sb.append("</tr>");
            
                sb.append("</table>");
                sb.append("<div id='popper' class=' text-center'> <button class='btn btn-success' onclick='orderConfirmed(\""+str+"\")'>Confirm Order</button> </div>");
                out.println(sb.toString());
            
            %>
         

    </div>
    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>