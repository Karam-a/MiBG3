package mibg3.Agent;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.lang.Iterable;

// Instansiering av variabler som presenteras i framens utvalda labels. �ven databsen.
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
//instansiering till Combo Box, v�rden i CB �ndras automatiskt efter de aliens som finns i databasen.
//private String cbNyckel;
//private String cbV�rde;


//Kontruktor. Skapar en HashMap av alla aliens i systemet, som sedan blir alternativen i v�r combo box. �NDRA INTE ANNARS F�R JAG RYCK, TACK PUSS O HEJ.
    public AlienInfoAgent() {
        try{
            //ansluter till databasen
        mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        
        // h�mtar antalet aliens i databasen
        //int antalAliens = Integer.parseInt(mibdb.fetchSingle("SELECT count(*) FROM Alien"));
        
        //L�gger till alla aliens i en arraylist "Aliens i DB." Loopar tills varje alien i databasen �r tillagd. 
       // ArrayList<String> aliensIDB = mibdb.fetchColumn("SELECT namn FROM Alien");
             //JOptionPane.showMessageDialog(null, aliensIDB);
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen, v�nligen f�rs�k igen.");
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
        �ndraNamn = new javax.swing.JButton();
        �ndraReg = new javax.swing.JButton();
        �ndraTel = new javax.swing.JButton();
        �ndraAgent = new javax.swing.JButton();
        �ndraPlats = new javax.swing.JButton();
        �ndraNamnField = new javax.swing.JTextField();
        �ndraRegField = new javax.swing.JTextField();
        �ndraTelField = new javax.swing.JTextField();
        �ndraAgentField = new javax.swing.JTextField();
        �ndraPlatsField = new javax.swing.JTextField();
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

        �ndraNamn.setText("�ndra");
        �ndraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraNamnActionPerformed(evt);
            }
        });

        �ndraReg.setText("�ndra");
        �ndraReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraRegActionPerformed(evt);
            }
        });

        �ndraTel.setText("�ndra");
        �ndraTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraTelActionPerformed(evt);
            }
        });

        �ndraAgent.setText("�ndra");
        �ndraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraAgentActionPerformed(evt);
            }
        });

        �ndraPlats.setText("�ndra");
        �ndraPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraPlatsActionPerformed(evt);
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
                                .addComponent(�ndraPlatsField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraAgentField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraTelField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraTel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraRegField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(�ndraNamn)
                    .addComponent(�ndraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienIDLabel)
                    .addComponent(returnAlienIDLabel)
                    .addComponent(alienIDLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regDatumAlienLabel)
                    .addComponent(returnAlienRegDatumLabel)
                    .addComponent(�ndraReg)
                    .addComponent(�ndraRegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNrLabel)
                    .addComponent(returnAlienTelNrLabel)
                    .addComponent(�ndraTel)
                    .addComponent(�ndraTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansvarigAgentLabel)
                    .addComponent(returnAlienAnsAgentLabel)
                    .addComponent(�ndraAgent)
                    .addComponent(�ndraAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandePlatsLabel)
                    .addComponent(returnAlienNuvPlatsLabel)
                    .addComponent(�ndraPlats)
                    .addComponent(�ndraPlatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rasLabel)
                    .addComponent(returnAlienRasLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private void errorLol(){
   JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen");}
   
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
    
    //B�rjat lite l�tt med metoden. 
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
    
    //Lite problem med det h�r, den �ndrar inte vald aliens namn. How da fuq do i make it work.
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

    private void �ndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraNamnActionPerformed
        // TODO add your handling code here:
        try{
            String namn = �ndraNamnField.getText();
            mibdb.update("UPDATE Alien SET Namn ="+ "'" + namn + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Namnet �r �ndrat.");
            returnAlienNamnLabel.setText(aNamn);
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att �ndra namnet.");
        }
    }//GEN-LAST:event_�ndraNamnActionPerformed

    private void �ndraRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraRegActionPerformed
        // TODO add your handling code here:
        try{
            String reg = �ndraRegField.getText();
            mibdb.update("UPDATE Alien SET Registreringsdatum ="+ "'" + reg + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Registreringsdatumet �r �ndrat.");
            returnAlienRegDatumLabel.setText(getRegDat());
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att �ndra registreringsdatumet.");
        }
    }//GEN-LAST:event_�ndraRegActionPerformed

    private void �ndraTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraTelActionPerformed
        // TODO add your handling code here:
        try{
            String telefon = �ndraTelField.getText();
            mibdb.update("UPDATE Alien SET Telefon ="+ "'" + telefon + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Telefonnumret �r �ndrat.");
            returnAlienTelNrLabel.setText(getTelNr());
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att �ndra telefonnumret.");
        }
    }//GEN-LAST:event_�ndraTelActionPerformed

    private void �ndraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraAgentActionPerformed
        // TODO add your handling code here:
        try{
            String agent = �ndraAgentField.getText();
            mibdb.update("UPDATE Alien SET Ansvarig_Agent ="+ "'" + agent + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Ansvarig agent �r �ndrad.");
            returnAlienAnsAgentLabel.setText(getAnsvarAg());
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att �ndra ansvarig agent.");
        }
    }//GEN-LAST:event_�ndraAgentActionPerformed

    private void �ndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraPlatsActionPerformed
        // TODO add your handling code here:
        try{
            String plats = �ndraPlatsField.getText();
            mibdb.update("UPDATE Alien SET Plats ="+ "'" + plats + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
            JOptionPane.showMessageDialog(null, "Nuvarande plats �r �ndrad.");
            returnAlienNuvPlatsLabel.setText(getNuvPlats());
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att �ndra den nuvarande platsen.");
        }
    }//GEN-LAST:event_�ndraPlatsActionPerformed


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
    private javax.swing.JButton �ndraAgent;
    private javax.swing.JTextField �ndraAgentField;
    private javax.swing.JButton �ndraNamn;
    private javax.swing.JTextField �ndraNamnField;
    private javax.swing.JButton �ndraPlats;
    private javax.swing.JTextField �ndraPlatsField;
    private javax.swing.JButton �ndraReg;
    private javax.swing.JTextField �ndraRegField;
    private javax.swing.JButton �ndraTel;
    private javax.swing.JTextField �ndraTelField;
    // End of variables declaration//GEN-END:variables
}
