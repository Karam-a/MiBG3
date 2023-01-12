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
    private String oc;

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
    
    private String getOC(){
        try{
            String agentID;
            agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn=" + "'" + agNamn + "'");
            String områdeID;
            områdeID = mibdb.fetchSingle("SELECT Omrade FROM Omradeschef WHERE Agent_ID=" +  agentID);
            oc = mibdb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID=" + "'" + områdeID + "'");
        }
        catch(InfException e){
            errorMessage();
        }
        return oc;
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
        returnAgNamnLabel.setText(agNamn);
        returnAgTelLabel.setText(getAgentTel());
        returnAnstDatLabel.setText(getAnst());
        returnAdmStatusLabel.setText(getAdminStatus());
        returnOmradeLabel.setText(getOmråde());
        returnChefOverOmrLabel.setText(getOC());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agentValCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        returnAgNamnLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        returnAgTelLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        returnAnstDatLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        returnAdmStatusLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        returnOmradeLabel = new javax.swing.JLabel();
        andraAgentKnapp = new javax.swing.JButton();
        taBortAgentKnapp = new javax.swing.JButton();
        agInfLabel = new javax.swing.JLabel();
        valjAgLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        andraOCStatus = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        returnChefOverOmrLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agentinformation");

        agentValCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agentValCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Namn:");

        returnAgNamnLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnAgNamnLabel.setText(getAgentNamn());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Telefon:");

        returnAgTelLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnAgTelLabel.setText(getAgentTel());

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Anställningsdatum:");

        returnAnstDatLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnAnstDatLabel.setText(getAnst());

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Administratör (J/N):");

        returnAdmStatusLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnAdmStatusLabel.setText(getAdminStatus());

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Område:");

        returnOmradeLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnOmradeLabel.setText(getOmråde());

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

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Chef över område:");

        returnChefOverOmrLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        returnChefOverOmrLabel.setText(getOC());

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
                                .addComponent(returnAgTelLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAnstDatLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAdmStatusLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnOmradeLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAgNamnLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnChefOverOmrLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(valjAgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(agentValCB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(andraOCStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taBortAgentKnapp)
                .addGap(12, 12, 12)
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
                    .addComponent(returnAgNamnLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(returnAgTelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(returnAnstDatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(returnAdmStatusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(returnOmradeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(returnChefOverOmrLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(andraAgentKnapp)
                    .addComponent(taBortAgentKnapp)
                    .addComponent(andraOCStatus))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void andraAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andraAgentKnappActionPerformed
        //Vid infoändring slussas användaren till nästa ruta.
        andraInfoAgent meny = new andraInfoAgent();
        meny.setVisible(true);
    }//GEN-LAST:event_andraAgentKnappActionPerformed

    //Vid val av ny agent uppdateras informationsrutorna.
    private void agentValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agentValCBActionPerformed
    uppdatera();
    }//GEN-LAST:event_agentValCBActionPerformed

    private void taBortAgentKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAgentKnappActionPerformed
        //Skapar en JOptionPane med valet ja/nej för att säkerställa att admin inte gör fel val.
        String namn = getAgentNamn();
        String agentID;
        int bekr = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort " + getAgentNamn() + " från systemet? DET GÅR INTE ATT ÅNGRA!"  , "Bekräfta borttagning av " + namn, JOptionPane.YES_NO_OPTION);
        if (bekr == JOptionPane.YES_OPTION){
            try{
                agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn=" + "'" + namn + "'");
                    if(returnChefOverOmrLabel != null){
                        mibdb.delete("DELETE FROM Omradeschef WHERE Agent_ID=" + "'" + agentID + "'");
                    }
                mibdb.delete("DELETE FROM Agent WHERE Namn=" + "'" + namn + "'");
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
        //Startar en ruta för admin att ändra områdeschef. 
        OCstatus meny = new OCstatus();
        meny.setVisible(true);
    }//GEN-LAST:event_andraOCStatusActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agInfLabel;
    private javax.swing.JComboBox<String> agentValCB;
    private javax.swing.JButton andraAgentKnapp;
    private javax.swing.JButton andraOCStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel returnAdmStatusLabel;
    private javax.swing.JLabel returnAgNamnLabel;
    private javax.swing.JLabel returnAgTelLabel;
    private javax.swing.JLabel returnAnstDatLabel;
    private javax.swing.JLabel returnChefOverOmrLabel;
    private javax.swing.JLabel returnOmradeLabel;
    private javax.swing.JButton taBortAgentKnapp;
    private javax.swing.JLabel valjAgLabel;
    // End of variables declaration//GEN-END:variables
}
