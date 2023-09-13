/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Personas;

/**
 *
 * @author gonpa
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String correo;
    private int numero_telefonico;
    private int DNI;
    private int edad;
    private String ID;
    private String contrasena;

    public Persona() {
        nombre = "Sin datos";
        apellido = "Sin datos";
        correo = "Sin datos";
        numero_telefonico = -1;
        DNI = -1;
        edad = -1;
        ID = "Sin datos";
        contrasena = "Sin datos";
    }

    public Persona(String nombre, String apellido, String correo, int numero_telefonico,int DNI,int edad, String ID, String contrasena) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero_telefonico = numero_telefonico;
        this.DNI = DNI;
        this.edad = edad;
        this.ID = ID;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ","
                + "apellido = " + apellido + ","
                + "correo = " + correo + ","
                + "numero_telefonico = " + numero_telefonico + ","
                + "DNI = " + DNI + ","
                + "edad = " + edad + ","
                + "ID = " + ID + ","
                + "contrase\u00f1a = " + contrasena;
    }
    
    public String toCSV() {
        return  nombre + ","
                + apellido + ","
                + correo + ","
                + numero_telefonico + ","
                + DNI + ","
                + edad + ","
                + ID + ","
                + contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(int numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
