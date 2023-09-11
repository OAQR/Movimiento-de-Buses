/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.Interfaces.Supervisor;

import com.project.MySQL.conexion;
import com.project.Utils.Utils;
import java.sql.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class RegistroConductor extends javax.swing.JFrame {

    private boolean maximizar = true, modoOscuro = true;
    private final int[] mousePosition = new int[2];
    private ArrayList<String> cambiaColor = new ArrayList<>(Arrays.asList("jpnlDinamico", "jpnlAgregar", "jpnlModificar", "jpnlBorrar", "jpnlImprimir"));

    public RegistroConductor(boolean modoOscuro) throws SQLException {
        if (Utils.dataBase[0]) {
            conexion.getInstance();;
        }
        initComponents();
        setLocationRelativeTo(null);
        CambioColor(modoOscuro);
    }

    private void CambioColor(boolean modoOscuro) {
        SwingUtilities.invokeLater(() -> {
            revalidate();
            try {
                Utils.ModoOscuro(this, cambiaColor, null, modoOscuro);
                Utils.modificacionComponentes(!modoOscuro, jpnlInfoModoOscuro, jlblInfoModoOscuro, "Modo Oscuro", "Modo Claro");
                Utils.modificacionComponentes(!modoOscuro, jpnlInfoPerfil, jlblInfoPerfil, "Perfil", "Perfil");
//                jlistFormulario.setBackground(modoOscuro ? new Color(81, 81, 81) : new Color(51, 51, 51));
                jlistFormulario.setBackground(new Color(51, 51, 51));
                if (Utils.dataBase[0]) {
                    conexion.listaPersonas("SELECT nombre, apellido FROM Persona WHERE tipo = 'Conductor'", jlistFormulario);
                }
                jlblCambioColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/" + (modoOscuro ? "Light" : "Dark") + "Mode.png")));
                jlblPerfilMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/MiniPerfil" + (modoOscuro ? "Oscuro" : "") + ".png")));
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
        jlblCambioColor = new javax.swing.JLabel();
        jlblPerfilMini = new javax.swing.JLabel();
        jpnlBarraLateral = new javax.swing.JPanel();
        jpnlPerfilMini = new javax.swing.JPanel();
        jpnlCambioColor = new javax.swing.JPanel();
        jlblAgregar = new javax.swing.JLabel();
        jpnlAgregar = new javax.swing.JPanel();
        jlblModificar = new javax.swing.JLabel();
        jpnlModificar = new javax.swing.JPanel();
        jlblBorrar = new javax.swing.JLabel();
        jpnlBorrar = new javax.swing.JPanel();
        jlblImprimir = new javax.swing.JLabel();
        jpnlImprimir = new javax.swing.JPanel();
        jscpFormulario = new javax.swing.JScrollPane();
        jlistFormulario = new javax.swing.JList<>();
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
        jpnlPrincipal.add(jpnlCambioColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 40, 40));

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
        jpnlPrincipal.add(jlblAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, 100, 30));

        jpnlAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jpnlAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.add(jpnlAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 150, 100, 30));

        jlblModificar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblModificar.setForeground(new java.awt.Color(0, 102, 0));
        jlblModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblModificar.setText("Modificar");
        jlblModificar.setToolTipText("");
        jlblModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        jlblModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblModificarMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 100, 30));

        jpnlModificar.setBackground(new java.awt.Color(255, 255, 255));
        jpnlModificar.setForeground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.add(jpnlModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 100, 30));

        jlblBorrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblBorrar.setForeground(new java.awt.Color(0, 102, 0));
        jlblBorrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblBorrar.setText("Borrar");
        jlblBorrar.setToolTipText("");
        jlblBorrar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        jlblBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblBorrarMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 100, 30));

        jpnlBorrar.setBackground(new java.awt.Color(255, 255, 255));
        jpnlBorrar.setForeground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.add(jpnlBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 370, 100, 30));

        jlblImprimir.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblImprimir.setForeground(new java.awt.Color(0, 102, 0));
        jlblImprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblImprimir.setText("Imprimir Registro");
        jlblImprimir.setToolTipText("");
        jlblImprimir.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        jlblImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblImprimirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblImprimirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblImprimirMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 530, 170, 30));

        jpnlImprimir.setBackground(new java.awt.Color(255, 255, 255));
        jpnlImprimir.setForeground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.add(jpnlImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 530, 170, 30));

        jscpFormulario.setBorder(null);

        jlistFormulario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlistFormulario.setForeground(new java.awt.Color(255, 255, 255));
        jlistFormulario.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jlistFormulario.setAlignmentY(1.5F);
        jscpFormulario.setViewportView(jlistFormulario);

        jpnlPrincipal.add(jscpFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 840, 410));

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
            Logger.getLogger(RegistroConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblPerfilMiniMouseClicked

    private void jlblBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBorrarMouseEntered
        Utils.enteredBotonVerde(jlblBorrar);
    }//GEN-LAST:event_jlblBorrarMouseEntered

    private void jlblBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBorrarMouseExited
        Utils.exitedBotonVerde(jlblBorrar);
    }//GEN-LAST:event_jlblBorrarMouseExited

    private void jlblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAgregarMouseClicked
        try {
            Utils.cambioDeJframe(this, new AgregarConductor(!modoOscuro));
        } catch (SQLException ex) {
            Logger.getLogger(RegistroConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblAgregarMouseClicked

    private void jlblAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAgregarMouseEntered
        Utils.enteredBotonVerde(jlblAgregar);
    }//GEN-LAST:event_jlblAgregarMouseEntered

    private void jlblAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblAgregarMouseExited
        Utils.exitedBotonVerde(jlblAgregar);
    }//GEN-LAST:event_jlblAgregarMouseExited

    private void jlblModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblModificarMouseClicked
        try {
            int selectedIndex = jlistFormulario.getSelectedIndex();
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción.");
                return;
            }
            if (Utils.dataBase[0]) {
                PreparedStatement ps = conexion.ModificarPersonas(jlistFormulario);
                Utils.cambioDeJframe(this, new ModificarConductor(!modoOscuro, ps));
            } else {
                Utils.cambioDeJframe(this, new ModificarConductor(!modoOscuro, null));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegistroConductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblModificarMouseClicked

    private void jlblModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblModificarMouseEntered
        Utils.enteredBotonVerde(jlblModificar);
    }//GEN-LAST:event_jlblModificarMouseEntered

    private void jlblModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblModificarMouseExited
        Utils.exitedBotonVerde(jlblModificar);
    }//GEN-LAST:event_jlblModificarMouseExited

    private void jlblBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblBorrarMouseClicked
        int selectedIndex = jlistFormulario.getSelectedIndex();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una opción.");
            return;
        }
        conexion.eliminarPersonas(jlistFormulario);

    }//GEN-LAST:event_jlblBorrarMouseClicked

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

    private void jlblRegistroBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblRegistroBusMouseClicked

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

    private void jlblImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblImprimirMouseClicked
        Utils.imprimir(jlistFormulario);
    }//GEN-LAST:event_jlblImprimirMouseClicked

    private void jlblImprimirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblImprimirMouseEntered
        Utils.enteredBotonVerde(jlblImprimir);
    }//GEN-LAST:event_jlblImprimirMouseEntered

    private void jlblImprimirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblImprimirMouseExited
        Utils.exitedBotonVerde(jlblImprimir);
    }//GEN-LAST:event_jlblImprimirMouseExited

//    public static void main(String args[]) throws SQLException {
//        Utils.iniciarJframe(new RegistroConductor(false));
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblAgregar;
    private javax.swing.JLabel jlblBorrar;
    private javax.swing.JLabel jlblCambioColor;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblFondo;
    private javax.swing.JLabel jlblImprimir;
    private javax.swing.JLabel jlblInfoModoOscuro;
    private javax.swing.JLabel jlblInfoPerfil;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblMaximizar;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblModificar;
    private javax.swing.JLabel jlblPerfilMini;
    private javax.swing.JLabel jlblRegistroBus;
    private javax.swing.JLabel jlblRegistroES;
    private javax.swing.JList<String> jlistFormulario;
    private javax.swing.JPanel jpnlAgregar;
    private javax.swing.JPanel jpnlBarraDeTitulos;
    private javax.swing.JPanel jpnlBarraLateral;
    private javax.swing.JPanel jpnlBorrar;
    private javax.swing.JPanel jpnlCambioColor;
    private javax.swing.JPanel jpnlDinamico;
    private javax.swing.JPanel jpnlExit;
    private javax.swing.JPanel jpnlImprimir;
    private javax.swing.JPanel jpnlInfoModoOscuro;
    private javax.swing.JPanel jpnlInfoPerfil;
    private javax.swing.JPanel jpnlMaximizar;
    private javax.swing.JPanel jpnlMinimizar;
    private javax.swing.JPanel jpnlModificar;
    private javax.swing.JPanel jpnlPerfilMini;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPanel jpnlRegistroBus;
    private javax.swing.JPanel jpnlRegistroES;
    private javax.swing.JScrollPane jscpFormulario;
    // End of variables declaration//GEN-END:variables
}
