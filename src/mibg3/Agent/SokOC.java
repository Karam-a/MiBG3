package mibg3.Agent;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SokOC extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> omr�deslista;
    private String agentNamn;
    private String omr�deNamn;

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
        JOptionPane.showMessageDialog(null, "N�got gick fel, v�nligen f�rs�k igen.");
    }
    
    private void namnlista(){
        //Fyller combo-boxen med omr�denas namn.
        try{
        omr�deslista = mibdb.fetchColumn("SELECT Benamning FROM Omrade");
        for(String omr�de : omr�deslista){
                omr�deValCB.addItem(omr�de);
        }
        }
        catch(InfException e){
        errorMessage();
        }
        }
    
    private String message(){
        //Metod som s�tter jLabeln l�ngst upp samt kallar p� namnlista() metoden som inte fungerade i konstruktorn men funkar h�r.
        namnlista();
        return "V�nligen v�lj ett omr�de.";
    }
   
    private String getOmr�deNamn(){
        //H�mtar det valda omr�dets namn.
        omr�deNamn = omr�deValCB.getSelectedItem().toString();
        return omr�deNamn;
    }
   
    private String getAgentNamn(){
        //Lokala variabler instansieras f�r att tilldelas de v�rden som returneras av det vi h�mtar fr�n databasen.
        //Kallar p� getOmr�deNamn() s� vi kan h�mta det valda omr�dets ID. H�mtar sedan omr�deschefens ID med hj�lp av omr�deID f�r att d�refter h�mta omr�deschefens namn.
        String omr�deID = "";
        String agentID = "";
        try{
                getOmr�deNamn();
                omr�deID = mibdb.fetchSingle("SELECT Omrades_ID FROM Omrade WHERE Benamning =" + "'" + omr�deNamn + "'");
                agentID = mibdb.fetchSingle("SELECT Agent_ID FROM Omradeschef WHERE Omrade =" + "'" + omr�deID + "'");
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

        omr�deValCB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        meddelande = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        omr�deValCB.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        omr�deValCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                omr�deValCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Omr�deschef:");

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
                    .addComponent(omr�deValCB, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(omr�deValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void omr�deValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_omr�deValCBActionPerformed
        //Uppdaterar namnet p� omr�deschefen varje g�ng man klickar i ett omr�de.
        jLabel2.setText(getAgentNamn());
    }//GEN-LAST:event_omr�deValCBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel meddelande;
    private javax.swing.JComboBox<String> omr�deValCB;
    // End of variables declaration//GEN-END:variables
}
