<html>
<head>
<title>USER REGISTRATION</title>
<script src="js/registervalidation.js"></script>
</head>
<body>

<div style="background-color:#1a313a;;height:60px;width:102%;margin-left:-0.8%;margin-top:-1%;">
<h2 style="color:#d23132;margin-top:1.2%;margin-left:2%;float:left;">USER <span style="color:#FFFFFF;">REGISTRATION<span></h2>
</div>
<form name="myForm" action="registeruser" method="Post" onsubmit="return validateFormuser()">
<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">USERNAME </h3>
<input type="text" name="username" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>
<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">PASSWORD </h3>
<input type="password" name="pswrd" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">EMAIL-ID </h3>
<input type="email" name="eid" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">PHONE NO. </h3>
<input type="text" name="phn" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"> <h3 style="color:#333333;width:120px;float:left;">AGE</h3>
<input type="text" name="age" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">10th(%) </h3>
<input type="text" name="tenth" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">12th(%) </h3>
<input type="text" name="twelth" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">CITY </h3>
<input type="text" name="city" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">COUNTRY </h3>
<input type="text" name="Country" style="height:30px;width:300px;border:1px solid #c3c3c3;"></p><br>

<p style="width:100%;line-height:0px;"><h3 style="color:#333333;width:120px;float:left;">PINCODE </h3>
<input type="text" name="pincode" style="height:30px;width:300px;border:1px solid #c3c3c3;"  maxlength="6" size="6"></p><br>

<input type="submit" value="SUBMIT" name="Submit" style="height:30px;width:100px;font-size:16px;margin-bottom:4%;">

</form>
</body>
</html>