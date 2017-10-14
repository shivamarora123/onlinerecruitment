package com.onlinerecuritment.services;
import com.onlinerecuritment.services.dao.*;
import java.sql.*;



import com.onlinerecuritment.services.dao.Dao;

public class RegisterServicecompany {
private Connection con=null;
private PreparedStatement ps=null;
public RegisterServicecompany(){
	con=Dao.dbconnect();
}
	public String register(String namecmp, String addrcmp, String username, String pass, String email, String phone,
			String post, String cutoff) {
		try{
		PreparedStatement ps=con.prepareStatement("insert into company values(?,?,?,?,?,?,?,?)");
        ps.setString(1,namecmp);
        ps.setString(2,addrcmp);
        ps.setString(3,username);
        ps.setString(4,pass);
        
        ps.setString(5,email);
        ps.setString(6,phone);
        ps.setString(7,post);
        ps.setString(8,cutoff);
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