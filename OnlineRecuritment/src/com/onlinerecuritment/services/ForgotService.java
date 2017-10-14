package com.onlinerecuritment.services;

import java.sql.*;


import com.onlinerecuritment.services.dao.Dao;

public class ForgotService {
private Connection con=null;
private PreparedStatement ps=null;
public ForgotService(){
	con=Dao.dbconnect();
}
String forgotid;
String forgotphone,forgotpassword;
	public String forgot(String username,String userphone,String status){
		if(status.equals("user")){
			try{
				 ps=con.prepareStatement("select*from userdata where username=?");
			     ps.setString(1,username);
			     ResultSet rs=ps.executeQuery();
			     while (rs.next()){
			     forgotid=rs.getString(1);
			     
			     forgotphone=rs.getString(3);
			     forgotpassword=rs.getString(2);
			     
			        } //while finish
			if(userphone.equals(forgotphone)) {
				System.out.println("Password fetched from FORGOT SERVICE company:"+forgotpassword);
				return forgotpassword;
				
			}//if finish
			
			
			}
			 catch(Exception e){System.out.println(e);}
				
			  
		}
		///place for company here
		if(status.equals("company")){
			try{
				 ps=con.prepareStatement("select*from company where username=?");
			     ps.setString(1,username);
			     ResultSet rs=ps.executeQuery();
			     while (rs.next()){
			     forgotid=rs.getString(3);
			     
			     forgotphone=rs.getString(6);
			     forgotpassword=rs.getString(4);
			     
			        } //while finish
			if(userphone.equals(forgotphone)) {
			System.out.println("Password fetched from FORGOT SERVICE company:"+forgotpassword);
				return forgotpassword;
				
			}//if finish
			
			
			}
			 catch(Exception e){System.out.println(e);}
				
			  
		}
		
		
		
	return "failure";	
	}
}
