package Application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.Db;

public class Program {
    public static void main(String[] args)  {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        
        try{
        	conn = Db.getConnection();
        	/*
        	st = conn.prepareStatement(
        			"INSERT INTO seller "
        			+ "(Name, Email, Birthdate, BaseSalary, DepartmentId)"
        			+ "VALUES"
        			+ "(?, ?, ?, ?, ?)",
        			Statement.RETURN_GENERATED_KEYS);
        	
        	st.setString(1, "Vitin");
        	st.setString(2, "vitin@gmail.com");
        	st.setDate(3, new java.sql.Date(sdf.parse("14/05/2013").getTime()));
        	st.setDouble(4, 8500.00);
        	st.setInt(5, 4);
        	*/
        	
        	st = conn.prepareStatement(
        			"Insert into department (Name) values ('D1'), ('D2')",
        			Statement.RETURN_GENERATED_KEYS);
        			
        	
        	int rowsAffected = st.executeUpdate();
        	
        	if(rowsAffected > 0) {
        		ResultSet rs = st.getGeneratedKeys();
        		while (rs.next()) {
        			int id = rs.getInt(1);
        			System.out.println("Done! Name = " + id);
        		}
        	}else {
        	System.out.println("No rown affected " + rowsAffected);
        	}
        			
        	
        }catch(SQLException e) {
        	System.out.println("Error " + e.getMessage());
        }
        finally {
        	Db.closeStatement(st);
        	Db.closeConnection();
        }
    }
}
