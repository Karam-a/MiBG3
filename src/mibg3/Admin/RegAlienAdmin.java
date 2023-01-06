/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibg3.Admin;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author d-aly
 */
public class RegAlienAdmin extends javax.swing.JFrame {
    private InfDB mibdb;
    private int plats;
    private int ansvarig;
    private String alienID;

    /**
     * Creates new form RegAlienAdmin
     */
    public RegAlienAdmin() {
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

        okAlienRegKnapp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rasCB1 = new javax.swing.JComboBox<>();
        DatumFIELD = new javax.swing.JTextField();
        platsCB1 = new javax.swing.JComboBox<>();
        NamnFIELD = new javax.swing.JTextField();
        agentCB1 = new javax.swing.JComboBox<>();
        TelFIELD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        LösenordFIELD = new javax.swing.JPasswordField();
        armBoogFIELD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrera Aliens");

        okAlienRegKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okAlienRegKnapp.setText("OK");
        okAlienRegKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAlienRegKnappActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Datum:");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Alien-ID:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Namn:");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Registreras Automatiskt.");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Lösenord:");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("YYYY-MM-DD");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Telefon:");

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Min. 1 tecken. Max 6 tecken.");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Plats:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Ras:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Ansvarig agent:");

        rasCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        rasCB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rasCB1ItemStateChanged(evt);
            }
        });

        DatumFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatumFIELDActionPerformed(evt);
            }
        });

        platsCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebro", "Västerås", "Vilhelmina", "Borås" }));
        platsCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platsCB1ActionPerformed(evt);
            }
        });

        NamnFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamnFIELDActionPerformed(evt);
            }
        });

        agentCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent O", "Agent K", "Agent J", "Agent Z" }));

        TelFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelFIELDActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Antal Armar/Boogies:");

        LösenordFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LösenordFIELDActionPerformed(evt);
            }
        });

        armBoogFIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armBoogFIELDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registrera en ny Alien");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(350, Short.MAX_VALUE)
                .addComponent(okAlienRegKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel8)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(armBoogFIELD)
                                    .addGap(155, 155, 155))
                                .addComponent(jLabel19)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(agentCB1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(platsCB1, 0, 95, Short.MAX_VALUE)
                                        .addComponent(rasCB1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DatumFIELD, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NamnFIELD, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TelFIELD, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LösenordFIELD, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))))))
                    .addGap(14, 14, 14)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(okAlienRegKnapp)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel19))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DatumFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel16))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(NamnFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(LösenordFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TelFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(platsCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(agentCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(rasCB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(armBoogFIELD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okAlienRegKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAlienRegKnappActionPerformed
        /** Lokala variabeldeklarationer. Dessa ska hämta värdet på det vi skriver in när man registrerar en ny
        * alien och ta lokalvariablerna som sedan sätts in i insert metoden för databasen så att informationen vi skriver in sätts in i databasen.
        */
            String namn = NamnFIELD.getText();
            String lösen = LösenordFIELD.getText();
            String telefon = TelFIELD.getText();
            String datum = DatumFIELD.getText();
            getValdPlats();
            getValdAgent();
            if(Valideringsklass.giltigtLosenord(lösen) && Valideringsklass.värdeExisterar(NamnFIELD) && Valideringsklass.värdeExisterar(DatumFIELD)){
                try{
                // Instansierar databasen.
                    mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
                    alienID = mibdb.getAutoIncrement("Alien", "Alien_ID");
                    mibdb.insert("INSERT INTO Alien VALUES(" + alienID + " , " + "'" + datum + "'" + " , " + "'" + lösen + "'" + " , " + "'" + namn + "'" + " , " + "'" + telefon + "'" + " , " + plats + " , " + ansvarig + ")");
                    setRas();
                    JOptionPane.showMessageDialog(null, "Grattis! En ny alien har registrerats i systemet.");

                }
                catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Gick inte att ansluta.");

            }
        }

    }//GEN-LAST:event_okAlienRegKnappActionPerformed

    private void rasCB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rasCB1ItemStateChanged
        if(rasCB1.getSelectedItem().equals("Worm")){
            armBoogFIELD.setText("0");
            armBoogFIELD.setEnabled(false);}
        else{
            armBoogFIELD.setEnabled(true);}
    }//GEN-LAST:event_rasCB1ItemStateChanged

    private void getValdPlats(){
      String vp = platsCB1.getSelectedItem().toString();
      switch (vp){
          case "Örebro": 
              plats = 1;
              break;
          case "Västerås":
              plats = 2;
              break;
          case "Vilhelmina":
              plats = 3;
              break;
          case "Borås":
              plats = 4;
              break;
      }
    }
      
   
    private void getValdAgent(){
        String va = agentCB1.getSelectedItem().toString();
        switch (va){
            case "Agent O":
            ansvarig = 1;
                break;
            case "Agent K":
            ansvarig = 2;
                break;
            case "Agent J":
            ansvarig = 3;
                break;
            case "Agent Z":
            ansvarig = 4;
                break;
      }
  }
    
    private void setRas(){
        String vr = rasCB1.getSelectedItem().toString();
        int antal = Integer.parseInt(armBoogFIELD.getText());
            try{
                    switch (vr){
                    case "Boglodite":
                        mibdb.insert("INSERT INTO Boglodite VALUES(" + alienID + "," + antal +")");
                        break;
                    case "Squid":
                        mibdb.insert("INSERT INTO Squid VALUES(" + alienID + "," + antal +")");
                        break;
                    case "Worm":
                        mibdb.insert("INSERT INTO Worm (Alien_ID) VALUES(" + alienID +")");
                        break;
        }
  }
  
  catch(InfException e){System.out.println("bruh");}
  }
    private void DatumFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatumFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatumFIELDActionPerformed

    private void NamnFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamnFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamnFIELDActionPerformed

    private void TelFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelFIELDActionPerformed

    private void LösenordFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LösenordFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LösenordFIELDActionPerformed

    private void armBoogFIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armBoogFIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_armBoogFIELDActionPerformed

    private void platsCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platsCB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platsCB1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegAlienAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegAlienAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatumFIELD;
    private javax.swing.JPasswordField LösenordFIELD;
    private javax.swing.JTextField NamnFIELD;
    private javax.swing.JTextField TelFIELD;
    private javax.swing.JComboBox<String> agentCB1;
    private javax.swing.JTextField armBoogFIELD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton okAlienRegKnapp;
    private javax.swing.JComboBox<String> platsCB1;
    private javax.swing.JComboBox<String> rasCB1;
    // End of variables declaration//GEN-END:variables
}
