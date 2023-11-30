package Control;

public class Obtenercliente {

    String nombre;
    int codigo;

    public Obtenercliente(int codigo,String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Obtenercliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
