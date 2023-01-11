package mibg3.Admin;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class OCstatus extends javax.swing.JFrame {
    InfDB mibdb;
    private String namn;
    private String område;

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
        områdeField = new javax.swing.JTextField();
        okKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Områdeschefsstatus");

        namnLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namnLabel.setText("Namn på agent:");

        omrLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        omrLabel.setText("Ange område (ett nummer):");

        namnField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        områdeField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        okKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okKnapp.setText("OK");
        okKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okKnappActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Områdeschefstatus");

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
                            .addComponent(områdeField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(områdeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(okKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Vid OK kommer användaren kunna ändra en agent till områdeschef.
    private void okKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnappActionPerformed
        //Validerar att alla fält är ifyllda.
        if(Valideringsklass.värdeExisterar(namnField) && Valideringsklass.värdeExisterar(områdeField)){
        int bekr = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ändra agentens status till områdeschef?" , "Bekräfta ändring", JOptionPane.YES_NO_OPTION);
        //Vid ett Ja kommer koden att köras och agenten görs till en OC.
        if(bekr == JOptionPane.YES_OPTION){
             try{
                    namn = namnField.getText();
                    område = områdeField.getText();
                    String agentID;
                    agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn =" + "'" + namn + "'");
                    mibdb.delete("DELETE FROM Omradeschef WHERE Omrade =" + "'" + område + "'");
                    mibdb.insert("INSERT INTO Omradeschef VALUES("+ "'"  + agentID + "'" + "," + "'" + område + "'"+")");
                    JOptionPane.showMessageDialog(null, "Du har ändrat " + namn + " till områdeschef över område " + område);
        
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ändra agenten till områdeschef, vänligen försök igen.");
            }
        }
       }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fälten och försök igen.");
        }
    }//GEN-LAST:event_okKnappActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField namnField;
    private javax.swing.JLabel namnLabel;
    private javax.swing.JButton okKnapp;
    private javax.swing.JLabel omrLabel;
    private javax.swing.JTextField områdeField;
    // End of variables declaration//GEN-END:variables
}
