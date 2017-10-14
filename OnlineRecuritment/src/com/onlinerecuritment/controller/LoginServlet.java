package com.onlinerecuritment.controller;
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



import com.onlinerecuritment.services.LoginService;
import com.onlinerecuritment.services.dao.Dao;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private Connection con=null;
	private PreparedStatement ps=null;
	public LoginServlet(){
		con=Dao.dbconnect();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("loginusername");
		String userpass=request.getParameter("loginpassword");
        String status=request.getParameter("status");
     //   System.out.println(status);
		LoginService loginservice=new LoginService();
  String result=loginservice.authenticate(username, userpass,status);
  System.out.println("Request in LoginModule From:"+result +"\n username:"+username);
  PrintWriter out=response.getWriter();
  
  ///Db connection for setting all values in sessions
  
  if(result.equals("user")){
	  String btech=null,twelth=null,tenth=null,skills=null;
	  try{
	  ps=con.prepareStatement("select * from userdata where username=?");
	  ps.setString(1,username);
	  ResultSet rs=ps.executeQuery();
	  while(rs.next()){
		 btech=rs.getString("btech");
		 System.out.println(btech);
		 twelth=rs.getString("twelth");
		  
		 tenth=rs.getString("tenth");
		 skills=rs.getString("skills");
	  }
	  HttpSession session=request.getSession();
	   session.setAttribute("usernameu",username);
	   session.setAttribute("btechu",btech);
	   
	   session.setAttribute("twelthu",twelth);
	   session.setAttribute("tenthu",tenth);
	   session.setAttribute("skillsu",skills);
	   
	 response.sendRedirect("Userdashboard.jsp"); 
	  }
	  
	  catch(Exception e){System.out.println(e);}
	  }
  else if(result.equals("company")){
	  String company_name = null,company_address = null,emailc=null,phonec = null,post = null;
	  try{
	  ps=con.prepareStatement("select * from company where username=?");
	  ps.setString(1,username);
	  ResultSet rs=ps.executeQuery();
	  while(rs.next()){
		 company_name=rs.getString("company_name");
		 System.out.println("session stored:"+company_name);
		 company_address=rs.getString("company_address");
		 emailc=rs.getString("email");
		 phonec=rs.getString("phone");
		 post=rs.getString("post");
	  }
	   HttpSession session=request.getSession();
	   session.setAttribute("usernamec",username);
	   session.setAttribute("company_name",company_name);
	   session.setAttribute("company_address",company_address);
	   session.setAttribute("emailc",emailc);
	   session.setAttribute("phonec",phonec);
	   session.setAttribute("post",post);
	   response.sendRedirect("company dashboard.jsp");
	  }
	  catch(Exception e){System.out.println(e);}
	  }
	
	else{
		PrintWriter out1 = response.getWriter();	
	 out1.println("<script type=\"text/javascript\">");
	 out1.println("alert('User or password incorrect');");
     out1.println("</script>");
     out1.print("</head><body></body></html>");
   
      RequestDispatcher rd=request.getRequestDispatcher("index.html");
	 rd.include(request, response);
 
 	 
 	 
	 
  }
	
	
	}


}
