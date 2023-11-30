/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BBDD;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Helen
 */
public class conexion {
    static Connection cnx = null;
    //VARIABLES DE USUARIO COMFORTSTAR
    public static String usuario;
    public static String password;
    //VARIABLES DE CONEXION BBDD
    public static String myDB = "jdbc:oracle:thin:@localhost:1521:orcl";//URL DE SQL DEVELOPER
    private static String userBD="PROYECTO";
    private static String pswd="proyecto123";
            
    public static Connection conectar(){
     try {
          Class.forName("oracle.jdbc.driver.OracleDriver");  //DRIVER DE SQL DEVELOPER
          cnx = DriverManager.getConnection(myDB,userBD,pswd);
     
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Revisar Conexion ");
        }
        return cnx;
    }  
    
    public void desconexion(){
        try {
            cnx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    
    /*public ResultSet consulta(String sql){
        ResultSet rs = null;
        try{
            PreparedStatement pst = cnx.prepareStatement(sql);
            rs = pst.executeQuery();
        }catch(SQLException e){
            System.err.println("Error consulta: " +e.getMessage());
        }
        return rs;
    }*/
}
