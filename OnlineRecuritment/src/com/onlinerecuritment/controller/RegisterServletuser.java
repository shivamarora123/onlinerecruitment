package com.onlinerecuritment.controller;
import java.io.*;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlinerecuritment.services.LoginService;
import com.onlinerecuritment.services.RegisterServiceUser;

@WebServlet("/registeruser")
public class RegisterServletuser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out=response.getWriter();
		//Get All the Parameters from Jsp Page
		String uname=request.getParameter("username1");
		String pass=request.getParameter("password1");
		String phone=request.getParameter("phno1");
		String btech=request.getParameter("btech1");
		String twelth=request.getParameter("marks121");
		String tenth=request.getParameter("marks101");
		String age=request.getParameter("age1");
		String city=request.getParameter("city1");
		String pincode=request.getParameter("pincode1");
		String skill=request.getParameter("skills1");
     ///Send All the Parameters to Service 
  
	    RegisterServiceUser regserviceuser=new RegisterServiceUser();
	    String result=regserviceuser.register(uname, pass,phone,btech, twelth,tenth,age,city,pincode,skill);
	    System.out.println("Request From Register USER Module status:"+result +"\n username:"+uname);
	    
	    if(result.equals("success")){
	    	out.println("<script type=\"text/javascript\">");
			 out.println("alert('User Has Been Successfully Created');");
		     out.println("</script>");
		     out.print("</head><body></body></html>");
		   	RequestDispatcher rd=request.getRequestDispatcher("index.html");
		     rd.include(request, response);
	    }
	    else if(result.equals("failure")){
	    	out.println("<script type=\"text/javascript\">");
			 out.println("alert('Error!Creating new  User<br>Try Again');");
		     out.println("</script>");
		     out.print("</head><body></body></html>");
		     RequestDispatcher rd=request.getRequestDispatcher("index.html");
		     rd.include(request, response);
	    }
	    
			
	

  
  
  
  }
  
	
		
}

