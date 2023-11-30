package Conexion;

import Control.DataBase_conexion;
import model.Labor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Renán O. Pérez
 */
public class Labor_conexion {

    ArrayList<Labor> NombreLabor = null;
    private static Labor_conexion LaborConexion = null;
    Labor Labores = null;

    DataBase_conexion conexcion = new DataBase_conexion();

    private Labor_conexion() {
        NombreLabor = new ArrayList<>();
    }

    public static Labor_conexion getLabor_conexion() {
        if (LaborConexion == null) {
            LaborConexion = new Labor_conexion();
        }
        return LaborConexion;
    }

    public ArrayList<Labor> getLabor() {
        return NombreLabor;
    }

    // Llenar combo Labor
    public ArrayList<Labor> Cargar_Dato() {
        ArrayList ListaLabor = new ArrayList();
        ResultSet rs = this.conexcion.consulta("SELECT ID_LABOR, CARGO, HORAS_LABORALES from LABOR");
        Labor labores = null;
        try {
            while (rs.next()) {
                labores = new Labor();
                labores.setCargo(rs.getString("CARGO"));
                ListaLabor.add(labores);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaLabor;
    }

    public void CargarComoboLabor(JComboBox Cmb_Labor, JComboBox Cmb_Labor_edit) {
        // Call: Cargar_Dato ();
        // Mostar datos cargado en ComboBox
        NombreLabor = Cargar_Dato();
        Cmb_Labor.addItem("-Seleccione-");
        Cmb_Labor_edit.addItem("-Seleccione-");
        if (NombreLabor.size() > 0) {
            for (Labor l : NombreLabor) {
                Cmb_Labor.addItem(l.getCargo());
                Cmb_Labor_edit.addItem(l.getCargo());
            }
        }
    }

}
