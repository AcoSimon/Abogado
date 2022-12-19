/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abogadodao;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Simon Acosta
 */
public class Main extends javax.swing.JFrame {

    /*  Iconos/Imagenes: */
    Icon agregarAB;
    Icon devolverAB;
    
    public Main() {
        initComponents();
        agregarAB = new ImageIcon("src/imagenes/agregarAB.png");
        devolverAB = new ImageIcon("src/imagenes/devolverAB.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        boton_agregarAbogado = new javax.swing.JButton();
        boton_devolverAbogado = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        boton_agregarCausa = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        boton_agregarSentencia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        notas = new javax.swing.JButton();
        boton_eliminarAbogado = new javax.swing.JButton();
        boton_devolverSentencia = new javax.swing.JButton();
        boton_modificarSentencia = new javax.swing.JButton();
        boton_devolverCausa = new javax.swing.JButton();
        boton_modificarCausa = new javax.swing.JButton();
        boton_modAbogado = new javax.swing.JButton();
        boton_eliminarSentencia = new javax.swing.JButton();
        boton_eliminarCausa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(32, 37, 43));

        jPanel1.setBackground(new java.awt.Color(32, 37, 43));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(94, 163, 215), 4));
        jPanel1.setToolTipText("");
        jPanel1.setName("Estudio Juridico"); // NOI18N

        boton_agregarAbogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarAB.png"))); // NOI18N
        boton_agregarAbogado.setText("Agregar abogado");
        boton_agregarAbogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregarAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarAbogadoActionPerformed(evt);
            }
        });

        boton_devolverAbogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverAB.png"))); // NOI18N
        boton_devolverAbogado.setText("Devolver abogado");
        boton_devolverAbogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_devolverAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_devolverAbogadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Blacksword", 0, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estudio Juridico");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panelAB.png"))); // NOI18N
        jLabel2.setText("Abogado:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panelSC.png"))); // NOI18N
        jLabel3.setText("Sentencia:");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        boton_agregarCausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarCS.png"))); // NOI18N
        boton_agregarCausa.setText("Agregar causa");
        boton_agregarCausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregarCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarCausaActionPerformed(evt);
            }
        });

        boton_agregarSentencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarSC.png"))); // NOI18N
        boton_agregarSentencia.setText("Agregar sentencia");
        boton_agregarSentencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregarSentencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarSentenciaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/panelCAUSA.png"))); // NOI18N
        jLabel4.setText("Causa:");

        notas.setBackground(new java.awt.Color(32, 37, 43));
        notas.setForeground(new java.awt.Color(32, 37, 43));
        notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notas.png"))); // NOI18N
        notas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        notas.setContentAreaFilled(false);
        notas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notas.setDefaultCapable(false);
        notas.setFocusable(false);
        notas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasActionPerformed(evt);
            }
        });

        boton_eliminarAbogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarAB.png"))); // NOI18N
        boton_eliminarAbogado.setText("Eliminar abogado");
        boton_eliminarAbogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_eliminarAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarAbogadoActionPerformed(evt);
            }
        });

        boton_devolverSentencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverSN.png"))); // NOI18N
        boton_devolverSentencia.setText("Devolver sentencia");
        boton_devolverSentencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_devolverSentencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_devolverSentenciaActionPerformed(evt);
            }
        });

        boton_modificarSentencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarSN.png"))); // NOI18N
        boton_modificarSentencia.setText("Modificar sentencia");
        boton_modificarSentencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_modificarSentencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarSentenciaActionPerformed(evt);
            }
        });

        boton_devolverCausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/devolverCS.png"))); // NOI18N
        boton_devolverCausa.setText("Devolver causa");
        boton_devolverCausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_devolverCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_devolverCausaActionPerformed(evt);
            }
        });

        boton_modificarCausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificarCS.png"))); // NOI18N
        boton_modificarCausa.setText("Modificar causa");
        boton_modificarCausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_modificarCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarCausaActionPerformed(evt);
            }
        });

        boton_modAbogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modAB.png"))); // NOI18N
        boton_modAbogado.setText("Modificar abogado");
        boton_modAbogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_modAbogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modAbogadoActionPerformed(evt);
            }
        });

        boton_eliminarSentencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarSN.png"))); // NOI18N
        boton_eliminarSentencia.setText("Eliminar sentencia");
        boton_eliminarSentencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_eliminarSentencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarSentenciaActionPerformed(evt);
            }
        });

        boton_eliminarCausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminarCS.png"))); // NOI18N
        boton_eliminarCausa.setText("Eliminar causa");
        boton_eliminarCausa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_eliminarCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_eliminarCausaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(notas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(boton_devolverAbogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(boton_agregarAbogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_modAbogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_eliminarAbogado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addComponent(boton_agregarSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator7)
                            .addComponent(boton_devolverSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_modificarSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_eliminarSentencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator6)
                            .addComponent(boton_agregarCausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator8)
                            .addComponent(boton_devolverCausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_modificarCausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_eliminarCausa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(boton_agregarAbogado)
                        .addGap(20, 20, 20)
                        .addComponent(boton_devolverAbogado)
                        .addGap(18, 18, 18)
                        .addComponent(boton_modAbogado)
                        .addGap(20, 20, 20)
                        .addComponent(boton_eliminarAbogado)
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_agregarSentencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(boton_devolverSentencia)
                        .addGap(18, 18, 18)
                        .addComponent(boton_modificarSentencia)
                        .addGap(18, 18, 18)
                        .addComponent(boton_eliminarSentencia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_agregarCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_devolverCausa)
                        .addGap(18, 18, 18)
                        .addComponent(boton_modificarCausa)
                        .addGap(18, 18, 18)
                        .addComponent(boton_eliminarCausa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_devolverAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_devolverAbogadoActionPerformed
        /* *Boton, DevolverAbogado. Utilizado para recibir datos de la base de datos SQL.*/
        Abogadodao abo = new Abogadodao();
        abo.devolverAbogado();
    }//GEN-LAST:event_boton_devolverAbogadoActionPerformed

    private void boton_agregarAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarAbogadoActionPerformed
        /* *Boton, DevolverAbogado. Utilizado para recibir datos de la base de datos SQL.*/
        Abogadodao abo = new Abogadodao();
        abo.agregarAbogado();
    }//GEN-LAST:event_boton_agregarAbogadoActionPerformed

    private void boton_agregarSentenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarSentenciaActionPerformed
        Sentenciadao sen = new Sentenciadao();
        sen.agregarSentencia();
    }//GEN-LAST:event_boton_agregarSentenciaActionPerformed

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        Abogadodao abo = new Abogadodao();
        abo.notas();
    }//GEN-LAST:event_notasActionPerformed

    private void boton_eliminarAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarAbogadoActionPerformed
        Abogadodao abo = new Abogadodao();
        abo.eliminarAbogado();
        
    }//GEN-LAST:event_boton_eliminarAbogadoActionPerformed

    private void boton_modAbogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modAbogadoActionPerformed
        Abogadodao abo = new Abogadodao();
        abo.modificarAbogado();
    }//GEN-LAST:event_boton_modAbogadoActionPerformed

    private void boton_devolverSentenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_devolverSentenciaActionPerformed
        Sentenciadao sen = new Sentenciadao();
        sen.devolverSentencia();
    }//GEN-LAST:event_boton_devolverSentenciaActionPerformed

    private void boton_modificarSentenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarSentenciaActionPerformed
        Sentenciadao sen = new Sentenciadao();
        sen.modificarSentencia();
    }//GEN-LAST:event_boton_modificarSentenciaActionPerformed

    private void boton_eliminarSentenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarSentenciaActionPerformed
        Sentenciadao sen = new Sentenciadao();
        sen.eliminarSentencia();
    }//GEN-LAST:event_boton_eliminarSentenciaActionPerformed

    private void boton_agregarCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarCausaActionPerformed
        Causadao cau = new Causadao();
        cau.agregarCausa();
    }//GEN-LAST:event_boton_agregarCausaActionPerformed

    private void boton_devolverCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_devolverCausaActionPerformed
        Causadao cau = new Causadao();
        cau.devolverCausa();
    }//GEN-LAST:event_boton_devolverCausaActionPerformed

    private void boton_eliminarCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_eliminarCausaActionPerformed
        Causadao cau = new Causadao();
        cau.eliminarCausa();
    }//GEN-LAST:event_boton_eliminarCausaActionPerformed

    private void boton_modificarCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarCausaActionPerformed
        Causadao cau = new Causadao();
        cau.modificarCausa();
    }//GEN-LAST:event_boton_modificarCausaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregarAbogado;
    private javax.swing.JButton boton_agregarCausa;
    private javax.swing.JButton boton_agregarSentencia;
    private javax.swing.JButton boton_devolverAbogado;
    private javax.swing.JButton boton_devolverCausa;
    private javax.swing.JButton boton_devolverSentencia;
    private javax.swing.JButton boton_eliminarAbogado;
    private javax.swing.JButton boton_eliminarCausa;
    private javax.swing.JButton boton_eliminarSentencia;
    private javax.swing.JButton boton_modAbogado;
    private javax.swing.JButton boton_modificarCausa;
    private javax.swing.JButton boton_modificarSentencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JButton notas;
    // End of variables declaration//GEN-END:variables
}
