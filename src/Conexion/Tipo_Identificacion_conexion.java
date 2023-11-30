package Conexion;

import Control.DataBase_conexion;
import model.Tipo_Identificacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Renán O. Pérez
 */
public class Tipo_Identificacion_conexion {

    ArrayList<Tipo_Identificacion> NombreIdentificacion = null;
    private static Tipo_Identificacion_conexion IdentificacionConexion = null;
    Tipo_Identificacion Identificaciones = null;

    DataBase_conexion conexcion = new DataBase_conexion();

    private Tipo_Identificacion_conexion() {
        NombreIdentificacion = new ArrayList<>();
    }

    public static Tipo_Identificacion_conexion getTipo_Identificacion_conexion() {
        if (IdentificacionConexion == null) {
            IdentificacionConexion = new Tipo_Identificacion_conexion();
        }
        return IdentificacionConexion;
    }

    public ArrayList<Tipo_Identificacion> getTipo_Identificacion() {
        return NombreIdentificacion;
    }

    public ArrayList<Tipo_Identificacion> Cargar_Dato() {
        // Carga el datos: Nombre de Tipo de Identificacion
        ArrayList ListaTipo_Identificacion = new ArrayList();
        ResultSet rs = this.conexcion.consulta("SELECT NOM_TIPO_IDENT from TIPO_IDENTIFICACION");
        Tipo_Identificacion identifiacion = null;
        try {
            while (rs.next()) {
                identifiacion = new Tipo_Identificacion();
                identifiacion.setNombre_Tipo_Identificacion(rs.getString("NOM_TIPO_IDENT"));
                ListaTipo_Identificacion.add(identifiacion);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaTipo_Identificacion;
    }

    public void CargarComoboIdentificacion(JComboBox Cmb_Tipo_Identifiacion, JComboBox Cmb_Tipo_Identifiacion_edit) {
        // Call: Cargar_Dato ();
        // Mostar datos cargado en ComboBox
        NombreIdentificacion = Cargar_Dato();
        Cmb_Tipo_Identifiacion.addItem("-Seleccione-");
        Cmb_Tipo_Identifiacion_edit.addItem("-Seleccione-");
        if (NombreIdentificacion.size() > 0) {
            for (Tipo_Identificacion i : NombreIdentificacion) {
                Cmb_Tipo_Identifiacion.addItem(i.getNombre_Tipo_Identificacion());
                Cmb_Tipo_Identifiacion_edit.addItem(i.getNombre_Tipo_Identificacion());
            }
        }
    }

}
