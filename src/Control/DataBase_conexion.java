package Control;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Renán O. Pérez
 */
public class DataBase_conexion {

    //  Driver:     oracle.jdbc.driver.OracleDriver
    //  DataBase:   jdbc:oracle:thin:@localhost:1521:XE
    //  User:       BDD_PROYECTO
    //  PassWord:   admin
    static Connection cnx = null;

    //VARIABLES DE CONEXION BBDD
    public static String myDB = "jdbc:oracle:thin:@localhost:1521:orcl";//URL DE SQL DEVELOPER
    private static String userBD = "PROYECTO";
    private static String pswd = "proyecto123";

//  Conexion a la Base de Datos
    public static Connection conectar() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  //DRIVER DE SQL DEVELOPER
            cnx = DriverManager.getConnection(myDB, userBD, pswd);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Revisar Conexion ");
        }
        return cnx;
    }

//  Desconexion a la Base de Datos
    public void desconexion() {
        try {
            cnx.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//  Captura sentencias SQl
    public ResultSet consulta(String sql) {
        ResultSet rs = null;
        try {
            cnx = conectar();
            PreparedStatement pst = cnx.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error consulta: " + e.getMessage());
        }
        return rs;
    }

}
