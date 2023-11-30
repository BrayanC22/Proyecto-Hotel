package model;

import java.sql.Date;

public class Reserva {
    
    private int ID_reserva;
    private int ID_habitacion;
    private int ID_cliente;
    private int ID_trabajador;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Reserva() {
    }

    public Reserva(int ID_reserva, int ID_habitacion, int ID_cliente, int ID_trabajador, Date fecha_inicio, Date fecha_fin) {
        this.ID_reserva = ID_reserva;
        this.ID_habitacion = ID_habitacion;
        this.ID_cliente = ID_cliente;
        this.ID_trabajador = ID_trabajador;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getID_reserva() {
        return ID_reserva;
    }

    public void setID_reserva(int ID_reserva) {
        this.ID_reserva = ID_reserva;
    }

    public int getID_habitacion() {
        return ID_habitacion;
    }

    public void setID_habitacion(int ID_habitacion) {
        this.ID_habitacion = ID_habitacion;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getID_trabajador() {
        return ID_trabajador;
    }

    public void setID_trabajador(int ID_trabajador) {
        this.ID_trabajador = ID_trabajador;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
