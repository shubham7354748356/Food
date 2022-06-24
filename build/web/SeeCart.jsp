
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
            alert("Add function got values: "+a);
            alert("The Number Of Counting Is: "+count);
         /*ajax = new XMLHttpRequest();
            ajax.onreadystatechange = processResponse;
         ajax.open("GET" , 'ConfirmOrder.jsp?str="+a' ,true);
            ajax.send(null);*/
        
           
            window.location = "ConfirmOrder.jsp?str=" +a+"&username=<%= request.getParameter("username") %>";
        
        }
        function processResponse()
        {
            if(ajax.readyState == 4)
            {
                alert(ajax.responseText);
                //window.location = "CustomersSeeMenu.jsp?username="+ajax.responseText;
            }
        }
        
        var arr = [];
        
        function increase(a)
        {
            alert(a);
            for( i=0;i<arr.length;i++)
            {
                if(arr[i] === a)
                {
                    alert("already present: "+a);
                     var quantity = parseInt(document.getElementById(a+"-quan").innerText);
                    document.getElementById(a+"-quan").innerHTML="";
                    document.getElementById(a+"-quan").innerHTML=(quantity+1);
                    alert(quantity);
                    return;
                }
                
            }
            arr.push(a);
            alert("Added In the Array Successfully: "+arr);
            var quantity = parseInt(document.getElementById(a+"-quan").innerText);
            document.getElementById(a+"-quan").innerHTML="";
            document.getElementById(a+"-quan").innerHTML=(quantity+1);
            alert(quantity);
        }
        function decrease(a)
        {
            alert(a);
            for(i=0;i<arr.length;i++)
            {
                if(arr[i] === a)
                {
                    alert("We Found the item in the array");
                    var quantity = parseInt(document.getElementById(a+"-quan").innerText);
                    if(quantity === 1)
                    {
                        document.getElementById(a+"-quan").innerHTML="";
                        document.getElementById(a+"-quan").innerHTML=(quantity-1);
                        delete arr[i];
                        alert("Now Reduced Array: "+arr);
                    }
                    else
                    {
                        document.getElementById(a+"-quan").innerHTML="";
                        document.getElementById(a+"-quan").innerHTML=(quantity-1);
                        alert("After reduction array: "+arr);
                    }
                    
                }
            }
        }
        var sen="";
        var count=0;
        function con()
        {
            alert("continue called successfully:");
            for(a=0;a<arr.length;a++)
            {
                
                if(arr[a] === undefined)
                {
                    console.log("undefined value got");
                    continue;
                }
                count++;
                console.log("No Continue: "+arr[a]+" "+document.getElementById(arr[a]+"-quan").innerText);
                sen  = sen+"-"+arr[a].trim()+"-"+document.getElementById(arr[a]+"-quan").innerText+"-";
            }
            console.log("Concating value: "+sen);
            add(sen);
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
        HashSet<String> hs = (HashSet)session.getAttribute("list");
        String username = request.getParameter("username");
        System.out.println("SeeCart.jsp: "+username);
        
        if(hs.size()==0)
        {
            out.println("Noting in the cart");
            System.out.println("Nothing In the cart");
        }
        else
        {
            StringBuilder sb = new StringBuilder();
            sb.append("<u><h2 class='mt-5 pt-3 text-center text-success ' >Select The Dish And Its Quantity</h2></u>");
            sb.append("<div class='container d-flex justify-content-center mt-2'> <div class='row justify-content-center  col-lg-12'>");
             for(String str : hs)
            {
                    DishPojo dp = DishDao.getDishByName(str);
                    System.out.println("From The Str We Got: "+dp);
                    sb.append("<div class=' col-lg-7 mt-3 d-flex justify-content-center'><div class='card col-lg-12 bg-dark'><img class='card-img-top rounded-circle' src='images/"+dp.getImage()+"'>");
                    sb.append("<div class='card-body text-warning'>");
                    sb.append("<div class='card-title text-center text-danger'>"+dp.getDish_name()+"</div>");
                    sb.append("<div class='card-subtitle text-muted mb-3 text-center'>"+dp.getPrice()+"</div>");
                    sb.append("<div class='card-text text-center'>"+dp.getDescription()+"</div>");
                    String increment="increase(\""+dp.getDish_name()+"\")";
                    String decrement="decrease(\""+dp.getDish_name()+"\")";
                    sb.append("<div class='text-center mt-2'>Quantity:<button onclick='"+increment+"' class='btn btn-success'>+</button><span class='bg-success' id='"+dp.getDish_name()+"-quan'> 0 </span><button class='btn btn-success' onclick='"+decrement+"'>-</button></div>");
                    sb.append("</div></div></div>");
                    
                    
                   
                                    
            }
            
           
            sb.append("<div></div>");
           out.println("<button class='btn btn-success mt-5'onclick='con()'>continue</button>");
             out.println(sb.toString());   
               
                
                
        }
    %>
        
    
            
          

            
            


       

    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>