/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newpackage;

/**
 *
 * @author D2K
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        angka1 = new javax.swing.JTextField();
        angka2 = new javax.swing.JTextField();
        txthasil = new javax.swing.JLabel();
        tbltambah = new javax.swing.JButton();
        tblkurang = new javax.swing.JButton();
        tblkali = new javax.swing.JButton();
        tblbagi = new javax.swing.JButton();
        tblmodulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbltambah.setText("+");
        tbltambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbltambahActionPerformed(evt);
            }
        });

        tblkurang.setText("-");
        tblkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblkurangActionPerformed(evt);
            }
        });

        tblkali.setText("x");
        tblkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblkaliActionPerformed(evt);
            }
        });

        tblbagi.setText(":");
        tblbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblbagiActionPerformed(evt);
            }
        });

        tblmodulo.setText("%");
        tblmodulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblmoduloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbltambah)
                        .addGap(28, 28, 28)
                        .addComponent(tblkurang)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthasil))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tblkali)
                        .addGap(34, 34, 34)
                        .addComponent(tblbagi)
                        .addGap(34, 34, 34)
                        .addComponent(tblmodulo)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthasil))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbltambah)
                    .addComponent(tblkurang)
                    .addComponent(tblkali)
                    .addComponent(tblbagi)
                    .addComponent(tblmodulo))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbltambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbltambahActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) + Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tbltambahActionPerformed

    private void tblkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblkurangActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) - Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tblkurangActionPerformed

    private void tblkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblkaliActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) * Double.parseDouble(angka2.getText());
        txthasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tblkaliActionPerformed

    private void tblbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblbagiActionPerformed
        // TODO add your handling code here:
        
        try{
            double hasil = Double.parseDouble(angka1.getText()) / Double.parseDouble(angka2.getText());
            txthasil.setText(Double.toString(hasil));
            if(Double.parseDouble(angka2.getText())== 0){
                throw new Exception();
            }
            else{
                
            }
        }
        catch(Exception e){
            txthasil.setText("Error");
        }
    }//GEN-LAST:event_tblbagiActionPerformed

    private void tblmoduloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblmoduloActionPerformed
        // TODO add your handling code here:
        try{
            double hasil = Double.parseDouble(angka1.getText()) % Double.parseDouble(angka2.getText());
            txthasil.setText(Double.toString(hasil));
            if(Double.parseDouble(angka2.getText())== 0){
                throw new Exception();
            }
            else{
                
            }
        }
        catch(Exception e){
            txthasil.setText("Error");
        }
    }//GEN-LAST:event_tblmoduloActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JButton tblbagi;
    private javax.swing.JButton tblkali;
    private javax.swing.JButton tblkurang;
    private javax.swing.JButton tblmodulo;
    private javax.swing.JButton tbltambah;
    private javax.swing.JLabel txthasil;
    // End of variables declaration//GEN-END:variables
}
