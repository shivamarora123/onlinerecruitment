package com.onlinerecuritment.services;
import java.sql.*;

import com.onlinerecuritment.services.dao.Dao;
public class LoginService {
	private Connection con=null;
	private PreparedStatement ps=null;
	public LoginService(){
		con=Dao.dbconnect();
		
	}
    String validateid;
    String validatepass;
  //  String status;
	String user="user";
	String company="company";
	String nouser="Invalid-Id";
	
	public String authenticate(String username,String userpass,String status){
			
		
		if(status.equals("user")){
			try{
				 ps=con.prepareStatement("select*from userdata where username=?");
			     ps.setString(1,username);
			     ResultSet rs=ps.executeQuery();
			     while (rs.next()){
			     validateid=rs.getString(1);
			     
			     validatepass=rs.getString(2);
			     
			        } //while finish
			 }
			 catch(Exception e){System.out.println(e);}
				
			 boolean resultid=username.equals(validateid);
			  boolean resultpass=userpass.equals(validatepass);
			  if(resultid && resultpass){
				   return "user";
			  }
			  return "wronguserpassword";
		}
		
		if(status.equals("company")){
			try{
				 ps=con.prepareStatement("select*from company where username=?");
			     ps.setString(1,username);
			     ResultSet rs=ps.executeQuery();
			     while (rs.next()){
			     validateid=rs.getString(3);
			     validatepass=rs.getString(4);
			        } //while finish
			 }
			 catch(Exception e){System.out.println(e);}
				
			 boolean resultid=username.equals(validateid);
			  boolean resultpass=userpass.equals(validatepass);
			  if(resultid && resultpass){
				   return "company";
			  }
			
		return "wronguserpassword";
		}
		return nouser;
	
	}	
	}