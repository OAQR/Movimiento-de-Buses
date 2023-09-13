/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Utils;

import com.project.Personas.Persona;
import java.util.List;

public class OrdenamientoDeDatos {

    public static void ordenamientoBurbujaPorApellido() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());
        int n = personas.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas.get(j).getApellido().compareTo(personas.get(j + 1).getApellido()) > 0) {
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }

        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

}
