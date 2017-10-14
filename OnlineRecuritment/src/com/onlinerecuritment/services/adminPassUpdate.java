package com.onlinerecuritment.services;
import java.sql.*;
import com.onlinerecuritment.services.dao.*;
public class adminPassUpdate {
 private static Connection con=null;
 private static PreparedStatement ps=null;
public adminPassUpdate(){
	con=Dao.dbconnect();
}
 
 
 public static boolean update(String oldpass, String newpass) {
		
try{		
ps=con.prepareStatement("update Admin set password=? where password=?");
ps.setString(1,oldpass);
ps.setString(2,newpass);
int qw=ps.executeUpdate();
if(qw>0){
	return true;
}

}		
catch(Exception e){}		
		
		return false;
	}

	
}
