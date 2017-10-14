package com.onlinerecuritment.controller;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import com.onlinerecuritment.services.adminPassUpdate;
import java.io.*;
@WebServlet("/Admin_update")
public class Admin_update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String oldpass=request.getParameter("old");
		String newpass=request.getParameter("new");

		boolean result=adminPassUpdate.update(oldpass,newpass);
		
		if(result){
			out.println("Password Changed Succesfully");
		}
		else
		{
			out.println("Error While Changing the Password");
		}
	}

}
