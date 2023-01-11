package mibg3.Agent;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegAlien extends javax.swing.JFrame {
    //Instansiering av variabler som presenteras i framens utvalda labels.
    private InfDB mibdb;
    private int plats;
    private int ansvarig;
    private String alienID;
    private ArrayList<String> alienNamn;
    private ArrayList<String> agentNamn;
 
    public RegAlien() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatumField = new javax.swing.JTextField();
        NamnField = new javax.swing.JTextField();
        TelField = new javax.swing.JTextField();
        LösenordField = new javax.swing.JPasswordField();
        okAlienRegKnapp = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rasCB = new javax.swing.JComboBox<>();
        platsCB = new javax.swing.JComboBox<>();
        agentCB = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        armBoogField = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrera Alien");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText(message());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Datum:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Namn:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Lösenord:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Telefon:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Plats:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Ansvarig agent:");

        DatumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatumFieldActionPerformed(evt);
            }
        });

        NamnField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamnFieldActionPerformed(evt);
            }
        });

        TelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelFieldActionPerformed(evt);
            }
        });

        LösenordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LösenordFieldActionPerformed(evt);
            }
        });

        okAlienRegKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okAlienRegKnapp.setText("Registrera Alien");
        okAlienRegKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAlienRegKnappActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Alien-ID:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Registreras Automatiskt.");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("YYYY-MM-DD");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Min. 1 tecken. Max 6 tecken.");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Ras:");

        rasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        rasCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rasCBItemStateChanged(evt);
            }
        });

        platsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Örebro", "Västerås", "Vilhelmina", "Borås" }));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Antal Armar/Boogies:");

        armBoogField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                armBoogFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(armBoogField, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(218, 218, 218))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(agentCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(platsCB, 0, 95, Short.MAX_VALUE)
                                    .addComponent(rasCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DatumField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NamnField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TelField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LösenordField, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okAlienRegKnapp)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LösenordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(platsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(agentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(armBoogField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(okAlienRegKnapp)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String message(){
        //Metod för att sätta texten till jLabeln längst upp i rutan. fyllAgentNamn() kallas här också efter det inte gick i konstruktorn.
        fyllAgentNamn();
        return "Registrera en ny Alien";
    }
    private void fyllAgentNamn(){
        //Fyller combo-boxen med agentnamn från databasen.
        try{
                agentNamn = mibdb.fetchColumn("SELECT Namn FROM Agent");
                for(String namn : agentNamn){
                    agentCB.addItem(namn);
            }
        }
        catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
    }
    private void fyllLista(){
        //Metod för att hämta alla aliennamn.
        try{
                alienNamn = mibdb.fetchColumn("SELECT Namn FROM Alien");
        }
        catch(InfException e){
                JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
    }
    private void DatumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatumFieldActionPerformed

    private void okAlienRegKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAlienRegKnappActionPerformed
     /** Lokala variabeldeklarationer. Dessa ska hämta värdet på det vi skriver in när man registrerar en ny
      * alien och ta lokalvariablerna som sedan sätts in i insert metoden för databasen så att informationen vi skriver in sätts in i databasen.
      * getValdPlats(), getValdAgent() och fyllLista() kallas internt för att hämta platsen, agenten och fylla combo-boxen med namn.
      * fyllLista() används här för att kontrollera att namnet vi skriver in inte redan finns i databasen.
      */
            String namn = NamnField.getText();
            String lösen = LösenordField.getText();
            String telefon = TelField.getText();
            String datum = DatumField.getText();
            getValdPlats();
            getValdAgent();
            fyllLista();
            if(Valideringsklass.giltigtLosenord(lösen) && Valideringsklass.värdeExisterar(NamnField) && Valideringsklass.värdeExisterar(DatumField)){
                if(alienNamn.contains(namn)){
                    JOptionPane.showMessageDialog(null, "Det finns redan en Alien med samma namn, vänligen ange ett nytt namn och försök igen.");
                }
                
            else try{
                    alienID = mibdb.getAutoIncrement("Alien", "Alien_ID");
                    mibdb.insert("INSERT INTO Alien VALUES(" + alienID + " , " + "'" + datum + "'" + " , " + "'" + lösen + "'" + " , " + "'" + namn + "'" + " , " + "'" + telefon + "'" + " , " + plats + " , " + ansvarig + ")");
                    setRas();
                    JOptionPane.showMessageDialog(null, "Grattis! En ny alien har registrerats i systemet.");
          
        }
            catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Gick inte att ansluta.");
        }
            } 
            else{
                    JOptionPane.showMessageDialog(null,"Ett eller flera fält är felaktigt formaterade, vänligen kontrollera fälten och försök igen.");
            }
    }//GEN-LAST:event_okAlienRegKnappActionPerformed

    private void NamnFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamnFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamnFieldActionPerformed

    private void LösenordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LösenordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LösenordFieldActionPerformed

    private void TelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelFieldActionPerformed

    private void armBoogFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_armBoogFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_armBoogFieldActionPerformed

    private void rasCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rasCBItemStateChanged
        //Metod som automatiskt sätter antalet armar/boogies till 0 ifall man väljer worm som ras.
        if(rasCB.getSelectedItem().equals("Worm")){
            armBoogField.setText("0");
            armBoogField.setEnabled(false);}
        else{
            armBoogField.setEnabled(true);}
    }//GEN-LAST:event_rasCBItemStateChanged

  private void getValdPlats(){
      //Metod som ska returnera ID:et för platsen som väljs i combo-boxen för plats.
      String vp = platsCB.getSelectedItem().toString();
      switch (vp){
          case "Örebro": 
              plats = 1;
              break;
          case "Västerås":
              plats = 2;
              break;
          case "Vilhelmina":
              plats = 3;
              break;
          case "Borås":
              plats = 4;
              break;
      }
  }
  
  private void getValdAgent(){
        //Hämtar den valda agentens (från combo-boxen alltså) ID för att sedan använda det i registreringen av alien.
        String va = agentCB.getSelectedItem().toString();
        int id = 0;
        try{
                id = Integer.parseInt(mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn=" + "'" + va + "'"));
        }
        catch(InfException e){
                JOptionPane.showMessageDialog(null, "Något gick fel. Försök igen.");
        }
        ansvarig = id;
  }
  
  private void setRas(){
   //Setter-metod som sätter in alien-ID på den registrerade alien i en viss ras-tabell baserat på vilken ras man väljer.
    String vr = rasCB.getSelectedItem().toString();
    int antal = Integer.parseInt(armBoogField.getText());
    try{
        switch (vr){
        case "Boglodite":
             mibdb.insert("INSERT INTO Boglodite VALUES(" + alienID + "," + antal +")");
            break;
        case "Squid":
            mibdb.insert("INSERT INTO Squid VALUES(" + alienID + "," + antal +")");
            break;
        case "Worm":
            mibdb.insert("INSERT INTO Worm (Alien_ID) VALUES(" + alienID +")");
            break;
        }
  }
  
  catch(InfException e){
      JOptionPane.showMessageDialog(null, "Något gick fel. Försök igen.");
  }
  }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatumField;
    private javax.swing.JPasswordField LösenordField;
    private javax.swing.JTextField NamnField;
    private javax.swing.JTextField TelField;
    private javax.swing.JComboBox<String> agentCB;
    private javax.swing.JTextField armBoogField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okAlienRegKnapp;
    private javax.swing.JComboBox<String> platsCB;
    private javax.swing.JComboBox<String> rasCB;
    // End of variables declaration//GEN-END:variables
}
