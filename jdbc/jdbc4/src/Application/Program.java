package Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.Db;

public class Program {
    public static void main(String[] args)  {
      
    	Connection conn = null;
    	PreparedStatement st = null;
    	
    	try {
    		conn = Db.getConnection();
    		
    		st = conn.prepareStatement(
    				"Update seller "
    				+ "SET BaseSalary = BaseSalary + ? "
    				+ "WHERE "
    				+ "(DepartmentId = ?)"
    				);
    		
    		st.setDouble(1, 200.00);
    		st.setInt(2, 2);
    		
    		int rowsAffected = st.executeUpdate();
    		
    		System.out.println("Done! Rows affected: " + rowsAffected);
    				
    		
    	}catch(SQLException e) {
    		System.out.println("Error: " + e.getMessage());
    	}finally {
    		Db.closeStatement(st);
    		Db.closeConnection();
    	}
    	
    }
}
