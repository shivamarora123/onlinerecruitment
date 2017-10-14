<%@ page  import="java.sql.*" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/login.css">
<title>Login:Online Recuritment</title>
</head>
<h1>Login Page</h1>
<body background="images/login.jpg">
<div class="LoginModule">
<form id="LoginForm" method="Post"action="login">
    <div class="row">
        
    <label for="username">UserName:</label>
    <input type="text" id="username" name="loginid">
    </div>
    <br>
    <div class="row">
    <label for="userpass">Password:</label>
    <input type="text" id="userpass" name="loginpass">
    </div>
     <br>
    <div>
    <input type="radio"name="status"value="admin">Admin
    <input type="radio"name="status"value="user">User
    <input type="radio"name="status"value="company">Company
      </div>
    <br>
    <div class="row">
    <button type="submit"name="loginsubmit">Login</button>
      </div>
 
        
    </form> 
    </div>
</body>
</html>