var username;
var password;
var city;
var state;
var usertype;
var checked;
var ajax;


var arrayList = ["Mp" , "Gujarat" , "Maharashtra" , "Goa" , "Up"];
var cityList = ["<option value='Bhopal'>Bhopal</option>","<option value='Ahmedabad'>Ahmedabad</option>","<option value='Mumbai'>Mumbai</option>","<option value='Panaji'>Panaji</option>","<option value='Ayodhya'>Ayodhya</option>"];
function signup()
{
    alert("The File Is Linked Successfully!!'");
    username = document.getElementById("username").value;
    password = document.getElementById("password").value;
    city = document.getElementById("city").value;
    state = document.getElementById("state").value;
    usertype=document.getElementById("usertype").value;
    checked = document.getElementById("checked").checked;
    alert(username);
    alert(password);
    alert(usertype);
    alert(city);
    alert(state);
    alert(checked);
    if(validate())
    {
        alert("details are validated successfully!!!!");
        ajax = new XMLHttpRequest();
        ajax.onreadystatechange = process;
        ajax.open("Get" , "SignUpControllerServlet?username="+username+"&password="+password+"&state="+state+"&city="+city+"&usertype="+usertype , true);
        ajax.send(null);
    }
    
}
function process()
{
    if(ajax.readyState===4)
    {
        var res = ajax.responseText;
        if(res.trim() === "success")
        {
            alert("Sign Up Complete");
            window.location="login.html";
        }
        else
        {
            alert("Username already present");
        }
    }
}
function validate()
{
    
    if(username==="")
    {
                alert("enter username!!");
                return;
    }
    if(password==="")
    {
        alert("enter password");
        return;
    }
    if(checked==false)
    {
        alert("Accept terms & Conditions!!!");
        return;
    }
    return true;
}
function getTheStates()
{
    alert("you Have Selected Another State");
    state = document.getElementById("state").value.trim();
    alert(state);
    var i;
    for( i=0;i<arrayList.length;i++)
    {
        if(arrayList[i] === state)
        {
            break;
        }
        
    }
    
    alert(cityList[i]);
    document.getElementById("city").innerHTML=cityList[i];
}