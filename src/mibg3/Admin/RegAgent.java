package mibg3.Admin;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegAgent extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> agentNamn;

    public RegAgent() {
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

        NamnField = new javax.swing.JTextField();
        AnstDatumField = new javax.swing.JTextField();
        L�senordField = new javax.swing.JPasswordField();
        regAgLabel = new javax.swing.JLabel();
        TelField = new javax.swing.JTextField();
        AGID = new javax.swing.JLabel();
        okAlienRegKnapp = new javax.swing.JButton();
        namnLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        omrLabel = new javax.swing.JLabel();
        anstDatLabel = new javax.swing.JLabel();
        losLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        admCheckBox = new javax.swing.JCheckBox();
        omradeCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrera Agenter");

        NamnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamnFieldActionPerformed(evt);
            }
        });

        AnstDatumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnstDatumFieldActionPerformed(evt);
            }
        });

        L�senordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L�senordFieldActionPerformed(evt);
            }
        });

        regAgLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        regAgLabel.setText("Registrera Agent");

        TelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelFieldActionPerformed(evt);
            }
        });

        AGID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        AGID.setText("AgentID:");

        okAlienRegKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okAlienRegKnapp.setText("OK");
        okAlienRegKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAlienRegKnappActionPerformed(evt);
            }
        });

        namnLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namnLabel.setText("Namn:");

        telLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        telLabel.setText("Telefon:");

        omrLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        omrLabel.setText("Omr�de:");

        anstDatLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        anstDatLabel.setText("Anst�llningsdatum:");

        losLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        losLabel.setText("L�senord:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("ID:et anges automatiskt");

        jLabel1.setText("YYYY-MM-DD");

        admCheckBox.setText("G�r till Administrat�r");
        admCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admCheckBoxActionPerformed(evt);
            }
        });

        omradeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "G�taland", "Norrland" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(okAlienRegKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(regAgLabel)
                        .addGap(70, 70, 70))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AGID)
                            .addComponent(anstDatLabel)
                            .addComponent(telLabel)
                            .addComponent(namnLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NamnField)
                                    .addComponent(AnstDatumField)
                                    .addComponent(TelField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(admCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(losLabel)
                                    .addComponent(omrLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(L�senordField)
                                    .addComponent(omradeCB, 0, 95, Short.MAX_VALUE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regAgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGID)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namnLabel)
                    .addComponent(NamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telLabel)
                    .addComponent(TelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anstDatLabel)
                    .addComponent(AnstDatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(losLabel)
                    .addComponent(L�senordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(omrLabel)
                    .addComponent(omradeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(admCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okAlienRegKnapp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NamnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamnFieldActionPerformed

    private void AnstDatumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnstDatumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnstDatumFieldActionPerformed

    private void L�senordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L�senordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L�senordFieldActionPerformed

    private void TelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelFieldActionPerformed

    //Setter, h�mtar ut alla agentnamn fr�n databasen och s�tter dem i en arraylist. 
    private void fyllLista(){
        try{
            agentNamn = mibdb.fetchColumn("SELECT Namn FROM Agent");
    }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
    }
    private void okAlienRegKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAlienRegKnappActionPerformed
        /* Lokala variabeldeklarationer. Dessa ska h�mta v�rdet p� det vi skriver in n�r man registrerar en ny
        *  alien och ta lokalvariablerna som sedan s�tts in i insert metoden f�r databasen s� att informationen vi skriver in s�tts in i databasen.
        */
        String admin;
        String namn = NamnField.getText();
        String telefon = TelField.getText();
        String l�sen = L�senordField.getText();
        String omrade = omradeCB.getSelectedItem().toString();
        fyllLista();
        //Om checkbox tickas kommer agenten att bli en admin vid registrering.
        if(admCheckBox.isSelected()){
            admin = "J";
            }
        else{
            admin = "N";
            }
        //Vid godk�nd validering k�rs koden.
        if(Valideringsklass.giltigtLosenord(l�sen) && Valideringsklass.v�rdeExisterar(NamnField) && Valideringsklass.v�rdeExisterar(TelField) && Valideringsklass.giltigtDatum(AnstDatumField));{
            //Om agentens namn redan finns i databasen kommer ett felmeddelande dyka upp och anv�ndaren f�r f�rs�ka igen.
        if(agentNamn.contains(namn)){
                JOptionPane.showMessageDialog(null, "Det finns redan en Agent med samma namn, v�nligen ange ett nytt namn och f�rs�k igen.");
                }
        //�r allt godk�nt kommer agenten att registreras.
            else try{
                    String omr�de = mibdb.fetchSingle("SELECT Omrades_ID FROM Omrade WHERE Benamning =" + "'" + omrade + "'");
                    int id = Integer.parseInt(mibdb.getAutoIncrement("Agent", "Agent_ID"));
                    mibdb.insert("INSERT INTO Agent VALUES(" + id + " , " + "'" + namn + "'" + " , " + "'" + telefon + "'" + " , " + "'" + AnstDatumField.getText() + "'" + " , " + "'" + admin + "'" + " , " + "'" + l�sen + "'" + " , " + omr�de + ")");
                    JOptionPane.showMessageDialog(null, "Grattis! En ny agent har registrerats i systemet.");
            }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "Ett problem uppstod. F�lten kan vara felaktigt formaterade eller s� l�mnades f�lten tomma. V�nligen f�rs�k igen.");
            }
        }
    }//GEN-LAST:event_okAlienRegKnappActionPerformed

    private void admCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admCheckBoxActionPerformed

    }//GEN-LAST:event_admCheckBoxActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AGID;
    private javax.swing.JTextField AnstDatumField;
    private javax.swing.JPasswordField L�senordField;
    private javax.swing.JTextField NamnField;
    private javax.swing.JTextField TelField;
    private javax.swing.JCheckBox admCheckBox;
    private javax.swing.JLabel anstDatLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel losLabel;
    private javax.swing.JLabel namnLabel;
    private javax.swing.JButton okAlienRegKnapp;
    private javax.swing.JLabel omrLabel;
    private javax.swing.JComboBox<String> omradeCB;
    private javax.swing.JLabel regAgLabel;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}
