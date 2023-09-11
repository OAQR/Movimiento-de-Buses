/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.Interfaces;

import com.project.MySQL.conexion;
import com.project.Utils.Utils;
import java.awt.Color;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Principal extends javax.swing.JFrame {

    private boolean maximizar = true, modoOscuro = true;
    private String persona = null, interfaz = null;
    private final int[] mousePosition = new int[2];
    private ArrayList<String> noCambiaColor = new ArrayList<>(Arrays.asList("jpnlPrincipal", "jpnlBarraDeTitulos", "jpnlBarraLateral", "jlblLogo",
            "jlblCambioColor", "jpnlCambioColor", "jlblExit", "jpnlExit", "jlblMaximizar", "jpnlMaximizar", "jlblMinimizar",
            "jpnlMinimizar", "jlblLogoEmpresa", "jlblNombreEmpresa", "jlblIniciarSesion", "jpnlInfoModoOscuro", "jlblInfoModoOscuro"));

    public Principal(boolean modoOscuro) throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        CambioColor(modoOscuro);
        if (Utils.dataBase[0]) {
            conexion.getInstance();;
        }
//        conexion.getInstance().CerrarConnexion();
    }

    private void CambioColor(boolean modoOscuro) {
        SwingUtilities.invokeLater(() -> {
            revalidate();
            try {
                Utils.ModoOscuro(this, null, noCambiaColor, modoOscuro);
                Utils.alturaSeparator(jsepEmpresaSlogan, modoOscuro);
                Utils.modificacionComponentes(!modoOscuro, jpnlInfoModoOscuro, jlblInfoModoOscuro, "Modo Oscuro", "Modo Claro");
                jlblLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/logo_" + (!modoOscuro ? "negro" : "blanco") + ".png")));
                jlblCambioColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/" + (!modoOscuro ? "Dark" : "Light") + "Mode.png")));
                jpnlBarraSuperior.setBackground(!modoOscuro ? new Color(102, 255, 255) : new Color(76, 22, 86));
                jpnlBarraInferior.setBackground(!modoOscuro ? new Color(102, 255, 255) : new Color(76, 22, 86));
                jlblSlogan.setForeground(!modoOscuro ? new Color(51, 51, 255) : new Color(250, 1, 154));
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
        jpnlBarraDeTitulos = new javax.swing.JPanel();
        jlblCambioColor = new javax.swing.JLabel();
        jpnlBarraLateral = new javax.swing.JPanel();
        jpnlCambioColor = new javax.swing.JPanel();
        jlblLogoEmpresa = new javax.swing.JLabel();
        jlblNombreEmpresa = new javax.swing.JLabel();
        jsepEmpresaSlogan = new javax.swing.JSeparator();
        jlblSlogan = new javax.swing.JLabel();
        jlblInicioSesion = new javax.swing.JLabel();
        jlblUsuario = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jsepUsuario = new javax.swing.JSeparator();
        jlblContraseña = new javax.swing.JLabel();
        jpswContraseña = new javax.swing.JPasswordField();
        jsepContraseña = new javax.swing.JSeparator();
        jlblIniciarSesion = new javax.swing.JLabel();
        jpnlIniciarSesion = new javax.swing.JPanel();
        jpnlBarraSuperior = new javax.swing.JPanel();
        jpnlBarraInferior = new javax.swing.JPanel();
        jpnlDinamico = new javax.swing.JPanel();
        jlblFondo = new javax.swing.JLabel();
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

        jpnlBarraDeTitulos.setBackground(new java.awt.Color(51, 51, 51));
        jpnlBarraDeTitulos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fjpnlBarraDeTitulosMouseDragged(evt);
            }
        });
        jpnlBarraDeTitulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fjpnlBarraDeTitulosMousePressed(evt);
            }
        });
        jpnlPrincipal.add(jpnlBarraDeTitulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 30));

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

        jpnlBarraLateral.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));
        jpnlPrincipal.add(jpnlCambioColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 40, 40));

        jlblLogoEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/logo_negro.png"))); // NOI18N
        jpnlPrincipal.add(jlblLogoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 190, 250));

        jlblNombreEmpresa.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblNombreEmpresa.setForeground(new java.awt.Color(255, 51, 0));
        jlblNombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblNombreEmpresa.setText("BusLink");
        jlblNombreEmpresa.setToolTipText("");
        jpnlPrincipal.add(jlblNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, 50));

        jsepEmpresaSlogan.setBackground(new java.awt.Color(0, 0, 0));
        jsepEmpresaSlogan.setForeground(new java.awt.Color(0, 0, 0));
        jsepEmpresaSlogan.setAlignmentX(2.0F);
        jsepEmpresaSlogan.setAlignmentY(2.0F);
        jsepEmpresaSlogan.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepEmpresaSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 180, 30));

        jlblSlogan.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jlblSlogan.setForeground(new java.awt.Color(51, 51, 255));
        jlblSlogan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblSlogan.setText("¡Tu viaje perfecto comienza aquí!");
        jpnlPrincipal.add(jlblSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 230, 50));

        jlblInicioSesion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblInicioSesion.setForeground(new java.awt.Color(0, 0, 0));
        jlblInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlblInicioSesion.setText("Inicio de Sesión");
        jpnlPrincipal.add(jlblInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 190, 30));

        jlblUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jlblUsuario.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jlblUsuario.setText("USUARIO (ID)");
        jpnlPrincipal.add(jlblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, 120, 30));

        jtxtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        jtxtUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtUsuario.setText("Ingrese su nombre de usuario");
        jtxtUsuario.setToolTipText("");
        jtxtUsuario.setBorder(null);
        jtxtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtUsuarioFocusLost(evt);
            }
        });
        jtxtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtUsuarioKeyTyped(evt);
            }
        });
        jpnlPrincipal.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 320, 20));

        jsepUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jsepUsuario.setAlignmentX(2.0F);
        jsepUsuario.setAlignmentY(2.0F);
        jsepUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 300, 30));

        jlblContraseña.setBackground(new java.awt.Color(0, 0, 0));
        jlblContraseña.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jlblContraseña.setText("CONTRASEÑA");
        jpnlPrincipal.add(jlblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, 130, 30));

        jpswContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jpswContraseña.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jpswContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jpswContraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jpswContraseña.setText("Ingrese su contraseña");
        jpswContraseña.setBorder(null);
        jpswContraseña.setDisabledTextColor(new java.awt.Color(221, 221, 221));
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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpswContraseñaKeyTyped(evt);
            }
        });
        jpnlPrincipal.add(jpswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 320, 20));

        jsepContraseña.setForeground(new java.awt.Color(0, 0, 0));
        jsepContraseña.setAlignmentX(2.0F);
        jsepContraseña.setAlignmentY(2.0F);
        jsepContraseña.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jpnlPrincipal.add(jsepContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 300, 30));

        jlblIniciarSesion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblIniciarSesion.setForeground(new java.awt.Color(0, 102, 0));
        jlblIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblIniciarSesion.setText("Iniciar Sesión");
        jlblIniciarSesion.setToolTipText("");
        jlblIniciarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        jlblIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fjlblIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fjlblIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fjlblIniciarSesionMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 110, 30));

        jpnlIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPrincipal.add(jpnlIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 110, 30));

        jpnlBarraSuperior.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jpnlBarraSuperiorLayout = new javax.swing.GroupLayout(jpnlBarraSuperior);
        jpnlBarraSuperior.setLayout(jpnlBarraSuperiorLayout);
        jpnlBarraSuperiorLayout.setHorizontalGroup(
            jpnlBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        jpnlBarraSuperiorLayout.setVerticalGroup(
            jpnlBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jpnlPrincipal.add(jpnlBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, -1));

        jpnlBarraInferior.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jpnlBarraInferiorLayout = new javax.swing.GroupLayout(jpnlBarraInferior);
        jpnlBarraInferior.setLayout(jpnlBarraInferiorLayout);
        jpnlBarraInferiorLayout.setHorizontalGroup(
            jpnlBarraInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1240, Short.MAX_VALUE)
        );
        jpnlBarraInferiorLayout.setVerticalGroup(
            jpnlBarraInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jpnlPrincipal.add(jpnlBarraInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 1240, -1));

        jpnlDinamico.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPrincipal.add(jpnlDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 690));

        jlblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/fondo1.png"))); // NOI18N
        jpnlPrincipal.add(jlblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 690));

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
        jpnlInfoModoOscuro.getAccessibleContext().setAccessibleName("");

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

    private void fjpnlBarraDeTitulosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fjpnlBarraDeTitulosMouseDragged
        Utils.handleDraggedBarraDeTitulos(this, mousePosition, evt);
    }//GEN-LAST:event_fjpnlBarraDeTitulosMouseDragged

    private void fjpnlBarraDeTitulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fjpnlBarraDeTitulosMousePressed
        Utils.handlePressedBarraDeTitulos(mousePosition, evt);
    }//GEN-LAST:event_fjpnlBarraDeTitulosMousePressed

    private void jlblCambioColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseClicked
        CambioColor(modoOscuro);
    }//GEN-LAST:event_jlblCambioColorMouseClicked

    private void jtxtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusGained
        Utils.placeholder(jtxtUsuario, "Ingrese su nombre de usuario", true);
    }//GEN-LAST:event_jtxtUsuarioFocusGained

    private void jtxtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtUsuarioFocusLost
        Utils.placeholder(jtxtUsuario, "Ingrese su nombre de usuario", false);
    }//GEN-LAST:event_jtxtUsuarioFocusLost

    private void jtxtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyTyped

    }//GEN-LAST:event_jtxtUsuarioKeyTyped

    private void jpswContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpswContraseñaFocusGained
        Utils.placeholder(jpswContraseña, "Ingrese su contraseña".toCharArray(), true);
    }//GEN-LAST:event_jpswContraseñaFocusGained

    private void jpswContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpswContraseñaFocusLost
        Utils.placeholder(jpswContraseña, "Ingrese su contraseña".toCharArray(), false);
    }//GEN-LAST:event_jpswContraseñaFocusLost

    private void jpswContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswContraseñaKeyTyped

    }//GEN-LAST:event_jpswContraseñaKeyTyped

    private void fjlblIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fjlblIniciarSesionMouseClicked
        jlblIniciarSesion.requestFocus();
        String[] campos = {"Usuario", "Contraseña"};
        String[] text = {"nombre de usuario", "contraseña"};

        boolean camposValidos = Utils.validarCamposInicioSesion(campos, text, this, modoOscuro);

        String persona = jtxtUsuario.getText().substring(0, 1).equalsIgnoreCase("A") ? "Administrador"
                : jtxtUsuario.getText().substring(0, 1).equalsIgnoreCase("S") ? "Supervisor"
                : jtxtUsuario.getText().substring(0, 1).equalsIgnoreCase("C") ? "Conductor" : "";
        
        if (Utils.dataBase[0]) {
        try {
            if (!persona.isEmpty()) {
                camposValidos = conexion.inicioSesion(persona, "SELECT * FROM " + persona/*.toLowerCase()*/, jtxtUsuario.getText(), jpswContraseña.getPassword());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }

        if (camposValidos) {

            String interfaz = "com.project.Interfaces." + persona + ".I" + persona;
            try {
                Class<?> interfazClass = Class.forName(interfaz);
                Constructor<?> constructor = interfazClass.getConstructor(boolean.class);
                Object objetoInterfaz = constructor.newInstance(!modoOscuro);

                if (objetoInterfaz instanceof JFrame jFrame) {
                    Utils.cambioDeJframe(this, jFrame);
                } else {
                    throw new ClassNotFoundException("La clase no extiende de JFrame.");
                }
            } catch (ClassNotFoundException ex) {
//                JOptionPane.showMessageDialog(null, "Error al iniciar sesión: No se encuentra la clase correspondiente.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NoSuchMethodException ex) {
//                JOptionPane.showMessageDialog(null, "Error al iniciar sesión: No se encuentra el constructor correspondiente.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InstantiationException ex) {
//                JOptionPane.showMessageDialog(null, "Error al iniciar sesión: No se puede crear la instancia correspondiente.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalAccessException ex) {
//                JOptionPane.showMessageDialog(null, "Error al iniciar sesión: No se puede acceder al constructor correspondiente.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IllegalArgumentException ex) {
//                JOptionPane.showMessageDialog(null, "Error al iniciar sesión: Argumento inválido.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (InvocationTargetException ex) {
//                JOptionPane.showMessageDialog(null, "Error al iniciar sesión: Invocación de método inválida.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_fjlblIniciarSesionMouseClicked

    private void fjlblIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fjlblIniciarSesionMouseEntered
        Utils.enteredBotonVerde(jlblIniciarSesion);
    }//GEN-LAST:event_fjlblIniciarSesionMouseEntered

    private void fjlblIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fjlblIniciarSesionMouseExited
        Utils.exitedBotonVerde(jlblIniciarSesion);
    }//GEN-LAST:event_fjlblIniciarSesionMouseExited

    private void jlblCambioColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseEntered
        Utils.ordenDeComponentesInfo(jpnlInfoModoOscuro, jlblInfoModoOscuro, true);
    }//GEN-LAST:event_jlblCambioColorMouseEntered

    private void jlblCambioColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseExited
        Utils.ordenDeComponentesInfo(jpnlInfoModoOscuro, jlblInfoModoOscuro, false);
    }//GEN-LAST:event_jlblCambioColorMouseExited

    private void jtxtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtUsuarioKeyReleased
        Utils.releasedEnter(jlblIniciarSesion, evt);
    }//GEN-LAST:event_jtxtUsuarioKeyReleased

    private void jpswContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpswContraseñaKeyReleased
        Utils.releasedEnter(jlblIniciarSesion, evt);
    }//GEN-LAST:event_jpswContraseñaKeyReleased

    public static void main(String args[]) throws SQLException {
        Utils.iniciarJframe(new Principal(false));
        conexion.getInstance().conectar();
//        Audio.convertirMP3aWAV("com/project/Audio/InicioSesion.mp3", "com/project/Audio/InicioSesion.wav");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblCambioColor;
    private javax.swing.JLabel jlblContraseña;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblFondo;
    private javax.swing.JLabel jlblInfoModoOscuro;
    private javax.swing.JLabel jlblIniciarSesion;
    private javax.swing.JLabel jlblInicioSesion;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblLogoEmpresa;
    private javax.swing.JLabel jlblMaximizar;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblNombreEmpresa;
    private javax.swing.JLabel jlblSlogan;
    private javax.swing.JLabel jlblUsuario;
    private javax.swing.JPanel jpnlBarraDeTitulos;
    private javax.swing.JPanel jpnlBarraInferior;
    private javax.swing.JPanel jpnlBarraLateral;
    private javax.swing.JPanel jpnlBarraSuperior;
    private javax.swing.JPanel jpnlCambioColor;
    private javax.swing.JPanel jpnlDinamico;
    private javax.swing.JPanel jpnlExit;
    private javax.swing.JPanel jpnlInfoModoOscuro;
    private javax.swing.JPanel jpnlIniciarSesion;
    private javax.swing.JPanel jpnlMaximizar;
    private javax.swing.JPanel jpnlMinimizar;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPasswordField jpswContraseña;
    private javax.swing.JSeparator jsepContraseña;
    private javax.swing.JSeparator jsepEmpresaSlogan;
    private javax.swing.JSeparator jsepUsuario;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
