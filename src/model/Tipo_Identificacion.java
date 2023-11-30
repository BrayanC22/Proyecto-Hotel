package model;

/**
 *
 * @author Renán O. Pérez
 */
public class Tipo_Identificacion {

    //  Variables
    int ID_Tipo_Identificacion;
    String Nombre_Tipo_Identificacion;

    //  Constructor: Default
    public Tipo_Identificacion() {
        this.ID_Tipo_Identificacion = 0;
        this.Nombre_Tipo_Identificacion = "";
    }

    //  Constructor: Parameterized
    public Tipo_Identificacion(int ID_Tipo_Identificacion, String Nombre_Tipo_Identificacion) {
        this.ID_Tipo_Identificacion = ID_Tipo_Identificacion;
        this.Nombre_Tipo_Identificacion = Nombre_Tipo_Identificacion;
    }

    public int getID_Tipo_Identificacion() {        //  Getter: ID_Tipo_Identificacion
        return ID_Tipo_Identificacion;
    }

    public void setID_Tipo_Identificacion(int ID_Tipo_Identificacion) {             //  Setter: ID_Tipo_Identificacion
        this.ID_Tipo_Identificacion = ID_Tipo_Identificacion;
    }

    public String getNombre_Tipo_Identificacion() { //  Getter: Nombre_Tipo_Identificacion
        return Nombre_Tipo_Identificacion;
    }

    public void setNombre_Tipo_Identificacion(String Nombre_Tipo_Identificacion) {  //  Setter: Nombre_Tipo_Identificacion
        this.Nombre_Tipo_Identificacion = Nombre_Tipo_Identificacion;
    }

    @Override
    public String toString() {
        return "\nID_Tipo_Identificacion: " + ID_Tipo_Identificacion
                + "\nNombre_Tipo_Identificacion: " + Nombre_Tipo_Identificacion;
    }

}
