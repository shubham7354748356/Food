
var username1;
var password1;
var checked;
var ajax;

function loginFunction() {
    //alert("button is pressed successfully");
    username1 = document.getElementById("username").value;
     username2 = $("#username").val();
   // alert(username1 + " " + username2);


    password1 = document.getElementById("password").value;
     password2 = $("#password").val();
   // alert(password1 + " " + password2);

    checked = document.getElementById("checkbox").checked;
   // alert(checked);
    if (validate()) {
      //  alert("The form Is Validated Successfully");
        ajax = new XMLHttpRequest();
        ajax.onreadystatechange = process;
        ajax.open("Get", "LoginControllerServlet?username=" + username1 + "&password=" + password1, true);
        ajax.send(null);
    }

}

function process() {
    swal("Admin" , "Process Response Called" , "success");
   if(ajax.readyState==4)
   {
       var res = ajax.responseText.trim();
       if(res==='fail')
       {
           swal("The Login Is Failed","cool");
       }
       else
       {
           //alert(res+" Because The Cridentials Are correct");
           swal("login","cool");
           window.location=res;
       }
   }
}

function validate() {
    if (username1 === "") {
        alert("please enter username");
        return false;
    }
    if (password1 === "") {
        alert("please enter password");
        return false;
    }
    if (checked === false) {
        alert("please select the check box")
        return false;
    }
    return true;
}