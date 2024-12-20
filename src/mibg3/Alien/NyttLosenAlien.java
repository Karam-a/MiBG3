package mibg3.Alien;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;


public class NyttLosenAlien extends javax.swing.JFrame {
    private InfDB mibdb;

    /**
     * Instansierar rutan för NyttLosenAlien.
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
        sammaLösen = new javax.swing.JPasswordField();
        nyttLösen = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Här kan du ändra ditt lösenord!");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nuvarande lösenord:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nytt lösenord:");

        sammaLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sammaLösenActionPerformed(evt);
            }
        });

        nyttLösen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyttLösenActionPerformed(evt);
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
                                .addComponent(sammaLösen)
                                .addComponent(nyttLösen, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
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
                    .addComponent(sammaLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nyttLösen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sammaLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sammaLösenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sammaLösenActionPerformed

    private void nyttLösenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyttLösenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nyttLösenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Skapar lokala variabler och tilldelar dem värdet av det vi skriver in (sammaLösen.getText() etc.). 
        //Lokal variabel (nuvarandeLösen) skapas för att tilldelas det nuvarande lösenordet för att kontrollera att det är stämmer överens med det vi skriver in i det nuvarande lösenord fältet.
        //Validerar att det värden finns i fälten samt att det nya lösenordet är giltigt d.v.s. inte längre än 7 tecken och ändrar sedan lösenordet till det nya.
        String nuvarandeLösen;
        String sammaLös = sammaLösen.getText();
        String nyttLös = nyttLösen.getText();
        if(Valideringsklass.värdeExisterar(sammaLösen) && Valideringsklass.värdeExisterar(nyttLösen) && Valideringsklass.giltigtLosenord(nyttLös)){
            try{
                    nuvarandeLösen = mibdb.fetchSingle("SELECT Losenord FROM Alien WHERE Alien_ID = "+ "'" + (mibg3.Alien.AlienInlogg.getInloggadAlien()) + "'");
                        if(nuvarandeLösen.equals(sammaLös)){
                            mibdb.update("UPDATE Alien SET Losenord = "+ "'" + nyttLös + "'" + " WHERE Losenord ="+ "'" + nuvarandeLösen + "'");
                            JOptionPane.showMessageDialog(null, "Du har ändrat ditt lösenord!");
            }
                        else{
                            JOptionPane.showMessageDialog(null, "Du har angett fel lösenord. Försök igen.");
            }
        }
            catch(InfException e){
                            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
            
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fälten och försök igen.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField nyttLösen;
    private javax.swing.JPasswordField sammaLösen;
    // End of variables declaration//GEN-END:variables
}
