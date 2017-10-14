package com.onlinerecuritment.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.onlinerecuritment.services.RegisterServicecompany;
@WebServlet("/Registercompany")
public class RegisterServletcompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
		PrintWriter out=response.getWriter();
		//Get All the Parameters from Jsp Page
		String namecmp=request.getParameter("namecomp1");
		String addrcmp=request.getParameter("addrcomp1");
		String username=request.getParameter("usernamecomp1");
		String pass=request.getParameter("passwordcomp1");
		String email=request.getParameter("email1");
		String phone=request.getParameter("phn1");
		String post=request.getParameter("post1");
		String cutoff=request.getParameter("cutoff1");
     ///Send All the Parameters to Service 
  
	    RegisterServicecompany regservice=new RegisterServicecompany();
	    String result=regservice.register(namecmp, addrcmp, username, pass, email, phone, post, cutoff);
	    System.out.println("Request From Register company Module status:"+result +"\n username:"+namecmp);
	    
	    if(result.equals("success")){
	  	  
	  		
		 out.println("<script type=\"text/javascript\">");
		 out.println("alert('Company User Has Been Successfully Created');");
	     out.println("</script>");
	     out.print("</head><body></body></html>");
	   	RequestDispatcher rd=request.getRequestDispatcher("index.html");
	     rd.include(request, response);
	    }
	    else if(result.equals("failure")){
	    	out.println("<script type=\"text/javascript\">");
			 out.println("alert('Error!Creating new Company User<br>Try Again');");
		     out.println("</script>");
		     out.print("</head><body></body></html>");
		     RequestDispatcher rd=request.getRequestDispatcher("index.html");
		     rd.include(request, response);
	    }
	    
			
	

  
  
  
  }
  
	
		
}

