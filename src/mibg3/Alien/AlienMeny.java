/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibg3.Alien;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Karam Al-Akhras
 */
public class AlienMeny extends javax.swing.JFrame {
    private static String ocTel;
    private static String ocNamn;
    private InfDB mibdb;

    /**
     * Creates new form AlienMeny
     */
    public AlienMeny() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        alienRutaNamn = new javax.swing.JLabel();
        välkommenAlien = new javax.swing.JLabel();
        ÄndraLösen = new javax.swing.JButton();
        InfoOmOC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        alienRutaNamn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        välkommenAlien.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        välkommenAlien.setText("Välkommen");

        ÄndraLösen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ÄndraLösen.setText("Ändra lösenord");
        ÄndraLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÄndraLösenActionPerformed(evt);
            }
        });

        InfoOmOC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        InfoOmOC.setText("Min områdeschef");
        InfoOmOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoOmOCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoOmOC)
                            .addComponent(ÄndraLösen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(välkommenAlien)
                        .addGap(52, 52, 52)
                        .addComponent(alienRutaNamn)
                        .addGap(14, 14, 14))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienRutaNamn)
                    .addComponent(välkommenAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ÄndraLösen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoOmOC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ÄndraLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÄndraLösenActionPerformed
        // TODO add your handling code here:
        NyttLösenAlien meny = new NyttLösenAlien();
        meny.setVisible(true);
    }//GEN-LAST:event_ÄndraLösenActionPerformed

    private void InfoOmOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoOmOCActionPerformed
        // TODO add your handling code here:
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
            String plats;
            plats = mibdb.fetchSingle("SELECT Plats FROM Alien WHERE Alien_ID = "+ "'" + (mibg3.Alien.AlienInlogg.getInloggadAlien()) + "'");
            String områdeschefID;
            områdeschefID = mibdb.fetchSingle("SELECT Agent_ID FROM Omradeschef WHERE Omrade = "+ "'" + plats + "'");
            
            ocNamn = mibdb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID = "+ "'" + områdeschefID + "'");
            ocTel = mibdb.fetchSingle("SELECT Telefon FROM Agent WHERE Agent_ID = "+ "'" + områdeschefID + "'");
            
            OmrådeschefINFO meny = new OmrådeschefINFO();
            meny.setVisible(true);
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen, vänligen försök igen.");
        }
    }//GEN-LAST:event_InfoOmOCActionPerformed

    public static String getOCTel(){
    return ocTel;
}
    
    public static String getOCNamn(){
        return ocNamn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoOmOC;
    private javax.swing.JLabel alienRutaNamn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel välkommenAlien;
    private javax.swing.JButton ÄndraLösen;
    // End of variables declaration//GEN-END:variables
}
