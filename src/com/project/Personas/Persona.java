/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Personas;

/**
 *
 * @author gonpa
 */
public abstract class Persona {

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

    public Persona(String nombre, String apellido, String correo, int numero_telefonico, int edad, int DNI, String ID, String contrasena) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero_telefonico = numero_telefonico;
        this.edad = edad;
        this.DNI = DNI;
        this.ID = ID;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre
                + "apellido = " + apellido
                + "correo = " + correo
                + "numero_telefonico = " + numero_telefonico
                + "DNI = " + DNI
                + "edad = " + edad
                + "ID = " + ID
                + "contrase\u00f1a = " + contrasena;
    }

}
