package mibg3.Agent;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class KommunikationReg extends javax.swing.JFrame {
    private InfDB mibdb;

    /**
     * Instansierar rutan KommunikationReg.
     */
    public KommunikationReg() {
        //Kopplar till databasen.
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
        jLabel2 = new javax.swing.JLabel();
        benämningField = new javax.swing.JTextField();
        OKknapp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        överföringField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrera Kommunikationsutrustning");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Vänligen ange uppgifter:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Benämning:");

        benämningField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        OKknapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OKknapp.setText("OK");
        OKknapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKknappActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Överföringsteknik:");

        överföringField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(överföringField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(benämningField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(benämningField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(överföringField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(OKknapp)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKknappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKknappActionPerformed
        //Validerar att värden finns i fälten och lägger till utrustningen i utrustningstabellen samt kommunikationstabellen.
        //Använder getAutoIncrement metoden för att automatiskt generera ett ID. tlfNID är "tillfälligt nästa id" och vi använde den istället för nästaid variabeln
        //direkt eftersom det inte fungerade när vi gjorde det.
        if(Valideringsklass.värdeExisterar(benämningField) && Valideringsklass.värdeExisterar(överföringField)){
            try{
                String benämning = benämningField.getText();
                String överföringsteknik = överföringField.getText();
                String tlfNID = "";
                String nästaid = mibdb.getAutoIncrement("Utrustning", "Utrustnings_ID");
                mibdb.insert("INSERT INTO Utrustning VALUES(" + nästaid + "," + "'" + benämning + "')");
                tlfNID = nästaid;
                mibdb.insert("INSERT INTO Kommunikation VALUES(" + tlfNID + "," + "'" + överföringsteknik + "')");
                JOptionPane.showMessageDialog(null, "Du har registrerat " + benämning + "!");
        }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Det gick inte att registrera utrustningen.");
        }
        }
        else{
                JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fälten och försök igen.");
        }
    }//GEN-LAST:event_OKknappActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKknapp;
    private javax.swing.JTextField benämningField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField överföringField;
    // End of variables declaration//GEN-END:variables
}
