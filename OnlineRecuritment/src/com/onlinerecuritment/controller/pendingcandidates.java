package com.onlinerecuritment.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlinerecuritment.services.dao.Dao;


@WebServlet("/pendingcandidates")
public class pendingcandidates extends HttpServlet {
	private Connection con=null;
	private PreparedStatement ps=null;
	public pendingcandidates(){
		con=Dao.dbconnect();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

			res.setContentType("text/html");
			PrintWriter out = res.getWriter();

			String username=req.getParameter("usern");
		
				if(req.getParameter("approve")!=null){
			String status ="Approved";
			try
			{
			 HttpSession session=req.getSession();
			String company_name=(String)session.getAttribute("company_name");
			
			 String sql_query="update approval SET status=?  where test_given_by=? and company_name=?";
			ps= con.prepareStatement(sql_query);
			ps.setString(1,status);
	         ps.setString(2,username); 
	         ps.setString(3,company_name);
	         int x=ps.executeUpdate();
					if(x==1)
					{
					
						res.sendRedirect("pendingcandidates.jsp");
					}
					
			}catch (Exception e2) {System.out.println(e2);}
			}
			
			
			
			if(req.getParameter("reject")!=null){
				String status ="Reject";
				try
				{
				 HttpSession session=req.getSession();
				String company_name=(String)session.getAttribute("company_name");
				
				String sql_query="update approval SET status=?  where test_given_by=? and company_name=?";
				ps= con.prepareStatement(sql_query);
				ps.setString(1,status);
		         ps.setString(2,username); 
		         ps.setString(3,company_name);
		    int x=ps.executeUpdate();
						if(x==1)
						{
						
							res.sendRedirect("pendingcandidates.jsp");
						}
						
				}catch (Exception e2) {System.out.println(e2);}
			}
			
			
			
			
			}
	

}
