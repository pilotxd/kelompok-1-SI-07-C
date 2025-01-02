package fitreminder;

import java.sql.*;

public class DB_Connector {
    
    private static final String URL = "jdbc:mysql://localhost:3306/tubespbo";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch (SQLException e){
            throw new SQLException("Koneksi Gagal : " + e.getMessage());
        }
    }
    
}
