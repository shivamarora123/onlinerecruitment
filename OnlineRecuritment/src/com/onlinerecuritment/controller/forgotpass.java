package com.onlinerecuritment.controller;
import com.onlinerecuritment.services.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.onlinerecuritment.services.dao.Dao;

@WebServlet("/forgotpass")
public class forgotpass extends HttpServlet {
	private Connection con=null;
	private PreparedStatement ps=null;
	public forgotpass(){
		con=Dao.dbconnect();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("forgotusername");
		String userphone=request.getParameter("forgotphone");
        String status=request.getParameter("status");
		
        ForgotService fs=new ForgotService();
     String result=fs.forgot(username, userphone, status);
		
     if(result.equals("failure")){
    		out.println("<script type=\"text/javascript\">");
			 out.println("alert('Invalid Credentials Entered!');");
		     out.println("</script>");
		     out.print("</head><body></body></html>");
		     RequestDispatcher rd=request.getRequestDispatcher("index.html");
		     rd.include(request, response);
     }
     else{
    	 
    	 String someMessage = result;
    //Delete below line
    	 //System.out.println(someMessage);
    	 //out.print("<html><head>");
    	 //out.print("<script type=\"text/javascript\">alert("+someMessage+ ");</script>");
    	 //out.print("</head><body></body></html>");
    	 JOptionPane.showMessageDialog(null, "Your Password is : " + someMessage);
    	 RequestDispatcher rd=request.getRequestDispatcher("index.html");
    	 rd.include(request, response);
     }
		
        
        
		
	}

}
