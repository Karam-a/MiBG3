
package mibg3;

import mibg3.Admin.AdminInlogg;
import mibg3.Alien.AlienInlogg;
import mibg3.Agent.AgentInlogg;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Inloggningsruta extends javax.swing.JFrame {

  // Skapar inloggningsrutan där användaren kan välja om de är aliens, agenter eller admins.
    public Inloggningsruta() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vadArDetVarstaSomKanHandaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Användarval");

        jInternalFrame1.setVisible(true);

        jButton1.setText("Agent");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alien");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Admin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Välkommen!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Loggar du in som Alien, Agent eller Administratör?");

        vadArDetVarstaSomKanHandaKnapp.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        vadArDetVarstaSomKanHandaKnapp.setForeground(new java.awt.Color(255, 51, 51));
        vadArDetVarstaSomKanHandaKnapp.setText("vad är det värsta som kan hända?");
        vadArDetVarstaSomKanHandaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vadArDetVarstaSomKanHandaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel1))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vadArDetVarstaSomKanHandaKnapp)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vadArDetVarstaSomKanHandaKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
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

 //Användaren får val att logga in som antingen Alien, Admin eller Agent.Vid ett val slussas användaren sedan vidare till rätt jFrame. 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    AgentInlogg agi = new AgentInlogg();    
    agi.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AlienInlogg alienin = new AlienInlogg();
        alienin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminInlogg adi = new AdminInlogg();
        adi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    //Kör metoden "kör"
    private void vadArDetVarstaSomKanHandaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vadArDetVarstaSomKanHandaKnappActionPerformed
        kör();
    }//GEN-LAST:event_vadArDetVarstaSomKanHandaKnappActionPerformed

    //Öppnar upp användarens webbläsare och söker på nedan länk.
    private void kör(){
        try{
    Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
    }
        catch(IOException | URISyntaxException e){
        System.out.println("Attans, det gick inte!");}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton vadArDetVarstaSomKanHandaKnapp;
    // End of variables declaration//GEN-END:variables



}