var dish_name;
var description;
var ajax;
var image;
var price;
function addDish()
{
    alert("Add Dish Function Called Successfully!!!");
    if(validate())
    {
        alert("Successfully Validated All The Details");
        image = document.querySelector("#image").files[0];
        var data = new FormData();
        data.append("dish_name" , dish_name);
        data.append("description" , description);
        data.append("price" , price);
        data.append("image" , image);
        
        ajax = new XMLHttpRequest();
        ajax.onreadystatechange = processResponse;
        ajax.open("POST" , "AddDishControllerServlet");
        ajax.send(data);
    }
}
function processResponse()
{
    if(ajax.readyState ==4)
    {
        alert(ajax.responseText);
        if(ajax.responseText.trim() === "success")
        {
            alert("Dish Added Successfully");
            window.location = "SupplierManageRestuarant.jsp";
        }
    }
}
function validate()
{
    dish_name = document.getElementById("dish_name").value;
    description = document.getElementById("desc").value;
    price = document.getElementById("price").value;
    alert(dish_name);
    alert(price);
    alert(description);
    if(dish_name === "")
    {
        alert("Please Enter Dish_name");
        return false;
    }
    if(price === "")
    {
        alert("Please Enter Dish Amount");
        return false;
    }
    if(description === "")
    {
        alert("Please Enter description!!!");
        return false;
    }
    return true;
}