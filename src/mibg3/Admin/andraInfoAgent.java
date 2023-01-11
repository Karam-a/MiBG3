package mibg3.Admin;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import mibg3.Valideringsklass;

public class andraInfoAgent extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> agentlista;

    public andraInfoAgent() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
        initComponents();
    }
    //Generellt errormeddelande vid infException.
    private void errorMessage(){
        JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
    }
    //Setter, hämtar alla agentnamn från databasen.
    private void agentLista(){
        try{
            agentlista = mibdb.fetchColumn("SELECT Namn FROM Agent");
            for(String namn : agentlista){
                agentCB.addItem(namn);
            }
        }
        catch(InfException e){
            errorMessage();
        }
    }
    //Meddelande som sätts i jLabel vid uppstart. Kör även metoden agentLista() för att fylla i comboboxen för agentval. Sker här då det ej gick i kontruktorn.
    private String meddelande(){
        agentLista();
        return "Vänligen välj en agent och fyll i de rader du vill ändra.";
    }
    //Getter, hämtar den valda agentens namn.
    private String hämtaNamn(){
        String namn = agentCB.getSelectedItem().toString();
        return namn;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agentCB = new javax.swing.JComboBox<>();
        andraInfoAgLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ändraNamnField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ändraTelField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ändraOmrådeField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ändraOmrådeKnapp = new javax.swing.JButton();
        ändraTelKnapp = new javax.swing.JButton();
        ändraLösenKnapp = new javax.swing.JButton();
        ändraNamnKnapp = new javax.swing.JButton();
        ändraLösenordField = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        admJA = new javax.swing.JButton();
        admNEJ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Redigera Agentinformation");

        agentCB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        andraInfoAgLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        andraInfoAgLabel.setText(meddelande());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Namn:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Lösenord:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Telefon:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Område:");

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Ange ett områdesnummer");

        ändraOmrådeKnapp.setText("Ändra");
        ändraOmrådeKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraOmrådeKnappActionPerformed(evt);
            }
        });

        ändraTelKnapp.setText("Ändra");
        ändraTelKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraTelKnappActionPerformed(evt);
            }
        });

        ändraLösenKnapp.setText("Ändra");
        ändraLösenKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraLösenKnappActionPerformed(evt);
            }
        });

        ändraNamnKnapp.setText("Ändra");
        ändraNamnKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraNamnKnappActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Administratör:");

        admJA.setText("Ja");
        admJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admJAActionPerformed(evt);
            }
        });

        admNEJ.setText("Nej");
        admNEJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admNEJActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Max 6 tecken.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ändraNamnField)
                            .addComponent(ändraLösenordField)
                            .addComponent(ändraTelField)
                            .addComponent(ändraOmrådeField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ändraLösenKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ändraNamnKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ändraTelKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ändraOmrådeKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(admJA, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admNEJ, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(agentCB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(andraInfoAgLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(andraInfoAgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ändraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ändraNamnKnapp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ändraLösenordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(ändraLösenKnapp)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ändraTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(ändraTelKnapp))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ändraOmrådeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(ändraOmrådeKnapp)
                            .addComponent(jLabel6)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(admJA)
                    .addComponent(admNEJ))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ändraNamnKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraNamnKnappActionPerformed
        //om ett värde finns i fältet kommer agentens namn att bytas.
        if(Valideringsklass.värdeExisterar(ändraNamnField)){
            try{
                String nyttNamn = ändraNamnField.getText();
                mibdb.update("UPDATE Agent SET Namn =" + "'" + nyttNamn + "'" + "WHERE Namn =" + "'" + hämtaNamn() + "'");
                JOptionPane.showMessageDialog(null, "Namnet är ändrat.");
        }
        catch(InfException e){
             errorMessage();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fältet och försök igen.");
        }
    }//GEN-LAST:event_ändraNamnKnappActionPerformed

    private void ändraLösenKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraLösenKnappActionPerformed
        //Ändrar lösenordet på en agent.
        String nyttLösen = ändraLösenordField.getText();
        //Om valideringsmetoderna godkäns kommer lösenordet att bytas.
        if(Valideringsklass.värdeExisterar(ändraLösenordField) && Valideringsklass.giltigtLosenord(nyttLösen)){
            try{
                 mibdb.update("UPDATE Agent SET Losenord =" + "'" + nyttLösen + "'" + "WHERE Namn =" + "'" + hämtaNamn() + "'");
                 JOptionPane.showMessageDialog(null, "Lösenordet är ändrat.");
        }
        catch(InfException e){
            errorMessage();
            }
       }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fältet och försök igen.");
        }
    }//GEN-LAST:event_ändraLösenKnappActionPerformed

    //Om knappen "ja" klickas in blir agenten en admin.
    private void admJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admJAActionPerformed
        try{
            mibdb.update("UPDATE Agent SET Administrator=" + "'" + "J" + "'" + "Where Namn=" + "'" + hämtaNamn() + "'");
            JOptionPane.showMessageDialog(null, hämtaNamn() + " är nu en Administratör!");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel, försök igen");}
    }//GEN-LAST:event_admJAActionPerformed
//Om knappen "nej" klickas är agenten inte en admin. 
    private void admNEJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admNEJActionPerformed
        try{mibdb.update("UPDATE Agent SET Administrator=" + "'" + "N" + "'" + "Where Namn=" + "'" + hämtaNamn() + "'");
             JOptionPane.showMessageDialog(null, hämtaNamn() + " är borttagen som Administratör!");
             }
       catch(InfException e){JOptionPane.showMessageDialog(null, "Något gick fel, försök igen");}    }//GEN-LAST:event_admNEJActionPerformed

    private void ändraTelKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraTelKnappActionPerformed
        //Ändrar telefonnummer på agenten. Värde måste anges i fältet för att det ska gå. 
        if(Valideringsklass.värdeExisterar(ändraTelField)){
            try{
                String nyTel = ändraTelField.getText();
                mibdb.update("UPDATE Agent SET Telefon="+ "'" + nyTel + "'" + "WHERE Namn =" + "'" + hämtaNamn() + "'");
                JOptionPane.showMessageDialog(null, "Telefonnumret är ändrat!");
        }
            catch(InfException e){
                errorMessage();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fältet och försök igen.");
        }
    }//GEN-LAST:event_ändraTelKnappActionPerformed

    private void ändraOmrådeKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraOmrådeKnappActionPerformed
        //Ändrar agentens område. Värde måste anges i fältet för att det ska gå. 
        if(Valideringsklass.värdeExisterar(ändraOmrådeField)){
            try{
                String nyttOmr = ändraOmrådeField.getText();
                mibdb.update("UPDATE Agent SET Omrade ="+ "'" + nyttOmr + "'" + "WHERE Namn ="+ "'" + hämtaNamn() + "'");
                JOptionPane.showMessageDialog(null, "Området är ändrat!");
        }
            catch(InfException e){
                errorMessage();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen på fältet och försök igen.");
        }
    }//GEN-LAST:event_ändraOmrådeKnappActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admJA;
    private javax.swing.JButton admNEJ;
    private javax.swing.JComboBox<String> agentCB;
    private javax.swing.JLabel andraInfoAgLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton ändraLösenKnapp;
    private javax.swing.JPasswordField ändraLösenordField;
    private javax.swing.JTextField ändraNamnField;
    private javax.swing.JButton ändraNamnKnapp;
    private javax.swing.JTextField ändraOmrådeField;
    private javax.swing.JButton ändraOmrådeKnapp;
    private javax.swing.JTextField ändraTelField;
    private javax.swing.JButton ändraTelKnapp;
    // End of variables declaration//GEN-END:variables
}
