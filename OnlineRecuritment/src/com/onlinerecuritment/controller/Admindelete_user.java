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
@WebServlet("/Admindelete_user")
public class Admindelete_user extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con=null;
	private PreparedStatement ps=null;
public Admindelete_user(){
	con=Dao.dbconnect();
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession();
		String adminname=(String)session.getAttribute("usernamea");
		String username=(String)session.getAttribute("usernameu");
		//String cmpname=(String)session.getAttribute("usernamec");
		String name=request.getParameter("name");
		try{
			
			if(request.getParameter("submit")!=null)
			{
			
 PreparedStatement ps=con.prepareStatement("delete userdata where username=?");
 ps.setString(1,name);
			               int qw=ps.executeUpdate();
			                 if(qw>0){
			                	 out.println("<script type=\"text/javascript\">");
			        			 out.println("alert('Successfully Deleted');");
			        		     out.println("</script>");
			        		     out.print("</head><body></body></html>");
			        		     RequestDispatcher rd=request.getRequestDispatcher("Admindelete_user.jsp");
			        		     rd.include(request, response);
			                 }
				               else{
				            	   out.println("<script type=\"text/javascript\">");
				        			 out.println("alert('User not found');");
				        		     out.println("</script>");
				        		     out.print("</head><body></body></html>");
				        		     RequestDispatcher rd=request.getRequestDispatcher("Admindelete_user.jsp");
				        		     rd.include(request, response);}
				
			}	 
			  

							 }
			catch(Exception e){
			                   out.println(e);
			                  }		
		
		
	}

}
