package mibg3.Admin;

import javax.swing.JOptionPane;
import mibg3.Inloggningsruta;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AdminInlogg extends javax.swing.JFrame {
    private InfDB mibdb;
    private String inloggadID; //Ger anv�ndaren ett ID som anv�nds f�r att identifiera den inloggade agentens ID.
    
    public AdminInlogg() {
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

        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        angeLosen = new javax.swing.JPasswordField();
        anvNamnField = new javax.swing.JTextField();
        okKnapp = new javax.swing.JButton();
        tillbakaKnapp = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrat�rsinloggning");

        jInternalFrame1.setVisible(true);

        jLabel3.setText("V�lkommen Administrat�r!");

        jLabel4.setText("V�nligen ange ditt anv�ndarnamn och l�senord.");

        jLabel5.setText("Anv�ndarnamn:");

        jLabel6.setText("L�senord:");

        angeLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angeLosenActionPerformed(evt);
            }
        });

        anvNamnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anvNamnFieldActionPerformed(evt);
            }
        });

        okKnapp.setText("OK");
        okKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okKnappActionPerformed(evt);
            }
        });

        tillbakaKnapp.setText("Tillbaka");
        tillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(anvNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 111, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tillbakaKnapp)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anvNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(angeLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tillbakaKnapp)
                    .addComponent(okKnapp))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void angeLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angeLosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angeLosenActionPerformed

    private void anvNamnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anvNamnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anvNamnFieldActionPerformed

    private void okKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnappActionPerformed
        //Inloggning f�r Admin. Validerar att v�rden �r angivna i f�lten, f�r att sedan logga in anv�ndaren.
        if(Valideringsklass.v�rdeExisterar(anvNamnField) && Valideringsklass.v�rdeExisterar(angeLosen)){
        try{
            String anv�ndarnamn = anvNamnField.getText();
            String l�senord = angeLosen.getText();
            String anvID;
            String l�sen;
            String checkAdmin;
            
            
            anvID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn = " + "'" + anv�ndarnamn + "'");
            l�sen = mibdb.fetchSingle("SELECT Losenord FROM Agent WHERE Agent_ID = " + "'" + anvID + "'");
            checkAdmin = mibdb.fetchSingle("SELECT Administrator FROM Agent WHERE Agent_ID = " + "'" + anvID + "'");
           
            //L�senords- och adminkontroll, om databasen anger agenten som Admin f�r denna tillg�ng till adminverktygen.
            if(l�senord.equals(l�sen) && (checkAdmin.equals("J"))){
                AdminMeny meny = new AdminMeny();
                meny.setVisible(true);
                inloggadID = anvID;
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Fel l�senord eller anv�ndarnamn. V�nligen f�rs�k igen.");
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta.");
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�lten och f�rs�k igen.");
        }
    }//GEN-LAST:event_okKnappActionPerformed

    //Tar tillbaka anv�ndaren till inloggningsrutan med ett knapptryck.
    private void tillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaKnappActionPerformed
        this.dispose();
        new Inloggningsruta().setVisible(true);
    }//GEN-LAST:event_tillbakaKnappActionPerformed





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField angeLosen;
    private javax.swing.JTextField anvNamnField;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton okKnapp;
    private javax.swing.JButton tillbakaKnapp;
    // End of variables declaration//GEN-END:variables
}
