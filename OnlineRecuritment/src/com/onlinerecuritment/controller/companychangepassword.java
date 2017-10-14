package com.onlinerecuritment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinerecuritment.services.dao.Dao;

@WebServlet("/companychangepassword")
public class companychangepassword extends HttpServlet {
	


	private Connection con=null;
	private PreparedStatement ps=null;
public companychangepassword(){
	con=Dao.dbconnect();
}
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	response.sendRedirect("companychangepassword");
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("usernamec");
		
		String name=request.getParameter("name");
		String oldpass=request.getParameter("old");
		String newpass=request.getParameter("new");
		String password=null;
		try{
			ps=con.prepareStatement("select * from company where username=?");
			ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
			password=rs.getString(4);
			}
			if(request.getParameter("submit")!=null)
			{
				
				if(name.equals(username) && password.equals(oldpass)){
					
			               PreparedStatement ps=con.prepareStatement("update company set password=? where username=?");
			               ps.setString(1,newpass);
			               ps.setString(2,name);
			               int qw=ps.executeUpdate();
			                 if(qw>0){
			                	 out.println("<script type=\"text/javascript\">");
			        			 out.println("alert('Password Successfully Updated');");
			        		     out.println("</script>");
			        		     out.print("</head><body></body></html>");
			        		     RequestDispatcher rd=request.getRequestDispatcher("userchangepassword.jsp");
			        		     rd.include(request, response);
			                 }
				}
			                    else if(!name.equals(username)){
			                    	out.println("<script type=\"text/javascript\">");
				        			 out.println("alert('Username Doesnot Match');");
				        		     out.println("</script>");
				        		     out.print("</head><body></body></html>");
				        		     RequestDispatcher rd=request.getRequestDispatcher("userchangepassword.jsp");
				        		     rd.include(request, response);
			                    }
			                    else if(!password.equals(oldpass)){
			                    	out.println("<script type=\"text/javascript\">");
				        			 out.println("alert('Old Password Doesnot Match');");
				        		     out.println("</script>");
				        		     out.print("</head><body></body></html>");
				        		     RequestDispatcher rd=request.getRequestDispatcher("userchangepassword.jsp");
				        		     rd.include(request, response);
			                    }
			                    else{
			                    	out.println("<script type=\"text/javascript\">");
				        			 out.println("alert('Unknown ERROR!');");
				        		     out.println("</script>");
				        		     out.print("</head><body></body></html>");
				        		     RequestDispatcher rd=request.getRequestDispatcher("userchangepassword.jsp");
				        		     rd.include(request, response);
			                    }
				
				 
			}     
				
							 }
			catch(Exception e){
			                   out.println(e);
			                  }		
		
		
	}

}
