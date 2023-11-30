package Conexion;

import Control.DataBase_conexion;
import model.Sexo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author Renán O. Pérez
 */
public class Sexo_conexion {

    ArrayList<Sexo> NombreSexo = null;
    private static Sexo_conexion SexoConexion = null;
    Sexo Sexos = null;

    DataBase_conexion conexcion = new DataBase_conexion();

    private Sexo_conexion() {
        NombreSexo = new ArrayList();
    }

    public static Sexo_conexion getSexo_conexion() {
        if (SexoConexion == null) {
            SexoConexion = new Sexo_conexion();
        }
        return SexoConexion;
    }

    public ArrayList<Sexo> getSexo() {
        return NombreSexo;
    }

    public ArrayList<Sexo> Cargar_Dato() {
        // Carga el datos: Nombre de Sexo
        ArrayList ListaSexos = new ArrayList();
        ResultSet rs = this.conexcion.consulta("SELECT NOM_SEXO from SEXO");
        Sexo sexos = null;
        try {
            while (rs.next()) {
                sexos = new Sexo();
                sexos.setNombre_Sexo(rs.getString("NOM_SEXO"));
                ListaSexos.add(sexos);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaSexos;
    }

    public void CargarComboSexo(JComboBox Cmb_Sexo, JComboBox Cmb_Sexo_edit) {
        // Call: Cargar_Dato ();
        // Mostar datos cargado en ComboBox
        NombreSexo = Cargar_Dato();
        Cmb_Sexo.addItem("-Seleccione-");
        Cmb_Sexo_edit.addItem("-Seleccione-");
        if (NombreSexo.size() > 0) {
            for (Sexo s : NombreSexo) {
                Cmb_Sexo.addItem(s.getNombre_Sexo());
                Cmb_Sexo_edit.addItem(s.getNombre_Sexo());
            }
        }
    }

}
