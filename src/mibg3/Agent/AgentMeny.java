package mibg3.Agent;

public class AgentMeny extends javax.swing.JFrame {
    
    private static String ettNamn;
    
    public AgentMeny(String namn) {
        //N�r denna ruta instansieras s� tas agentens namn som parameter och s�tter f�ltet "ettNamn" till det.
        ettNamn = namn;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        knappAgentHanteraAliens = new javax.swing.JButton();
        knappAgentHanteraUtrustning = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        andraLosen = new javax.swing.JButton();
        sokOCKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agentmeny");

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("V�lkommen, " + h�mtaAgentNamn());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("V�lj ett alternativ nedan");

        knappAgentHanteraAliens.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        knappAgentHanteraAliens.setText("Hantera Aliens");
        knappAgentHanteraAliens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knappAgentHanteraAliensActionPerformed(evt);
            }
        });

        knappAgentHanteraUtrustning.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        knappAgentHanteraUtrustning.setText("Hantera Utrustning");
        knappAgentHanteraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                knappAgentHanteraUtrustningActionPerformed(evt);
            }
        });

        andraLosen.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        andraLosen.setText("�ndra l�senord");
        andraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraLosenActionPerformed(evt);
            }
        });

        sokOCKnapp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sokOCKnapp.setText("S�k omr�deschef");
        sokOCKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sokOCKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(knappAgentHanteraAliens)
                        .addGap(18, 18, 18)
                        .addComponent(andraLosen))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(knappAgentHanteraUtrustning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sokOCKnapp)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(knappAgentHanteraAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(andraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(knappAgentHanteraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sokOCKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void knappAgentHanteraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knappAgentHanteraUtrustningActionPerformed
        //Startar en HanteraUtrustning ruta f�r agent.
        HanteraUtrustning meny = new HanteraUtrustning();
        meny.setVisible(true);
    }//GEN-LAST:event_knappAgentHanteraUtrustningActionPerformed

    private void knappAgentHanteraAliensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_knappAgentHanteraAliensActionPerformed
        //Startar en HanteraAliens ruta f�r agent.
        HanteraAliens meny = new HanteraAliens();
        meny.setVisible(true);
    }//GEN-LAST:event_knappAgentHanteraAliensActionPerformed

    private void andraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraLosenActionPerformed
        //Startar en NyttLosenord ruta f�r agent.
        new NyttLosenord().setVisible(true);
    }//GEN-LAST:event_andraLosenActionPerformed

    private void sokOCKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sokOCKnappActionPerformed
        // Startar en SokOC ruta f�r agent (s�ka omr�deschef).
        SokOC meny = new SokOC();
        meny.setVisible(true);
    }//GEN-LAST:event_sokOCKnappActionPerformed

   public static String h�mtaAgentNamn(){
       //H�mtar agentens namn. Anv�nds i jLabeln i designrutan s� att agentens namn st�r p� rutan n�r man har loggat in.
        return ettNamn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton andraLosen;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton knappAgentHanteraAliens;
    private javax.swing.JButton knappAgentHanteraUtrustning;
    private javax.swing.JButton sokOCKnapp;
    // End of variables declaration//GEN-END:variables
}
