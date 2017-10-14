<html>
<head>
<style>
#div1 ul li ul{
	margin:0px;
	padding:0px;
	
}
 #div1{
	 list-style:none;
	 margin-top:30px;
	 margin-left:200px;
}
#div1 ul li{
	background-color:red;
	border:3px solid red;
	width:210px;
	height:35px;
	text-align:center;
	line-height:35px;
	float:left;
	position:relative;
	border-radius:8px;
}
#div1 ul li a{
	text-decoration:none;
	color:white;
	display:block;
	
}
#div1 ul li a:hover{
	color:black;
	background-color:blue;
	border-radius:8px;
} 
#div1 ul ul {
	position:absolute;
	display:none;
	
}
#div1 ul li:hover > ul{
	display:block;
	
}
 
</style>
</head>
<body background="images/smartapp.jpg";>
<div id="div1">
<ul>
<li><a href="#"> ABOUT USER <span><img src="images/60995.png"></span></a>
<ul>
<li><a href="#"> VIEW USER </a></li>
<li><a href="#"> DELETE USER </a></li>
</ul>
</li>
<li><a href="#"> ABOUT COMPANY <span><img src="images/60995.png"></span></a>
<ul>
<li><a href="#"> VIEW COMPANY </a></li>
<li><a href="#"> DELETE COMPANY </a></li>

</ul>
</li>
<li><a href="#"> EXAMINATION DETAILS </a></li>
<li><a href="#"> CHANGE PASSWORD </a></li>
<li><a href="#"> LOGOUT </a></li>
<ul>
</div>
</body>
</html>