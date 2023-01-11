package mibg3.Agent;

import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class NyttLosenord extends javax.swing.JFrame {
private InfDB mibdb;
    /**
     * Instansierar rutan NyttLosenord.
     */
    public NyttLosenord() {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nuvarandeL�senField = new javax.swing.JPasswordField();
        nyttL�senField = new javax.swing.JPasswordField();
        okKnapp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("�ndra L�senord");

        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("�ndra ditt l�senord");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Nuvarande l�senord:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nytt l�senord:");

        nuvarandeL�senField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuvarandeL�senFieldActionPerformed(evt);
            }
        });

        okKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okKnapp.setText("OK");
        okKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okKnappActionPerformed(evt);
            }
        });

        jLabel4.setText("Max 6 tecken");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuvarandeL�senField, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(nyttL�senField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nuvarandeL�senField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nyttL�senField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(okKnapp)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnappActionPerformed
        //Skapar lokala variabler och tilldelar dem v�rdet av det vi skriver in (nuvarandeL�senField.getText() etc.). 
        //Lokal variabel (nuvarandeL�sen) skapas f�r att tilldelas det nuvarande l�senordet f�r att kontrollera att det �r st�mmer �verens med det vi skriver in i det nuvarande l�senord f�ltet.
        //Validerar att det v�rden finns i f�lten samt att det nya l�senordet �r giltigt d.v.s. inte l�ngre �n 7 tecken och �ndrar sedan l�senordet till det nya.
            String nuvarandeL�sen;
            String sammaL�sen = nuvarandeL�senField.getText();
            String nyttL�sen = nyttL�senField.getText();
        if(Valideringsklass.v�rdeExisterar(nuvarandeL�senField) && Valideringsklass.v�rdeExisterar(nyttL�senField) && Valideringsklass.giltigtLosenord(nyttL�sen)){
            try{
                nuvarandeL�sen = mibdb.fetchSingle("SELECT Losenord FROM Agent WHERE Agent_ID = "+ "'" + (mibg3.Agent.AgentInlogg.getInloggadAgentID()) + "'");
                    if(nuvarandeL�sen.equals(sammaL�sen)){
                        mibdb.update("UPDATE Agent SET Losenord = "+ "'" + nyttL�sen + "'" + " WHERE Losenord ="+ "'" + nuvarandeL�sen + "'");
                        JOptionPane.showMessageDialog(null, "Du har �ndrat ditt l�senord!");
            }
            
        }
            catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
            
        }
        }
        else{
                        JOptionPane.showMessageDialog(null, "L�senordet du angav �r l�ngre �n 6 tecken eller l�mnades tomt. V�nligen f�rs�k igen.");
                    }
    }//GEN-LAST:event_okKnappActionPerformed

    private void nuvarandeL�senFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuvarandeL�senFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuvarandeL�senFieldActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField nuvarandeL�senField;
    private javax.swing.JPasswordField nyttL�senField;
    private javax.swing.JButton okKnapp;
    // End of variables declaration//GEN-END:variables
}