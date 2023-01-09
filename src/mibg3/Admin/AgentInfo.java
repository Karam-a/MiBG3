package mibg3.Admin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class AgentInfo extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> agentNamn;
    private String agNamn;
    private String agTel;
    private String agAnst;
    private String adminStatus;
    private String omr�de;

    public AgentInfo() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");}
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");}
        initComponents();}
    
    //Felmeddelande, skrivs ut efter ett error av typen InfException uppst�r.
    private void errorMessage(){
        JOptionPane.showMessageDialog(null, "N�got gick fel, v�nligen f�rs�k igen.");
    }
    
    //Setter, k�rs vid start i syfte att fylla agentValComboBox med alla agentnamn i databasen.
    private void namnLista(){
        try{
            agentNamn = mibdb.fetchColumn("SELECT Namn FROM Agent");
            for(String namn : agentNamn){
                agentValCB.addItem(namn);
            }
        }
        catch(InfException e){
            errorMessage();
        }
    }
    
    //Getter, h�mtar agentnamnet. 
    private String getAgentNamn(){
        namnLista();
        agNamn = agentValCB.getSelectedItem().toString();
        return agNamn;
    }
    
    //Getter, h�mtar vald agents telefonnummer.
    private String getAgentTel(){
        try{
            agTel = mibdb.fetchSingle("SELECT Telefon FROM Agent WHERE Namn =" + "'" + agNamn + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return agTel;
    }
    
    //Getter, h�mtar anst�llningsdatum p� vald agent.
    private String getAnst(){
        try{
            agAnst = mibdb.fetchSingle("SELECT Anstallningsdatum FROM Agent WHERE Namn=" + "'" + agNamn + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return agAnst;
    }
    
    //Getter, h�mtar adminstatus p�  vald agent.
    private String getAdminStatus(){
        try{
            adminStatus = mibdb.fetchSingle("SELECT Administrator FROM Agent WHERE Namn=" + "'" + agNamn + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return adminStatus;
    }
    
    //Getter, h�mtar omr�det p� vald agent.
    private String getOmr�de(){
        try{
            String tlfOmr;
            tlfOmr = mibdb.fetchSingle("SELECT Omrade FROM Agent WHERE NAMN=" + "'" + agNamn + "'");
            omr�de = mibdb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID =" + "'" + tlfOmr + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return omr�de;
    }
    private void uppdatera(){
        // Anv�ndaren v�ljer en agent, metoden k�rs och uppdaterar alla jLabels med relevant info. 
        agNamn = agentValCB.getSelectedItem().toString();
        jLabel2.setText(agNamn);
        jLabel4.setText(getAgentTel());
        jLabel6.setText(getAnst());
        jLabel8.setText(getAdminStatus());
        jLabel10.setText(getOmr�de());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agentValCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        taBortAgentKnapp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agentinformation");

        agentValCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentValCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Namn:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText(getAgentNamn());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Telefon:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText(getAgentTel());

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Anst�llningsdatum:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText(getAnst());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Administrat�r (J/N):");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText(getAdminStatus());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Omr�de:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText(getOmr�de());

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("�ndra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        taBortAgentKnapp.setText("Ta bort Agent");
        taBortAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentKnappActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Agentinformation");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("V�lj Agent:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agentValCB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(taBortAgentKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(taBortAgentKnapp))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Vid info�ndring slussas anv�ndaren till n�sta ruta.
        �ndraInfoAgent meny = new �ndraInfoAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agentValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentValCBActionPerformed
    uppdatera();
    }//GEN-LAST:event_agentValCBActionPerformed

    private void taBortAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentKnappActionPerformed
        //Skapar en JOptionPane med valet ja/nej f�r att s�kerst�lla att admin inte g�r fel val.
        String namn = getAgentNamn();
        int bekr = JOptionPane.showConfirmDialog(null, "�r du s�ker p� att du vill ta bort " + getAgentNamn() + " fr�n systemet? DET G�R INTE ATT �NGRA!"  , "Bekr�fta borttagning av " + namn, JOptionPane.YES_NO_OPTION);
        if (bekr == JOptionPane.YES_OPTION){
            try{
                mibdb.delete("DELETE FROM Agent WHERE Namn=" + "'" + getAgentNamn() + "'");
                JOptionPane.showMessageDialog(null, namn + " �r nu borttagen fr�n systemet.");
                //Vid genomf�rande startar den om f�nstret, som p� nytt g�r igenom databasen och h�mtar alla namn.
                this.dispose();
                AgentInfo aInf = new AgentInfo();
                aInf.setVisible(true);
                }
            catch(InfException e){JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen.");}
        }
        //Vid ett "nej" returnerar den till menyn. Inget f�r�ndras i databasen eller programmet. 
        else{
        JOptionPane.showMessageDialog(null, "Ingen agent borttagen.");
        }
    }//GEN-LAST:event_taBortAgentKnappActionPerformed

    
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
            java.util.logging.Logger.getLogger(AgentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgentInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agentValCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton taBortAgentKnapp;
    // End of variables declaration//GEN-END:variables
}
