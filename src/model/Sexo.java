package model;

/**
 *
 * @author Renán O. Pérez
 */
public class Sexo {

    //  Variables
    int ID_Sexo;
    String Nombre_Sexo;

    //  Constructor: default
    public Sexo() {
        this.ID_Sexo = 0;
        this.Nombre_Sexo = "";
    }

    //  Construcotr: parameterized
    public Sexo(int ID_Sexo, String Nombre_Sexo) {
        this.ID_Sexo = ID_Sexo;
        this.Nombre_Sexo = Nombre_Sexo;
    }

    public int getID_Sexo() {                           //  Getter: ID_Sexo
        return ID_Sexo;
    }

    public void setID_Sexo(int ID_Sexo) {               //  Setter: ID_Sexo
        this.ID_Sexo = ID_Sexo;
    }

    public String getNombre_Sexo() {                    //  Getter: Nombre_Sexo
        return Nombre_Sexo;
    }

    public void setNombre_Sexo(String Nombre_Sexo) {    //  Setter: Nombre_Sexo
        this.Nombre_Sexo = Nombre_Sexo;
    }

    @Override
    public String toString() {
        return "\nID_Sexo: " + ID_Sexo
                + "\nNombre_Sexo: " + Nombre_Sexo;
    }

}
