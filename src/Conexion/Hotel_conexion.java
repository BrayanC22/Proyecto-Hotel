package Conexion;

import Control.DataBase_conexion;
import model.Hotel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Renán O. Pérez
 */
public class Hotel_conexion {

    ArrayList<Hotel> NombreHotel = null;
    private static Hotel_conexion HotelConexion = null;
    Hotel Hoteles = null;

    DataBase_conexion conexcion = new DataBase_conexion();

    private Hotel_conexion() {
        NombreHotel = new ArrayList<>();
    }

    public static Hotel_conexion getHotel_conexion() {
        if (HotelConexion == null) {
            HotelConexion = new Hotel_conexion();
        }
        return HotelConexion;
    }

    public ArrayList<Hotel> getHotel() {
        return NombreHotel;
    }

    public ArrayList<Hotel> Cargar_Dato() {
        // Carga el datos: Nombre de Hoteles
        ArrayList ListaHoteles = new ArrayList();
        ResultSet rs = this.conexcion.consulta("SELECT NOM_HOTEL FROM HOTEL");
        Hotel hoteles = null;
        try {
            while (rs.next()) {
                hoteles = new Hotel();
                hoteles.setNombre_Hotel(rs.getString("NOM_HOTEL"));
                ListaHoteles.add(hoteles);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaHoteles;
    }

    public void CargarComoboHotel(JComboBox Cmb_Hotel, JComboBox Cmb_Hotel_edit) {
        // Call: Cargar_Dato ();
        // Mostar datos cargado en ComboBox
        NombreHotel = Cargar_Dato();
        Cmb_Hotel.addItem("-Seleccione-");
        Cmb_Hotel_edit.addItem("-Seleccione-");
        if (NombreHotel.size() > 0) {
            for (Hotel h : NombreHotel) {
                Cmb_Hotel.addItem(h.getNombre_Hotel());
                Cmb_Hotel_edit.addItem(h.getNombre_Hotel());
            }
        }
    }

}
