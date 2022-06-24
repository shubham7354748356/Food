
<%@page import="PojoPackage.*,java.util.* , daoPackage.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Delete Dish</title>
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
        String username = (String)session.getAttribute("username");
        System.out.println("Fetched Username "+username);
      /*  RestuarantPojo rp = RestuarantDao.getRestuarantByUsername(username);
        System.out.println("Got The rp:"+rp.toString());*/
        String state = (String)session.getAttribute("state");
        String city = (String) session.getAttribute("city");
        System.out.println("Fetched state: "+state);
        System.out.println("Fetched city: "+city);
        RestuarantPojo rp = RestuarantDao.getRestuarantByUsername(username);
        System.out.println(rp);
        System.out.println("Restuarant Details Fetched");
        
       
        %>
<div class="card container-fluid bg-dark mt-5">
        <div class="row" style="">
            <div class="col-lg-7 pt-3"> <img class="card-img" src='images/<%=rp.getImage()%>'></div>
            <div class="col-lg-5 mt-3">
                <div class="card-body text-warning">
                    <div class="card-title text-center"><%=rp.getRestuarant_name()%></div>
                    <div class="card-subtitle text-muted text-center" > <%=state%>,<%=city%> </div>
                    
                    <div class="card-text des"> <%=rp.getDescription()%></div>
                        
                </div>
            
            
            </div>
        </div>
        
    
</div>

    <%
        if(rp!=null)
        {
            ArrayList<DishPojo> al = DishDao.getAllDishByUsername(username);
            if(al.size()==0)
            {
                
            }
            else
            {
                int id=1;
                StringBuilder sb = new StringBuilder();
                sb.append(" <div class='container  d-flex justify-content-center mt-3'><div class='row  justify-content-center col-lg-12' id='main' >");
                for(DishPojo dp : al)
                {
                    
                   /* sb.append("<div class='col-lg-4 bg-success'><div class='col-lg-12 bg-danger'>This Is The Data</div></div>");
                    sb.append("<div class='col-lg-4 bg-success'><div class='col-lg-12 bg-danger'>This Is The Data</div></div>");
                    sb.append("<div class='col-lg-4 bg-success'><div class='col-lg-12 bg-danger'>This Is The Data</div></div>");*/
                    sb.append("<div class='col-lg-4 mt-3 d-flex justify-content-center' id='"+dp.getDish_name()+"' ><div class='card col-lg-12 bg-dark'>");
                    sb.append("<img class='card-img-top rounded-circle' src='images/"+dp.getImage()+"'>");
                    sb.append("<div class='card-body text-warning'><div class='card-title text-center text-danger'>"+dp.getDish_name()+"</div>");
                    sb.append("<div class='card-subtitle text-muted mb-3 text-center'>"+state+", "+city+"</div>");
                    sb.append("<div class='card-text'><div class='des'>"+dp.getDescription()+"</div><div class='mt-3 text-primary price'>Price :"+dp.getPrice()+"</div>");
                    String fun="'del(\""+dp.getDish_name()+"\")'";
                    System.out.println(fun);
                    sb.append("<div class='d-flex justify-content-center mt-2'><input type='button' class='btn btn-primary d-flex justify-content-center' value='Delete' onclick="+fun+"></div></div></div></div></div>");
                      
                 /*   sb.append("<div class='col-lg-4 mt-3 d-flex justify-content-center bg-success'><div class='card col-lg-12 bg-dark'>");
                    sb.append("<img class='card-img-top rounded-circle' src='images/bg3.jpg'>");
                    sb.append("<div class='card-body text-warning'><div class='card-title text-center text-danger'>This Is The Title Of The Card</div>");
                    sb.append("<div class='card-subtitle text-muted mb-3 text-center'>This Is The Subtitle Of The Card</div>");
                    sb.append("<div class='card-text'>this is the description</div></div></div></div>");
                    
                      
                    sb.append("<div class='col-lg-4 mt-3 d-flex justify-content-center bg-success'><div class='card col-lg-12 bg-dark'>");
                    sb.append("<img class='card-img-top rounded-circle' src='images/bg3.jpg'>");
                    sb.append("<div class='card-body text-warning'><div class='card-title text-center text-danger'>This Is The Title Of The Card</div>");
                    sb.append("<div class='card-subtitle text-muted mb-3 text-center'>This Is The Subtitle Of The Card</div>");
                    sb.append("<div class='card-text'></div></div></div></div>");*/
                    
                            
                }
                sb.append("</div></div>");
                 out.println(sb);
            }
           
            
            
        }
    
    %> 
    
     
    
    
    
    
     <script src="DeleteDish.js">
         
    </script>

    <script src="Jquery.js">
    </script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>