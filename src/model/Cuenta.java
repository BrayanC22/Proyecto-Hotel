package model;

/**
 *
 * @author Renán O. Pérez
 */
public class Cuenta {

    //  Variable
    int ID_Cuenta;
    String usuario;
    String contrasena;

    //  Constructor: default
    public Cuenta() {
        this.ID_Cuenta = 0;
        this.usuario = "";
        this.contrasena = "";
    }

    //  Constructor: parameterized
    public Cuenta(int ID_Cuenta, String usuario, String contrasena) {
        this.ID_Cuenta = ID_Cuenta;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getID_Cuenta() {                     //  Getter: ID_Cuenta
        return ID_Cuenta;
    }

    public void setID_Cuenta(int ID_Cuenta) {       //  Setter: ID_Cuenta
        this.ID_Cuenta = ID_Cuenta;
    }

    public String getUsuario() {                    //  Getter: usuario
        return usuario;
    }

    public void setUsuario(String usuario) {        //  Setter: usuario
        this.usuario = usuario;
    }

    public String getContrasena() {                 //  Getter: contrasena
        return contrasena;
    }

    public void setContrasena(String contrasena) { //  Setter: contrasena
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "\nID_Cuenta: " + ID_Cuenta
                + "\nusuario: " + usuario
                + "\ncontrasena: " + contrasena;
    }

}
