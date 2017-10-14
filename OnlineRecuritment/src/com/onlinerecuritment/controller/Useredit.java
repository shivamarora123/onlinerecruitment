package com.onlinerecuritment.controller;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinerecuritment.services.dao.Dao;
@WebServlet("/Useredit")
public class Useredit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con=null;
	private PreparedStatement ps=null;
public Useredit(){
	con=Dao.dbconnect();
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("usernameu");
		
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String btech=request.getParameter("btech");
		String twelth=request.getParameter("twelth");
		String tenth=request.getParameter("tenth");
		String age=request.getParameter("age");
		String city=request.getParameter("city");
		String pincode=request.getParameter("pincode");
		String skill=request.getParameter("skills");
		
		try{
			
			if(request.getParameter("submit")!=null)
			{
				
				
					
			   PreparedStatement ps=con.prepareStatement("update userdata set phone=?,btech=?,twelth=?,tenth=?,age=?,city=?,pincode=?,skills=? where username=?");
			   ps.setString(1,phone);
			   ps.setString(2,btech);
			   ps.setString(3,twelth);
			   ps.setString(4,tenth);
			   ps.setString(5,age);
			   ps.setString(6,city);
			   ps.setString(7,pincode);
			   ps.setString(8,skill);
			   ps.setString(9,username);
			   int qw=ps.executeUpdate();
			   if(qw>0){
				 out.println("<script type=\"text/javascript\">");
      			 out.println("alert('Successfully Updated');");
      		     out.println("</script>");
      		     out.print("</head><body></body></html>");
      		     RequestDispatcher rd=request.getRequestDispatcher("Useredit.jsp");
      		     rd.include(request, response); 
      		     }
			                  
		 else{
			 out.println("<script type=\"text/javascript\">");
			 out.println("alert('Not Updated');");
		     out.println("</script>");
		     out.print("</head><body></body></html>");
		     RequestDispatcher rd=request.getRequestDispatcher("Useredit.jsp");
		     rd.include(request, response);  }	               
			} 
      }
			catch(Exception e)
		{
			System.out.println(e);
	    }		
		
		
	}

}
