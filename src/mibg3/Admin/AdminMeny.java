/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibg3.Admin;

public class AdminMeny extends javax.swing.JFrame {


    public AdminMeny() {
        initComponents();
    }
//Admin väljer en knapp som sedan initierar en ny ruta.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        välkomenLabel = new javax.swing.JLabel();
        minProfilKnapp = new javax.swing.JButton();
        hanteraAliensKnapp = new javax.swing.JToggleButton();
        hanteraAgentKnapp = new javax.swing.JToggleButton();
        valjAltLbel = new javax.swing.JLabel();
        hanteraUtrKnapp = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administratörsmeny");

        välkomenLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        välkomenLabel.setText("Välkommen!");

        minProfilKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        minProfilKnapp.setText("Min profil");

        hanteraAliensKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hanteraAliensKnapp.setText("Hantera aliens");
        hanteraAliensKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraAliensKnappActionPerformed(evt);
            }
        });

        hanteraAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hanteraAgentKnapp.setText("Hantera agenter");
        hanteraAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraAgentKnappActionPerformed(evt);
            }
        });

        valjAltLbel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        valjAltLbel.setText("Välj ett alternativ nedan:");

        hanteraUtrKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hanteraUtrKnapp.setText("Hantera utrustning");
        hanteraUtrKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraUtrKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minProfilKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hanteraAgentKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hanteraAliensKnapp)
                                .addGap(18, 18, 18)
                                .addComponent(hanteraUtrKnapp))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(välkomenLabel))
                            .addComponent(valjAltLbel))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(välkomenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valjAltLbel)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minProfilKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hanteraAgentKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hanteraUtrKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hanteraAliensKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hanteraAliensKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraAliensKnappActionPerformed
        // TODO add your handling code here:
        HanteraAlienAdmin meny = new HanteraAlienAdmin();
        meny.setVisible(true);
    }//GEN-LAST:event_hanteraAliensKnappActionPerformed

    private void hanteraAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraAgentKnappActionPerformed
        // TODO add your handling code here:
        HanteraAgent meny = new HanteraAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_hanteraAgentKnappActionPerformed

    private void hanteraUtrKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraUtrKnappActionPerformed
        // TODO add your handling code here:
        HanteraUtrustningAdmin meny = new HanteraUtrustningAdmin();
        meny.setVisible(true);
    }//GEN-LAST:event_hanteraUtrKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton hanteraAgentKnapp;
    private javax.swing.JToggleButton hanteraAliensKnapp;
    private javax.swing.JToggleButton hanteraUtrKnapp;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton minProfilKnapp;
    private javax.swing.JLabel valjAltLbel;
    private javax.swing.JLabel välkomenLabel;
    // End of variables declaration//GEN-END:variables
}
