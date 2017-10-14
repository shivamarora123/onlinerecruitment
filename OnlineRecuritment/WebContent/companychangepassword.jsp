<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
if(session.getAttribute("usernamec")==null){
	response.sendRedirect("index.html");
}
%>
<%@ include file="companyside.html" %>  
<%@ include file="companynav.html" %>  
<%@ page import="java.sql.*" %>
<!DOCTYPE html>

<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    

    <title>Password Change</title>

    <!-- Bootstrap core CSS -->
    <link href="./dashboard%20files/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="./dashboard%20files/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./dashboard%20files/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="./dashboard%20files/ie-emulation-modes-warning.js.download"></script>

	<!-- custom css for side bar -->
	<link rel="stylesheet" href="dashboard%20files/sidebar.css">
	<script src="js/hello.js"></script>
  </head>

  <body>
            <!-- Main Dashboard -->
            
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Company Change Password</h1>

          </div>

<!-- Table -->
  <div class="col-md-10 col-md-offset-2">
  <form action="companychangepassword" method="Post" name="Admin" onsubmit="return validateForm()">
  <table class="table table-striped">
<tr>
<tr>
<td> USERNAME </td>
<td><input type="text" name="name"></td>
</tr>
<td> OLD PASSWORD </td>
<td><input type="password" name="old"></td>
</tr>
<tr>
<td> NEW PASSWORD </td>
<td><input type="password" name="new"></td>
</tr>
<tr>
<td> CONFIRM PASSWORD </td>
<td><input type="password" name="confirm"></td>
</tr>
</div>  

</table>
<table class="table">

<div class="col-md-offset-4">
<td><input type="submit" name="submit" value="SUBMIT"class="btn btn-danger"></td>
</div>
</tr>

</table>
</form>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./dashboard%20files/jquery.min.js.download"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="./dashboard%20files/bootstrap.min.js.download"></script>
    <!-- Just to make our placeholder images work. Don't actually copy the next line! -->
    <script src="./dashboard%20files/holder.min.js.download"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="./dashboard%20files/ie10-viewport-bug-workaround.js.download"></script>
  	<script src="js/hello.js"></script>

</body></html>