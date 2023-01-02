package mibg3.Agent;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.lang.Iterable;

// Instansiering av variabler som presenteras i framens utvalda labels. Även databsen.
public class AlienInfoAgent extends javax.swing.JFrame {

private InfDB mibdb;
private String aNamn;
private String aID;
private String aRegDat;
private String aTelNr;
private String ansvAg;
private String nuvPlats;
private String faktOmr;
private String aRas;
//instansiering till Combo Box, värden i CB ändras automatiskt efter de aliens som finns i databasen.
//private String cbNyckel;
//private String cbVärde;


//Kontruktor. Skapar en HashMap av alla aliens i systemet, som sedan blir alternativen i vår combo box. ÄNDRA INTE ANNARS FÅR JAG RYCK, TACK PUSS O HEJ.
    public AlienInfoAgent() {
        try{
            //ansluter till databasen
        mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        
        // hämtar antalet aliens i databasen
        //int antalAliens = Integer.parseInt(mibdb.fetchSingle("SELECT count(*) FROM Alien"));
        
        //Lägger till alla aliens i en arraylist "Aliens i DB." Loopar tills varje alien i databasen är tillagd. 
       // ArrayList<String> aliensIDB = mibdb.fetchColumn("SELECT namn FROM Alien");
             //JOptionPane.showMessageDialog(null, aliensIDB);
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen, vänligen försök igen.");
        }
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        rasLabel = new javax.swing.JLabel();
        returnAlienRasLabel = new javax.swing.JLabel();
        alienIDLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alienInformationMainLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        alienInformationMainLabel.setText("Alieninformation");

        alienValCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bobbo", "My Book", "Braxen" }));
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
        nuvarandePlatsLabel.setText("Nuvarande Plats:");

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

        rasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rasLabel.setText("Ras:");

        returnAlienRasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienRasLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienRasLabel.setText(getNuvPlats());

        alienIDLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienIDLabel1.setText("ID kan ej redigeras.");

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
                                .addComponent(nuvarandePlatsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienNuvPlatsLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rasLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienRasLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(alienIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienIDLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ändraPlatsField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ändraPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(alienIDLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(alienInformationMainLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(alienLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alienValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(returnAlienRasLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void errorLol(){
   JOptionPane.showMessageDialog(null, "Något gick fel, försök igen");}
   
    private String getAlienNamn(){
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
    
    //Börjat lite lätt med metoden. 
    private void getRas(){
        boolean squid;
        boolean boglodite;
        boolean worm;
        try{ 
            if(aID = mibdb.fetchSingle("SELECT Alien_ID FROM Squid")){
                squid = true;
                boglodite = false;
                worm = false;
            }
            int valdAlien = Integer.parseInt(aID);
            switch (valdAlien){
                case 
            
            }
        }
    }
    
    //Lite problem med det här, den ändrar inte vald aliens namn. How da fuq do i make it work.
    private void alienValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienValCBActionPerformed
       aNamn = alienValCB.getSelectedItem().toString();
       returnAlienAnsAgentLabel.setText(getAnsvarAg());
       returnAlienIDLabel.setText(getAlienID());
       returnAlienNamnLabel.setText(aNamn);
       returnAlienNuvPlatsLabel.setText(getNuvPlats());
       returnAlienRegDatumLabel.setText(getRegDat());
       returnAlienTelNrLabel.setText(getTelNr());
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


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlienInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienInfoAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       // ArrayList<String> namn = mibdb.fetchColumn("SELECT Namn FROM Alien");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienInfoAgent().setVisible(true);
            }
        });
    }

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
    private javax.swing.JButton ändraReg;
    private javax.swing.JTextField ändraRegField;
    private javax.swing.JButton ändraTel;
    private javax.swing.JTextField ändraTelField;
    // End of variables declaration//GEN-END:variables
}
