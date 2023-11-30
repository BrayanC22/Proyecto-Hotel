
package DBALEX;

import BBDD.conexion;
import BBDD.hotelBBDD;
import Control.Obtenercliente;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.*;
import java.util.logging.*;

public class Conexion extends JTable {
    private static Connection conexion = null; 
    PreparedStatement pst = null;
    private static String user= "PROYECTO";
    private static String contra ="proyecto123";
    
    private static String url= "jdbc:oracle:thin:@localhost:1521:orcl";
    
    public /*static*/ Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexion = DriverManager.getConnection(url,user,contra);
            conexion.setAutoCommit(false);
            if(conexion!=null){
                System.out.println("Conexion Exitosa");   
            }
            else{
                System.out.println("Conexion Erronea");
            }
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Conexion Erronea");
        }
        return conexion;
    }
    
    public void desconectar(){
        try {
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al desconectar");
        }
    }

    public  ResultSet consulta(String sql){
        ResultSet res = null;
        try {
            this.getConnection();
            PreparedStatement pstm= conexion.prepareStatement(sql) ;
            res = pstm.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error en la consulta" + e.getMessage());
        }
        return res;
    }
    
    public DefaultComboBoxModel sexo(){
        DefaultComboBoxModel model  = new DefaultComboBoxModel();
        model.addElement("Seleccione una clave");
        ResultSet res = this.consulta("select * from SEXO order by NOM_SEXO");
        
        try {
            while(res.next()){
               model.addElement(res.getString("NOM_SEXO"));
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error; " + e.getMessage());
        }
        return model; 
    }
    
    public DefaultComboBoxModel Pais(){
        DefaultComboBoxModel model  = new DefaultComboBoxModel();
        model.addElement("Seleccione una clave");
        ResultSet res = this.consulta("select * from PAIS");
        
        try {
            while(res.next()){
               model.addElement(res.getString("NOM_PAIS"));
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error; " + e.getMessage());
        }
        return model; 
    }
    
    public DefaultComboBoxModel Categoria(){
        DefaultComboBoxModel model  = new DefaultComboBoxModel();
        model.addElement("Seleccione una clave");
        ResultSet res = this.consulta("select * from CATEGORIA");
        
        try {
            while(res.next()){
               model.addElement(res.getString("NOM_CATEGORIA"));
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error; " + e.getMessage());
        }
        return model; 
    }
    
    DefaultTableModel tableModel = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    
    public void MostrarReservas(JTable tabla){ 
        DefaultTableModel model;
        String [] columnas = {"Cod. Reserva","Num. Habitacion","Cliente","Trabajador","Fech. Llegada",
            "Fech. Salida"};
        model = new DefaultTableModel(null, columnas);
        
        String [] filas = new String[6];
        ResultSet rs = this.consulta("Select ID_reserva, ID_habitacion, nom_cliente ||' '|| apellido_cl , nombre, fecha_inicio, fecha_fin\n" +
                        "from RESERVA r, CLIENTE c, TRABAJADOR t\n" +
                        "WHERE r.id_cliente=c.id_cliente\n" +
                        "and r.id_trabajador = t.id_trabajador\n" +
                        "ORDER BY Id_reserva");
        this.BuscarDatos(model, rs, filas, columnas, tabla);
    }
    
    
    public void MostrarClientes(JTable tblclientes){ 
        DefaultTableModel model;
        String [] columnas = {"Cod. Cliente","Sexo","Tipo Ident.","Num. Ident","Nombre",
            "Apellido","Celular","Correo", "Direccion"};
        model = new DefaultTableModel(null, columnas);
        
        String [] filas = new String[9];
        ResultSet rs = this.consulta("SELECT Id_Cliente, NOM_SEXO, NOM_TIPO_IDENT, NUM_IDENT, nom_cliente, apellido_cl,"
                + " celular_cl, correo_cl, direccion_cl \n" +
                "FROM CLIENTE C, HOTEL H, SEXO S, TIPO_IDENTIFICACION TI\n" +
                "WHERE C.ID_SEXO = S.ID_SEXO\n" +
                "AND C.ID_TIPO_IDEN = TI.ID_TIPO_IDENT\n" +
                "ORDER BY Id_Cliente");
        this.BuscarDatos(model, rs, filas, columnas, tblclientes);
    }
  
    public void MostrarHabitacionDispo(JTable tblHabitacion) {
        DefaultTableModel model;
        String [] columnas = {"Num. Habitación","Tipo Habitacion","Numero Camas","Capacidad","Estado",
            "Precio","Extra"};
        model = new DefaultTableModel(null, columnas);
        
        String [] filas = new String[7];
        ResultSet rs = this.consulta("SELECT ID_Habitacion,nom_tipo_hab,num_Camas,capacidad,"
                + "nom_estado,precio,"
                + "extra\n" +"FROM HABITACION, TIPO_HABITACION, ESTADO_HABITACION\n" 
                + "WHERE HABITACION.Id_Estado_Habitacion=100 AND (HABITACION.ID_TIPO_HABITACION = TIPO_HABITACION.ID_tipo_habitacion) AND "
                + "(HABITACION.ID_ESTADO_HABITACION = ESTADO_HABITACION.ID_estado_habitacion)"
                + "ORDER BY ID_Habitacion");
        this.BuscarDatos(model, rs, filas, columnas, tblHabitacion);
    }
  
    public void identificar_bsqueda(JTable tabla,String buscar,String BusquedaResv){
        
        if (BusquedaResv.compareToIgnoreCase("Habitacion") == 0) {
            DefaultTableModel model;
            String[] columnas = {"Num. Habitación", "Tipo Habitacion", "Numero Camas", "Capacidad", "Estado",
                "Precio", "Extra"};
            model = new DefaultTableModel(null, columnas);

            String[] filas = new String[7];
            ResultSet rs = this.consulta("SELECT ID_Habitacion,nom_tipo_hab,num_Camas,capacidad,"
                    + "nom_estado,precio,"
                    + "extra\n" + "FROM HABITACION, TIPO_HABITACION, ESTADO_HABITACION\n"
                    + "WHERE (ID_Habitacion = " + buscar + ")"
                    + "AND (HABITACION.ID_TIPO_HABITACION = TIPO_HABITACION.ID_tipo_habitacion) AND "
                    + "(HABITACION.ID_ESTADO_HABITACION = ESTADO_HABITACION.ID_estado_habitacion)"
                    + "ORDER BY ID_Habitacion");
            this.BuscarDatos(model, rs, filas,columnas, tabla);
            
        }
        else if (BusquedaResv.compareToIgnoreCase("Clientes") == 0) {
            DefaultTableModel model;
            String[] columnas = {"Cod. Cliente", "Sexo", "Tipo Ident.", "Num. Ident", "Nombre",
                "Apellido", "Celular", "Correo", "Direccion"};
            model = new DefaultTableModel(null, columnas);

            String[] filas = new String[9];
            ResultSet rs = this.consulta("SELECT Id_Cliente, NOM_SEXO, NOM_TIPO_IDENT, NUM_IDENT, nom_cliente, apellido_cl,"
                    + " celular_cl, correo_cl, direccion_cl \n"
                    + "FROM CLIENTE C, HOTEL H, SEXO S, TIPO_IDENTIFICACION TI\n"
                    + "WHERE (NUM_IDENT = '" + buscar + "')"
                    + "AND C.ID_SEXO = S.ID_SEXO\n"
                    + "AND C.ID_TIPO_IDEN = TI.ID_TIPO_IDENT\n"
                    + "ORDER BY Id_Cliente");
            this.BuscarDatos(model, rs, filas, columnas, tabla);
        }
        else if (BusquedaResv.compareToIgnoreCase("Reservas") == 0) {
            DefaultTableModel model;
            String[] columnas = {"Cod. Reserva", "Num. Habitacion", "Cliente", "Trabajador", "Fech. Llegada",
                "Fech. Salida"};
            model = new DefaultTableModel(null, columnas);

            String[] filas = new String[6];
            ResultSet rs = this.consulta("Select ID_reserva, ID_habitacion, nom_cliente ||' '|| apellido_cl , nombre, fecha_inicio, fecha_fin\n"
                    + "from RESERVA r, CLIENTE c, TRABAJADOR t\n"
                    + "WHERE (c.num_ident='" + buscar + "')"
                    + "and r.id_cliente=c.id_cliente\n"
                    + "and r.id_trabajador = t.id_trabajador\n"
                    + "ORDER BY Id_reserva");
            
            this.BuscarDatos(model, rs, filas, columnas, tabla);
        }
        
    }
    
    
    public void BuscarDatos(DefaultTableModel model, ResultSet rs,String[] filas,String[] columnas,JTable tabla) {
        try {
            while (rs.next()) {
                for(int i = 0; i <columnas.length; i++){
                    filas[i]=rs.getString(i+1);    
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String seleccionarhabi(JTable tblhabitacion){
        String codigohabi;
        DefaultTableModel modelo=(DefaultTableModel)tblhabitacion.getModel();
        int filaSeleccionada=tblhabitacion.getSelectedRow();
        
        if(filaSeleccionada>=0){
            codigohabi= (tblhabitacion.getValueAt(filaSeleccionada, 0).toString());
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado la fila a escoger");
            codigohabi="";
        }
        
        return codigohabi;
    }
    
    public Obtenercliente seleccionarcli(JTable tabla){
        Obtenercliente clien = new Obtenercliente();
        String nombre;
        String codigocli;
        
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        int filaSeleccionada=tabla.getSelectedRow();
        
        if(filaSeleccionada>=0){
            codigocli= (tabla.getValueAt(filaSeleccionada, 0).toString());
             nombre= (tabla.getValueAt(filaSeleccionada, 4).toString());
        }else{
            JOptionPane.showMessageDialog(null,"No ha seleccionado la fila a escoger");
            codigocli="";
            nombre="";
        }
        clien.setCodigo(Integer.parseInt(codigocli));
        clien.setNombre(nombre);
        return clien;
    }
    
    
    public  ResultSet consulta2(String sql){
        ResultSet res = null;
        try {
            this.getConnection();
            PreparedStatement pstm= conexion.prepareStatement(sql) ;
            res = pstm.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error en la consulta" + e.getMessage());
        }
        return res;
    }
    
    /*
    public void EliminarDatos(JTable tabla) {
        //int fila = tabla.getSelectedRow()+1;
        //System.out.println(fila);
        try {
            this.getConnection();
            PreparedStatement pstm= conexion.prepareStatement("DELETE FROM RESERVA "
                    + " WHERE ID_Reserva = ?");
            pstm.setInt(1,108);
            System.out.println("Se va a eliminar algo");
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    public int login(String user, String clave){
        int resultado =0;
        ResultSet res = this.consulta("select * from CUENTA WHERE nom_usuario='"+user+"' AND contraseña='"+clave+"'");
        try {
            while(res.next()){
               resultado = 1;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error; " + e.getMessage());
        }
        return resultado;
    }
}
