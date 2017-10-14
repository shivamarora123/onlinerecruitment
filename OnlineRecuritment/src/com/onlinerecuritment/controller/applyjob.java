package com.onlinerecuritment.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinerecuritment.services.dao.Dao;

@WebServlet("/applyjob")
public class applyjob extends HttpServlet {
	private Connection con=null;
	private PreparedStatement ps=null;
	public applyjob(){
		con=Dao.dbconnect();
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session=request.getSession();
	String company_name=request.getParameter("compname");
	String username=(String)session.getAttribute("usernameu");
	String btech=(String)session.getAttribute("btechu");
	
	String twelth=(String)session.getAttribute("twelthu");
	String tenth=(String)session.getAttribute("tenthu");
	String skills=(String)session.getAttribute("skillsu");
	String status="NotApproved";
	try{
		
		
		
			
			ps=con.prepareStatement("insert into approval values(?,?,?,?,?,?,?)");
	        	ps.setString(1,company_name);
	        	ps.setString(2,username);
	        	ps.setString(3,btech);
	        	ps.setString(4,twelth);
	        	ps.setString(5,tenth);
	        	ps.setString(6,skills);
	        	ps.setString(7,status);
	        	
	        	int x=ps.executeUpdate();
				if(x==1)
				{
				
					response.sendRedirect("applyjob.jsp");
				}
	}
		catch(Exception e){}
	
	
	}

}
