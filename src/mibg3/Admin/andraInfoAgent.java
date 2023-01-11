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
    //Setter, h�mtar alla agentnamn fr�n databasen.
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
    //Meddelande som s�tts i jLabel vid uppstart. K�r �ven metoden agentLista() f�r att fylla i comboboxen f�r agentval. Sker h�r d� det ej gick i kontruktorn.
    private String meddelande(){
        agentLista();
        return "V�nligen v�lj en agent och fyll i de rader du vill �ndra.";
    }
    //Getter, h�mtar den valda agentens namn.
    private String h�mtaNamn(){
        String namn = agentCB.getSelectedItem().toString();
        return namn;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agentCB = new javax.swing.JComboBox<>();
        andraInfoAgLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        �ndraNamnField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        �ndraTelField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        �ndraOmr�deField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        �ndraOmr�deKnapp = new javax.swing.JButton();
        �ndraTelKnapp = new javax.swing.JButton();
        �ndraL�senKnapp = new javax.swing.JButton();
        �ndraNamnKnapp = new javax.swing.JButton();
        �ndraL�senordField = new javax.swing.JPasswordField();
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
        jLabel3.setText("L�senord:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Telefon:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Omr�de:");

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Ange ett omr�desnummer");

        �ndraOmr�deKnapp.setText("�ndra");
        �ndraOmr�deKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraOmr�deKnappActionPerformed(evt);
            }
        });

        �ndraTelKnapp.setText("�ndra");
        �ndraTelKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraTelKnappActionPerformed(evt);
            }
        });

        �ndraL�senKnapp.setText("�ndra");
        �ndraL�senKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraL�senKnappActionPerformed(evt);
            }
        });

        �ndraNamnKnapp.setText("�ndra");
        �ndraNamnKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraNamnKnappActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Administrat�r:");

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
                            .addComponent(�ndraNamnField)
                            .addComponent(�ndraL�senordField)
                            .addComponent(�ndraTelField)
                            .addComponent(�ndraOmr�deField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(�ndraL�senKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(�ndraNamnKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(�ndraTelKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(�ndraOmr�deKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(�ndraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(�ndraNamnKnapp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(�ndraL�senordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(�ndraL�senKnapp)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(�ndraTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(�ndraTelKnapp))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(�ndraOmr�deField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(�ndraOmr�deKnapp)
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

    
    private void �ndraNamnKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraNamnKnappActionPerformed
        //om ett v�rde finns i f�ltet kommer agentens namn att bytas.
        if(Valideringsklass.v�rdeExisterar(�ndraNamnField)){
            try{
                String nyttNamn = �ndraNamnField.getText();
                mibdb.update("UPDATE Agent SET Namn =" + "'" + nyttNamn + "'" + "WHERE Namn =" + "'" + h�mtaNamn() + "'");
                JOptionPane.showMessageDialog(null, "Namnet �r �ndrat.");
        }
        catch(InfException e){
             errorMessage();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�ltet och f�rs�k igen.");
        }
    }//GEN-LAST:event_�ndraNamnKnappActionPerformed

    private void �ndraL�senKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraL�senKnappActionPerformed
        //�ndrar l�senordet p� en agent.
        String nyttL�sen = �ndraL�senordField.getText();
        //Om valideringsmetoderna godk�ns kommer l�senordet att bytas.
        if(Valideringsklass.v�rdeExisterar(�ndraL�senordField) && Valideringsklass.giltigtLosenord(nyttL�sen)){
            try{
                 mibdb.update("UPDATE Agent SET Losenord =" + "'" + nyttL�sen + "'" + "WHERE Namn =" + "'" + h�mtaNamn() + "'");
                 JOptionPane.showMessageDialog(null, "L�senordet �r �ndrat.");
        }
        catch(InfException e){
            errorMessage();
            }
       }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�ltet och f�rs�k igen.");
        }
    }//GEN-LAST:event_�ndraL�senKnappActionPerformed

    //Om knappen "ja" klickas in blir agenten en admin.
    private void admJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admJAActionPerformed
        try{
            mibdb.update("UPDATE Agent SET Administrator=" + "'" + "J" + "'" + "Where Namn=" + "'" + h�mtaNamn() + "'");
            JOptionPane.showMessageDialog(null, h�mtaNamn() + " �r nu en Administrat�r!");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen");}
    }//GEN-LAST:event_admJAActionPerformed
//Om knappen "nej" klickas �r agenten inte en admin. 
    private void admNEJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admNEJActionPerformed
        try{mibdb.update("UPDATE Agent SET Administrator=" + "'" + "N" + "'" + "Where Namn=" + "'" + h�mtaNamn() + "'");
             JOptionPane.showMessageDialog(null, h�mtaNamn() + " �r borttagen som Administrat�r!");
             }
       catch(InfException e){JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen");}    }//GEN-LAST:event_admNEJActionPerformed

    private void �ndraTelKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraTelKnappActionPerformed
        //�ndrar telefonnummer p� agenten. V�rde m�ste anges i f�ltet f�r att det ska g�. 
        if(Valideringsklass.v�rdeExisterar(�ndraTelField)){
            try{
                String nyTel = �ndraTelField.getText();
                mibdb.update("UPDATE Agent SET Telefon="+ "'" + nyTel + "'" + "WHERE Namn =" + "'" + h�mtaNamn() + "'");
                JOptionPane.showMessageDialog(null, "Telefonnumret �r �ndrat!");
        }
            catch(InfException e){
                errorMessage();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�ltet och f�rs�k igen.");
        }
    }//GEN-LAST:event_�ndraTelKnappActionPerformed

    private void �ndraOmr�deKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraOmr�deKnappActionPerformed
        //�ndrar agentens omr�de. V�rde m�ste anges i f�ltet f�r att det ska g�. 
        if(Valideringsklass.v�rdeExisterar(�ndraOmr�deField)){
            try{
                String nyttOmr = �ndraOmr�deField.getText();
                mibdb.update("UPDATE Agent SET Omrade ="+ "'" + nyttOmr + "'" + "WHERE Namn ="+ "'" + h�mtaNamn() + "'");
                JOptionPane.showMessageDialog(null, "Omr�det �r �ndrat!");
        }
            catch(InfException e){
                errorMessage();
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�ltet och f�rs�k igen.");
        }
    }//GEN-LAST:event_�ndraOmr�deKnappActionPerformed

 

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
    private javax.swing.JButton �ndraL�senKnapp;
    private javax.swing.JPasswordField �ndraL�senordField;
    private javax.swing.JTextField �ndraNamnField;
    private javax.swing.JButton �ndraNamnKnapp;
    private javax.swing.JTextField �ndraOmr�deField;
    private javax.swing.JButton �ndraOmr�deKnapp;
    private javax.swing.JTextField �ndraTelField;
    private javax.swing.JButton �ndraTelKnapp;
    // End of variables declaration//GEN-END:variables
}
