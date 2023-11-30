package BBDD;

public class Obtenertrab {
    String nombre; 
    String cargo;
    int codigotrab;

    public Obtenertrab() {
    }

    public Obtenertrab(String nombre, String cargo, int codigo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.codigotrab = codigo;
    }

    public int getCodigotrab() {
        return codigotrab;
    }

    public void setCodigotrab(int codigotrab) {
        this.codigotrab = codigotrab;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
