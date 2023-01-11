package mibg3.Alien;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;


public class NyttLosenAlien extends javax.swing.JFrame {
    private InfDB mibdb;

    /**
     * Instansierar rutan f�r NyttLosenAlien.
     */
    public NyttLosenAlien() {
        //Kopplar till databasen.
        try{
                mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
                initComponents();
    }
        catch(InfException e){
                JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sammaL�sen = new javax.swing.JPasswordField();
        nyttL�sen = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("H�r kan du �ndra ditt l�senord!");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nuvarande l�senord:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nytt l�senord:");

        sammaL�sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sammaL�senActionPerformed(evt);
            }
        });

        nyttL�sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttL�senActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Max 6 tecken");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sammaL�sen)
                                .addComponent(nyttL�sen, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sammaL�sen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nyttL�sen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sammaL�senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sammaL�senActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sammaL�senActionPerformed

    private void nyttL�senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttL�senActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nyttL�senActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Skapar lokala variabler och tilldelar dem v�rdet av det vi skriver in (sammaL�sen.getText() etc.). 
        //Lokal variabel (nuvarandeL�sen) skapas f�r att tilldelas det nuvarande l�senordet f�r att kontrollera att det �r st�mmer �verens med det vi skriver in i det nuvarande l�senord f�ltet.
        //Validerar att det v�rden finns i f�lten samt att det nya l�senordet �r giltigt d.v.s. inte l�ngre �n 7 tecken och �ndrar sedan l�senordet till det nya.
        String nuvarandeL�sen;
        String sammaL�s = sammaL�sen.getText();
        String nyttL�s = nyttL�sen.getText();
        if(Valideringsklass.v�rdeExisterar(sammaL�sen) && Valideringsklass.v�rdeExisterar(nyttL�sen) && Valideringsklass.giltigtLosenord(nyttL�s)){
            try{
                    nuvarandeL�sen = mibdb.fetchSingle("SELECT Losenord FROM Alien WHERE Alien_ID = "+ "'" + (mibg3.Alien.AlienInlogg.getInloggadAlien()) + "'");
                        if(nuvarandeL�sen.equals(sammaL�s)){
                            mibdb.update("UPDATE Alien SET Losenord = "+ "'" + nyttL�s + "'" + " WHERE Losenord ="+ "'" + nuvarandeL�sen + "'");
                            JOptionPane.showMessageDialog(null, "Du har �ndrat ditt l�senord!");
            }
                        else{
                            JOptionPane.showMessageDialog(null, "Du har angett fel l�senord. F�rs�k igen.");
            }
        }
            catch(InfException e){
                            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
            
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�lten och f�rs�k igen.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField nyttL�sen;
    private javax.swing.JPasswordField sammaL�sen;
    // End of variables declaration//GEN-END:variables
}
