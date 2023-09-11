/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.Interfaces.Administrador;

import com.project.MySQL.conexion;
import com.project.Utils.Utils;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class Horario extends javax.swing.JFrame {

    private boolean maximizar = true, modoOscuro = true;
    private final int[] mousePosition = new int[2];
    private ArrayList<String> cambiaColor = new ArrayList<>(Arrays.asList("jlblHorario", "jpnlDinamico"));

    public Horario(boolean modoOscuro) throws SQLException {
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
                jpnlDias.setBackground(!modoOscuro ? new Color(51, 51, 51) : new Color(81, 81, 81));
                jpnlHoras.setBackground(!modoOscuro ? new Color(51, 51, 51) : new Color(81, 81, 81));
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
        jlblPerfilMini = new javax.swing.JLabel();
        jlblGestionDeBuses = new javax.swing.JLabel();
        jpnlGestionDeBuses = new javax.swing.JPanel();
        jpnlBarraDeTitulos = new javax.swing.JPanel();
        jlblCambioColor = new javax.swing.JLabel();
        jpnlBarraLateral = new javax.swing.JPanel();
        jpnlPerfilMini = new javax.swing.JPanel();
        jpnlCambioColor = new javax.swing.JPanel();
        jlblHorario = new javax.swing.JLabel();
        jpnlDias = new javax.swing.JPanel();
        jlblDomingo = new javax.swing.JLabel();
        jlblSabado = new javax.swing.JLabel();
        jlblViernes = new javax.swing.JLabel();
        jlblJueves = new javax.swing.JLabel();
        jlblMiercoles = new javax.swing.JLabel();
        jlblMartes = new javax.swing.JLabel();
        jlblLunes = new javax.swing.JLabel();
        jpnlHoras = new javax.swing.JPanel();
        jlblCero = new javax.swing.JLabel();
        jlblUno = new javax.swing.JLabel();
        jlblDos = new javax.swing.JLabel();
        jlblTres = new javax.swing.JLabel();
        jlblCuatro = new javax.swing.JLabel();
        jlblCinco = new javax.swing.JLabel();
        jlblSeis = new javax.swing.JLabel();
        jlblSiete = new javax.swing.JLabel();
        jlblOcho = new javax.swing.JLabel();
        jlblNueve = new javax.swing.JLabel();
        jlblDiez = new javax.swing.JLabel();
        jlblOnce = new javax.swing.JLabel();
        jlblCeroLunes = new javax.swing.JLabel();
        jlblUnoLunes = new javax.swing.JLabel();
        jlblDosLunes = new javax.swing.JLabel();
        jlblTresLunes = new javax.swing.JLabel();
        jlblCuatroLunes = new javax.swing.JLabel();
        jlblCincoLunes = new javax.swing.JLabel();
        jlblSeisLunes = new javax.swing.JLabel();
        jlblSieteLunes = new javax.swing.JLabel();
        jlblOchoLunes = new javax.swing.JLabel();
        jlblNueveLunes = new javax.swing.JLabel();
        jlblDiezLunes = new javax.swing.JLabel();
        jlblOnceLunes = new javax.swing.JLabel();
        jlblCeroMartes = new javax.swing.JLabel();
        jlblUnoMartes = new javax.swing.JLabel();
        jlblDosMartes = new javax.swing.JLabel();
        jlblTresMartes = new javax.swing.JLabel();
        jlblCuatroMartes = new javax.swing.JLabel();
        jlblCincoMartes = new javax.swing.JLabel();
        jlblSeisMartes = new javax.swing.JLabel();
        jlblSieteMartes = new javax.swing.JLabel();
        jlblOchoMartes = new javax.swing.JLabel();
        jlblNueveMartes = new javax.swing.JLabel();
        jlblDiezMartes = new javax.swing.JLabel();
        jlblOnceMartes = new javax.swing.JLabel();
        jlblCeroMiercoles = new javax.swing.JLabel();
        jlblUnoMiercoles = new javax.swing.JLabel();
        jlblDosMiercoles = new javax.swing.JLabel();
        jlblTresMiercoles = new javax.swing.JLabel();
        jlblCuatroMiercoles = new javax.swing.JLabel();
        jlblCincoMiercoles = new javax.swing.JLabel();
        jlblSeisMiercoles = new javax.swing.JLabel();
        jlblSieteMiercoles = new javax.swing.JLabel();
        jlblOchoMiercoles = new javax.swing.JLabel();
        jlblNueveMiercoles = new javax.swing.JLabel();
        jlblDiezMiercoles = new javax.swing.JLabel();
        jlblOnceMiercoles = new javax.swing.JLabel();
        jlblCeroJueves = new javax.swing.JLabel();
        jlblUnoJueves = new javax.swing.JLabel();
        jlblDosJueves = new javax.swing.JLabel();
        jlblTresJueves = new javax.swing.JLabel();
        jlblCuatroJueves = new javax.swing.JLabel();
        jlblCincoJueves = new javax.swing.JLabel();
        jlblSeisJueves = new javax.swing.JLabel();
        jlblSieteJueves = new javax.swing.JLabel();
        jlblOchoJueves = new javax.swing.JLabel();
        jlblNueveJueves = new javax.swing.JLabel();
        jlblDiezJueves = new javax.swing.JLabel();
        jlblOnceJueves = new javax.swing.JLabel();
        jlblCeroViernes = new javax.swing.JLabel();
        jlblUnoViernes = new javax.swing.JLabel();
        jlblDosViernes = new javax.swing.JLabel();
        jlblTresViernes = new javax.swing.JLabel();
        jlblCuatroViernes = new javax.swing.JLabel();
        jlblCincoViernes = new javax.swing.JLabel();
        jlblSeisViernes = new javax.swing.JLabel();
        jlblSieteViernes = new javax.swing.JLabel();
        jlblOchoViernes = new javax.swing.JLabel();
        jlblNueveViernes = new javax.swing.JLabel();
        jlblDiezViernes = new javax.swing.JLabel();
        jlblOnceViernes = new javax.swing.JLabel();
        jlblCeroSabado = new javax.swing.JLabel();
        jlblUnoSabado = new javax.swing.JLabel();
        jlblDosSabado = new javax.swing.JLabel();
        jlblTresSabado = new javax.swing.JLabel();
        jlblCuatroSabado = new javax.swing.JLabel();
        jlblCincoSabado = new javax.swing.JLabel();
        jlblSeisSabado = new javax.swing.JLabel();
        jlblSieteSabado = new javax.swing.JLabel();
        jlblOchoSabado = new javax.swing.JLabel();
        jlblNueveSabado = new javax.swing.JLabel();
        jlblDiezSabado = new javax.swing.JLabel();
        jlblOnceSabado = new javax.swing.JLabel();
        jlblCeroDomingo = new javax.swing.JLabel();
        jlblUnoDomingo = new javax.swing.JLabel();
        jlblDosDomingo = new javax.swing.JLabel();
        jlblTresDomingo = new javax.swing.JLabel();
        jlblCuatroDomingo = new javax.swing.JLabel();
        jlblCincoDomingo = new javax.swing.JLabel();
        jlblSeisDomingo = new javax.swing.JLabel();
        jlblSieteDomingo = new javax.swing.JLabel();
        jlblOchoDomingo = new javax.swing.JLabel();
        jlblNueveDomingo = new javax.swing.JLabel();
        jlblDiezDomingo = new javax.swing.JLabel();
        jlblOnceDomingo = new javax.swing.JLabel();
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

        jlblGestionDeBuses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblGestionDeBuses.setForeground(new java.awt.Color(134, 134, 134));
        jlblGestionDeBuses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblGestionDeBuses.setText("Gestión de Buses");
        jlblGestionDeBuses.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblGestionDeBuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblGestionDeBusesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblGestionDeBusesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblGestionDeBusesMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblGestionDeBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 30));

        jpnlGestionDeBuses.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlGestionDeBuses, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 130, 30));

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

        jpnlBarraLateral.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 720));
        jpnlPrincipal.add(jpnlPerfilMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 40, 40));
        jpnlPrincipal.add(jpnlCambioColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 40, 40));

        jlblHorario.setBackground(new java.awt.Color(255, 255, 255));
        jlblHorario.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jlblHorario.setForeground(new java.awt.Color(0, 0, 0));
        jlblHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblHorario.setText("Horario");
        jpnlPrincipal.add(jlblHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, 40));

        jpnlDias.setBackground(new java.awt.Color(51, 51, 51));

        jlblDomingo.setBackground(new java.awt.Color(51, 51, 51));
        jlblDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDomingo.setText("DOMINGO");
        jlblDomingo.setToolTipText("");
        jlblDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        jlblDomingo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblSabado.setBackground(new java.awt.Color(51, 51, 51));
        jlblSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSabado.setText("SABADO");
        jlblSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));

        jlblViernes.setBackground(new java.awt.Color(51, 51, 51));
        jlblViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblViernes.setText("VIERNES");
        jlblViernes.setToolTipText("");
        jlblViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));
        jlblViernes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlblJueves.setBackground(new java.awt.Color(51, 51, 51));
        jlblJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblJueves.setText("JUEVES");
        jlblJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));

        jlblMiercoles.setBackground(new java.awt.Color(51, 51, 51));
        jlblMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMiercoles.setText("MIERCOLES");
        jlblMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));

        jlblMartes.setBackground(new java.awt.Color(51, 51, 51));
        jlblMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblMartes.setText("MARTES");
        jlblMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));

        jlblLunes.setBackground(new java.awt.Color(51, 51, 51));
        jlblLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLunes.setText("LUNES");
        jlblLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 2, 3, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpnlDiasLayout = new javax.swing.GroupLayout(jpnlDias);
        jpnlDias.setLayout(jpnlDiasLayout);
        jpnlDiasLayout.setHorizontalGroup(
            jpnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(jpnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlDiasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jlblLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jlblMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jlblMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jlblJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jlblViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jlblSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jlblDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpnlDiasLayout.setVerticalGroup(
            jpnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(jpnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlDiasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpnlPrincipal.add(jpnlDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 840, 30));

        jpnlHoras.setBackground(new java.awt.Color(51, 51, 51));

        jlblCero.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCero.setForeground(new java.awt.Color(255, 255, 255));
        jlblCero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCero.setText("00:00 - 01:00");
        jlblCero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblUno.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUno.setForeground(new java.awt.Color(255, 255, 255));
        jlblUno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUno.setText("01:00 - 02:00");
        jlblUno.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblDos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDos.setForeground(new java.awt.Color(255, 255, 255));
        jlblDos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDos.setText("02:00 - 03:00");
        jlblDos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblTres.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTres.setForeground(new java.awt.Color(255, 255, 255));
        jlblTres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTres.setText("03:00 - 04:00");
        jlblTres.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblCuatro.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatro.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatro.setText("04:00 - 05:00");
        jlblCuatro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblCinco.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCinco.setForeground(new java.awt.Color(255, 255, 255));
        jlblCinco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCinco.setText("05:00 - 06:00");
        jlblCinco.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblSeis.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeis.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeis.setText("06:00 - 07:00");
        jlblSeis.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblSiete.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSiete.setForeground(new java.awt.Color(255, 255, 255));
        jlblSiete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSiete.setText("07:00 - 08:00");
        jlblSiete.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblOcho.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOcho.setForeground(new java.awt.Color(255, 255, 255));
        jlblOcho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOcho.setText("08:00 - 09:00");
        jlblOcho.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblNueve.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueve.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueve.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueve.setText("09:00 - 10:00");
        jlblNueve.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblDiez.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiez.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiez.setText("10:00 - 11:00");
        jlblDiez.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblOnce.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnce.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnce.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnce.setText("11:00 - 12:00");
        jlblOnce.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jlblCeroLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceLunes.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceLunes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceLunes.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceLunes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCeroMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceMartes.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceMartes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceMartes.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceMartes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCeroMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceMiercoles.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceMiercoles.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCeroJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceJueves.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceJueves.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceJueves.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceJueves.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCeroViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceViernes.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceViernes.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceViernes.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceViernes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCeroSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceSabado.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceSabado.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceSabado.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceSabado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceSabado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCeroDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblCeroDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCeroDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblCeroDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCeroDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblUnoDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblUnoDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblUnoDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblUnoDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblUnoDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDosDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblDosDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDosDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblDosDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDosDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblTresDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblTresDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblTresDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblTresDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblTresDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCuatroDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblCuatroDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCuatroDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblCuatroDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCuatroDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblCincoDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblCincoDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblCincoDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblCincoDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCincoDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSeisDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblSeisDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSeisDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblSeisDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSeisDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblSieteDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblSieteDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblSieteDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblSieteDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSieteDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOchoDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblOchoDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOchoDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblOchoDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOchoDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblNueveDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblNueveDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblNueveDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblNueveDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNueveDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblDiezDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblDiezDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblDiezDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblDiezDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblDiezDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        jlblOnceDomingo.setBackground(new java.awt.Color(0, 0, 0));
        jlblOnceDomingo.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jlblOnceDomingo.setForeground(new java.awt.Color(255, 255, 255));
        jlblOnceDomingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblOnceDomingo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(1, 1, 1)));

        javax.swing.GroupLayout jpnlHorasLayout = new javax.swing.GroupLayout(jpnlHoras);
        jpnlHoras.setLayout(jpnlHorasLayout);
        jpnlHorasLayout.setHorizontalGroup(
            jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlHorasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblCero, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCeroDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblUno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblUnoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblDos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDosDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblTres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblTresDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCuatroDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblCincoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSeisDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblSieteDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOchoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblNueveDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblDiezDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlHorasLayout.createSequentialGroup()
                            .addComponent(jlblOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jlblOnceDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpnlHorasLayout.setVerticalGroup(
            jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnlHorasLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblCero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCeroDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblUno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblUnoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblDos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDosDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblTres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblTresDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCuatroDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblCincoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSeisDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblSieteDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOchoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblNueveDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblDiezDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlblOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceSabado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlblOnceDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpnlPrincipal.add(jpnlHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 149, 960, 480));

        jpnlDinamico.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPrincipal.add(jpnlDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 690));

        jlblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/fondo1.png"))); // NOI18N
        jpnlPrincipal.add(jlblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 690));

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
            .addGap(0, 50, Short.MAX_VALUE)
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

    private void jlblCambioColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseClicked
        CambioColor(modoOscuro);
    }//GEN-LAST:event_jlblCambioColorMouseClicked

    private void jpnlBarraDeTitulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlBarraDeTitulosMousePressed
        Utils.handlePressedBarraDeTitulos(mousePosition, evt);
    }//GEN-LAST:event_jpnlBarraDeTitulosMousePressed

    private void jpnlBarraDeTitulosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlBarraDeTitulosMouseDragged
        Utils.handleDraggedBarraDeTitulos(this, mousePosition, evt);
    }//GEN-LAST:event_jpnlBarraDeTitulosMouseDragged

    private void jlblMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseExited
        Utils.exitedMaximizar_Minimizar(jpnlMinimizar, jlblMinimizar);
    }//GEN-LAST:event_jlblMinimizarMouseExited

    private void jlblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseEntered
        Utils.enteredMaximizar_Minimizar(jpnlMinimizar, jlblMinimizar);
    }//GEN-LAST:event_jlblMinimizarMouseEntered

    private void jlblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
        maximizar = true;
    }//GEN-LAST:event_jlblMinimizarMouseClicked

    private void jlblMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMaximizarMouseExited
        Utils.exitedMaximizar_Minimizar(jpnlMaximizar, jlblMaximizar);
    }//GEN-LAST:event_jlblMaximizarMouseExited

    private void jlblMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMaximizarMouseEntered
        Utils.enteredMaximizar_Minimizar(jpnlMaximizar, jlblMaximizar);
    }//GEN-LAST:event_jlblMaximizarMouseEntered

    private void jlblMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblMaximizarMouseClicked
        maximizar = Utils.clickedMaximizar(this, maximizar);
    }//GEN-LAST:event_jlblMaximizarMouseClicked

    private void jlblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblExitMouseExited
        Utils.restaurarBotonSalir(jlblExit);
    }//GEN-LAST:event_jlblExitMouseExited

    private void jlblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblExitMouseEntered
        Utils.resaltarBotonSalir(jlblExit);
    }//GEN-LAST:event_jlblExitMouseEntered

    private void jlblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlblExitMouseClicked

    private void jlblPerfilMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblPerfilMiniMouseClicked
        try {
            Utils.cambioDeJframe(this, new IAdministrador(!modoOscuro));
        } catch (SQLException ex) {
            Logger.getLogger(Horario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblPerfilMiniMouseClicked

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

    private void jlblGestionDeBusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblGestionDeBusesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblGestionDeBusesMouseClicked

    private void jlblGestionDeBusesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblGestionDeBusesMouseEntered
        Utils.resaltarSubtitulos(jlblGestionDeBuses);
    }//GEN-LAST:event_jlblGestionDeBusesMouseEntered

    private void jlblGestionDeBusesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblGestionDeBusesMouseExited
        Utils.restaurarSubtitulos(jlblGestionDeBuses);
    }//GEN-LAST:event_jlblGestionDeBusesMouseExited

    public static void main(String args[]) {
        try {
            Utils.iniciarJframe(new Horario(false));
        } catch (SQLException ex) {
            Logger.getLogger(Horario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblCambioColor;
    private javax.swing.JLabel jlblCero;
    private javax.swing.JLabel jlblCeroDomingo;
    private javax.swing.JLabel jlblCeroJueves;
    private javax.swing.JLabel jlblCeroLunes;
    private javax.swing.JLabel jlblCeroMartes;
    private javax.swing.JLabel jlblCeroMiercoles;
    private javax.swing.JLabel jlblCeroSabado;
    private javax.swing.JLabel jlblCeroViernes;
    private javax.swing.JLabel jlblCinco;
    private javax.swing.JLabel jlblCincoDomingo;
    private javax.swing.JLabel jlblCincoJueves;
    private javax.swing.JLabel jlblCincoLunes;
    private javax.swing.JLabel jlblCincoMartes;
    private javax.swing.JLabel jlblCincoMiercoles;
    private javax.swing.JLabel jlblCincoSabado;
    private javax.swing.JLabel jlblCincoViernes;
    private javax.swing.JLabel jlblCuatro;
    private javax.swing.JLabel jlblCuatroDomingo;
    private javax.swing.JLabel jlblCuatroJueves;
    private javax.swing.JLabel jlblCuatroLunes;
    private javax.swing.JLabel jlblCuatroMartes;
    private javax.swing.JLabel jlblCuatroMiercoles;
    private javax.swing.JLabel jlblCuatroSabado;
    private javax.swing.JLabel jlblCuatroViernes;
    private javax.swing.JLabel jlblDiez;
    private javax.swing.JLabel jlblDiezDomingo;
    private javax.swing.JLabel jlblDiezJueves;
    private javax.swing.JLabel jlblDiezLunes;
    private javax.swing.JLabel jlblDiezMartes;
    private javax.swing.JLabel jlblDiezMiercoles;
    private javax.swing.JLabel jlblDiezSabado;
    private javax.swing.JLabel jlblDiezViernes;
    private javax.swing.JLabel jlblDomingo;
    private javax.swing.JLabel jlblDos;
    private javax.swing.JLabel jlblDosDomingo;
    private javax.swing.JLabel jlblDosJueves;
    private javax.swing.JLabel jlblDosLunes;
    private javax.swing.JLabel jlblDosMartes;
    private javax.swing.JLabel jlblDosMiercoles;
    private javax.swing.JLabel jlblDosSabado;
    private javax.swing.JLabel jlblDosViernes;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblFondo;
    private javax.swing.JLabel jlblGestionDeBuses;
    private javax.swing.JLabel jlblHorario;
    private javax.swing.JLabel jlblInfoModoOscuro;
    private javax.swing.JLabel jlblInfoPerfil;
    private javax.swing.JLabel jlblJueves;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblLunes;
    private javax.swing.JLabel jlblMartes;
    private javax.swing.JLabel jlblMaximizar;
    private javax.swing.JLabel jlblMiercoles;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblNueve;
    private javax.swing.JLabel jlblNueveDomingo;
    private javax.swing.JLabel jlblNueveJueves;
    private javax.swing.JLabel jlblNueveLunes;
    private javax.swing.JLabel jlblNueveMartes;
    private javax.swing.JLabel jlblNueveMiercoles;
    private javax.swing.JLabel jlblNueveSabado;
    private javax.swing.JLabel jlblNueveViernes;
    private javax.swing.JLabel jlblOcho;
    private javax.swing.JLabel jlblOchoDomingo;
    private javax.swing.JLabel jlblOchoJueves;
    private javax.swing.JLabel jlblOchoLunes;
    private javax.swing.JLabel jlblOchoMartes;
    private javax.swing.JLabel jlblOchoMiercoles;
    private javax.swing.JLabel jlblOchoSabado;
    private javax.swing.JLabel jlblOchoViernes;
    private javax.swing.JLabel jlblOnce;
    private javax.swing.JLabel jlblOnceDomingo;
    private javax.swing.JLabel jlblOnceJueves;
    private javax.swing.JLabel jlblOnceLunes;
    private javax.swing.JLabel jlblOnceMartes;
    private javax.swing.JLabel jlblOnceMiercoles;
    private javax.swing.JLabel jlblOnceSabado;
    private javax.swing.JLabel jlblOnceViernes;
    private javax.swing.JLabel jlblPerfilMini;
    private javax.swing.JLabel jlblSabado;
    private javax.swing.JLabel jlblSeis;
    private javax.swing.JLabel jlblSeisDomingo;
    private javax.swing.JLabel jlblSeisJueves;
    private javax.swing.JLabel jlblSeisLunes;
    private javax.swing.JLabel jlblSeisMartes;
    private javax.swing.JLabel jlblSeisMiercoles;
    private javax.swing.JLabel jlblSeisSabado;
    private javax.swing.JLabel jlblSeisViernes;
    private javax.swing.JLabel jlblSiete;
    private javax.swing.JLabel jlblSieteDomingo;
    private javax.swing.JLabel jlblSieteJueves;
    private javax.swing.JLabel jlblSieteLunes;
    private javax.swing.JLabel jlblSieteMartes;
    private javax.swing.JLabel jlblSieteMiercoles;
    private javax.swing.JLabel jlblSieteSabado;
    private javax.swing.JLabel jlblSieteViernes;
    private javax.swing.JLabel jlblTres;
    private javax.swing.JLabel jlblTresDomingo;
    private javax.swing.JLabel jlblTresJueves;
    private javax.swing.JLabel jlblTresLunes;
    private javax.swing.JLabel jlblTresMartes;
    private javax.swing.JLabel jlblTresMiercoles;
    private javax.swing.JLabel jlblTresSabado;
    private javax.swing.JLabel jlblTresViernes;
    private javax.swing.JLabel jlblUno;
    private javax.swing.JLabel jlblUnoDomingo;
    private javax.swing.JLabel jlblUnoJueves;
    private javax.swing.JLabel jlblUnoLunes;
    private javax.swing.JLabel jlblUnoMartes;
    private javax.swing.JLabel jlblUnoMiercoles;
    private javax.swing.JLabel jlblUnoSabado;
    private javax.swing.JLabel jlblUnoViernes;
    private javax.swing.JLabel jlblViernes;
    private javax.swing.JPanel jpnlBarraDeTitulos;
    private javax.swing.JPanel jpnlBarraLateral;
    private javax.swing.JPanel jpnlCambioColor;
    private javax.swing.JPanel jpnlDias;
    private javax.swing.JPanel jpnlDinamico;
    private javax.swing.JPanel jpnlExit;
    private javax.swing.JPanel jpnlGestionDeBuses;
    private javax.swing.JPanel jpnlHoras;
    private javax.swing.JPanel jpnlInfoModoOscuro;
    private javax.swing.JPanel jpnlInfoPerfil;
    private javax.swing.JPanel jpnlMaximizar;
    private javax.swing.JPanel jpnlMinimizar;
    private javax.swing.JPanel jpnlPerfilMini;
    private javax.swing.JPanel jpnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
