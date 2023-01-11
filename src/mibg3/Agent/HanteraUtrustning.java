package mibg3.Agent;

public class HanteraUtrustning extends javax.swing.JFrame {

    /**
     * Instansierar HanteraUtrustning-rutan.
     */
    public HanteraUtrustning() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kommunikationKnapp = new javax.swing.JButton();
        vapenKommunikation = new javax.swing.JButton();
        teknikKnapp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hantera Utrustning");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Välj utrustningstyp att registrera");

        kommunikationKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kommunikationKnapp.setText("Kommunikation");
        kommunikationKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kommunikationKnappActionPerformed(evt);
            }
        });

        vapenKommunikation.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        vapenKommunikation.setText("Vapen");
        vapenKommunikation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vapenKommunikationActionPerformed(evt);
            }
        });

        teknikKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        teknikKnapp.setText("Teknik");
        teknikKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teknikKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kommunikationKnapp)
                .addGap(18, 18, 18)
                .addComponent(vapenKommunikation, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(teknikKnapp)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kommunikationKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vapenKommunikation, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teknikKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kommunikationKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kommunikationKnappActionPerformed
        //Startar en KommunikationReg ruta för agent för att registrera utrustning av typen kommunikation.
        KommunikationReg meny = new KommunikationReg();
        meny.setVisible(true);
    }//GEN-LAST:event_kommunikationKnappActionPerformed

    private void vapenKommunikationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vapenKommunikationActionPerformed
        //Startar en vapenReg ruta för agent för att registrera utrustning av typen vapen.
        vapenReg meny = new vapenReg();
        meny.setVisible(true);
    }//GEN-LAST:event_vapenKommunikationActionPerformed

    private void teknikKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teknikKnappActionPerformed
        //Startar en teknikReg ruta för agent för att registrera utrustning av typen teknik.
        teknikReg meny = new teknikReg();
        meny.setVisible(true);
    }//GEN-LAST:event_teknikKnappActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton kommunikationKnapp;
    private javax.swing.JButton teknikKnapp;
    private javax.swing.JButton vapenKommunikation;
    // End of variables declaration//GEN-END:variables
}
