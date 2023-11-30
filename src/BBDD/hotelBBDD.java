package BBDD;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Hoteles;
import model.Pais;
import model.Reserva;

/**
 *
 * @author Helen
 */
public class hotelBBDD {
    Connection cnx = null;
    PreparedStatement pst = null;
    ArrayList<Hoteles> htl = new ArrayList<>();
    DefaultTableModel model = null;
    
    
    public ResultSet consulta(String sql){
        ResultSet rs = null;
        try{
            cnx = conexion.conectar();
            PreparedStatement pst = cnx.prepareStatement(sql);
            rs = pst.executeQuery();
        }catch(SQLException e){
            System.err.println("Error consulta: " +e.getMessage());
        }
        return rs;
    }
    
    public int login(String user, String clave) {
        int resultado = 0;
        ResultSet res = this.consulta("select * from CUENTA WHERE nom_usuario='" + user + "' AND contraseña='" + clave + "'");
        try {
            while (res.next()) {
                resultado = 1;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println("Ocurrio un error; " + e.getMessage());
        }
        return resultado;
    }
    
    public Obtenertrab identificardatos(String user){
        Obtenertrab trabaj = new Obtenertrab();
        ResultSet rs = this.consulta("select t.id_trabajador, nombre, cargo "
                + "from CUENTA c, TRABAJADOR t, LABOR b " +
            "WHERE (c.nom_usuario = '" +user+ "') "+
            "AND c.id_trabajador = t.id_trabajador " +
            " AND t.id_labor = b.id_labor");
        
        try{
            while(rs.next()){
                trabaj.setNombre(rs.getString("nombre"));
                trabaj.setCargo(rs.getString("cargo"));
                trabaj.setCodigotrab(rs.getInt("id_trabajador"));
            }
            rs.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return trabaj;
    }
 
    
//CARGAR JCOMBOBOX PAIS    
    public ArrayList<Pais> ComboPais(){
        ArrayList<Pais> listaPais = new ArrayList<>();
        ResultSet rs = this.consulta("SELECT ID_pais, nom_pais from PAIS");
        Pais pais = null;
        try{
            while(rs.next()){
                pais = new Pais();
                pais.setIdPais(rs.getString("ID_pais"));
                pais.setNomPais(rs.getString("nom_pais"));
                listaPais.add(pais);
            }
            rs.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return listaPais;
    }
    
    public String getIdP(ArrayList<Pais> pais, String busqueda){
        String id;
        int i=0;
        while(!pais.get(i).getNomPais().equals(busqueda)){
            i++;
        }
        id=pais.get(i).getIdPais();
        System.out.println(id);
        return id;
    } 
 
//CARGAR JCOMBOBOX CATEGORIA    
    public ArrayList<Categoria> ComboCat(){
        ArrayList<Categoria> listaC = new ArrayList<>();
        ResultSet rs = this.consulta("SELECT ID_categoria, nom_categoria from CATEGORIA");
        Categoria c = null;
        try{
            while(rs.next()){
                c = new Categoria();
                c.setIdCategoria(rs.getString("ID_categoria"));
                c.setNomCategoria(rs.getString("nom_categoria"));
                listaC.add(c);
            }
            rs.close();
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return listaC;
    }
    
    public String getIdC(ArrayList<Categoria> cat, String busqueda){
        String id;
        int i=0;
        while(!cat.get(i).getNomCategoria().equals(busqueda)){
            i++;
        }
        id=cat.get(i).getIdCategoria();
        System.out.println(id);
        return id;
    } 
    

//BUSCAR HOTELES    
    public ArrayList<Hoteles> ListaHoteles() {
        ArrayList<Hoteles> htl = new ArrayList<>();
        ResultSet rs = this.consulta("SELECT ID_HOTEL,Nom_Hotel,"
                + "nom_categoria,nom_pais,direccion,correo,telefono,ruc,"
                + "fecha_fundacion\n" +"FROM HOTEL, CATEGORIA, PAIS\n" 
                + "WHERE (HOTEL.ID_categoria = CATEGORIA.ID_categoria) AND "
                + "(HOTEL.ID_pais = PAIS.ID_pais)\n"
                + "ORDER BY ID_Hotel");
        try {
            while (rs.next()) {
                Hoteles h = new Hoteles();
                h.setId_hotel(rs.getInt(1));
                h.setNombre_hotel(rs.getString(2));
                h.setNom_pais(rs.getString(3));
                h.setNom_categoria(rs.getString(4));
                h.setDireccion(rs.getString(5));
                h.setCorreo(rs.getString(6));
                h.setTelefono(rs.getString(7));
                h.setRuc(rs.getString(8));
                h.setFecha_fundacion(rs.getDate(9));            
                htl.add(h);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return htl;
    }
    
    
//INSERTAR DATOS 
    public void InsertarDatos(Hoteles h, int p, int c) {
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("INSERT INTO Hotel("
                    + " ID_Hotel, Nom_Hotel, ID_categoria, ID_pais, direccion,"
                    + "correo, telefono, ruc, fecha_fundacion) "
                    + "VALUES(?,?,"+c+","+p+",?,?,?,?,?)");
            pst.setInt   (1, h.getId_hotel());
            pst.setString(2, h.getNombre_hotel());
            //pst.setString(3, h.getNom_pais());
            //pst.setString(4, h.getNom_categoria());
            pst.setString(3, h.getDireccion());
            pst.setString(4, h.getCorreo());
            pst.setString(5, h.getTelefono());
            pst.setString(6, h.getRuc());
            pst.setDate  (7, h.getFecha_fundacion());            
            pst.executeQuery();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(hotelBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarDatos(Reserva r) {    
        try {
            cnx = conexion.conectar();
            
            pst = cnx.prepareStatement("INSERT INTO RESERVA( ID_reserva, ID_habitacion,"
                    + " ID_cliente, ID_trabajador, fecha_inicio,\n" 
                    + "fecha_fin) VALUES(?,?,?,?,?,?)");
            
            pst.setInt   (1, r.getID_reserva());
            pst.setInt(2, r.getID_habitacion());
            pst.setInt(3, r.getID_cliente());
            pst.setInt(4, r.getID_trabajador());
            pst.setDate(5, r.getFecha_inicio());
            pst.setDate(6, r.getFecha_fin());
            pst.executeQuery();
            JOptionPane.showMessageDialog(null,"Datos guardadados");
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(hotelBBDD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocurrio un error");
        }
    }
    
    public void Cambiarestadohabi(int  codhabi) {
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("UPDATE HABITACION SET ID_Estado_Habitacion = 101 where ID_HABITACION = "+ codhabi +" ") ;  
            pst.executeQuery();
            System.out.println("Se actualizó con exito");
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(hotelBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void EliminarReserva(JTable tabla) {
        int filaSeleccionada=tabla.getSelectedRow();
        //System.out.println(filaSeleccionada);
        int codigohbai= Integer.parseInt(tabla.getValueAt(filaSeleccionada, 0).toString());
        //System.out.println(" VAMOS SI SE PUEDE" + codigohbai);        
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("DELETE FROM RESERVA WHERE ID_Reserva = " + codigohbai+ "");
            System.out.println("SE VA A ELIMINAR ALGO");
            pst.executeUpdate();
            System.out.println("SE ELIMINÓ ALGO");
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(hotelBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
//MODIFICAR DATOS
    public void ModificarDatos(Hoteles h, int p, int c) {
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("UPDATE HOTEL SET "
                    + "ID_Hotel = ?, Nom_Hotel = ?, ID_categoria = "+c+","
                    + "ID_pais = "+p+""
                    +",direccion = ?, correo = ?, "
                    + "telefono = ?, ruc = ?, fecha_fundacion = ?"
                    + " WHERE ID_Hotel = "+h.getId_hotel()+"") ;
            pst.setInt   (1, h.getId_hotel());
            //pst.setString(2, h.getId_pais());
            //pst.setString(3, h.getId_categoria());
            pst.setString(2, h.getNombre_hotel());
            pst.setString(3, h.getDireccion());
            pst.setString(4, h.getCorreo());
            pst.setString(5, h.getTelefono());
            pst.setString(6, h.getRuc());
            pst.setDate  (7, h.getFecha_fundacion());
            pst.executeQuery();
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(hotelBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
   

//ELIMINAR DATOS 
    public void EliminarDatos(JTable tblHotel) {
        int fila = tblHotel.getSelectedRow()+1;
        System.out.println(fila);
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("DELETE FROM HOTEL "
                    + " WHERE ID_Hotel = ?");
            pst.setInt(1,fila);
            pst.executeUpdate();
            System.out.println("SE ELIMINO CORRECTAMENTE");
            pst.close();
        } catch (SQLException ex) {
            Logger.getLogger(hotelBBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
//MOSTRAR DATOS TABLA
    public void MostrarHotel(JTable tblHotel) {
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","CATEGORIA","PAIS","DIRECCIÓN",
            "CORREO","TELÉFONO","RUC","FUNDACIÓN"};
        model = new DefaultTableModel(null, columnas);
        
        String [] filas = new String[9];
        ResultSet rs = this.consulta("SELECT ID_HOTEL,Nom_Hotel,"
                + "nom_categoria,nom_pais,direccion,correo,telefono,ruc,"
                + "fecha_fundacion\n" 
                + "FROM HOTEL, CATEGORIA, PAIS\n" 
                + "WHERE (HOTEL.ID_categoria = CATEGORIA.ID_categoria) AND "
                + "(HOTEL.ID_pais = PAIS.ID_pais)"
                + "ORDER BY ID_Hotel");
        try {
            while (rs.next()) {
                for(int i = 0; i <9; i++){
                    filas[i]=rs.getString(i+1);    
                }
                model.addRow(filas);
            }
            tblHotel.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//CARGAR DATOS    
    public void CargarDatos(JTable tblHotel, JTextField txtI, JTextField txtN,
                JComboBox cmbC,JComboBox cmbP,JTextField txtD,
                JTextField txtR,JTextField txtT,JTextField txtC,
                JDateChooser dtcF) {
        
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("SELECT Nom_Hotel,"
                + "nom_categoria,nom_pais,direccion,correo,telefono,ruc,"
                + "fecha_fundacion\n"
                + "FROM HOTEL, CATEGORIA, PAIS\n" 
                + "WHERE (ID_Hotel = ?) AND (HOTEL.ID_categoria = CATEGORIA.ID_categoria) AND "
                + "(HOTEL.ID_pais = PAIS.ID_pais)");
            int fila = tblHotel.getSelectedRow();
            int id = Integer.parseInt(tblHotel.getValueAt(fila, 0).toString()); 
            pst.setInt(1,id);
            ResultSet rs= pst.executeQuery();
            //pst.close();
            while (rs.next()) {
                txtI.setText(String.valueOf(id));
                //txtI.setText(String.valueOf("ID_Hotel"));
                txtN.setText(rs.getString("Nom_Hotel"));
                cmbC.setSelectedItem(rs.getString("nom_categoria"));
                cmbP.setSelectedItem(rs.getString("nom_pais"));
                txtD.setText(rs.getString("direccion"));
                txtR.setText(rs.getString("correo"));
                txtC.setText(rs.getString("telefono"));
                txtT.setText(rs.getString("ruc"));
                dtcF.setDate(rs.getDate("Fecha_fundacion"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//BUSCAR DATOS    
    public void BuscarDatos(JTable tblHotel,String buscar) {
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRE","CATEGORIA","PAIS","DIRECCIÓN",
            "CORREO","TELÉFONO","RUC","FUNDACIÓN"};
        model = new DefaultTableModel(null,columnas);
        String [] filas = new String[9];
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("SELECT ID_HOTEL,Nom_Hotel,"
                + "nom_categoria,nom_pais,direccion,correo,telefono,ruc,"
                + "fecha_fundacion\n" 
                + "FROM HOTEL, CATEGORIA, PAIS\n" 
                + "WHERE (Nom_Hotel = '"+buscar+"') "
                + "AND (HOTEL.ID_categoria = CATEGORIA.ID_categoria) "
                + "AND (HOTEL.ID_pais = PAIS.ID_pais)");
            ResultSet rs= pst.executeQuery();
            while (rs.next()) {
                for(int i = 0; i <9; i++){
                    filas[i]=rs.getString(i+1);    
                }
                model.addRow(filas);
            }
            tblHotel.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

//CONSULTA AVANZADA
    public void ConsultaAvanzada(JTable tblHotel1,int pais) {
        DefaultTableModel model;
        String [] columnas = {"PAIS","CATEGORIA","CANTIDAD"};
        model = new DefaultTableModel(null,columnas);
        String [] filas = new String[3];
        try {
            cnx = conexion.conectar();
            pst = cnx.prepareStatement("SELECT P.NOM_PAIS, C.NOM_CATEGORIA, COUNT (H.ID_PAIS)\n" 
                  + "FROM HOTEL H, PAIS P, CATEGORIA C\n" 
                  + "WHERE H.ID_PAIS = P.ID_PAIS AND H.ID_CATEGORIA = C.ID_CATEGORIA "
                  + "AND H.ID_PAIS = '"+pais+"'\n" 
                  + "GROUP BY NOM_PAIS, NOM_CATEGORIA");
            ResultSet rs= pst.executeQuery();
            while (rs.next()) {
                for(int i = 0; i <3; i++){
                    filas[i]=rs.getString(i+1);    
                }
                model.addRow(filas);
            }
            tblHotel1.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    
    
}
