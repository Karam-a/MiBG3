
package mibg3.Admin;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AlienInfoAdmin extends javax.swing.JFrame {
private InfDB mibdb;
private String aNamn;
private String aID;
private String aRegDat;
private String aTelNr;
private String ansvAg;
private String nuvPlats;
private String faktOmr;
private String aRas;
private ArrayList<String> namn;

    /**
     * Creates new form AlienInfoAdmin
     */
    public AlienInfoAdmin() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rasLabel = new javax.swing.JLabel();
        returnAlienRasLabel = new javax.swing.JLabel();
        alienIDLabel1 = new javax.swing.JLabel();
        ändraRasCB = new javax.swing.JComboBox<>();
        ändraRas = new javax.swing.JButton();
        ändraRasAntalArmBoog = new javax.swing.JTextField();
        rasLabel1 = new javax.swing.JLabel();
        alienInformationMainLabel = new javax.swing.JLabel();
        alienValCB = new javax.swing.JComboBox<>();
        alienLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        alienNamnLabel = new javax.swing.JLabel();
        alienIDLabel = new javax.swing.JLabel();
        regDatumAlienLabel = new javax.swing.JLabel();
        telNrLabel = new javax.swing.JLabel();
        ansvarigAgentLabel = new javax.swing.JLabel();
        nuvarandePlatsLabel = new javax.swing.JLabel();
        returnAlienNamnLabel = new javax.swing.JLabel();
        returnAlienIDLabel = new javax.swing.JLabel();
        returnAlienRegDatumLabel = new javax.swing.JLabel();
        returnAlienTelNrLabel = new javax.swing.JLabel();
        returnAlienAnsAgentLabel = new javax.swing.JLabel();
        returnAlienNuvPlatsLabel = new javax.swing.JLabel();
        ändraNamn = new javax.swing.JButton();
        ändraReg = new javax.swing.JButton();
        ändraTel = new javax.swing.JButton();
        ändraAgent = new javax.swing.JButton();
        ändraPlats = new javax.swing.JButton();
        ändraNamnField = new javax.swing.JTextField();
        ändraRegField = new javax.swing.JTextField();
        ändraTelField = new javax.swing.JTextField();
        ändraAgentField = new javax.swing.JTextField();
        ändraPlatsField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alieninformation");

        rasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rasLabel.setText("Ras:");

        returnAlienRasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienRasLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienRasLabel.setText(getRas());

        alienIDLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienIDLabel1.setText("ID kan ej redigeras.");

        ändraRasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        ändraRasCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ändraRasCBItemStateChanged(evt);
            }
        });

        ändraRas.setText("Ändra");
        ändraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraRasActionPerformed(evt);
            }
        });

        ändraRasAntalArmBoog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraRasAntalArmBoogActionPerformed(evt);
            }
        });

        rasLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rasLabel1.setText("Antal Armar/Boogies (Endast vid rasbyte):");

        alienInformationMainLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        alienInformationMainLabel.setText("Här kan du se och ändra information om aliens.");

        alienValCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienValCBActionPerformed(evt);
            }
        });
        alienValCB.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                alienValCBPropertyChange(evt);
            }
        });

        alienLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        alienLabel.setText("Alien:");

        alienNamnLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienNamnLabel.setText("Namn:");

        alienIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienIDLabel.setText("Alien ID:");

        regDatumAlienLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regDatumAlienLabel.setText("Registreringsdatum:");

        telNrLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telNrLabel.setText("Telefonnummer:");

        ansvarigAgentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ansvarigAgentLabel.setText("Ansvarig Agent:");

        nuvarandePlatsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuvarandePlatsLabel.setText("Nuvarande plats:");

        returnAlienNamnLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienNamnLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienNamnLabel.setText(getAlienNamn());

        returnAlienIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienIDLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienIDLabel.setText(getAlienID());

        returnAlienRegDatumLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienRegDatumLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienRegDatumLabel.setText(getRegDat());

        returnAlienTelNrLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienTelNrLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienTelNrLabel.setText(getTelNr());

        returnAlienAnsAgentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienAnsAgentLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienAnsAgentLabel.setText(getAnsvarAg());

        returnAlienNuvPlatsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienNuvPlatsLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienNuvPlatsLabel.setText(getNuvPlats());

        ändraNamn.setText("Ändra");
        ändraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraNamnActionPerformed(evt);
            }
        });

        ändraReg.setText("Ändra");
        ändraReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraRegActionPerformed(evt);
            }
        });

        ändraTel.setText("Ändra");
        ändraTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraTelActionPerformed(evt);
            }
        });

        ändraAgent.setText("Ändra");
        ändraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraAgentActionPerformed(evt);
            }
        });

        ändraPlats.setText("Ändra");
        ändraPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraPlatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(regDatumAlienLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienRegDatumLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alienNamnLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienNamnLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(telNrLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienTelNrLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ansvarigAgentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienAnsAgentLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rasLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienRasLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alienIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienIDLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuvarandePlatsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienNuvPlatsLabel))
                            .addComponent(rasLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ändraAgentField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ändraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ändraTelField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ändraTel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ändraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ändraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ändraRegField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ändraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alienIDLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ändraRasAntalArmBoog, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ändraRasCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ändraPlatsField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ändraPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ändraRas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(alienLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alienValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alienInformationMainLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alienInformationMainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienLabel)
                    .addComponent(alienValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienNamnLabel)
                    .addComponent(returnAlienNamnLabel)
                    .addComponent(ändraNamn)
                    .addComponent(ändraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienIDLabel)
                    .addComponent(returnAlienIDLabel)
                    .addComponent(alienIDLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regDatumAlienLabel)
                    .addComponent(returnAlienRegDatumLabel)
                    .addComponent(ändraReg)
                    .addComponent(ändraRegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNrLabel)
                    .addComponent(returnAlienTelNrLabel)
                    .addComponent(ändraTel)
                    .addComponent(ändraTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansvarigAgentLabel)
                    .addComponent(returnAlienAnsAgentLabel)
                    .addComponent(ändraAgent)
                    .addComponent(ändraAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandePlatsLabel)
                    .addComponent(returnAlienNuvPlatsLabel)
                    .addComponent(ändraPlats)
                    .addComponent(ändraPlatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rasLabel)
                    .addComponent(returnAlienRasLabel)
                    .addComponent(ändraRasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ändraRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ändraRasAntalArmBoog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rasLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void errorLol(){
   JOptionPane.showMessageDialog(null, "Något gick fel, försök igen");}
   
private void namnLista(){
       try{
        namn = mibdb.fetchColumn("SELECT Namn FROM Alien");
        for(String alienNamn : namn){
            alienValCB.addItem(alienNamn);
        }
       }
       catch(InfException e){
           JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
       }
    }

private String getAlienNamn(){
        namnLista();        
          aNamn = alienValCB.getSelectedItem().toString();
          return aNamn;
    }
      
    
    private String getAlienID(){
        try{aID = mibdb.fetchSingle("SELECT Alien_ID FROM Alien WHERE Namn=" + "'" + aNamn + "'");}
        catch(InfException e){errorLol();}
        return aID;
    }
    
    private String getRegDat(){
    try{aRegDat = mibdb.fetchSingle("SELECT Registreringsdatum FROM Alien WHERE Namn=" + "'" + aNamn + "'");}
    catch(InfException e){errorLol();}
    return aRegDat;
    }
   
   
    private String getTelNr(){
    try{aTelNr = mibdb.fetchSingle("SELECT Telefon FROM Alien WHERE Namn=" + "'" + aNamn + "'");}
    catch(InfException e){errorLol();}
    return aTelNr;
    }
    
    private String getAnsvarAg(){
        String tlfAag;
        try{
        tlfAag = mibdb.fetchSingle("SELECT Ansvarig_Agent FROM Alien WHERE Namn=" + "'" + aNamn+ "'");
        ansvAg = mibdb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID=" + tlfAag);}
    catch(InfException e){errorLol();}
    return ansvAg;
    }
    
    private String getNuvPlats(){
        String tlfOmr;
        String finnsI;
    try{
        tlfOmr = mibdb.fetchSingle("SELECT Plats FROM Alien WHERE Namn=" + "'" + aNamn + "'");
        nuvPlats = mibdb.fetchSingle("SELECT Benamning FROM Plats WHERE Plats_ID=" + tlfOmr);
        finnsI = mibdb.fetchSingle("SELECT Finns_I FROM Plats WHERE Plats_ID=" + tlfOmr);
        faktOmr = mibdb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID=" + finnsI);
    }
    catch(InfException e){errorLol();}
    return nuvPlats + ", " + faktOmr;
    }

    private String getRas(){
        try{
                if(mibdb.fetchColumn("SELECT * FROM Squid WHERE Alien_ID=" + "'" + aID + "'").contains(aID) && aID !=null){
                    aRas = "Squid";}
                else if (mibdb.fetchColumn("SELECT * FROM Boglodite WHERE Alien_ID=" + "'" + aID + "'").contains(aID) && aID !=null){
                    aRas = "Boglodite";}
                else if(mibdb.fetchColumn("SELECT * FROM Worm WHERE Alien_ID = "+ "'" + aID + "'").contains(aID) && aID !=null){
                    aRas="Worm";}
                else{
                    aRas = "Alien Saknar Ras.";}
            }
        catch(InfException e){errorLol();}
        return aRas;
    }
    
    private void taBortFranRas(){
   try{
       String rasCheck = getRas();
       if("Alien Saknar Ras.".equals(rasCheck)){
       }
       else switch(rasCheck){
           case "Squid":
               mibdb.delete("DELETE FROM Squid WHERE Alien_ID=" + aID);
               break;
           case "Boglodite":
               mibdb.delete("DELETE FROM Boglodite WHERE Alien_ID=" + aID);
               break;
           case "Worm":
               mibdb.delete("DELETE FROM Worm WHERE Alien_ID=" + aID);
               break;
       }
   }
   catch(InfException e){JOptionPane.showMessageDialog(null, "Något gick fel med ändring av rasen, försök igen.");}
    }
    
    private void ändraRasCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ändraRasCBItemStateChanged
        if(ändraRasCB.getSelectedItem().equals("Worm")){
            ändraRasAntalArmBoog.setText("0");
            ändraRasAntalArmBoog.setEnabled(false);}
        else{
            ändraRasAntalArmBoog.setEnabled(true);}
    }//GEN-LAST:event_ändraRasCBItemStateChanged

    private void ändraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraRasActionPerformed
        try{
            int antAB = Integer.parseInt(ändraRasAntalArmBoog.getText());
            String valdRas = ändraRasCB.getSelectedItem().toString();
            switch (valdRas){
                case "Boglodite":
                taBortFranRas();
                mibdb.insert("INSERT INTO Boglodite(Alien_ID,Antal_Boogies) VALUES(" + aID + "," + "'" + antAB + "'" + ")");
                break;
                case "Squid":
                taBortFranRas();
                mibdb.insert("INSERT INTO Squid (Alien_ID,Antal_armar) VALUES(" + aID +"," +"'" + antAB + "'"+ ")");
                break;
                case "Worm":
                taBortFranRas();
                mibdb.insert("INSERT INTO Worm (Alien_ID) VALUES(" + aID + ")");
                break;
            }

        }
        catch(InfException e){JOptionPane.showMessageDialog(null, "Rasändring misslyckades, vänligen försök igen.");}
        JOptionPane.showMessageDialog(null, "Rasbyte lyckades! Alien " + aNamn+ " är nu "+ getRas() + "!");
        ändraRasAntalArmBoog.setText("");
        returnAlienRasLabel.setText(getRas());
    }//GEN-LAST:event_ändraRasActionPerformed

    private void ändraRasAntalArmBoogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraRasAntalArmBoogActionPerformed
        //-//
    }//GEN-LAST:event_ändraRasAntalArmBoogActionPerformed

    private void alienValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienValCBActionPerformed
        aNamn = alienValCB.getSelectedItem().toString();
        returnAlienAnsAgentLabel.setText(getAnsvarAg());
        returnAlienIDLabel.setText(getAlienID());
        returnAlienNamnLabel.setText(aNamn);
        returnAlienNuvPlatsLabel.setText(getNuvPlats());
        returnAlienRegDatumLabel.setText(getRegDat());
        returnAlienTelNrLabel.setText(getTelNr());
        returnAlienRasLabel.setText(getRas());

    }//GEN-LAST:event_alienValCBActionPerformed

    private void alienValCBPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_alienValCBPropertyChange

    }//GEN-LAST:event_alienValCBPropertyChange

    private void ändraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraNamnActionPerformed
        // TODO add your handling code here:
        try{
            String namn = ändraNamnField.getText();
            mibdb.update("UPDATE Alien SET Namn ="+ "'" + namn + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Namnet är ändrat.");
            returnAlienNamnLabel.setText(aNamn);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ändra namnet.");
        }
    }//GEN-LAST:event_ändraNamnActionPerformed

    private void ändraRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraRegActionPerformed
        // TODO add your handling code here:
        try{
            String reg = ändraRegField.getText();
            mibdb.update("UPDATE Alien SET Registreringsdatum ="+ "'" + reg + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Registreringsdatumet är ändrat.");
            returnAlienRegDatumLabel.setText(getRegDat());
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ändra registreringsdatumet.");
        }
    }//GEN-LAST:event_ändraRegActionPerformed

    private void ändraTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraTelActionPerformed
        // TODO add your handling code here:
        try{
            String telefon = ändraTelField.getText();
            mibdb.update("UPDATE Alien SET Telefon ="+ "'" + telefon + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Telefonnumret är ändrat.");
            returnAlienTelNrLabel.setText(getTelNr());
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ändra telefonnumret.");
        }
    }//GEN-LAST:event_ändraTelActionPerformed

    private void ändraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraAgentActionPerformed
        // TODO add your handling code here:
        try{
            String agent = ändraAgentField.getText();
            mibdb.update("UPDATE Alien SET Ansvarig_Agent ="+ "'" + agent + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Ansvarig agent är ändrad.");
            returnAlienAnsAgentLabel.setText(getAnsvarAg());

        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ändra ansvarig agent.");
        }
    }//GEN-LAST:event_ändraAgentActionPerformed

    private void ändraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraPlatsActionPerformed
        // TODO add your handling code here:
        try{
            String plats = ändraPlatsField.getText();
            mibdb.update("UPDATE Alien SET Plats ="+ "'" + plats + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Nuvarande plats är ändrad.");
            returnAlienNuvPlatsLabel.setText(getNuvPlats());
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ändra den nuvarande platsen.");
        }
    }//GEN-LAST:event_ändraPlatsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alienIDLabel;
    private javax.swing.JLabel alienIDLabel1;
    private javax.swing.JLabel alienInformationMainLabel;
    private javax.swing.JLabel alienLabel;
    private javax.swing.JLabel alienNamnLabel;
    private javax.swing.JComboBox<String> alienValCB;
    private javax.swing.JLabel ansvarigAgentLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nuvarandePlatsLabel;
    private javax.swing.JLabel rasLabel;
    private javax.swing.JLabel rasLabel1;
    private javax.swing.JLabel regDatumAlienLabel;
    private javax.swing.JLabel returnAlienAnsAgentLabel;
    private javax.swing.JLabel returnAlienIDLabel;
    private javax.swing.JLabel returnAlienNamnLabel;
    private javax.swing.JLabel returnAlienNuvPlatsLabel;
    private javax.swing.JLabel returnAlienRasLabel;
    private javax.swing.JLabel returnAlienRegDatumLabel;
    private javax.swing.JLabel returnAlienTelNrLabel;
    private javax.swing.JLabel telNrLabel;
    private javax.swing.JButton ändraAgent;
    private javax.swing.JTextField ändraAgentField;
    private javax.swing.JButton ändraNamn;
    private javax.swing.JTextField ändraNamnField;
    private javax.swing.JButton ändraPlats;
    private javax.swing.JTextField ändraPlatsField;
    private javax.swing.JButton ändraRas;
    private javax.swing.JTextField ändraRasAntalArmBoog;
    private javax.swing.JComboBox<String> ändraRasCB;
    private javax.swing.JButton ändraReg;
    private javax.swing.JTextField ändraRegField;
    private javax.swing.JButton ändraTel;
    private javax.swing.JTextField ändraTelField;
    // End of variables declaration//GEN-END:variables
}
