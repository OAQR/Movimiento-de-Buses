/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.Interfaces.Supervisor;

import com.project.MySQL.conexion;
import java.sql.*;
import com.project.Utils.Utils;
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class AgregarConductor extends javax.swing.JFrame {

    private boolean maximizar = true, modoOscuro = true;
    private final int[] mousePosition = new int[2];
    ArrayList<String> cambiaColor = new ArrayList<>(Arrays.asList("jpnlDinamico", "jlblRegistrarConductor", "jlblNombre",
            "jtxtNombre", "jsepNombre", "jlblApellido", "jtxtApellido", "jsepApellido", "jlblCorreo", "jtxtCorreo",
            "jsepCorreo", "jlblNumeroTelefonico", "jtxtNumeroTelefonico", "jsepNumeroTelefonico", "jlblDNI", "jtxtDNI",
            "jsepDNI", "jlblEdad", "jtxtEdad", "jsepEdad", "jlblID", "jtxtID", "jsepID",
            "jlblContraseña", "jpswContraseña", "jsepContraseña", "jlblConfirmeContraseña", "jpswConfirmeContraseña",
            "jsepConfirmeContraseña", "jsepEmpresaSlogan", "jpnlAgregar"));

    public AgregarConductor(boolean modoOscuro) throws SQLException {
        initComponents();
        if (Utils.dataBase[0]) {
            conexion.getInstance();
            jtxtID.setText(Utils.generarID("C", "SELECT MAX(idConductor) FROM Conductor"));
        } else jtxtID.setText(Utils.generarID("C", ""));
        
        setLocationRelativeTo(null);
        CambioColor(modoOscuro);
    }

    private void CambioColor(boolean modoOscuro) {
        SwingUtilities.invokeLater(() -> {
            revalidate();
            try {
                Utils.ModoOscuro(this, cambiaColor, null, modoOscuro);
                Utils.alturaSeparator(jsepEmpresaSlogan, modoOscuro);
                Utils.modificacionComponentes(!modoOscuro, jpnlInfoModoOscuro, jlblInfoModoOscuro, "Modo Oscuro", "Modo Claro");
                Utils.modificacionComponentes(!modoOscuro, jpnlInfoPerfil, jlblInfoPerfil, "Perfil", "Perfil");
                jlblSlogan.setForeground(!modoOscuro ? new Color(51, 51, 255) : new Color(250, 1, 154));
                jlblLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/logo_" + (!modoOscuro ? "negro" : "blanco") + ".png")));
                jlblPerfilMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/MiniPerfil" + (modoOscuro ? "Oscuro" : "") + ".png")));
                jlblCambioColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/" + (!modoOscuro ? "Dark" : "Light") + "Mode.png")));
                jlblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/" + (!modoOscuro ? "RegresarOscuro" : "Regresar") + ".png")));
                repaint();
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                ex.printStackTrace();
            }
        });
        this.modoOscuro = !modoOscuro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlPrincipal = new javax.swing.JPanel();
        jlblExit = new javax.swing.JLabel();
        jlblMaximizar = new javax.swing.JLabel();
        jlblMinimizar = new javax.swing.JLabel();
        jpnlExit = new javax.swing.JPanel();
        jpnlMaximizar = new javax.swing.JPanel();
        jpnlMinimizar = new javax.swing.JPanel();
        jlblLogo = new javax.swing.JLabel();
        jlblRegistroBus = new javax.swing.JLabel();
        jpnlRegistroBus = new javax.swing.JPanel();
        jlblRegistroES = new javax.swing.JLabel();
        jpnlRegistroES = new javax.swing.JPanel();
        jpnlBarraDeTitulos = new javax.swing.JPanel();
        jlblRegistrarConductor = new javax.swing.JLabel();
        jlblLogoEmpresa = new javax.swing.JLabel();
        jlblNombreEmpresa = new javax.swing.JLabel();
        jsepEmpresaSlogan = new javax.swing.JSeparator();
        jlblSlogan = new javax.swing.JLabel();
        jlblNombreObligatorio = new javax.swing.JLabel();
        jlblNombre = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jsepNombre = new javax.swing.JSeparator();
        jlblApellidoObligatorio = new javax.swing.JLabel();
        jlblApellido = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jsepApellido = new javax.swing.JSeparator();
        jlblCorreoObligatorio = new javax.swing.JLabel();
        jlblCorreo = new javax.swing.JLabel();
        jtxtCorreo = new javax.swing.JTextField();
        jsepCorreo = new javax.swing.JSeparator();
        jlblNumeroTelefonicoObligatorio = new javax.swing.JLabel();
        jlblNumeroTelefonico = new javax.swing.JLabel();
        jtxtNumeroTelefonico = new javax.swing.JTextField();
        jsepNumeroTelefonico = new javax.swing.JSeparator();
        jlblDNIObligatorio = new javax.swing.JLabel();
        jlblDNI = new javax.swing.JLabel();
        jtxtDNI = new javax.swing.JTextField();
        jsepDNI = new javax.swing.JSeparator();
        jlblEdadObligatorio = new javax.swing.JLabel();
        jlblEdad = new javax.swing.JLabel();
        jtxtEdad = new javax.swing.JTextField();
        jsepEdad = new javax.swing.JSeparator();
        jlblIDObligatorio = new javax.swing.JLabel();
        jlblID = new javax.swing.JLabel();
        jtxtID = new javax.swing.JTextField();
        jsepID = new javax.swing.JSeparator();
        jlblContraseñaObligatorio = new javax.swing.JLabel();
        jlblContraseña = new javax.swing.JLabel();
        jpswContraseña = new javax.swing.JPasswordField();
        jsepContraseña = new javax.swing.JSeparator();
        jlblConfirmeContraseñaObligatorio = new javax.swing.JLabel();
        jlblConfirmeContraseña = new javax.swing.JLabel();
        jpswConfirmeContraseña = new javax.swing.JPasswordField();
        jsepConfirmeContraseña = new javax.swing.JSeparator();
        jlblCambioColor = new javax.swing.JLabel();
        jlblPerfilMini = new javax.swing.JLabel();
        jpnlBarraLateral = new javax.swing.JPanel();
        jpnlPerfilMini = new javax.swing.JPanel();
        jpnlCambioColor = new javax.swing.JPanel();
        jlblAgregar = new javax.swing.JLabel();
        jpnlAgregar = new javax.swing.JPanel();
        jlblRegresar = new javax.swing.JLabel();
        jpnlDinamico = new javax.swing.JPanel();
        jlblFondo = new javax.swing.JLabel();
        jlblInfoPerfil = new javax.swing.JLabel();
        jpnlInfoPerfil = new javax.swing.JPanel();
        jlblInfoModoOscuro = new javax.swing.JLabel();
        jpnlInfoModoOscuro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpnlPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.setForeground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblExit.setBackground(new java.awt.Color(51, 51, 51));
        jlblExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlblExit.setForeground(new java.awt.Color(255, 51, 0));
        jlblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblExit.setText("X");
        jlblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblExit.setPreferredSize(new java.awt.Dimension(40, 40));
        jlblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblExitMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 30));

        jlblMaximizar.setBackground(new java.awt.Color(51, 51, 51));
        jlblMaximizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlblMaximizar.setForeground(new java.awt.Color(255, 51, 0));
        jlblMaximizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/maximizar_blanco1.png"))); // NOI18N
        jlblMaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMaximizar.setPreferredSize(new java.awt.Dimension(40, 40));
        jlblMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMaximizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblMaximizarMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 40, 30));

        jlblMinimizar.setBackground(new java.awt.Color(51, 51, 51));
        jlblMinimizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlblMinimizar.setForeground(new java.awt.Color(255, 51, 0));
        jlblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/menos_blanco3.png"))); // NOI18N
        jlblMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblMinimizar.setPreferredSize(new java.awt.Dimension(40, 40));
        jlblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblMinimizarMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 30));

        jpnlExit.setBackground(new java.awt.Color(51, 51, 51));
        jpnlExit.setPreferredSize(new java.awt.Dimension(40, 40));
        jpnlPrincipal.add(jpnlExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 40, 30));

        jpnlMaximizar.setBackground(new java.awt.Color(51, 51, 51));
        jpnlMaximizar.setPreferredSize(new java.awt.Dimension(40, 40));
        jpnlPrincipal.add(jpnlMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 40, 30));

        jpnlMinimizar.setBackground(new java.awt.Color(51, 51, 51));
        jpnlMinimizar.setPreferredSize(new java.awt.Dimension(40, 40));
        jpnlPrincipal.add(jpnlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 40, 30));

        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/UTP.png"))); // NOI18N
        jpnlPrincipal.add(jlblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jlblRegistroBus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblRegistroBus.setForeground(new java.awt.Color(134, 134, 134));
        jlblRegistroBus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblRegistroBus.setText("Registro del Bus");
        jlblRegistroBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblRegistroBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblRegistroBusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblRegistroBusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblRegistroBusMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblRegistroBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 30));

        jpnlRegistroBus.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlRegistroBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 30));

        jlblRegistroES.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblRegistroES.setForeground(new java.awt.Color(134, 134, 134));
        jlblRegistroES.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblRegistroES.setText("Entrada y Salida");
        jlblRegistroES.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblRegistroES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblRegistroESMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblRegistroESMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblRegistroESMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblRegistroES, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 130, 30));

        jpnlRegistroES.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlRegistroES, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 130, 30));

        jpnlBarraDeTitulos.setBackground(new java.awt.Color(51, 51, 51));
        jpnlBarraDeTitulos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpnlBarraDeTitulosMouseDragged(evt);
            }
        });
        jpnlBarraDeTitulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnlBarraDeTitulosMousePressed(evt);
            }
        });
        jpnlPrincipal.add(jpnlBarraDeTitulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

        jlblRegistrarConductor.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jlblRegistrarConductor.setForeground(new java.awt.Color(0, 0, 0));
        jlblRegistrarConductor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblRegistrarConductor.setText("Registrar Conductor");
        jpnlPrincipal.add(jlblRegistrarConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 60, 370, 50));

        jlblLogoEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/logo_negro.png"))); // NOI18N
        jpnlPrincipal.add(jlblLogoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 100, 190, 250));

        jlblNombreEmpresa.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblNombreEmpresa.setForeground(new java.awt.Color(255, 51, 0));
        jlblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombreEmpresa.setText("BusLink");
        jlblNombreEmpresa.setToolTipText("");
        jpnlPrincipal.add(jlblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 290, 100, 50));

        jsepEmpresaSlogan.setForeground(new java.awt.Color(0, 0, 0));
        jsepEmpresaSlogan.setAlignmentX(2.0F);
        jsepEmpresaSlogan.setAlignmentY(2.0F);
        jsepEmpresaSlogan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepEmpresaSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 330, 180, 30));

        jlblSlogan.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jlblSlogan.setForeground(new java.awt.Color(51, 51, 255));
        jlblSlogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSlogan.setText("¡Tu viaje perfecto comienza aquí!");
        jpnlPrincipal.add(jlblSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 320, 220, 50));

        jlblNombreObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblNombreObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblNombreObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombreObligatorio.setText("*");
        jlblNombreObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblNombreObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 156, 20, 20));

        jlblNombre.setBackground(new java.awt.Color(0, 0, 0));
        jlblNombre.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNombre.setForeground(new java.awt.Color(0, 0, 0));
        jlblNombre.setText("NOMBRE");
        jpnlPrincipal.add(jlblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 160, 90, 30));

        jtxtNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtNombre.setForeground(new java.awt.Color(102, 102, 102));
        jtxtNombre.setText("Ingrese su nombre");
        jtxtNombre.setToolTipText("");
        jtxtNombre.setBorder(null);
        jtxtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNombreFocusLost(evt);
            }
        });
        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyReleased(evt);
            }
        });
        jpnlPrincipal.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 210, 300, 20));

        jsepNombre.setBackground(new java.awt.Color(255, 255, 255));
        jsepNombre.setForeground(new java.awt.Color(0, 0, 0));
        jsepNombre.setAlignmentX(2.0F);
        jsepNombre.setAlignmentY(2.0F);
        jsepNombre.setFocusCycleRoot(true);
        jsepNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 230, 300, 30));

        jlblApellidoObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblApellidoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblApellidoObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblApellidoObligatorio.setText("*");
        jlblApellidoObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblApellidoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 156, 20, 20));

        jlblApellido.setBackground(new java.awt.Color(0, 0, 0));
        jlblApellido.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblApellido.setForeground(new java.awt.Color(0, 0, 0));
        jlblApellido.setText("APELLIDO");
        jpnlPrincipal.add(jlblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 100, 30));

        jtxtApellido.setBackground(new java.awt.Color(255, 255, 255));
        jtxtApellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtApellido.setForeground(new java.awt.Color(102, 102, 102));
        jtxtApellido.setText("Ingrese su apellido");
        jtxtApellido.setToolTipText("");
        jtxtApellido.setBorder(null);
        jtxtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtApellidoFocusLost(evt);
            }
        });
        jtxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtApellidoKeyReleased(evt);
            }
        });
        jpnlPrincipal.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 300, 20));

        jsepApellido.setForeground(new java.awt.Color(0, 0, 0));
        jsepApellido.setAlignmentX(2.0F);
        jsepApellido.setAlignmentY(2.0F);
        jsepApellido.setFocusCycleRoot(true);
        jsepApellido.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 300, 30));

        jlblCorreoObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblCorreoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblCorreoObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCorreoObligatorio.setText("*");
        jlblCorreoObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblCorreoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 287, 20, 20));

        jlblCorreo.setBackground(new java.awt.Color(0, 0, 0));
        jlblCorreo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jlblCorreo.setText("CORREO");
        jpnlPrincipal.add(jlblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 290, 90, 30));

        jtxtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtCorreo.setForeground(new java.awt.Color(102, 102, 102));
        jtxtCorreo.setText("Ingrese su correo electrónico");
        jtxtCorreo.setToolTipText("");
        jtxtCorreo.setBorder(null);
        jtxtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCorreoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCorreoFocusLost(evt);
            }
        });
        jtxtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCorreoKeyReleased(evt);
            }
        });
        jpnlPrincipal.add(jtxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 340, 300, 20));

        jsepCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jsepCorreo.setAlignmentX(2.0F);
        jsepCorreo.setAlignmentY(2.0F);
        jsepCorreo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 360, 300, 30));

        jlblNumeroTelefonicoObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblNumeroTelefonicoObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblNumeroTelefonicoObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNumeroTelefonicoObligatorio.setText("*");
        jlblNumeroTelefonicoObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblNumeroTelefonicoObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 285, 20, 20));

        jlblNumeroTelefonico.setBackground(new java.awt.Color(0, 0, 0));
        jlblNumeroTelefonico.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNumeroTelefonico.setForeground(new java.awt.Color(0, 0, 0));
        jlblNumeroTelefonico.setText("NÚMERO TELEFÓNICO");
        jpnlPrincipal.add(jlblNumeroTelefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 210, 30));

        jtxtNumeroTelefonico.setBackground(new java.awt.Color(255, 255, 255));
        jtxtNumeroTelefonico.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtNumeroTelefonico.setForeground(new java.awt.Color(102, 102, 102));
        jtxtNumeroTelefonico.setText("Ingrese su número telefónico");
        jtxtNumeroTelefonico.setToolTipText("");
        jtxtNumeroTelefonico.setBorder(null);
        jtxtNumeroTelefonico.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtNumeroTelefonicoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtNumeroTelefonicoFocusLost(evt);
            }
        });
        jtxtNumeroTelefonico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtNumeroTelefonicoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNumeroTelefonicoKeyTyped(evt);
            }
        });
        jpnlPrincipal.add(jtxtNumeroTelefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 300, 20));

        jsepNumeroTelefonico.setForeground(new java.awt.Color(0, 0, 0));
        jsepNumeroTelefonico.setAlignmentX(2.0F);
        jsepNumeroTelefonico.setAlignmentY(2.0F);
        jsepNumeroTelefonico.setFocusCycleRoot(true);
        jsepNumeroTelefonico.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepNumeroTelefonico, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 300, 30));

        jlblDNIObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblDNIObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblDNIObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDNIObligatorio.setText("*");
        jlblDNIObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblDNIObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 416, 20, 20));

        jlblDNI.setBackground(new java.awt.Color(0, 0, 0));
        jlblDNI.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDNI.setForeground(new java.awt.Color(0, 0, 0));
        jlblDNI.setText("DNI");
        jpnlPrincipal.add(jlblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 420, 90, 30));

        jtxtDNI.setBackground(new java.awt.Color(255, 255, 255));
        jtxtDNI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtDNI.setForeground(new java.awt.Color(102, 102, 102));
        jtxtDNI.setText("Ingrese su DNI");
        jtxtDNI.setToolTipText("");
        jtxtDNI.setBorder(null);
        jtxtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtDNIFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtDNIFocusLost(evt);
            }
        });
        jtxtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDNIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDNIKeyTyped(evt);
            }
        });
        jpnlPrincipal.add(jtxtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 470, 300, 20));

        jsepDNI.setForeground(new java.awt.Color(0, 0, 0));
        jsepDNI.setAlignmentX(2.0F);
        jsepDNI.setAlignmentY(2.0F);
        jsepDNI.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 490, 300, 30));

        jlblEdadObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblEdadObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblEdadObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblEdadObligatorio.setText("*");
        jlblEdadObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblEdadObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 416, 20, 20));

        jlblEdad.setBackground(new java.awt.Color(0, 0, 0));
        jlblEdad.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblEdad.setForeground(new java.awt.Color(0, 0, 0));
        jlblEdad.setText("EDAD");
        jpnlPrincipal.add(jlblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 90, 30));

        jtxtEdad.setBackground(new java.awt.Color(255, 255, 255));
        jtxtEdad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtEdad.setForeground(new java.awt.Color(102, 102, 102));
        jtxtEdad.setText("Ingrese su edad");
        jtxtEdad.setToolTipText("");
        jtxtEdad.setBorder(null);
        jtxtEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtEdadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtEdadFocusLost(evt);
            }
        });
        jtxtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtEdadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEdadKeyTyped(evt);
            }
        });
        jpnlPrincipal.add(jtxtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 300, 20));

        jsepEdad.setForeground(new java.awt.Color(0, 0, 0));
        jsepEdad.setAlignmentX(2.0F);
        jsepEdad.setAlignmentY(2.0F);
        jsepEdad.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 300, 30));

        jlblIDObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblIDObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblIDObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIDObligatorio.setText("*");
        jlblIDObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblIDObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 416, 20, 20));

        jlblID.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblID.setForeground(new java.awt.Color(0, 0, 0));
        jlblID.setText("ID");
        jlblID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlblID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblIDMouseClicked(evt);
            }
        });
        jpnlPrincipal.add(jlblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 420, 30, 30));

        jtxtID.setEditable(false);
        jtxtID.setBackground(new java.awt.Color(255, 255, 255));
        jtxtID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtID.setForeground(new java.awt.Color(102, 102, 102));
        jtxtID.setToolTipText("");
        jtxtID.setBorder(null);
        jpnlPrincipal.add(jtxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 470, 300, 20));

        jsepID.setForeground(new java.awt.Color(0, 0, 0));
        jsepID.setAlignmentX(2.0F);
        jsepID.setAlignmentY(2.0F);
        jsepID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepID, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 490, 300, 30));

        jlblContraseñaObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblContraseñaObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblContraseñaObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblContraseñaObligatorio.setText("*");
        jlblContraseñaObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblContraseñaObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 546, 20, 20));

        jlblContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jlblContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jlblContraseña.setText("CONTRASEÑA");
        jpnlPrincipal.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 550, 130, 30));

        jpswContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jpswContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jpswContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jpswContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpswContraseña.setText("Ingrese su contraseña");
        jpswContraseña.setBorder(null);
        jpswContraseña.setEchoChar('\u0000');
        jpswContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpswContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpswContraseñaFocusLost(evt);
            }
        });
        jpswContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpswContraseñaKeyReleased(evt);
            }
        });
        jpnlPrincipal.add(jpswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 600, 300, 20));

        jsepContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jsepContraseña.setAlignmentX(2.0F);
        jsepContraseña.setAlignmentY(2.0F);
        jsepContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 620, 300, 30));

        jlblConfirmeContraseñaObligatorio.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jlblConfirmeContraseñaObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jlblConfirmeContraseñaObligatorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConfirmeContraseñaObligatorio.setText("*");
        jlblConfirmeContraseñaObligatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblConfirmeContraseñaObligatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 546, 20, 20));

        jlblConfirmeContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jlblConfirmeContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblConfirmeContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jlblConfirmeContraseña.setText("CONFIRME CONTRASEÑA");
        jpnlPrincipal.add(jlblConfirmeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 230, 30));

        jpswConfirmeContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jpswConfirmeContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jpswConfirmeContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jpswConfirmeContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpswConfirmeContraseña.setText("Reingrese su contraseña");
        jpswConfirmeContraseña.setBorder(null);
        jpswConfirmeContraseña.setEchoChar('\u0000');
        jpswConfirmeContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpswConfirmeContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jpswConfirmeContraseñaFocusLost(evt);
            }
        });
        jpswConfirmeContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jpswConfirmeContraseñaKeyReleased(evt);
            }
        });
        jpnlPrincipal.add(jpswConfirmeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, 300, 20));

        jsepConfirmeContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jsepConfirmeContraseña.setAlignmentX(2.0F);
        jsepConfirmeContraseña.setAlignmentY(2.0F);
        jsepConfirmeContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepConfirmeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 300, 30));

        jlblCambioColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCambioColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/DarkMode.png"))); // NOI18N
        jlblCambioColor.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlblCambioColor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblCambioColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCambioColorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblCambioColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblCambioColorMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblCambioColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 40, 40));

        jlblPerfilMini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPerfilMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/MiniPerfil.png"))); // NOI18N
        jlblPerfilMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblPerfilMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblPerfilMiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblPerfilMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblPerfilMiniMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblPerfilMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 40, 30));

        jpnlBarraLateral.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));
        jpnlPrincipal.add(jpnlPerfilMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 40, 40));
        jpnlPrincipal.add(jpnlCambioColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 40, 40));

        jlblAgregar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblAgregar.setForeground(new java.awt.Color(0, 102, 0));
        jlblAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblAgregar.setText("Agregar");
        jlblAgregar.setToolTipText("");
        jlblAgregar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        jlblAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblAgregarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblAgregarMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1145, 665, 100, 30));

        jpnlAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jpnlAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.add(jpnlAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1145, 665, 100, 30));

        jlblRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/RegresarOscuro.png"))); // NOI18N
        jlblRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblRegresarMouseClicked(evt);
            }
        });
        jpnlPrincipal.add(jlblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 665, 30, 30));

        jpnlDinamico.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPrincipal.add(jpnlDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 690));

        jlblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/fondo1.png"))); // NOI18N
        jpnlPrincipal.add(jlblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1250, 690));

        jlblInfoPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jlblInfoPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblInfoPerfil.setText(" Perfil ");
        jlblInfoPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblInfoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 657, -1, 20));

        jpnlInfoPerfil.setBackground(new java.awt.Color(43, 43, 43));

        javax.swing.GroupLayout jpnlInfoPerfilLayout = new javax.swing.GroupLayout(jpnlInfoPerfil);
        jpnlInfoPerfil.setLayout(jpnlInfoPerfilLayout);
        jpnlInfoPerfilLayout.setHorizontalGroup(
            jpnlInfoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jpnlInfoPerfilLayout.setVerticalGroup(
            jpnlInfoPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jpnlPrincipal.add(jpnlInfoPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 657, -1, 20));

        jlblInfoModoOscuro.setForeground(new java.awt.Color(255, 255, 255));
        jlblInfoModoOscuro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblInfoModoOscuro.setText(" Modo Oscuro ");
        jlblInfoModoOscuro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpnlPrincipal.add(jlblInfoModoOscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 695, -1, 20));

        jpnlInfoModoOscuro.setBackground(new java.awt.Color(43, 43, 43));

        javax.swing.GroupLayout jpnlInfoModoOscuroLayout = new javax.swing.GroupLayout(jpnlInfoModoOscuro);
        jpnlInfoModoOscuro.setLayout(jpnlInfoModoOscuroLayout);
        jpnlInfoModoOscuroLayout.setHorizontalGroup(
            jpnlInfoModoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jpnlInfoModoOscuroLayout.setVerticalGroup(
            jpnlInfoModoOscuroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jpnlPrincipal.add(jpnlInfoModoOscuro, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 695, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblExitMouseClicked
        Utils.clickedExit();
    }//GEN-LAST:event_jlblExitMouseClicked

    private void jlblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblExitMouseEntered
        Utils.resaltarBotonSalir(jlblExit);
    }//GEN-LAST:event_jlblExitMouseEntered

    private void jlblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblExitMouseExited
        Utils.restaurarBotonSalir(jlblExit);
    }//GEN-LAST:event_jlblExitMouseExited

    private void jlblMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMaximizarMouseClicked
        maximizar = Utils.clickedMaximizar(this, maximizar);
    }//GEN-LAST:event_jlblMaximizarMouseClicked

    private void jlblMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMaximizarMouseEntered
        Utils.enteredMaximizar_Minimizar(jpnlMaximizar, jlblMaximizar);
    }//GEN-LAST:event_jlblMaximizarMouseEntered

    private void jlblMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMaximizarMouseExited
        Utils.exitedMaximizar_Minimizar(jpnlMaximizar, jlblMaximizar);
    }//GEN-LAST:event_jlblMaximizarMouseExited

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        maximizar = true;
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jlblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseEntered
        Utils.enteredMaximizar_Minimizar(jpnlMinimizar, jlblMinimizar);
    }//GEN-LAST:event_jlblMinimizarMouseEntered

    private void jlblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseExited
        Utils.exitedMaximizar_Minimizar(jpnlMinimizar, jlblMinimizar);
    }//GEN-LAST:event_jlblMinimizarMouseExited

    private void jlblRegistroBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseClicked

    }//GEN-LAST:event_jlblRegistroBusMouseClicked

    private void jpnlBarraDeTitulosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlBarraDeTitulosMouseDragged
        Utils.handleDraggedBarraDeTitulos(this, mousePosition, evt);
    }//GEN-LAST:event_jpnlBarraDeTitulosMouseDragged

    private void jpnlBarraDeTitulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlBarraDeTitulosMousePressed
        Utils.handlePressedBarraDeTitulos(mousePosition, evt);
    }//GEN-LAST:event_jpnlBarraDeTitulosMousePressed

    private void jlblCambioColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseClicked
        CambioColor(modoOscuro);
    }//GEN-LAST:event_jlblCambioColorMouseClicked

    private void jlblPerfilMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblPerfilMiniMouseClicked
        try {
            Utils.cambioDeJframe(this, new ISupervisor(!modoOscuro));
        } catch (SQLException ex) {
            Logger.getLogger(AgregarConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblPerfilMiniMouseClicked

    private void jlblAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAgregarMouseExited
        Utils.exitedBotonVerde(jlblAgregar);
    }//GEN-LAST:event_jlblAgregarMouseExited

    private void jlblAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAgregarMouseEntered
        Utils.enteredBotonVerde(jlblAgregar);
    }//GEN-LAST:event_jlblAgregarMouseEntered


    private void jlblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAgregarMouseClicked
        try {
            jlblAgregar.requestFocus();

            String[] campos = {"Nombre", "Apellido", "Correo", "NumeroTelefonico", "DNI", "Edad", "Contraseña", "ConfirmeContraseña"};
            String[] text = {"nombre", "apellido", "correo electrónico", "número telefónico", "DNI", "edad", "contraseña", "confirmeContraseña"};

            boolean camposValidos = Utils.validarCamposConductor(campos, text, this, modoOscuro);

            if (camposValidos) {
                try {
                    if (Utils.dataBase[0]) {
                        PreparedStatement psConductor = conexion.tipoPersona("C");
                        psConductor.setString(1, jtxtID.getText());
                        psConductor.setString(2, new String(jpswContraseña.getPassword()));
                        psConductor.executeUpdate();
                        psConductor.close();

                        PreparedStatement psPersona = conexion.persona("INSERT INTO Persona (nombre, apellido, correo, numero_telefonico, DNI, edad, tipo, idConductor) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
                        psPersona.setString(1, jtxtNombre.getText());
                        psPersona.setString(2, jtxtApellido.getText());
                        psPersona.setString(3, jtxtCorreo.getText());
                        psPersona.setInt(4, Integer.parseInt(jtxtNumeroTelefonico.getText()));
                        psPersona.setInt(5, Integer.parseInt(jtxtDNI.getText()));
                        psPersona.setInt(6, Integer.parseInt(jtxtEdad.getText()));
                        psPersona.setString(7, "Conductor");
                        psPersona.setString(8, jtxtID.getText());
                        psPersona.executeUpdate();
                        psPersona.close();
                    }

                    Utils.cambioDeJframe(this, new RegistroConductor(!modoOscuro));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(AgregarConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblAgregarMouseClicked

    private void jlblRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegresarMouseClicked
        try {
            Utils.cambioDeJframe(this, new RegistroConductor(!modoOscuro));
        } catch (SQLException ex) {
            Logger.getLogger(AgregarConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblRegresarMouseClicked

    private void jtxtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusGained
        Utils.placeholder(jtxtNombre, "Ingrese su nombre", true);
    }//GEN-LAST:event_jtxtNombreFocusGained

    private void jtxtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNombreFocusLost
        Utils.placeholder(jtxtNombre, "Ingrese su nombre", false);
    }//GEN-LAST:event_jtxtNombreFocusLost

    private void jtxtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusGained
        Utils.placeholder(jtxtApellido, "Ingrese su apellido", true);
    }//GEN-LAST:event_jtxtApellidoFocusGained

    private void jtxtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtApellidoFocusLost
        Utils.placeholder(jtxtApellido, "Ingrese su apellido", false);
    }//GEN-LAST:event_jtxtApellidoFocusLost

    private void jtxtCorreoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCorreoFocusGained
        Utils.placeholder(jtxtCorreo, "Ingrese su correo electrónico", true);
    }//GEN-LAST:event_jtxtCorreoFocusGained

    private void jtxtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCorreoFocusLost
        Utils.placeholder(jtxtCorreo, "Ingrese su correo electrónico", false);
    }//GEN-LAST:event_jtxtCorreoFocusLost

    private void jtxtNumeroTelefonicoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNumeroTelefonicoFocusGained
        Utils.placeholder(jtxtNumeroTelefonico, "Ingrese su número telefónico", true);
    }//GEN-LAST:event_jtxtNumeroTelefonicoFocusGained

    private void jtxtNumeroTelefonicoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtNumeroTelefonicoFocusLost
        Utils.placeholder(jtxtNumeroTelefonico, "Ingrese su número telefónico", false);
    }//GEN-LAST:event_jtxtNumeroTelefonicoFocusLost

    private void jtxtDNIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtDNIFocusGained
        Utils.placeholder(jtxtDNI, "Ingrese su DNI", true);
    }//GEN-LAST:event_jtxtDNIFocusGained

    private void jtxtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtDNIFocusLost
        Utils.placeholder(jtxtDNI, "Ingrese su DNI", false);
    }//GEN-LAST:event_jtxtDNIFocusLost

    private void jtxtEdadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtEdadFocusGained
        Utils.placeholder(jtxtEdad, "Ingrese su edad", true);
    }//GEN-LAST:event_jtxtEdadFocusGained

    private void jtxtEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtEdadFocusLost
        Utils.placeholder(jtxtEdad, "Ingrese su edad", false);
    }//GEN-LAST:event_jtxtEdadFocusLost

    private void jpswContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpswContraseñaFocusGained
        Utils.placeholder(jpswContraseña, ("Ingrese su contraseña").toCharArray(), true);
    }//GEN-LAST:event_jpswContraseñaFocusGained

    private void jpswContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpswContraseñaFocusLost
        Utils.placeholder(jpswContraseña, ("Ingrese su contraseña").toCharArray(), false);
    }//GEN-LAST:event_jpswContraseñaFocusLost

    private void jpswConfirmeContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpswConfirmeContraseñaFocusGained
        Utils.placeholder(jpswConfirmeContraseña, ("Reingrese su contraseña").toCharArray(), true);
    }//GEN-LAST:event_jpswConfirmeContraseñaFocusGained

    private void jpswConfirmeContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpswConfirmeContraseñaFocusLost
        Utils.placeholder(jpswConfirmeContraseña, ("Reingrese su contraseña").toCharArray(), false);
    }//GEN-LAST:event_jpswConfirmeContraseñaFocusLost

    private void jlblCambioColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseEntered
        Utils.ordenDeComponentesInfo(jpnlInfoModoOscuro, jlblInfoModoOscuro, true);
    }//GEN-LAST:event_jlblCambioColorMouseEntered

    private void jlblCambioColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseExited
        Utils.ordenDeComponentesInfo(jpnlInfoModoOscuro, jlblInfoModoOscuro, false);
    }//GEN-LAST:event_jlblCambioColorMouseExited

    private void jlblPerfilMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblPerfilMiniMouseEntered
        Utils.ordenDeComponentesInfo(jpnlInfoPerfil, jlblInfoPerfil, true);
    }//GEN-LAST:event_jlblPerfilMiniMouseEntered

    private void jlblPerfilMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblPerfilMiniMouseExited
        Utils.ordenDeComponentesInfo(jpnlInfoPerfil, jlblInfoPerfil, false);
    }//GEN-LAST:event_jlblPerfilMiniMouseExited

    private void jlblRegistroBusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseEntered
        Utils.resaltarSubtitulos(jlblRegistroBus);
    }//GEN-LAST:event_jlblRegistroBusMouseEntered

    private void jlblRegistroBusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseExited
        Utils.restaurarSubtitulos(jlblRegistroBus);
    }//GEN-LAST:event_jlblRegistroBusMouseExited

    private void jlblRegistroESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblRegistroESMouseClicked

    private void jlblRegistroESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroESMouseEntered
        Utils.resaltarSubtitulos(jlblRegistroES);
    }//GEN-LAST:event_jlblRegistroESMouseEntered

    private void jlblRegistroESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroESMouseExited
        Utils.restaurarSubtitulos(jlblRegistroES);
    }//GEN-LAST:event_jlblRegistroESMouseExited

    private void jtxtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDNIKeyTyped
        if (jtxtDNI.getText().length() >= 8) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jtxtDNIKeyTyped

    private void jtxtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEdadKeyTyped
        if (jtxtEdad.getText().length() >= 2) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jtxtEdadKeyTyped

    private void jtxtNumeroTelefonicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNumeroTelefonicoKeyTyped
        if (jtxtNumeroTelefonico.getText().length() >= 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_jtxtNumeroTelefonicoKeyTyped

    private void jlblIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblIDMouseClicked

    }//GEN-LAST:event_jlblIDMouseClicked

    private void jtxtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jtxtNombreKeyReleased

    private void jtxtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jtxtApellidoKeyReleased

    private void jtxtNumeroTelefonicoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNumeroTelefonicoKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jtxtNumeroTelefonicoKeyReleased

    private void jtxtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDNIKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jtxtDNIKeyReleased

    private void jtxtEdadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEdadKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jtxtEdadKeyReleased

    private void jpswContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswContraseñaKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jpswContraseñaKeyReleased

    private void jpswConfirmeContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswConfirmeContraseñaKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jpswConfirmeContraseñaKeyReleased

    private void jtxtCorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCorreoKeyReleased
        Utils.releasedEnter(jlblAgregar, evt);
    }//GEN-LAST:event_jtxtCorreoKeyReleased

    public static void main(String args[]) throws SQLException {
        Utils.iniciarJframe(new AgregarConductor(false));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblAgregar;
    private javax.swing.JLabel jlblApellido;
    private javax.swing.JLabel jlblApellidoObligatorio;
    private javax.swing.JLabel jlblCambioColor;
    private javax.swing.JLabel jlblConfirmeContraseña;
    private javax.swing.JLabel jlblConfirmeContraseñaObligatorio;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblContraseñaObligatorio;
    private javax.swing.JLabel jlblCorreo;
    private javax.swing.JLabel jlblCorreoObligatorio;
    private javax.swing.JLabel jlblDNI;
    private javax.swing.JLabel jlblDNIObligatorio;
    private javax.swing.JLabel jlblEdad;
    private javax.swing.JLabel jlblEdadObligatorio;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblFondo;
    private javax.swing.JLabel jlblID;
    private javax.swing.JLabel jlblIDObligatorio;
    private javax.swing.JLabel jlblInfoModoOscuro;
    private javax.swing.JLabel jlblInfoPerfil;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblLogoEmpresa;
    private javax.swing.JLabel jlblMaximizar;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblNombre;
    private javax.swing.JLabel jlblNombreEmpresa;
    private javax.swing.JLabel jlblNombreObligatorio;
    private javax.swing.JLabel jlblNumeroTelefonico;
    private javax.swing.JLabel jlblNumeroTelefonicoObligatorio;
    private javax.swing.JLabel jlblPerfilMini;
    private javax.swing.JLabel jlblRegistrarConductor;
    private javax.swing.JLabel jlblRegistroBus;
    private javax.swing.JLabel jlblRegistroES;
    private javax.swing.JLabel jlblRegresar;
    private javax.swing.JLabel jlblSlogan;
    private javax.swing.JPanel jpnlAgregar;
    private javax.swing.JPanel jpnlBarraDeTitulos;
    private javax.swing.JPanel jpnlBarraLateral;
    private javax.swing.JPanel jpnlCambioColor;
    private javax.swing.JPanel jpnlDinamico;
    private javax.swing.JPanel jpnlExit;
    private javax.swing.JPanel jpnlInfoModoOscuro;
    private javax.swing.JPanel jpnlInfoPerfil;
    private javax.swing.JPanel jpnlMaximizar;
    private javax.swing.JPanel jpnlMinimizar;
    private javax.swing.JPanel jpnlPerfilMini;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPanel jpnlRegistroBus;
    private javax.swing.JPanel jpnlRegistroES;
    private javax.swing.JPasswordField jpswConfirmeContraseña;
    private javax.swing.JPasswordField jpswContraseña;
    private javax.swing.JSeparator jsepApellido;
    private javax.swing.JSeparator jsepConfirmeContraseña;
    private javax.swing.JSeparator jsepContraseña;
    private javax.swing.JSeparator jsepCorreo;
    private javax.swing.JSeparator jsepDNI;
    private javax.swing.JSeparator jsepEdad;
    private javax.swing.JSeparator jsepEmpresaSlogan;
    private javax.swing.JSeparator jsepID;
    private javax.swing.JSeparator jsepNombre;
    private javax.swing.JSeparator jsepNumeroTelefonico;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCorreo;
    private javax.swing.JTextField jtxtDNI;
    private javax.swing.JTextField jtxtEdad;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtNumeroTelefonico;
    // End of variables declaration//GEN-END:variables

}
