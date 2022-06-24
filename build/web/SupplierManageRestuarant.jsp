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
        
       
    </style>
    <script src="AdminOptions.js">
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
            <div class="col-lg-4 mt-5">
                <a href="AddDish.jsp">
                    <img src="Add_Dish.png" class="col-lg-12">
                    <h2 class="caption text-center bg-dark text-warning">Add Dish</h2>

                </a>
            </div>

            <div class="col-lg-4 mt-5">
                <a href="DeleteDish.jsp">
                    <img src="Delete_Dish.png" class="col-lg-12">
                    <h2 class="caption text-center bg-dark text-warning">Delete Dish</h2>

                </a>
            </div>

            <div class="col-lg-4 mt-5">
                <a href="SupplierSeeMenu.jsp">
                    <img src="See_Menu.png" class="col-lg-12">
                    <h2 class="caption text-center bg-dark text-warning"> See Menu</h2>

                </a>
            </div>
        </div>

    </div>
    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>