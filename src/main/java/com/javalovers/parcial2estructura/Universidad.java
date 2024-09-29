/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.javalovers.parcial2estructura;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class Universidad extends javax.swing.JFrame {

    Matriz obj = new Matriz();
    int contador = 0;
    String peliculas[] = new String[]{"joker", "deadpool", "sonic"};
    String concatpeli = "\n";
    int vendidas[] = new int[3];
    ArrayList <Registro> documentos = new ArrayList();
    public Universidad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CantStudent = new javax.swing.JButton();
        Consult = new javax.swing.JButton();
        Estadisticas = new javax.swing.JButton();
        Selection = new javax.swing.JButton();
        Cartelera = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        EntradasCompradas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Universidad");

        CantStudent.setText("Cantidad de Estudiantes");
        CantStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantStudentActionPerformed(evt);
            }
        });

        Consult.setText("Consultar Lista");
        Consult.setEnabled(false);
        Consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultActionPerformed(evt);
            }
        });

        Estadisticas.setText("Estadisticas");
        Estadisticas.setEnabled(false);
        Estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasActionPerformed(evt);
            }
        });

        Selection.setText("Seleccionar Escenario");
        Selection.setEnabled(false);
        Selection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectionActionPerformed(evt);
            }
        });

        Cartelera.setText("Cartelera");
        Cartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarteleraActionPerformed(evt);
            }
        });

        jButton1.setText("Comprar Entrada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EntradasCompradas.setText("Entradas Compradas");
        EntradasCompradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradasCompradasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cartelera)
                    .addComponent(jButton1)
                    .addComponent(EntradasCompradas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selection)
                    .addComponent(Consult)
                    .addComponent(Estadisticas)
                    .addComponent(CantStudent))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CantStudent)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consult)
                    .addComponent(Cartelera))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Estadisticas)
                    .addComponent(EntradasCompradas))
                .addGap(18, 18, 18)
                .addComponent(Selection)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CantStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantStudentActionPerformed
        obj.cantStudent();
        Consult.setEnabled(true);
        Estadisticas.setEnabled(true);
        Selection.setEnabled(true);
    }//GEN-LAST:event_CantStudentActionPerformed

    private void ConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultActionPerformed
        obj.consult();
    }//GEN-LAST:event_ConsultActionPerformed

    private void EstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasActionPerformed
        obj.estadistica();
    }//GEN-LAST:event_EstadisticasActionPerformed

    private void SelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectionActionPerformed
        obj.selection(JOptionPane.showInputDialog(null, "escriba que escenario desea saber \n gym \n teatro \n cancha \n restaurante"));
    }//GEN-LAST:event_SelectionActionPerformed

    private void CarteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarteleraActionPerformed
    for(int i = 0; i<peliculas.length;i++){
    JOptionPane.showMessageDialog(null, peliculas[i] + " = " + vendidas[i]);
    }
    }//GEN-LAST:event_CarteleraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if(contador == 0){
        for(int i = 0; i<peliculas.length;i++){
        concatpeli += peliculas[i] + "\n";
    }
        contador = 1;
    }
    String pelicula = JOptionPane.showInputDialog(null,"ingrese cual pelicula quiere ver" + concatpeli);
    String documento = JOptionPane.showInputDialog(null,"ingrese su documento");
    for(int i = 0;i<peliculas.length;i++){
            if(pelicula.equals(peliculas[i])){
                vendidas[i] += 1;
                JOptionPane.showMessageDialog(null, "compra realizada");
                break;
            }else if(i==2){
                JOptionPane.showMessageDialog(null,"no está esa pelicula, saliendo");
                return;
            }
            }
        obj.buy(documento,
                JOptionPane.showInputDialog(null,"ingrese su nombre"),
                pelicula,
                Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese su edad")),
                JOptionPane.showInputDialog(null,"ingrese su genero")
        );
        boolean search = false;
        for(int i = 0;i<documentos.size();i++){
            Registro registro = documentos.get(i);
            if(registro.getDocumento().equals(documento)){
                registro.cantidades();
                search = true;
                break;
            }
        }
        if(!search){
            documentos.add(new Registro(documento));
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EntradasCompradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradasCompradasActionPerformed
        obj.cantidad(documentos,JOptionPane.showInputDialog("diga su documento"));
    }//GEN-LAST:event_EntradasCompradasActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Universidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Universidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Universidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Universidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Universidad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CantStudent;
    private javax.swing.JButton Cartelera;
    private javax.swing.JButton Consult;
    private javax.swing.JButton EntradasCompradas;
    private javax.swing.JButton Estadisticas;
    private javax.swing.JButton Selection;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
