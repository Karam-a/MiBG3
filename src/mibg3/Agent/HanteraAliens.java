package mibg3.Agent;

public class HanteraAliens extends javax.swing.JFrame {

    public HanteraAliens() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        regAlien = new javax.swing.JButton();
        alienInfoKnapp = new javax.swing.JButton();
        sokEfterRasKnapp = new javax.swing.JButton();
        sokEfterOmr = new javax.swing.JButton();
        sokDatumKnapp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hantera Aliens");

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Hitta och ändra alieninformation");

        regAlien.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regAlien.setText("Registrera alien");
        regAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAlienActionPerformed(evt);
            }
        });

        alienInfoKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        alienInfoKnapp.setText("Alieninfo");
        alienInfoKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienInfoKnappActionPerformed(evt);
            }
        });

        sokEfterRasKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sokEfterRasKnapp.setText("Sök efter ras");
        sokEfterRasKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokEfterRasKnappActionPerformed(evt);
            }
        });

        sokEfterOmr.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sokEfterOmr.setText("Sök efter område");
        sokEfterOmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokEfterOmrActionPerformed(evt);
            }
        });

        sokDatumKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        sokDatumKnapp.setText("Sök mellan två angivna datum");
        sokDatumKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokDatumKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sokDatumKnapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(regAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sokEfterRasKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alienInfoKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sokEfterOmr)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regAlien)
                    .addComponent(alienInfoKnapp))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sokEfterRasKnapp)
                    .addComponent(sokEfterOmr))
                .addGap(18, 18, 18)
                .addComponent(sokDatumKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAlienActionPerformed
        //Startar en RegAlien ruta för att registrera aliens.
        RegAlien meny = new RegAlien();
        meny.setVisible(true);
    }//GEN-LAST:event_regAlienActionPerformed

    private void alienInfoKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienInfoKnappActionPerformed
        //Startar en AlienInfoAgent ruta för agent.
        AlienInfoAgent meny = new AlienInfoAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_alienInfoKnappActionPerformed

    private void sokEfterOmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokEfterOmrActionPerformed
        //Startar en AlienPaOmrade ruta för agent.
        AlienPaOmrade meny = new AlienPaOmrade();
        meny.setVisible(true);
    }//GEN-LAST:event_sokEfterOmrActionPerformed

    private void sokEfterRasKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokEfterRasKnappActionPerformed
        //Startar en sokEfterRas ruta för agent.
        sokEfterRas meny = new sokEfterRas();
        meny.setVisible(true);
    }//GEN-LAST:event_sokEfterRasKnappActionPerformed

    private void sokDatumKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokDatumKnappActionPerformed
        //Startar en tvaDatum ruta för agent (för att kunna söka på aliens registrerade mellan två datum).
        tvaDatum meny = new tvaDatum();
        meny.setVisible(true);
    }//GEN-LAST:event_sokDatumKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alienInfoKnapp;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton regAlien;
    private javax.swing.JButton sokDatumKnapp;
    private javax.swing.JButton sokEfterOmr;
    private javax.swing.JButton sokEfterRasKnapp;
    // End of variables declaration//GEN-END:variables
}
