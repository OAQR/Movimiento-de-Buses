/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.Utils;

import com.project.Personas.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrdenamientoDeDatos {

    public static void ordenamientoBurbujaPorApellido() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());

        for (int i = 0; i < personas.size() - 1; i++) {
            for (int j = 0; j < personas.size() - i - 1; j++) {
                if (personas.get(j).getApellido().compareTo(personas.get(j + 1).getApellido()) > 0) {
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }

        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

    public static void ordenamientoSeleccionPorNombre() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());

        for (int i = 0; i < personas.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < personas.size(); j++) {
                if (personas.get(j).getNombre().compareTo(personas.get(minIndex).getNombre()) < 0) {
                    minIndex = j;
                }
            }

            Persona temp = personas.get(i);
            personas.set(i, personas.get(minIndex));
            personas.set(minIndex, temp);
        }

        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

    public static void ordenamientoInsercionPorCorreo() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());
        for (int i = 1; i < personas.size(); i++) {
            int j = i - 1;
            while (j >= 0 && personas.get(j).getCorreo().compareTo(personas.get(i).getCorreo()) > 0) {
                personas.set(j + 1, personas.get(j));
                j = j - 1;
            }
            personas.set(j + 1, personas.get(i));
        }
        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

    public static void quickSortPorDNI() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());
        quickSortPorDNI(personas, 0, personas.size() - 1);
        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

    public static void quickSortPorDNI(List<Persona> personas, int primero, int ultimo) {

        int i = primero, j = ultimo;
        long pivote = personas.get((primero + ultimo) / 2).getDNI();

        while (i <= j) {
            while (personas.get(i).getDNI() < pivote) {
                i++;
            }
            while (personas.get(j).getDNI() > pivote) {
                j--;
            }
            if (i <= j) {
                Persona temp = personas.get(i);
                personas.set(i, personas.get(j));
                personas.set(j, temp);
                i++;
                j--;
            }
        }

        if (primero < j) {
            quickSortPorDNI(personas, primero, j);
        }
        if (i < ultimo) {
            quickSortPorDNI(personas, i, ultimo);
        }
    }

    public static void quickSortPorNombre() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());
        quickSortPorNombre(personas, 0, personas.size() - 1);
        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

    private static void quickSortPorNombre(List<Persona> personas, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particionPorNombre(personas, izquierda, derecha);
            quickSortPorNombre(personas, izquierda, indiceParticion - 1);
            quickSortPorNombre(personas, indiceParticion + 1, derecha);
        }
    }

    private static int particionPorNombre(List<Persona> personas, int izquierda, int derecha) {
        String pivote = personas.get(derecha).getNombre();
        int i = (izquierda - 1);

        for (int j = izquierda; j < derecha; j++) {
            if (personas.get(j).getNombre().compareTo(pivote) < 0) {
                i++;
                particionPorNombre(personas, i, j);
            }
        }

        particionPorNombre(personas, i + 1, derecha);
        return i + 1;
    }

    public static void mergeSortPorNombre() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());
        mergeSortPorNombre(personas, 0, personas.size() - 1);
        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

    private static void mergeSortPorNombre(List<Persona> personas, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = (izquierda + derecha) / 2;
            mergeSortPorNombre(personas, izquierda, medio);
            mergeSortPorNombre(personas, medio + 1, derecha);
            fusionPorNombre(personas, izquierda, medio, derecha);
        }
    }

    private static void fusionPorNombre(List<Persona> personas, int izquierda, int medio, int derecha) {
        int n1 = medio - izquierda + 1;
        int n2 = derecha - medio;

        List<Persona> izquierdaArray = new ArrayList<>(n1);
        List<Persona> derechaArray = new ArrayList<>(n2);

        for (int i = 0; i < n1; i++) {
            izquierdaArray.add(personas.get(izquierda + i));
        }
        for (int j = 0; j < n2; j++) {
            derechaArray.add(personas.get(medio + 1 + j));
        }

        int i = 0, j = 0;
        int k = izquierda;

        while (i < n1 && j < n2) {
            if (izquierdaArray.get(i).getNombre().compareTo(derechaArray.get(j).getNombre()) <= 0) {
                personas.set(k, izquierdaArray.get(i));
                i++;
            } else {
                personas.set(k, derechaArray.get(j));
                j++;
            }
            k++;
        }

        while (i < n1) {
            personas.set(k, izquierdaArray.get(i));
            i++;
            k++;
        }

        while (j < n2) {
            personas.set(k, derechaArray.get(j));
            j++;
            k++;
        }
    }

    public static void shellSortPorNombre() {
        List<Persona> personas = FicheroCSV.cargarDatosCSV(FicheroCSV.obtenerArchivoCSV());
        int n = personas.size();
        int brecha = n / 2;

        while (brecha > 0) {
            for (int i = brecha; i < n; i++) {
                Persona temp = personas.get(i);
                int j = i;

                while (j >= brecha && personas.get(j - brecha).getNombre().compareTo(temp.getNombre()) > 0) {
                    personas.set(j, personas.get(j - brecha));
                    j -= brecha;
                }

                personas.set(j, temp);
            }

            brecha /= 2;
        }

        FicheroCSV.guardarCambiosCSV(personas, FicheroCSV.obtenerArchivoCSV());
    }

}
