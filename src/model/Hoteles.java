/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Helen
 */
public class Hoteles {
    int id_hotel;
    String nom_categoria,nom_pais,nombre_hotel,direccion,correo,telefono,ruc;
    Date fecha_fundacion;
    
    public Hoteles(){}

    public Hoteles(int id_hotel, String nom_categoria, String nom_pais, 
            String nombre_hotel, String direccion, String correo, 
            String telefono, String ruc, Date fecha_fundacion) {
        this.id_hotel = id_hotel;
        this.nom_categoria = nom_categoria;
        this.nom_pais = nom_pais;
        this.nombre_hotel = nombre_hotel;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.ruc = ruc;
        this.fecha_fundacion = fecha_fundacion;
    }

    public int getId_hotel() {
        return id_hotel;
    }

    public void setId_hotel(int id_hotel) {
        this.id_hotel = id_hotel;
    }

    public String getNom_categoria() {
        return nom_categoria;
    }

    public void setNom_categoria(String nom_categoria) {
        this.nom_categoria = nom_categoria;
    }

    public String getNom_pais() {
        return nom_pais;
    }

    public void setNom_pais(String nom_pais) {
        this.nom_pais = nom_pais;
    }

    public String getNombre_hotel() {
        return nombre_hotel;
    }

    public void setNombre_hotel(String nombre_hotel) {
        this.nombre_hotel = nombre_hotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(Date fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }
    
    
}
