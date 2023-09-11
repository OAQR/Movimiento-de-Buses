/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Personas;

import com.project.Registros.Registro;

/**
 *
 * @author gonpa
 */
public class Conductor extends Persona{
    
    private String ID_Conductor;
    private String contraseña;

    public Conductor() {
        ID_Conductor = "";
        contraseña = "";
    }

    public Conductor(int dni, String nombre, String apellido, String correo, int numero_telefonico, int edad, String ID_Conductor, String contraseña) {
        super(nombre, apellido, correo, numero_telefonico, edad, dni, correo, contraseña);
        this.ID_Conductor = ID_Conductor;
        this.contraseña = contraseña; 
        Registro registro = new Registro();
        registro.agregarPersona(this);
    }

    @Override
    public String toString() {
        return super.toString() + " Conductor{" + "ID_Conductor=" + ID_Conductor + '}';
    }

    public String getID_Conductor() {
        return ID_Conductor;
    }

    public void setID_Conductor(String ID_Conductor) {
        this.ID_Conductor = ID_Conductor;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
