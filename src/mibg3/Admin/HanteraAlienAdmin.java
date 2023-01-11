package mibg3.Admin;

import mibg3.Agent.RegAlien;
import mibg3.Agent.AlienInfoAgent;

public class HanteraAlienAdmin extends javax.swing.JFrame {

    public HanteraAlienAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hantAlienLabel = new javax.swing.JLabel();
        regAlienKnapp = new javax.swing.JButton();
        alienInfoKnapp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hantera Aliens");

        hantAlienLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        hantAlienLabel.setText("Hantera Aliens");

        regAlienKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regAlienKnapp.setText("Registrera alien");
        regAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAlienKnappActionPerformed(evt);
            }
        });

        alienInfoKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        alienInfoKnapp.setText("Alieninformation");
        alienInfoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienInfoKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hantAlienLabel)
                    .addComponent(regAlienKnapp)
                    .addComponent(alienInfoKnapp))
                .addContainerGap(38, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(hantAlienLabel)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regAlienKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alienInfoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAlienKnappActionPerformed
        //Startar en RegAlien ruta för admin.
        RegAlien meny = new RegAlien();
        meny.setVisible(true);
    }//GEN-LAST:event_regAlienKnappActionPerformed

    private void alienInfoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienInfoKnappActionPerformed
       //Startar en AlienInfo ruta för admin.
        AlienInfoAgent meny = new AlienInfoAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_alienInfoKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alienInfoKnapp;
    private javax.swing.JLabel hantAlienLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton regAlienKnapp;
    // End of variables declaration//GEN-END:variables
}
