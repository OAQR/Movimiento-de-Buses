/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.MySQL;

import com.project.Personas.Persona;
import com.project.Utils.Utils;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class conexion {

    private conexion() throws SQLException {
    }

    private static Connection conexion;
    private static conexion instancia;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static final String URL = "jdbc:mysql://root:yBRWAFGrr5K3QjoWhJyb@containers-us-west-174.railway.app:7503/railway?autoReconnet=true&&useSSL=true";//mysql://localhost:3306/flota_etuchisa
    private static final String USERNAME = "root";
    private static final String PASSWORD = "yBRWAFGrr5K3QjoWhJyb";

    public static conexion getInstance() throws SQLException {
        if (instancia == null) {
            instancia = new conexion();
        }
        return instancia;
    }

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Utils.dataBase[0] = true;;
//            JOptionPane.showMessageDialog(null, "conexion exitosa !!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, """
                                                No se puedo iniciar la conexion a la base de datos.
                                                Se iniciara el modo sin conexion.
                                                Los cambios efectuados en el modo sin conexion no se guardan.
                                                """);
            Utils.dataBase[0] = false;;
        }
        return conexion;
    }

    public static void CerrarConnexion() throws SQLException {
        try {
            conexion.close();
//            JOptionPane.showMessageDialog(null, "Se desconecto de la base de datos. ");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        } finally {
            conexion.close();
        }

    }

    public static int contador(String consulta) throws SQLException {
        try (Statement st = conexion.createStatement(); ResultSet rs = st.executeQuery(consulta)) {
            String ultimoId = "";
            if (rs.next()) {
                ultimoId = rs.getString(1);
            }
            return Integer.parseInt(ultimoId.substring(1));
        }
    }

    public static boolean inicioSesion(String persona, String consulta, String usuario, char[] contraseña) throws SQLException {
        boolean personaValida = true;
        try (PreparedStatement ps = conexion.prepareStatement(consulta); ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                if (!rs.getString("id" + persona).equalsIgnoreCase(usuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario incorrecto");
                    personaValida = false;

                } else {
                    char[] contra = rs.getString("Contraseña").toCharArray();
                    if (!Arrays.equals(contra, contraseña)) {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                        personaValida = false;
                    }
                    Arrays.fill(contra, '\0');
                }
            }
        }
        return personaValida;
    }

    public static PreparedStatement tipoPersona(String tipo) throws SQLException {
        String query;
        switch (tipo) {
            case "A" ->
                query = "INSERT INTO Administrador (idAdministrador, contraseña) VALUES (?,?)";
            case "S" ->
                query = "INSERT INTO Supervisor (idSupervisor, contraseña) VALUES (?,?)";
            case "C" ->
                query = "INSERT INTO Conductor (idConductor, contraseña) VALUES (?,?)";
            default ->
                throw new IllegalArgumentException("Tipo de persona inválido");
        }
        return conexion.prepareStatement(query);
    }

    public static PreparedStatement cambiarContraseña(String tipo) throws SQLException {
        String query;
        switch (tipo) {
            case "A" ->
                query = "UPDATE Administrador SET contraseña = ? WHERE idAdministrador = ?";
            case "S" ->
                query = "UPDATE Supervisor SET contraseña = ? WHERE idSupervisor = ?";
            case "C" ->
                query = "UPDATE Conductor SET contraseña = ? WHERE idConductor = ?";
            default ->
                throw new IllegalArgumentException("Tipo de persona inválido");
        }
        return conexion.prepareStatement(query);
    }

    public static PreparedStatement persona(String query) throws SQLException {
        return conexion.prepareStatement(query);
    }

//    public static void listaPersonas(String consulta, JList<String> jlist) {
//        try {
//            ps = conexion.prepareStatement(consulta);
//            rs = ps.executeQuery();
//
//            DefaultListModel<String> model = new DefaultListModel<>();
//
//            while (rs.next()) {
//                String nombre = rs.getString("nombre");
//                String apellido = rs.getString("apellido");
//                model.addElement(apellido + ", " + nombre);
//            }
//
//            Utils.cambioColorJList(jlist);
//            jlist.setModel(model);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    
    public static List<Persona> listaPersonas(String consulta) {
    List<Persona> personas = new ArrayList<>();
    
    try {
        ps = conexion.prepareStatement(consulta);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String correo = rs.getString("correo");
            int numeroTelefonico = rs.getInt("numero_telefonico");
            int edad = rs.getInt("edad");
            int dni = rs.getInt("DNI");
            String id = rs.getString("ID");
            String contrasena = rs.getString("contrasena");
            
            Persona persona = new Persona(nombre, apellido, correo, numeroTelefonico, edad, dni, id, contrasena);
            personas.add(persona);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return personas;
}


    public static void eliminarPersonas(JList<String> jlist) {
        try {
            DefaultListModel<String> model = (DefaultListModel<String>) jlist.getModel();
            int selectedIndex = jlist.getSelectedIndex();
            if (selectedIndex != -1) {
                String nombreApellido = model.getElementAt(selectedIndex);
                String[] nombreApellidoArr = nombreApellido.split(", ");
                String apellido = nombreApellidoArr[0];
                String nombre = nombreApellidoArr[1];

                String query = "SELECT idPersona, tipo, idAdministrador, idSupervisor, idConductor FROM Persona WHERE apellido = ? AND nombre = ?";
                try (PreparedStatement statement = conexion.prepareStatement(query)) {
                    statement.setString(1, apellido);
                    statement.setString(2, nombre);
                    ResultSet rs = statement.executeQuery();
                    if (rs.next()) {
                        int idPersona = rs.getInt("idPersona");
                        String tipo = rs.getString("tipo");
                        String idAdministrador = rs.getString("idAdministrador");
                        String idSupervisor = rs.getString("idSupervisor");
                        String idConductor = rs.getString("idConductor");

                        if (tipo.equals("Administrador") && idAdministrador != null) {
                            try (PreparedStatement psEliminarAdministrador = conexion.prepareStatement("DELETE FROM Administrador WHERE idAdministrador = ?")) {
                                psEliminarAdministrador.setString(1, idAdministrador);
                                psEliminarAdministrador.executeUpdate();
                            }
                        } else if (tipo.equals("Supervisor") && idSupervisor != null) {
                            try (PreparedStatement psEliminarSupervisor = conexion.prepareStatement("DELETE FROM Supervisor WHERE idSupervisor = ?")) {
                                psEliminarSupervisor.setString(1, idSupervisor);
                                psEliminarSupervisor.executeUpdate();
                            }
                        } else if (tipo.equals("Conductor") && idConductor != null) {
                            try (PreparedStatement psEliminarConductor = conexion.prepareStatement("DELETE FROM Conductor WHERE idConductor = ?")) {
                                psEliminarConductor.setString(1, idConductor);
                                psEliminarConductor.executeUpdate();
                            }
                        }

                        try (PreparedStatement psEliminarPersona = conexion.prepareStatement("DELETE FROM Persona WHERE idPersona = ?")) {
                            psEliminarPersona.setInt(1, idPersona);
                            psEliminarPersona.executeUpdate();
                        }

                        model.remove(selectedIndex);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement ModificarPersonas(JList<String> jlist) {
        String query = "";
        try {
            DefaultListModel<String> model = (DefaultListModel<String>) jlist.getModel();
            int selectedIndex = jlist.getSelectedIndex();
            if (selectedIndex != -1) {
                String nombreApellido = model.getElementAt(selectedIndex);
                String[] nombreApellidoArr = nombreApellido.split(", ");
                String apellido = nombreApellidoArr[0];
                String nombre = nombreApellidoArr[1];

                query = "SELECT * FROM Persona WHERE apellido = ? AND nombre = ?";
                PreparedStatement statement = conexion.prepareStatement(query);
                statement.setString(1, apellido);
                statement.setString(2, nombre);
                return statement;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static PreparedStatement obtenerDatosTipo(String tipo, String ID) throws SQLException {
        String query = "";
        try {
            switch (tipo) {
                case "A" ->
                    query = "SELECT idAdministrador, contraseña FROM Administrador WHERE idAdministrador = ?";
                case "S" ->
                    query = "SELECT idSupervisor, contraseña FROM Supervisor WHERE idSupervisor = ?";
                case "C" ->
                    query = "SELECT idConductor, contraseña FROM Conductor WHERE idConductor = ?";
                default ->
                    throw new IllegalArgumentException("Tipo de persona inválido");
            }
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, ID);
            return statement;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
