var restuarant_name;
var description;
var ajax;
function addRestuarant()
{
    alert("Add Restuarant Java Script File");
    restuarant_name = document.getElementById("restuarant_name").value;
    description = $("#desc").val();
    alert(description);
    
    if(validate())
    {
        alert("All The Fields Are Verified Successfully");
        ajax = new XMLHttpRequest();
        ajax.onreadystatechange=processResponse;
        var data = new FormData();
        data.append("restuarant_name" , restuarant_name);
        data.append("description" , description);
        var image = document.querySelector("#image").files[0];
        data.append("image" , image);
        ajax.open("POST" , "SupplierAddRestuarantControllerServlet");
        ajax.send(data);
    }
}
function processResponse()
{
    if(ajax.readyState==4)
    {
        alert(ajax.responseText);
        if(ajax.responseText.trim()==="success")
        {
            alert("In The window Location ");
            window.location="SupplierOptions.jsp";
        }
    }
}
function validate()
{
    alert("In The Validate Function");
    if(restuarant_name==="")
    {
        alert("Please Enter UserName");
        return false;
    }
    if(description==="")
    {
        alert("Please Enter The Description For The Restuarant");
        return false;
    }
    if(description.split(" ").length<5)
    {
        alert("Description should Be more Than 50 Words");
        return false;
    }
    return true;
}
