/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.project.Utils;

import com.project.Personas.Persona;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FicheroCSV {

    public static File obtenerArchivoCSV() {
        return new File("./conductores.csv");
    }

    public static void llenarDatosCSV(List<Persona> personas, File archivoCSV) {
        try (FileOutputStream fos = new FileOutputStream(archivoCSV); OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write("Nombre,Apellido,Correo,NumeroTelefonico,DNI,Edad,ID,Contrasena");
            bw.newLine();

            for (Persona persona : personas) {
                bw.write(persona.toCSV());
                bw.newLine();
            }

            System.out.println("El archivo CSV se ha llenado correctamente.");

        } catch (IOException e) {
            System.err.println("No se ha podido escribir en el archivo CSV.");
        }
    }

    public static List<Persona> cargarDatosCSV(File archivoCSV) {
        List<Persona> personas = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(archivoCSV); InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8); BufferedReader br = new BufferedReader(isr)) {

            String cabecera = br.readLine();
            if (cabecera != null) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] campos = linea.split(",");
                    if (campos.length == 8) {
                        String nombre = campos[0];
                        String apellido = campos[1];
                        String correo = campos[2];
                        int numeroTelefonico = Integer.parseInt(campos[3]);
                        int dni = Integer.parseInt(campos[4]);
                        int edad = Integer.parseInt(campos[5]);
                        String id = campos[6];
                        String contrasena = campos[7];

                        Persona persona = new Persona(nombre, apellido, correo, numeroTelefonico, edad, dni, id, contrasena);
                        personas.add(persona);
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("No se ha podido cargar el archivo CSV.");
        }

        return personas;
    }

    public static void guardarCambiosCSV(List<Persona> personas, File archivoCSV) {
        try (FileOutputStream fos = new FileOutputStream(archivoCSV); OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8); BufferedWriter bw = new BufferedWriter(osw)) {

            bw.write("Nombre,Apellido,Correo,NumeroTelefonico,DNI,Edad,ID,Contrasena");
            bw.newLine();

            for (Persona persona : personas) {
                bw.write(persona.toCSV());
                bw.newLine();
            }

            System.out.println("Cambios guardados en el archivo CSV.");

        } catch (IOException e) {
            System.err.println("No se ha podido escribir en el archivo CSV.");
        }
    }

    public static void eliminarPersonaCSV(String idPersona, File archivoCSV) {
        List<Persona> personas = cargarDatosCSV(archivoCSV);
        personas.removeIf(persona -> persona.getID().equals(idPersona));
        guardarCambiosCSV(personas, archivoCSV);
        System.out.println("Persona eliminada del archivo CSV.");
    }

     public static void agregarPersonaCSV(Persona persona, File archivoCSV) {
        try (FileWriter writer = new FileWriter(archivoCSV, true)) {
            writer.write(persona.toCSV());
            writer.write(System.lineSeparator());
            System.out.println("Nueva persona agregada al archivo CSV.");
        } catch (IOException e) {
            System.err.println("Error al agregar nueva persona al archivo CSV.");
        }
    }
}
