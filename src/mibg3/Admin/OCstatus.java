package mibg3.Admin;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class OCstatus extends javax.swing.JFrame {
    InfDB mibdb;
    private String namn;
    private String omr�de;

    public OCstatus() {
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

        namnLabel = new javax.swing.JLabel();
        omrLabel = new javax.swing.JLabel();
        namnField = new javax.swing.JTextField();
        omr�deField = new javax.swing.JTextField();
        okKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Omr�deschefsstatus");

        namnLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namnLabel.setText("Namn p� agent:");

        omrLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        omrLabel.setText("Ange omr�de (ett nummer):");

        namnField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        omr�deField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        okKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okKnapp.setText("OK");
        okKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okKnappActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Omr�deschefstatus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(omrLabel)
                            .addComponent(namnLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namnField)
                            .addComponent(omr�deField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(okKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnLabel)
                    .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omrLabel)
                    .addComponent(omr�deField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Vid OK kommer anv�ndaren kunna �ndra en agent till omr�deschef.
    private void okKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnappActionPerformed
        //Validerar att alla f�lt �r ifyllda.
        if(Valideringsklass.v�rdeExisterar(namnField) && Valideringsklass.v�rdeExisterar(omr�deField)){
        int bekr = JOptionPane.showConfirmDialog(null, "�r du s�ker p� att du vill �ndra agentens status till omr�deschef?" , "Bekr�fta �ndring", JOptionPane.YES_NO_OPTION);
        //Vid ett Ja kommer koden att k�ras och agenten g�rs till en OC.
        if(bekr == JOptionPane.YES_OPTION){
             try{
                    namn = namnField.getText();
                    omr�de = omr�deField.getText();
                    String agentID;
                    agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn =" + "'" + namn + "'");
                    mibdb.delete("DELETE FROM Omradeschef WHERE Omrade =" + "'" + omr�de + "'");
                    mibdb.insert("INSERT INTO Omradeschef VALUES("+ "'"  + agentID + "'" + "," + "'" + omr�de + "'"+")");
                    JOptionPane.showMessageDialog(null, "Du har �ndrat " + namn + " till omr�deschef �ver omr�de " + omr�de);
        
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att �ndra agenten till omr�deschef, v�nligen f�rs�k igen.");
            }
        }
       }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�lten och f�rs�k igen.");
        }
    }//GEN-LAST:event_okKnappActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField namnField;
    private javax.swing.JLabel namnLabel;
    private javax.swing.JButton okKnapp;
    private javax.swing.JLabel omrLabel;
    private javax.swing.JTextField omr�deField;
    // End of variables declaration//GEN-END:variables
}
