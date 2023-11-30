package Conexion;

import Control.DataBase_conexion;
import model.Trabajador;

import java.sql.Date;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renán O. Pérez
 */
public class Trabajador_conexion {

    ArrayList<Trabajador> Trabajador = null;
    private static Trabajador_conexion TrabajadorConexion = null;

    DataBase_conexion Conexion = new DataBase_conexion();
    Connection cnx = null;
    PreparedStatement pst = null;
    String[] columnas = {"ID", "Hotel", "Sexo", "Labor", "Tipo", "Numero", "Nombre", "Apellido", "Título", "Teléfono", "Correo", "Fecha", "Dirección"};
    DefaultTableModel model = null;
    String SelectTrabajador = " ID_TRABAJADOR, NOM_HOTEL, NOM_SEXO, CARGO, NOM_TIPO_IDENT, NUM_IDENT, NOMBRE, APELLIDO, TITULO, T.TELEFONO, T.CORREO, FECHA_NACIMIENTO, T.DIRECCION ";
    String FromTrabajador = " TRABAJADOR T, HOTEL H, SEXO S, LABOR L, TIPO_IDENTIFICACION TI ";
    String WhereTrabajador = " T.ID_HOTEL = H.ID_HOTEL AND T.ID_SEXO = S.ID_SEXO AND T.ID_LABOR = L.ID_LABOR AND T.ID_TIPO_IDEN = TI.ID_TIPO_IDENT ORDER BY ID_TRABAJADOR ";

    private Trabajador_conexion() {
        Trabajador = new ArrayList<>();
    }

    public static Trabajador_conexion getTrabajador_conexion() {
        if (TrabajadorConexion == null) {
            TrabajadorConexion = new Trabajador_conexion();
        }
        return TrabajadorConexion;
    }

    public ArrayList<Trabajador> getTrabajador() {
        return Trabajador;
    }

    public void setTrabajador(ArrayList<Trabajador> Trabajador) {
        this.Trabajador = Trabajador;
    }

//  Verificar datos llenos a guardar
    public boolean Verificar(String ID_Trabajador, int Hotel, int Sexo, int Labor, int Tipo, String Numero, String Nombre, String Apellido, String Titulo, String Telefono, String Correo, Calendar calendario, String Direccion) {
        boolean OutPut = false;
        if (!ID_Trabajador.isEmpty() && Hotel != 0 && Sexo != 0 && Labor != 0 && Tipo != 0 && !Numero.isEmpty() && !Nombre.isEmpty() && !Apellido.isEmpty() && !Titulo.isEmpty() && !Telefono.isEmpty() && !Correo.isEmpty() && calendario != null && !Direccion.isEmpty()) {
            OutPut = true;
        } else {
            JOptionPane.showMessageDialog(null, "Llene los campos");
        }
        return OutPut;
    }

//  Saves new elelemnte in table: TRABAJADOR
    public void Guardar(String ID_Trabajador, int Hotel, int Sexo, int Labor, int Tipo, String Numero, String Nombre, String Apellido, String Titulo, String Telefono, String Correo, Calendar calendario, String Direccion) {
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int año = calendario.get(Calendar.YEAR) - 1900;
        Trabajador trbjdr = new Trabajador();
        trbjdr.setID_Trabajador(Integer.parseInt(ID_Trabajador));
        trbjdr.setID_Hotel(Hotel);
        trbjdr.setID_Sexo(Sexo);
        trbjdr.setID_Labor(Labor);
        trbjdr.setID_Tipo_Identificacion(Tipo);
        trbjdr.setNumero_Identificacion(Numero);
        trbjdr.setNombre(Nombre);
        trbjdr.setApellido(Apellido);
        trbjdr.setTitulo(Titulo);
        trbjdr.setTelefono(Telefono);
        trbjdr.setCorreo(Correo);
        trbjdr.setFecha_Nacimiento(new Date(año, mes, dia));
        trbjdr.setDireccion(Direccion);
        InsertarTrabajador(trbjdr);
        JOptionPane.showMessageDialog(null, "Datos guardadados");
    }

    //  Add new data in table: TRABAJADOR
    public void InsertarTrabajador(Trabajador trbjdr) {
        try {
            cnx = Conexion.conectar();
            pst = cnx.prepareStatement("INSERT INTO TRABAJADOR ("
                    + " ID_TRABAJADOR, ID_HOTEL, ID_SEXO, ID_LABOR, ID_TIPO_IDEN, NUM_IDENT, NOMBRE, APELLIDO, TITULO, TELEFONO, CORREO, FECHA_NACIMIENTO, DIRECCION)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, trbjdr.getID_Trabajador());
            pst.setInt(2, trbjdr.getID_Hotel());
            pst.setInt(3, trbjdr.getID_Sexo());
            pst.setInt(4, trbjdr.getID_Labor());
            pst.setInt(5, trbjdr.getID_Tipo_Identificacion());
            pst.setString(6, trbjdr.getNumero_Identificacion());
            pst.setString(7, trbjdr.getNombre());
            pst.setString(8, trbjdr.getApellido());
            pst.setString(9, trbjdr.getTitulo());
            pst.setString(10, trbjdr.getTelefono());
            pst.setString(11, trbjdr.getCorreo());
            pst.setDate(12, trbjdr.getFecha_Nacimiento());
            pst.setString(13, trbjdr.getDireccion());
            pst.executeQuery();
            pst.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Erro en Agregar");
        }
    }

//  Show all data from table: TRABAJADOR
    public void LlenarTabla(JTable Tbl_Buscar) {
        model = new DefaultTableModel(null, columnas);
        String[] filas = new String[columnas.length];
        ResultSet rs = this.Conexion.consulta("SELECT " + SelectTrabajador
                + "FROM " + FromTrabajador
                + "WHERE " + WhereTrabajador);
        try {
            while (rs.next()) {
                for (int i = 0; i < filas.length; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            Tbl_Buscar.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//  Search data in table: TRABAJADOR
    public void BuscarTabla(JTable Tbl_Buscar, String ID_Trabajador_search) {
        model = new DefaultTableModel(null, columnas);
        String[] filas = new String[columnas.length];
        try {
            cnx = Conexion.conectar();
            pst = cnx.prepareStatement("SELECT " + SelectTrabajador + "FROM " + FromTrabajador
                    + "WHERE ID_TRABAJADOR = " + ID_Trabajador_search + "AND " + WhereTrabajador);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < filas.length; i++) {
                    filas[i] = rs.getString(i + 1);
                }
                model.addRow(filas);
            }
            Tbl_Buscar.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//  Delete data from table: TRABAJADOR
    public void EliminarDatos(JTable Tbl_Buscar) {  // Error: no elimina primera fila
        int fila = Tbl_Buscar.getSelectedRow();
        int ID = Integer.parseInt(Tbl_Buscar.getValueAt(fila, 0).toString());
        try {
            cnx = Conexion.conectar();
            pst = cnx.prepareStatement("DELETE FROM TRABAJADOR WHERE ID_TRABAJADOR = " + ID + " ");
            
            pst.executeUpdate();
            
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(Trabajador_conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//  Edita data from table: TRABAJADOR
    public void EditarDatos () {
        
    }
}
