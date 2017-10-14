package com.onlinerecuritment.controller;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
@WebServlet("/Admin_login")
public class Admin_login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	
	String username=request.getParameter("username");
	String password=request.getParameter("password");

	if(request.getParameter("adminlogin")!=null){
		if(username.equals("admin")&& password.equals("admin123"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("usernamea",username);
			session.setAttribute("usernamec",username);
			session.setAttribute("usernameu",username);
			
	    	 response.sendRedirect("Admin Dashboard.jsp");
		}
		else{
			///place error message here in javascript popup
			response.sendRedirect("Admin_login.jsp");
		}


	}
	
	
	}

}
