/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.alejandrove.cuidarpokemon.frontend.mascota;

import com.alejandrove.cuidarpokemon.backend.Mascota;
import com.alejandrove.cuidarpokemon.backend.MotorJuego;
import javax.swing.JFrame;

/**
 *
 * @author aleja
 */
public class EstadoFrame extends javax.swing.JFrame {

    JFrame parent;
    MotorJuego juego;
    Mascota mascota;

    /**
     * Creates new form EstadoFrame
     * 
     * @param parent
     * @param juego
     * @param mascota
     */
    public EstadoFrame(JFrame parent, MotorJuego juego, Mascota mascota) {
        initComponents();
        this.parent = parent;
        this.juego = juego;
        this.mascota = mascota;
        actualizarEstado();
    }

    public void actualizarEstado() {
        peticionesList.setListData(new String[] {
                mascota.getPeticionesComidaString(),
                mascota.getPeticionesLimpiarString(),
                mascota.getPeticionesCurarString(),
                mascota.getPeticionesPaseoString()
        });
        tituloLabel.setText("Estado: " + mascota.getEstado());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        peticionesList = new javax.swing.JList<>();
        actualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 36)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("Estado: vivo");

        jButton10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton10.setText("Regresar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(peticionesList);

        actualizar.setText("actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)
                                                        .addComponent(jButton10))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(108, 108, 108)
                                                                .addComponent(jScrollPane1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 295,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(212, 212, 212)
                                                                .addComponent(actualizar)))
                                                .addGap(0, 90, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(tituloLabel, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tituloLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton10)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
        parent.setVisible(true);
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton10ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_actualizarActionPerformed
        actualizarEstado();
    }// GEN-LAST:event_actualizarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton jButton10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> peticionesList;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
