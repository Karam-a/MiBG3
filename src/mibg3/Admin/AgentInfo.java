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
    private String område;

    public AgentInfo() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");}
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");}
        initComponents();}
    
    //Felmeddelande, skrivs ut efter ett error av typen InfException uppstår.
    private void errorMessage(){
        JOptionPane.showMessageDialog(null, "Något gick fel, vänligen försök igen.");
    }
    
    //Setter, körs vid start i syfte att fylla agentValComboBox med alla agentnamn i databasen.
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
    
    //Getter, hämtar agentnamnet. 
    private String getAgentNamn(){
        namnLista();
        agNamn = agentValCB.getSelectedItem().toString();
        return agNamn;
    }
    
    //Getter, hämtar vald agents telefonnummer.
    private String getAgentTel(){
        try{
            agTel = mibdb.fetchSingle("SELECT Telefon FROM Agent WHERE Namn =" + "'" + agNamn + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return agTel;
    }
    
    //Getter, hämtar anställningsdatum på vald agent.
    private String getAnst(){
        try{
            agAnst = mibdb.fetchSingle("SELECT Anstallningsdatum FROM Agent WHERE Namn=" + "'" + agNamn + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return agAnst;
    }
    
    //Getter, hämtar adminstatus på  vald agent.
    private String getAdminStatus(){
        try{
            adminStatus = mibdb.fetchSingle("SELECT Administrator FROM Agent WHERE Namn=" + "'" + agNamn + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return adminStatus;
    }
    
    //Getter, hämtar området på vald agent.
    private String getOmråde(){
        try{
            String tlfOmr;
            tlfOmr = mibdb.fetchSingle("SELECT Omrade FROM Agent WHERE NAMN=" + "'" + agNamn + "'");
            område = mibdb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID =" + "'" + tlfOmr + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return område;
    }
    private void uppdatera(){
        // Användaren väljer en agent, metoden körs och uppdaterar alla jLabels med relevant info. 
        agNamn = agentValCB.getSelectedItem().toString();
        jLabel2.setText(agNamn);
        jLabel4.setText(getAgentTel());
        jLabel6.setText(getAnst());
        jLabel8.setText(getAdminStatus());
        jLabel10.setText(getOmråde());
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
        andraAgentKnapp = new javax.swing.JButton();
        taBortAgentKnapp = new javax.swing.JButton();
        agInfLabel = new javax.swing.JLabel();
        valjAgLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        andraOCStatus = new javax.swing.JButton();

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
        jLabel5.setText("Anställningsdatum:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText(getAnst());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Administratör (J/N):");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText(getAdminStatus());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Område:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText(getOmråde());

        andraAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        andraAgentKnapp.setText("Ändra");
        andraAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraAgentKnappActionPerformed(evt);
            }
        });

        taBortAgentKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        taBortAgentKnapp.setText("Ta bort Agent");
        taBortAgentKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAgentKnappActionPerformed(evt);
            }
        });

        agInfLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        agInfLabel.setText("Agentinformation");

        valjAgLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valjAgLabel.setText("Välj Agent:");

        andraOCStatus.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        andraOCStatus.setText("Ändra områdeschef-status");
        andraOCStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andraOCStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(agInfLabel))
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
                        .addComponent(valjAgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agentValCB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(andraOCStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(taBortAgentKnapp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(andraAgentKnapp)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agInfLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agentValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valjAgLabel))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(andraAgentKnapp)
                        .addComponent(taBortAgentKnapp))
                    .addComponent(andraOCStatus))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andraAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAgentKnappActionPerformed
        //Vid infoändring slussas användaren till nästa ruta.
        ändraInfoAgent meny = new ändraInfoAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_andraAgentKnappActionPerformed

    private void agentValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentValCBActionPerformed
    uppdatera();
    }//GEN-LAST:event_agentValCBActionPerformed

    private void taBortAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentKnappActionPerformed
        //Skapar en JOptionPane med valet ja/nej för att säkerställa att admin inte gör fel val.
        String namn = getAgentNamn();
        int bekr = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort " + getAgentNamn() + " från systemet? DET GÅR INTE ATT ÅNGRA!"  , "Bekräfta borttagning av " + namn, JOptionPane.YES_NO_OPTION);
        if (bekr == JOptionPane.YES_OPTION){
            try{
                mibdb.delete("DELETE FROM Agent WHERE Namn=" + "'" + getAgentNamn() + "'");
                JOptionPane.showMessageDialog(null, namn + " är nu borttagen från systemet.");
                //Vid genomförande startar den om fönstret, som på nytt går igenom databasen och hämtar alla namn.
                this.dispose();
                AgentInfo aInf = new AgentInfo();
                aInf.setVisible(true);
                }
            catch(InfException e){JOptionPane.showMessageDialog(null, "Något gick fel, försök igen.");}
        }
        //Vid ett "nej" returnerar den till menyn. Inget förändras i databasen eller programmet. 
        else{
        JOptionPane.showMessageDialog(null, "Ingen agent borttagen.");
        }
    }//GEN-LAST:event_taBortAgentKnappActionPerformed

    private void andraOCStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraOCStatusActionPerformed
        // TODO add your handling code here:
        OCstatus meny = new OCstatus();
        meny.setVisible(true);
    }//GEN-LAST:event_andraOCStatusActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agInfLabel;
    private javax.swing.JComboBox<String> agentValCB;
    private javax.swing.JButton andraAgentKnapp;
    private javax.swing.JButton andraOCStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel valjAgLabel;
    // End of variables declaration//GEN-END:variables
}
