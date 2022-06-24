<!DOCTYPE html>
<html lang="en">
    
    
    <% 
        String state = (String)session.getAttribute("state");
        String city = (String) session.getAttribute("city");
    
    %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="bootstrap.css" rel="stylesheet">
    <style>
        #img {
            width: 100%;
        }
    </style>
</head>

<body class="bg-dark">
    <div class="container-fluid">
        <div>
            <nav class=" navbar fixed-top navbar-dark navbar-expand-sm d-flex justify-content-center bg-danger">
                <!--  <a href="#" class="navbar-brand">Shubham Rajput</a>-->
                <ul class="navbar-nav">
                    <li class="navbar-item">
                        <a href="#" class="navbar-link mr-3 text-white">Add Restuarant </a>
                    </li>
                    <li class="navbar-item">
                        <a href="#" class="navbar-link mr-3 text-white">Your Cart</a>
                    </li>
                    <li class="navbar-item">
                        <a href="#" class="navbar-link mr-3 text-white">Wish List</a>
                    </li>
                    <li class="navbar-item">
                        <a href="#" class="navbar-link mr-3 text-white">Previous Orders</a>
                    </li>





                </ul>

            </nav>

        </div>
        <img src="image5.jpeg" id="img" style="height: 400px;">
    </div>
    <div class="h3 text-center mt-3 text-white"><u>Your Location State:<%=state%> / City<%=city%> </u></div>





    <div class="container-fluid mt-3">
        <div class="row d-flex justify-content-center">

            <div class="card col-lg-3 col-md-6 col-sm-8 mt-3 bg-danger mr-3">
                <img src="image5.jpeg" class="card-img mt-3">
                <div class=" text-center text-white">
                    <h4 class="card-title">This Is Card Title</h4>
                    <p class="card-body "> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                </div>
            </div>

            <div class="card col-lg-3 col-md-6 col-sm-8 mt-3 bg-danger mr-3">
                <img src="image1.jpg" class="card-img mt-3">
                <div class=" text-center text-white">
                    <h4 class="card-title">This Is Card Title</h4>
                    <p class="card-body "> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                </div>
            </div>

            <div class="card col-lg-3 col-md-6 col-sm-8 mt-3 bg-danger mr-3">
                <img src="image1.jpg" class="card-img mt-3">
                <div class=" text-center text-white">
                    <h4 class="card-title">This Is Card Title</h4>
                    <p class="card-body "> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                </div>
            </div>

            <div class="card col-lg-3 mr-3 col-md-6 col-sm-8 mt-3 bg-danger">
                <img src="image1.jpg" class="card-img mt-3">
                <div class=" text-center text-white">
                    <h4 class="card-title">This Is Card Title</h4>
                    <p class="card-body "> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                </div>
            </div>

            <div class="card col-lg-3 mr-3 col-md-6 col-sm-8 mt-3 bg-danger">
                <img src="image1.jpg" class="card-img mt-3">
                <div class=" text-center text-white">
                    <h4 class="card-title">This Is Card Title</h4>
                    <p class="card-body "> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                </div>
            </div>

            <div class="card col-lg-3 mr-3 col-md-6 col-sm-8 mt-3 bg-danger">
                <img src="image1.jpg" class="card-img mt-3">
                <div class=" text-center text-white">
                    <h4 class="card-title">This Is Card Title</h4>
                    <p class="card-body "> This is The Best product Of That Area. Definitely You Can Get The Best Of The Taste And Along with That get Anything more...</p>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                    <button class="btn btn-info mb-3"> Add To WishList</button>
                </div>
            </div>






        </div>
    </div>




    <div class="text-white bg-warning text-center fixed-bottom" style="opacity: 1;">This Will Be fixed At The Bottom Of Our Application in All Pages....</div>



    <script src="Jquery.js"></script>
    <script src="bootstrap.bundle.js"></script>
</body>

</html>