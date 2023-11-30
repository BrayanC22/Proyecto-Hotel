package DBCALVOPIÑA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConexionC {
    
    private Connection con = null;
    
    public Connection getConexion()
    {
        try{
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "PROYECTO", "proyecto123");
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } 
        
      return con;  
    }
}


    
    
    
    
    
   
   
   
   
   
   
