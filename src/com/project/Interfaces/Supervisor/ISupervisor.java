/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.Interfaces.Supervisor;

import com.project.Interfaces.Principal;
import com.project.MySQL.conexion;
import com.project.Utils.Utils;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

public class ISupervisor extends javax.swing.JFrame {

    private boolean maximizar = true, modoOscuro = true;
    private final int[] mousePosition = new int[2];
    private ArrayList<String> noCambiaColor = new ArrayList<>(Arrays.asList("jpnlPrincipal", "jpnlBarraDeTitulos", "jpnlBarraLateral",
            "jlblLogo", "jlblCambioColor", "jpnlCambioColor", "jlblExit", "jpnlExit", "jlblMaximizar", "jpnlMaximizar",
            "jlblMinimizar", "jpnlMinimizar", "jlblGestiónDeBuses", "jpnlGestiónDeBuses", "jlblGestiónDeHorarios",
            "jpnlGestiónDeHorarios", "jlblCerrarSesion", "jlblPerfilImagen"));
    private ArrayList<String> cambiaColor = new ArrayList<>(Arrays.asList("jpnlDinamico", "jlblSupervisor", "jlblNombres", "jpnlCerrarSesion"));

    public ISupervisor(boolean modoOscuro) throws SQLException {
        if (Utils.dataBase[0]) {
            conexion.getInstance();
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
                jlblCambioColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/" + (modoOscuro ? "Light" : "Dark") + "Mode.png")));
                jlblPerfilImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/Perfil" + (!modoOscuro ? "Oscuro" : "") + ".png")));
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
        jlblRegistroConductor = new javax.swing.JLabel();
        jpnlRegistroConductor = new javax.swing.JPanel();
        jlblRegistroES = new javax.swing.JLabel();
        jpnlRegistroES = new javax.swing.JPanel();
        jpnlBarraDeTitulos = new javax.swing.JPanel();
        jlblCambioColor = new javax.swing.JLabel();
        jpnlBarraLateral = new javax.swing.JPanel();
        jpnlCambioColor = new javax.swing.JPanel();
        jlblPerfilImagen = new javax.swing.JLabel();
        jlblSupervisor = new javax.swing.JLabel();
        jlblNombres = new javax.swing.JLabel();
        jlblCerrarSesion = new javax.swing.JLabel();
        jpnlCerrarSesion = new javax.swing.JPanel();
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

        jlblRegistroConductor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblRegistroConductor.setForeground(new java.awt.Color(134, 134, 134));
        jlblRegistroConductor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblRegistroConductor.setText("Registro de Conductores");
        jlblRegistroConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblRegistroConductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblRegistroConductorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblRegistroConductorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblRegistroConductorMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblRegistroConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 190, 30));

        jpnlRegistroConductor.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlRegistroConductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 190, 30));

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
        jpnlPrincipal.add(jlblRegistroES, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 130, 30));

        jpnlRegistroES.setBackground(new java.awt.Color(51, 51, 51));
        jpnlPrincipal.add(jpnlRegistroES, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 130, 30));

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
        jpnlPrincipal.add(jpnlCambioColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 40, 40));

        jlblPerfilImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/PerfilOscuro.png"))); // NOI18N
        jpnlPrincipal.add(jlblPerfilImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 328, 344));

        jlblSupervisor.setBackground(new java.awt.Color(255, 255, 255));
        jlblSupervisor.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jlblSupervisor.setForeground(new java.awt.Color(0, 0, 0));
        jlblSupervisor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblSupervisor.setText("Supervisor");
        jlblSupervisor.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jpnlPrincipal.add(jlblSupervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 328, 60));

        jlblNombres.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jlblNombres.setForeground(new java.awt.Color(0, 0, 0));
        jlblNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNombres.setText("Quispe Rivas, Oscar Andres");
        jpnlPrincipal.add(jlblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 328, 60));

        jlblCerrarSesion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jlblCerrarSesion.setForeground(new java.awt.Color(0, 102, 0));
        jlblCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblCerrarSesion.setText("Cerrar Sesión");
        jlblCerrarSesion.setToolTipText("");
        jlblCerrarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 0)));
        jlblCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlblCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlblCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlblCerrarSesionMouseExited(evt);
            }
        });
        jpnlPrincipal.add(jlblCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 660, 110, 30));

        jpnlCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        jpnlCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jpnlPrincipal.add(jpnlCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 660, 110, 30));

        jpnlDinamico.setBackground(new java.awt.Color(255, 255, 255));
        jpnlPrincipal.add(jpnlDinamico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1240, 690));

        jlblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/imagenes/fondo1.png"))); // NOI18N
        jpnlPrincipal.add(jlblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 1250, 690));

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

    private void jlblRegistroBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseClicked

    }//GEN-LAST:event_jlblRegistroBusMouseClicked

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

    private void jlblCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarSesionMouseClicked
        try {
            Utils.cambioDeJframe(this, new Principal(!modoOscuro));
        } catch (SQLException ex) {
            Logger.getLogger(ISupervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblCerrarSesionMouseClicked

    private void jlblCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarSesionMouseEntered
        Utils.enteredBotonVerde(jlblCerrarSesion);
    }//GEN-LAST:event_jlblCerrarSesionMouseEntered

    private void jlblCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCerrarSesionMouseExited
        Utils.exitedBotonVerde(jlblCerrarSesion);
    }//GEN-LAST:event_jlblCerrarSesionMouseExited

    private void jlblRegistroConductorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroConductorMouseClicked
        try {
            Utils.cambioDeJframe(this, new RegistroConductor(!modoOscuro));
        } catch (SQLException ex) {
            Logger.getLogger(ISupervisor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jlblRegistroConductorMouseClicked

    private void jlblCambioColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseExited
        Utils.ordenDeComponentesInfo(jpnlInfoModoOscuro, jlblInfoModoOscuro, false);
    }//GEN-LAST:event_jlblCambioColorMouseExited

    private void jlblCambioColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCambioColorMouseEntered
        Utils.ordenDeComponentesInfo(jpnlInfoModoOscuro, jlblInfoModoOscuro, true);
    }//GEN-LAST:event_jlblCambioColorMouseEntered

    private void jlblRegistroBusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseEntered
        Utils.resaltarSubtitulos(jlblRegistroBus);
    }//GEN-LAST:event_jlblRegistroBusMouseEntered

    private void jlblRegistroBusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroBusMouseExited
        Utils.restaurarSubtitulos(jlblRegistroBus);
    }//GEN-LAST:event_jlblRegistroBusMouseExited

    private void jlblRegistroConductorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroConductorMouseEntered
        Utils.resaltarSubtitulos(jlblRegistroConductor);
    }//GEN-LAST:event_jlblRegistroConductorMouseEntered

    private void jlblRegistroConductorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroConductorMouseExited
        Utils.restaurarSubtitulos(jlblRegistroConductor);
    }//GEN-LAST:event_jlblRegistroConductorMouseExited

    private void jlblRegistroESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroESMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblRegistroESMouseClicked

    private void jlblRegistroESMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroESMouseEntered
        Utils.resaltarSubtitulos(jlblRegistroES);
    }//GEN-LAST:event_jlblRegistroESMouseEntered

    private void jlblRegistroESMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblRegistroESMouseExited
        Utils.restaurarSubtitulos(jlblRegistroES);
    }//GEN-LAST:event_jlblRegistroESMouseExited

//    public static void main(String args[]) {
//        try {
//            Utils.iniciarJframe(new ISupervisor(false));
//        } catch (SQLException ex) {
//            Logger.getLogger(ISupervisor.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblCambioColor;
    private javax.swing.JLabel jlblCerrarSesion;
    private javax.swing.JLabel jlblExit;
    private javax.swing.JLabel jlblFondo;
    private javax.swing.JLabel jlblInfoModoOscuro;
    private javax.swing.JLabel jlblLogo;
    private javax.swing.JLabel jlblMaximizar;
    private javax.swing.JLabel jlblMinimizar;
    private javax.swing.JLabel jlblNombres;
    private javax.swing.JLabel jlblPerfilImagen;
    private javax.swing.JLabel jlblRegistroBus;
    private javax.swing.JLabel jlblRegistroConductor;
    private javax.swing.JLabel jlblRegistroES;
    private javax.swing.JLabel jlblSupervisor;
    private javax.swing.JPanel jpnlBarraDeTitulos;
    private javax.swing.JPanel jpnlBarraLateral;
    private javax.swing.JPanel jpnlCambioColor;
    private javax.swing.JPanel jpnlCerrarSesion;
    private javax.swing.JPanel jpnlDinamico;
    private javax.swing.JPanel jpnlExit;
    private javax.swing.JPanel jpnlInfoModoOscuro;
    private javax.swing.JPanel jpnlMaximizar;
    private javax.swing.JPanel jpnlMinimizar;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPanel jpnlRegistroBus;
    private javax.swing.JPanel jpnlRegistroConductor;
    private javax.swing.JPanel jpnlRegistroES;
    // End of variables declaration//GEN-END:variables
}
