/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Registros;

import com.project.Personas.Persona;
import com.project.Buses.Buses;
import java.util.*;

/**
 *
 * @author gonpa
 */
public class Registro {
    
    Map<Buses, ArrayList<Persona>> registro = new HashMap<>();
    private ArrayList<Persona> personas; 
    private ArrayList<Buses> buses; 

    public Registro() {
        personas = new ArrayList<>();
        buses = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void agregarBus(Buses bus) {
        buses.add(bus);
    }

    public ArrayList<Persona> obtenerPersonas() {
        return personas;
    }

    public ArrayList<Buses> obtenerBuses() {
        return buses;
    }
}
