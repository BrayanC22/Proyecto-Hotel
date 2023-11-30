package model;

import java.sql.Date;

/**
 *
 * @author Renán O. Pérez
 */
public class Trabajador {

    //  Variables
    int ID_Trabajador;
    int ID_Hotel;
    int ID_Sexo;
    int ID_Labor;
    int ID_Tipo_Identificacion;
    String Numero_Identificacion;
    String Nombre;
    String Apellido;
    String Titulo;
    String Telefono;
    String Correo;
    Date Fecha_Nacimiento;
    String Direccion;

    //  Constructor: default
    public Trabajador() {
        this.ID_Trabajador = 0;
        this.ID_Hotel = 0;
        this.ID_Sexo = 0;
        this.ID_Labor = 0;
        this.ID_Tipo_Identificacion = 0;
        this.Numero_Identificacion = "";
        this.Nombre = "";
        this.Apellido = "";
        this.Titulo = "";
        this.Telefono = "";
        this.Correo = "";
        this.Fecha_Nacimiento = null;
        this.Direccion = "";
    }

    //  Constructor: parameterized
    public Trabajador(int ID_Trabajador, int ID_Hotel, int ID_Sexo, int ID_Labor, int ID_Tipo_Identificacion, String Numero_Identificacion, String Nombre, String Apellido, String Titulo, String Telefono, String Correo, Date Fecha_Nacimiento, String Direccion) {
        this.ID_Trabajador = ID_Trabajador;
        this.ID_Hotel = ID_Hotel;
        this.ID_Sexo = ID_Sexo;
        this.ID_Labor = ID_Labor;
        this.ID_Tipo_Identificacion = ID_Tipo_Identificacion;
        this.Numero_Identificacion = Numero_Identificacion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Titulo = Titulo;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Direccion = Direccion;
    }

    public int getID_Trabajador() {
        return ID_Trabajador;
    }

    public int getID_Hotel() {
        return ID_Hotel;
    }

    public int getID_Sexo() {
        return ID_Sexo;
    }

    public int getID_Labor() {
        return ID_Labor;
    }

    public int getID_Tipo_Identificacion() {
        return ID_Tipo_Identificacion;
    }

    public String getNumero_Identificacion() {
        return Numero_Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setID_Trabajador(int ID_Trabajador) {
        this.ID_Trabajador = ID_Trabajador;
    }

    public void setID_Hotel(int ID_Hotel) {
        this.ID_Hotel = ID_Hotel;
    }

    public void setID_Sexo(int ID_Sexo) {
        this.ID_Sexo = ID_Sexo;
    }

    public void setID_Labor(int ID_Labor) {
        this.ID_Labor = ID_Labor;
    }

    public void setID_Tipo_Identificacion(int ID_Tipo_Identificacion) {
        this.ID_Tipo_Identificacion = ID_Tipo_Identificacion;
    }

    public void setNumero_Identificacion(String Numero_Identificacion) {
        this.Numero_Identificacion = Numero_Identificacion;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "\nID_Trabajador: " + ID_Trabajador
                + "\nID_Hotel: " + ID_Hotel
                + "\nID_Sexo: " + ID_Sexo
                + "\nID_Labor: " + ID_Labor
                + "\nID_Tipo_Identificacion: " + ID_Tipo_Identificacion
                + "\nNumero_Identificacion: " + Numero_Identificacion
                + "\nNombre: " + Nombre
                + "\nApellido: " + Apellido
                + "\nTitulo: " + Titulo
                + "\nTelefono: " + Telefono
                + "\nCorreo: " + Correo
                + "\nFecha_Nacimiento: " + Fecha_Nacimiento
                + "\nDireccion: " + Direccion + '}';
    }

}
