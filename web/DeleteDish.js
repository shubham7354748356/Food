var ajax;
function del(a)
{
    alert("In the external file deleted is called successfully "+a);
    document.getElementById(a).remove();
    ajax = new XMLHttpRequest();
   // ajax.onreadystatechange = processResponse;
    /*var data = new FormData();
    data.append("di" , a.toString());
    ajax.open("GET" , "DeleteDishControllerServlet?dish_name="+a , true);
    ajax.send(null);*/
    $.get("DeleteDishControllerServlet?dish_name="+a,processResponse);
    
    
    
    if(document.getElementById("main").childElementCount == 0 )
    {
        alert("All The Element Are Now Deleted");
    }
}
function processResponse(responseText)
{
    
    if(responseText.trim() == 'success')
    {
        alert("we got the success");
    }
    else
    {
        alert("unable to delete the dish");
    }
}

