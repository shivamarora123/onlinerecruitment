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
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    

    <title>Company Edit</title>

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

  </head>

  <body>
            <!-- Main Dashboard -->
            
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Company Edit</h1>

          </div>


 <!--  Database Connection -->
      <%! String url="jdbc:oracle:thin:@localhost:1521:xe";
       String id="hr";
       String pass="abc";
       String username;
       %>
      <%   
    try{
  	 username=(String)session.getAttribute("usernamec");
    	Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection(url,id,pass);
			PreparedStatement ps=con.prepareStatement("select * from company where username=?");
       ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
    %>    
         

  <!-- Table -->
  <div class="col-md-10 col-md-offset-2">
  <form action="Companyedit" method="Post" name="Admin">
  <table class="table table-striped">
     <% 
        while(rs.next()){
      %> 
     <tr>
    <th>USERNAME</th>
    <td><input type="text" disabled="disabled" value="<%=rs.getString(3)%>" name="name"></td>
    </tr>
    <tr>
    <th>COMPANY NAME</th>
    <td><input type="text" value="<%=rs.getString(1)%>" name="cmpname"></td>
    </tr>
    <tr>
    <th>COMPANY ADDRESS</th>
    <td><input type="text" value="<%=rs.getString(2)%>" name="cmpaddr"></td>
    </tr>
    <tr>
    <th>EMAIL</th>
    <td><input type="text" value="<%=rs.getString(5)%>" name="email"></td>
    </tr>
    <tr>
    <th>PHONE</th>
    <td><input type="text" value="<%=rs.getString(6)%>" name="phone"></td>
    </tr>
    <tr>
    <th>POST</th>
    <td><input type="text" value="<%=rs.getString(7)%>" name="post"></td>
    </tr>
    <tr>
    <th>CUTOFF</th>
    <td><input type="text" value="<%=rs.getString(8)%>" name="cutoff"></td>
    </tr>

    <table class="table">
<div class="col-md-8 col-md-offset-4">
<td><input type="submit" name="submit" value="SUBMIT"class="btn btn-danger"></td>
</div>
</tr>

</table>
</form>
    
    
 	<% 
        	   
     
} 

				 }
catch(Exception e){
                   out.println(e);
                  }				 
%>
  
 
  
  
  
  </table>
</div>
          




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
  

</body></html>