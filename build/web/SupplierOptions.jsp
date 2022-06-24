<%@page import="daoPackage.RestuarantDao"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Supplier Options</title>
    <link rel="stylesheet" href="bootstrap.css">
    <style>
        li {
            margin-left: 20px;
            margin-right: 20px;
        }
        
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
        }
        
        a:hover {
            text-decoration: none;
        }
        
       
         <%
             String value="none";
                     
            String username = (String )session.getAttribute("username");
            int status = RestuarantDao.isRestuarantPresent(username);
            if(status!=-1)
            {
                System.out.println("In The SupplierOption.jsp The Restuarant is already Present status: "+status);
                out.println("#add{opacity:0.5;pointer-events:none}");
                if(status==0)
                {
                    
                      System.out.println("The Restuarant Is Present But The Admin Has not Verified The Restuarant!!!!!");
                     out.println("#manage,#orders{opacity:0.5;pointer-events:none}");
                     value="block";
                }
                
               
              
            }
            else
            {
                System.out.println("In The SuppplierOptions.jsp The Restuarant is not Present");
                out.println("#manage,#orders{opacity:0.5;pointer-events:none}");
            }
         
            
        %>
         
    </style>
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

    <div class="container mt-5">

        <div class="row  d-flex justify-content-center  mt-5 pt-3">
            <div class="col-lg-4 mt-5" id="add">
                <a href="AddRestuarant.jsp">
                    <img src="SupplierAddRestuarant.png" class="col-lg-12">
                    <h2 class="caption text-center bg-dark text-warning">Add Restuarant</h2>

                </a>
            </div>

            <div class="col-lg-4 mt-5" id="manage">
                <a href="SupplierManageRestuarant.jsp">
                    <img src="SupplierManageRestuarant.jpg" class="col-lg-12">
                    <h2 class="caption text-center bg-dark text-warning">Manage Restuarant</h2>

                </a>
            </div>

            <div class="col-lg-4 mt-5 " id="orders">
                <a href="SupplierSeeOrders.jsp">
                    <img src="SupplierOrders.png" class="col-lg-12">
                    <h2 class="caption text-center bg-dark text-warning">Orders</h2>

                </a>
            </div>
        </div>

    </div>
           
    
    
    <div class="bg-warning text-center  mb-3 container" id="message" style='display:<%=value%>;'>Your Restuarant Appliction Is Still Pending For The Verification.</div>
    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>