package com.onlinerecuritment.controller;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinerecuritment.services.dao.Dao;
@WebServlet("/Companyedit")
public class Companyedit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con=null;
	private PreparedStatement ps=null;
public Companyedit(){
	con=Dao.dbconnect();
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("usernamec");
		
		
		String cmpname=request.getParameter("cmpname");
		String cmpaddr=request.getParameter("cmpaddr");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String post=request.getParameter("post");
		String cutoff=request.getParameter("cutoff");
		String confirmname=null;
		try{
			
			if(request.getParameter("submit")!=null)
			{
					
			   ps=con.prepareStatement("update company set company_name=?,company_address=?,email=?,phone=?,post=?,cutoff=? where username=?");
			   ps.setString(1,cmpname);
			   ps.setString(2,cmpaddr);
			   ps.setString(3,email);
			   ps.setString(4,phone);
			   ps.setString(5,post);
			   ps.setString(6,cutoff);
			   ps.setString(7,username);
			   int qw=ps.executeUpdate();
			   if(qw>0){
				   out.println("<script type=\"text/javascript\">");
	      			 out.println("alert('Successfully Updated');");
	      		     out.println("</script>");
	      		     out.print("</head><body></body></html>");
	      		     RequestDispatcher rd=request.getRequestDispatcher("companyedit.jsp");
	      		     rd.include(request, response); 
	      		      }
			                  
	     else{
	    	 out.println("<script type=\"text/javascript\">");
  			 out.println("alert('Not Updated');");
  		     out.println("</script>");
  		     out.print("</head><body></body></html>");
  		     RequestDispatcher rd=request.getRequestDispatcher("companyedit.jsp");
  		     rd.include(request, response); 
  		     }
			}    
			}
			catch(Exception e){
			                   out.println(e);
			                  }		
		
		
	}

}
