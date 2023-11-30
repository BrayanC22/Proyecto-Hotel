package model;

import java.sql.Date;

/**
 *
 * @author Renán O. Pérez
 */
public class Hotel {

    //  Variables
    int ID_Hotel;
    String Nombre_Hotel;
    int ID_Categoría;
    int ID_Pais;
    String Direccion;
    String Correo;
    String Telefono;
    String Ruc;
    Date Fecha_Fundacion;
    
    //  Constructor: default
    public Hotel() {
        this.ID_Hotel = 0;
        this.Nombre_Hotel = "";
        this.ID_Categoría = 0;
        this.ID_Pais = 0;
        this.Direccion = "";
        this.Correo = "";
        this.Telefono = "";
        this.Ruc = "";
        this.Fecha_Fundacion = null;
    }
    
    //  Constructor: parameterized
    public Hotel(int ID_Hotel, String Nombre_Hotel, int ID_Categoría, int ID_Pais, String Direccion, String Correo, String Telefono, String Ruc, Date Fecha_Fundacion) {
        this.ID_Hotel = ID_Hotel;
        this.Nombre_Hotel = Nombre_Hotel;
        this.ID_Categoría = ID_Categoría;
        this.ID_Pais = ID_Pais;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.Ruc = Ruc;
        this.Fecha_Fundacion = Fecha_Fundacion;
    }

    public int getID_Hotel() {
        return ID_Hotel;
    }

    public String getNombre_Hotel() {
        return Nombre_Hotel;
    }

    public int getID_Categoría() {
        return ID_Categoría;
    }

    public int getID_Pais() {
        return ID_Pais;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getRuc() {
        return Ruc;
    }

    public Date getFecha_Fundacion() {
        return Fecha_Fundacion;
    }

    public void setID_Hotel(int ID_Hotel) {
        this.ID_Hotel = ID_Hotel;
    }

    public void setNombre_Hotel(String Nombre_Hotel) {
        this.Nombre_Hotel = Nombre_Hotel;
    }

    public void setID_Categoría(int ID_Categoría) {
        this.ID_Categoría = ID_Categoría;
    }

    public void setID_Pais(int ID_Pais) {
        this.ID_Pais = ID_Pais;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public void setFecha_Fundacion(Date Fecha_Fundacion) {
        this.Fecha_Fundacion = Fecha_Fundacion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "ID_Hotel=" + ID_Hotel + ", Nombre_Hotel=" + Nombre_Hotel + ", ID_Categor\u00eda=" + ID_Categoría + ", ID_Pais=" + ID_Pais + ", Direccion=" + Direccion + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Ruc=" + Ruc + ", Fecha_Fundacion=" + Fecha_Fundacion + '}';
    }
    
    
    
    
    
}
