package mibg3.Admin;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;

public class andraKC extends javax.swing.JFrame {
    private InfDB mibdb;

    public andraKC() {
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

        jLabel1 = new javax.swing.JLabel();
        namnField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bekräftaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Namn på agent:");

        namnField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Gör Agent till Kontorschef");

        bekräftaKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        bekräftaKnapp.setText("Bekräfta");
        bekräftaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bekräftaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bekräftaKnapp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bekräftaKnapp)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bekräftaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bekräftaKnappActionPerformed
        // Vid knapptryck kontrolleras först att ett värde angivits i fältet, sedan får användaren bekräfta att de faktiskt vill genomföra bytet.
        if(Valideringsklass.värdeExisterar(namnField)){
        try{
            //Kontrollruta, ja/nej måste väljas. Vid nej sker inget, vid ja körs nedan kod.
            int bekr = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ändra den nuvarande kontorschefen?"  , "Bekräfta ändring av kontorschef", JOptionPane.YES_NO_OPTION);
            if (bekr == JOptionPane.YES_OPTION){
                String namn;
                String agentID;
                namn = namnField.getText();
                if(Valideringsklass.värdeExisterar(namnField)){
                    String nuvarandeChef = mibdb.fetchSingle("SELECT Agent_ID FROM Kontorschef WHERE Kontorsbeteckning = 'Örebrokontoret'");
                    mibdb.delete("DELETE FROM Kontorschef WHERE Kontorsbeteckning = 'Örebrokontoret'");
                    agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn =" + "'" + namn + "'");
                    mibdb.insert("INSERT INTO Kontorschef VALUES(" + "'" + agentID + "'" + ", 'Örebrokontoret')");
                    mibdb.delete("DELETE FROM Faltagent WHERE Agent_ID = "+ "'" + agentID + "'");
                    mibdb.insert("INSERT INTO Faltagent VALUES(" + "'" + nuvarandeChef + "'" + ")");
                    JOptionPane.showMessageDialog(null, "Du har nu gjort " + namn + " till den nya kontorschefen!");
            }
            }
        }
         catch(InfException e){
                JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
                    }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fältet och försök igen.");
        }
    }//GEN-LAST:event_bekräftaKnappActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bekräftaKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField namnField;
    // End of variables declaration//GEN-END:variables
}
