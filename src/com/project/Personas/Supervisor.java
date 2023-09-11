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
public class Supervisor extends Persona{
    
    private int ID_Supervisor;

    public Supervisor() {
        ID_Supervisor = -1;
    }

    public Supervisor(int dni, String nombre, String apellido, String correo, int numero_telefonico, int edad) {
        super(nombre, apellido, correo, numero_telefonico, edad, dni, correo, correo);
        this.ID_Supervisor = ID_Supervisor;
        Registro registro = new Registro();
        registro.agregarPersona(this);
    }
    
    @Override
    public String toString() {
        return super.toString() + " Supervisor{" + "ID_Supervisor=" + ID_Supervisor + '}';
    }

    public int getID_Supervisor() {
        return ID_Supervisor;
    }

    public void setID_Supervisor(int ID_Supervisor) {
        this.ID_Supervisor = ID_Supervisor;
    }
}
