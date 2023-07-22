/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.project.Buses;

/**
 *
 * @author gonpa
 */
public class Buses {

    String placa;
    double PRECIO_GALON;
    double GALONES_KM;
    double PORCENTAJE_GANACIA;
    double km;
    double precio_Ruta;
    String ruta;

    public Buses() {
        PRECIO_GALON = 0;
        GALONES_KM = 0;
        PORCENTAJE_GANACIA = 0;
    }
    
    
    public Buses(String placa, double km, String ruta) {
        this.placa = placa;
        this.km = km;
        this.ruta = ruta;
    }

    @Override
    public String toString() {
        return "Buses{" + "placa=" + placa + ", km=" + km + ", ruta=" + ruta + ", precio_Ruta=" + precio_Ruta + '}';
    }

    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getPrecio_Ruta() {
        return precio_Ruta = ((km*GALONES_KM)*PRECIO_GALON)*PORCENTAJE_GANACIA;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    
}
