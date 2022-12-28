/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibg3.Agent;

import javax.swing.JOptionPane;
import mibg3.Alien.LyckadReg;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author d-aly
 */
public class RegAlien extends javax.swing.JFrame {
    private InfDB mibdb;

    /**
     * Creates new form RegAlien
     */
    public RegAlien() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatumField = new javax.swing.JTextField();
        NamnField = new javax.swing.JTextField();
        TelField = new javax.swing.JTextField();
        LösenordField = new javax.swing.JPasswordField();
        AnsvAgentField = new javax.swing.JTextField();
        okAlienRegKnapp = new javax.swing.JButton();
        PlatsField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        AlienIDFIELD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Här kan du registrera nya aliens!");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Datum:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Namn:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Lösenord:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Telefon:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Plats:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Ansvarig agent:");

        DatumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatumFieldActionPerformed(evt);
            }
        });

        NamnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamnFieldActionPerformed(evt);
            }
        });

        TelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelFieldActionPerformed(evt);
            }
        });

        LösenordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LösenordFieldActionPerformed(evt);
            }
        });

        AnsvAgentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsvAgentFieldActionPerformed(evt);
            }
        });

        okAlienRegKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okAlienRegKnapp.setText("OK");
        okAlienRegKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAlienRegKnappActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Alien-ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DatumField, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(NamnField)
                            .addComponent(TelField)
                            .addComponent(LösenordField)
                            .addComponent(AnsvAgentField)
                            .addComponent(PlatsField)
                            .addComponent(AlienIDFIELD))))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okAlienRegKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LösenordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PlatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AnsvAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(AlienIDFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(okAlienRegKnapp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatumFieldActionPerformed

    private void okAlienRegKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAlienRegKnappActionPerformed
        // inte komplett än!!
        // String fraga = "INSERT INTO Alien (Alien_ID, Registreringsdatum, Losenord, Namn, Telefon"
        // Lokala variabeldeklarationer.
            String namn = NamnField.getText();
            String lösen = LösenordField.getText();
            String telefon = TelField.getText();
            String datum = DatumField.getText();
            int plats = Integer.parseInt( PlatsField.getText());
            int id = Integer.parseInt( AlienIDFIELD.getText());
            int ansvarig = Integer.parseInt( AnsvAgentField.getText());
            if(Valideringsklass.giltigtLosenord(lösen) && Valideringsklass.värdeExisterar(NamnField) && Valideringsklass.värdeExisterar(DatumField) && Valideringsklass.värdeExisterar(PlatsField) && Valideringsklass.värdeExisterar(AlienIDFIELD) && Valideringsklass.värdeExisterar(AnsvAgentField)){
        try{
            // Instansierar databasen.
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            mibdb.insert("INSERT INTO Alien VALUES('" + id + "' , '" + "'" + datum + "'" + "' , '" + lösen + "' , '" + namn + "' , '" + telefon + "' , '" + plats + "' , '" + ansvarig+ ")");
            LyckadReg reg = new LyckadReg();
            reg.setVisible(true);
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Gick inte att ansluta.");
            
        }
            }
            
    }//GEN-LAST:event_okAlienRegKnappActionPerformed

    private void NamnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamnFieldActionPerformed

    private void LösenordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LösenordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LösenordFieldActionPerformed

    private void AnsvAgentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsvAgentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnsvAgentFieldActionPerformed

    private void TelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegAlien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegAlien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlienIDFIELD;
    private javax.swing.JTextField AnsvAgentField;
    private javax.swing.JTextField DatumField;
    private javax.swing.JPasswordField LösenordField;
    private javax.swing.JTextField NamnField;
    private javax.swing.JTextField PlatsField;
    private javax.swing.JTextField TelField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton okAlienRegKnapp;
    // End of variables declaration//GEN-END:variables
}
