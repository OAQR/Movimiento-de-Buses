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
    
    private int dni;
    private String nombre;
    private String apellido;
    private String correo;
    private int numero_telefonico;
    private int edad;

    public Persona() {
        dni = -1;
        nombre = "Sin datos";
        apellido = "Sin datos";
        correo = "Sin datos";        
        numero_telefonico = -1;
        edad = -1;
    }

    public Persona(int dni, String nombre, String apellido, String correo, int numero_telefonico, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero_telefonico = numero_telefonico;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", numero_telefonico=" + numero_telefonico + ", edad=" + edad + '}';
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    
    
}
