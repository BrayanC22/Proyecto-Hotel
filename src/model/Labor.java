package model;

/**
 *
 * @author Renán O. Pérez
 */
public class Labor {

    //  Variables
    int ID_Labor;
    String Cargo;
    int Horas_Laborales;

    // Constructor: default
    public Labor() {
        this.ID_Labor = 0;
        this.Cargo = "";
        this.Horas_Laborales = 0;
    }

    // Constructor: parameterized
    public Labor(int ID_Labor, String cargo, int horas_laborales) {
        this.ID_Labor = ID_Labor;
        this.Cargo = cargo;
        this.Horas_Laborales = horas_laborales;
    }

    public int getID_Labor() {                              //  Getter: ID_Labor
        return ID_Labor;
    }

    public void setID_Labor(int ID_Labor) {                 //  Setter: ID_Labor
        this.ID_Labor = ID_Labor;
    }

    public String getCargo() {                              //  Getter: cargo
        return Cargo;
    }

    public void setCargo(String Cargo) {                    //  Setter: cargo
        this.Cargo = Cargo;
    }

    public int getHoras_Laborales() {                       //  Getter: horas_laborales
        return Horas_Laborales;
    }

    public void setHoras_Laborales(int Horas_Laborales) {   //  Setter: horas_laborales
        this.Horas_Laborales = Horas_Laborales;
    }

    @Override
    public String toString() {
        return "\nID_Labor: " + ID_Labor
                + "\ncargo: " + Cargo
                + "\nhoras_laborales: " + Horas_Laborales;
    }

}
