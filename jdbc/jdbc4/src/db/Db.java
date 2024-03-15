package db;

import java.io.FileInputStream;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.cj.protocol.Resultset;

public class Db {

    private static Connection conn = null;

        public static Connection getConnection() {
            try {
                if (conn == null) {
                    Properties props = loadProperties();
                    String url = props.getProperty("dburl");
                    conn = DriverManager.getConnection(url, props);
                }
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        
            return conn;
        }

    public static void closeConnection(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    
    private static Properties loadProperties() {
        Properties props = new Properties();
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            props.load(fs);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return props;
    }
    
    public static void closeStatement(Statement st) {
    	if(st != null) {
    		try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
    	}
    }
    
    public static void closeResultSet(ResultSet rs) {
    	if(rs != null) {
    		try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
    	}
    }

}
