<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="bootstrap.css" rel="stylesheet">
    <style>
         li {
            margin-left: 20px;
            margin-right: 20px;
        }
        
        body {
            background-image: url(bg8.jpg);
            background-repeat: no-repeat;
            background-position: center;
            background-size: cover;
            font-family: 'Dancing Script', cursive;
        }
    </style>
    <script src="SupplierAddRestuarant.js"></script>


</head>

<body>
     <nav class=" fixed-top navbar  bg-warning navbar-expand-sm">
        <a class="navbar-brand btn btn-danger ">Food Application</a>
        <ul class="navbar-nav ml-auto">
            <li class="navbar-item active"><a href="#" class="navbar-link btn-danger btn">Back</a></li>
            <li class="navbar-item"><a href="#" class="navbar-link btn btn-danger">Logout</a></li>


        </ul>

    </nav>

    <div class="container col-lg-4 col-sm-12 bg-dark  pt-5 text-warning" style="z-index: 2;">
        <div class="text-center"><img src="add_restuarant.jpg" style="height:80px; width: 80px;"></div>
        <h2 class="text-danger text-center">Add Restuarant Details:</h2>
        <hr> Enter Restuarant Name:

        <input type="text" class="col-lg-12 form-control" id="restuarant_name">
        <br> Select Restuarant State:
        <select class="form-control" disabled="disabled">
            <option  selected=""><%=session.getAttribute("state")%></option>
        </select>
        <br>Select Restuarant City:
        <select class="form-control" disabled="disabled">
            <option value=""><%=session.getAttribute("city")%></option>
           
        </select>
        <br> Enter The Description About Restuarant:
        <textarea class="form-control col-lg-12" cols="10" rows="6" id="desc"></textarea>



        <br> Upload Image Of The Restuarant:
        <div class="btn btn-success col-lg-12 mb-3" style="text-align: left;"><span>Select Image</span><input type="file" class="" value="Upload" style="opacity: 0;" id="image" accept="image/jpeg"></div>
        <input type="button" class="btn btn-success col-lg-12 mb-3" onclick="addRestuarant()" value="Add Restuarant">






    </div>




    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>