package mibg3.Admin;

public class HanteraAgent extends javax.swing.JFrame {

    public HanteraAgent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agInfKNapp = new javax.swing.JButton();
        hantAgMenytitel = new javax.swing.JLabel();
        regAg = new javax.swing.JButton();
        taBortUtrKnapp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        andraKCKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hantera Agenter");

        agInfKNapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        agInfKNapp.setText("Agentinformation");
        agInfKNapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agInfKNappActionPerformed(evt);
            }
        });

        hantAgMenytitel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        hantAgMenytitel.setText("Hantera Agenter");

        regAg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regAg.setText("Registrera agent");
        regAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regAgActionPerformed(evt);
            }
        });

        taBortUtrKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        taBortUtrKnapp.setText("Ta bort utrustning");

        andraKCKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        andraKCKnapp.setText("Ändra kontorschef");
        andraKCKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraKCKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(andraKCKnapp)
                    .addComponent(hantAgMenytitel)
                    .addComponent(regAg)
                    .addComponent(agInfKNapp)
                    .addComponent(taBortUtrKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hantAgMenytitel)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(regAg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agInfKNapp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taBortUtrKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andraKCKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regAgActionPerformed
        // //Startar en RegAgent ruta för admin.
        RegAgent meny = new RegAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_regAgActionPerformed

    private void agInfKNappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agInfKNappActionPerformed
        //Startar en AgentInfo ruta för admin.
        AgentInfo meny = new AgentInfo();
        meny.setVisible(true);
    }//GEN-LAST:event_agInfKNappActionPerformed

    private void andraKCKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraKCKnappActionPerformed
        //Startar en ÄndraKontorschef ruta för admin.
        andraKC meny = new andraKC();
        meny.setVisible(true);
    }//GEN-LAST:event_andraKCKnappActionPerformed

 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agInfKNapp;
    private javax.swing.JButton andraKCKnapp;
    private javax.swing.JLabel hantAgMenytitel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton regAg;
    private javax.swing.JButton taBortUtrKnapp;
    // End of variables declaration//GEN-END:variables
}
