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
<html>
<head>
<title>View Candidates</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
  <!-- Main Dashboard -->
            
            <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">View Candidates</h1>

          </div>
          <!--  Database Connection -->
       <%! String url="jdbc:oracle:thin:@localhost:1521:xe";
       String id="hr";
       String pass="abc"; %>
      <%   
    try{
    	String company_name=(String)session.getAttribute("company_name");
    	
  	  Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection(url,id,pass);
			PreparedStatement ps=con.prepareStatement("select * from approval where company_name=?");
           ps.setString(1,company_name);
			ResultSet rs=ps.executeQuery();
    %>
      
              
  <!-- Table -->
  <div class="col-md-10 col-md-offset-2">
  <table class="table">
     <tr>
    <th>Username</th>
    <th>B.tech</th>
    <th>12th</th>
   <th>10th</th> 
   <th>Skills</th>
   
   
    </tr>
   <% 
        while(rs.next()){
      %>  	
        	<tr>
        	<td><%= rs.getString("test_given_by")%></td>
        	<td><%=rs.getString("btech")%></td>
        	<td><%=rs.getString("twelth")%></td>
        	<td><%=rs.getString("tenth")%></td>
        	<td><%=rs.getString("skills")%></td>
        	</tr>
   
   <%  
} 

				 }
catch(Exception e){
                   out.println(e);
                  }				 
%>

    
    
   
   
     
  
  
  
  </table>
</div>

</body>
</html>