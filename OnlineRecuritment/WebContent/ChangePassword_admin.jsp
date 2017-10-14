<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>change password</title>
<head>
<body>
<center>
<form action="Admin_update"method="Post" onsubmit="return validateForm()" name="Admin">
<h1> <font color="red"></ul> CHANGE PASSWORD </ul></font></h1>
<br>
<table>
<tr>
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
<tr>
<td><input type="submit" name="submit" value="SUBMIT" width="50px"></td>
<td><input type="submit" name="back" value="BACK"></td>
</tr>
</table>
</form>
</center>
</body>
</html>
