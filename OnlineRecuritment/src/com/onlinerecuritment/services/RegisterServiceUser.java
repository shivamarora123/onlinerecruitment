package com.onlinerecuritment.services;
import java.sql.*;
import com.onlinerecuritment.services.dao.*;


public class RegisterServiceUser {
	private static Connection con=null;
	private static PreparedStatement ps=null;
	public RegisterServiceUser(){
		con=Dao.dbconnect();
	}
	
	public String register(String username, String pass,String phone,String btech, String twelth, String tenth,
			String age, String city, String pincode, String skill) {
		
		try{
			PreparedStatement ps=con.prepareStatement("insert into userdata values(?,?,?,?,?,?,?,?,?,?)");
	        ps.setString(1,username);
	        ps.setString(2,pass);
	        
	        ps.setString(3,phone);
	        ps.setString(4,btech);
	        ps.setString(5,twelth);
	        ps.setString(6,tenth);
	        ps.setString(7,age);
	        ps.setString(8,city);
	        ps.setString(9,pincode);
	        ps.setString(10,skill);
	        
	       // ps.executeQuery();
	        int z=ps.executeUpdate();
	        if(z>0){
	            return "success";
	        }
		
		}
		
		catch(Exception e){System.out.println(e);}
		return "failure";
	}
	

}
