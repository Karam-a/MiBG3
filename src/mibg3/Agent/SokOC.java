package mibg3.Agent;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SokOC extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> områdeslista;
    private String agentNamn;
    private String områdeNamn;

    /**
     * Instansierar rutan SokOC.
     */
    public SokOC() {
        //Kopplar till databasen.
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
        initComponents();
    }
    
    private void errorMessage(){
        JOptionPane.showMessageDialog(null, "Något gick fel, vänligen försök igen.");
    }
    
    private void namnlista(){
        //Fyller combo-boxen med områdenas namn.
        try{
        områdeslista = mibdb.fetchColumn("SELECT Benamning FROM Omrade");
        for(String område : områdeslista){
                områdeValCB.addItem(område);
        }
        }
        catch(InfException e){
        errorMessage();
        }
        }
    
    private String message(){
        //Metod som sätter jLabeln längst upp samt kallar på namnlista() metoden som inte fungerade i konstruktorn men funkar här.
        namnlista();
        return "Vänligen välj ett område.";
    }
   
    private String getOmrådeNamn(){
        //Hämtar det valda områdets namn.
        områdeNamn = områdeValCB.getSelectedItem().toString();
        return områdeNamn;
    }
   
    private String getAgentNamn(){
        //Lokala variabler instansieras för att tilldelas de värden som returneras av det vi hämtar från databasen.
        //Kallar på getOmrådeNamn() så vi kan hämta det valda områdets ID. Hämtar sedan områdeschefens ID med hjälp av områdeID för att därefter hämta områdeschefens namn.
        String områdeID = "";
        String agentID = "";
        try{
                getOmrådeNamn();
                områdeID = mibdb.fetchSingle("SELECT Omrades_ID FROM Omrade WHERE Benamning =" + "'" + områdeNamn + "'");
                agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Omradeschef WHERE Omrade =" + "'" + områdeID + "'");
                agentNamn = mibdb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID =" + "'"  + agentID + "'");
    }
        catch(InfException e){
                errorMessage();
        }
        return agentNamn;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        områdeValCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        meddelande = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        områdeValCB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        områdeValCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                områdeValCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Områdeschef:");

        meddelande.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        meddelande.setText(message());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText(getAgentNamn());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(områdeValCB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(meddelande))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(meddelande)
                .addGap(31, 31, 31)
                .addComponent(områdeValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void områdeValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_områdeValCBActionPerformed
        //Uppdaterar namnet på områdeschefen varje gång man klickar i ett område.
        jLabel2.setText(getAgentNamn());
    }//GEN-LAST:event_områdeValCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel meddelande;
    private javax.swing.JComboBox<String> områdeValCB;
    // End of variables declaration//GEN-END:variables
}
