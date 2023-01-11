package mibg3.Agent;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class teknikReg extends javax.swing.JFrame {
    private InfDB mibdb;

    /**
     * Instansierar rutan teknikReg.
     */
    public teknikReg() {
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

        OKknapp = new javax.swing.JButton();
        kraftk�llaTeknik = new javax.swing.JLabel();
        kraftField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ben�mningTeknik = new javax.swing.JLabel();
        namnField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrera Teknik");

        OKknapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        OKknapp.setText("OK");
        OKknapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKknappActionPerformed(evt);
            }
        });

        kraftk�llaTeknik.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        kraftk�llaTeknik.setText("Kraftk�lla:");

        kraftField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("V�nligen ange uppgifter:");

        ben�mningTeknik.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ben�mningTeknik.setText("Ben�mning:");

        namnField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ben�mningTeknik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kraftk�llaTeknik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kraftField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(OKknapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ben�mningTeknik)
                    .addComponent(namnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kraftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kraftk�llaTeknik))
                .addGap(19, 19, 19)
                .addComponent(OKknapp)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKknappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKknappActionPerformed
        // Validerar att det finns v�rden i f�lten och sedan s�tter in den data vi skrivit in i tabellerna utrustning och teknik.
        //Anv�nder getAutoIncrement f�r att automatiskt generera ett ID f�r utrustningen.
        if(Valideringsklass.v�rdeExisterar(namnField) && Valideringsklass.v�rdeExisterar(kraftField)){
            try{
                String ben�mning = namnField.getText();
                String kraft = kraftField.getText();
                String n�staid = mibdb.getAutoIncrement("Utrustning", "Utrustnings_ID");
                mibdb.insert("INSERT INTO Utrustning VALUES(" + n�staid + "," + "'" + ben�mning + "')");
                mibdb.insert("INSERT INTO Teknik VALUES(" + n�staid + "," + "'" + kraft + "')");
                JOptionPane.showMessageDialog(null, "Du har registrerat " + ben�mning + "!");
        }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Det gick inte att registrera utrustningen.");
        }
        }
        else{
                JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�lten och f�rs�k igen.");
        }
    }//GEN-LAST:event_OKknappActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKknapp;
    private javax.swing.JLabel ben�mningTeknik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kraftField;
    private javax.swing.JLabel kraftk�llaTeknik;
    private javax.swing.JTextField namnField;
    // End of variables declaration//GEN-END:variables
}
