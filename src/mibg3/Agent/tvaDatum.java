package mibg3.Agent;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;

public class tvaDatum extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> alienNamn;

    /**
     * Instansierar rutan tvaDatum.
     */
    public tvaDatum() {
        //Kopplar till databasen.
        try {
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
        initComponents();
    }
    
    private void kollaDatum(){
        //Validerar att v�rden finns i f�lten samt att det �r giltiga datum (s� att man inte kan skriva in exempelvis 2022-67-08). 
        //Sedan ska en JOptionPane hoppa upp med ett aliennamn som �r registrerat mellan de tv� angivna datumen.
         if(Valideringsklass.v�rdeExisterar(startDatumField) && Valideringsklass.v�rdeExisterar(slutDatumField) && Valideringsklass.giltigtDatum(startDatumField) && Valideringsklass.giltigtDatum(slutDatumField));{
            try{
                    alienNamn = mibdb.fetchColumn("SELECT Namn FROM Alien WHERE Registreringsdatum > " + "'" + startDatumField.getText() + "'" + "AND Registreringsdatum <" + "'"  + slutDatumField.getText() + "'");
                    JOptionPane.showMessageDialog(null, alienNamn);
        }
            catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Kunde inte hitta n�gra aliens mellan angivna datum.");
        }
         }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startDatumField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        slutDatumField = new javax.swing.JTextField();
        s�kKnapp = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Ange start- och slutdatum");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Startdatum:");

        startDatumField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Slutdatum:");

        slutDatumField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        s�kKnapp.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        s�kKnapp.setText("S�k");
        s�kKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s�kKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(s�kKnapp)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(startDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(slutDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(startDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(slutDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(s�kKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s�kKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s�kKnappActionPerformed
        //Kallar p� metoden kollaDatum() n�r s�k-knappen �r tryckt.
        kollaDatum();
    }//GEN-LAST:event_s�kKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField slutDatumField;
    private javax.swing.JTextField startDatumField;
    private javax.swing.JButton s�kKnapp;
    // End of variables declaration//GEN-END:variables
}
