package mibg3.Agent;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class vapenReg extends javax.swing.JFrame {
private InfDB mibdb;
    /**
     * Instansierar rutan för vapenReg.
     */
    public vapenReg() {
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

        kaliber = new javax.swing.JLabel();
        kaliberField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        benämningVapen = new javax.swing.JLabel();
        benämningField = new javax.swing.JTextField();
        OKknapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrera Vapen");

        kaliber.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kaliber.setText("Kaliber:");

        kaliberField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Vänligen ange uppgifter:");

        benämningVapen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        benämningVapen.setText("Benämning:");

        benämningField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        OKknapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OKknapp.setText("OK");
        OKknapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKknappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(benämningVapen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(benämningField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kaliber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kaliberField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(benämningVapen)
                    .addComponent(benämningField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kaliberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaliber))
                .addGap(18, 18, 18)
                .addComponent(OKknapp)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKknappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKknappActionPerformed
        //Validerar att värden finns i fälten och sedan lägger in den data vi skriver in i tabellerna utrustning och vapen.
        //Använder getAutoIncrement för att automatiskt generera ett ID för vapnet.
        if(Valideringsklass.värdeExisterar(benämningField) && Valideringsklass.värdeExisterar(kaliberField)){
            try{
                    String benämning = benämningField.getText();
                    String kaliberv = kaliberField.getText();
                    String nästaid = mibdb.getAutoIncrement("Utrustning", "Utrustnings_ID");
                    mibdb.insert("INSERT INTO Utrustning VALUES(" + nästaid + "," + "'" + benämning + "')");
                    mibdb.insert("INSERT INTO Vapen VALUES(" + nästaid + "," + "'" + kaliberv + "')");
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
    private javax.swing.JLabel benämningVapen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel kaliber;
    private javax.swing.JTextField kaliberField;
    // End of variables declaration//GEN-END:variables
}
