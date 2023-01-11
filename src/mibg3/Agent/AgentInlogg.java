package mibg3.Agent;

import javax.swing.JOptionPane;
import mibg3.Inloggningsruta;
import mibg3.Valideringsklass;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AgentInlogg extends javax.swing.JFrame {
    private InfDB mibdb;
    private static String inloggadAgentID;
    private static String agentNamn;
  
    public AgentInlogg() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
        inloggadAgentID = "";
        agentNamn = "";
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        anvField = new javax.swing.JTextField();
        losField = new javax.swing.JPasswordField();
        okKnapp = new javax.swing.JButton();
        tillbakaKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agentinlogg");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("V�lkommen Agent!");

        jLabel2.setText("V�nligen ange anv�ndarnamn och l�senord.");

        jLabel3.setText("Anv�ndarnamn:");

        jLabel4.setText("L�senord:");

        anvField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anvFieldActionPerformed(evt);
            }
        });

        losField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                losFieldActionPerformed(evt);
            }
        });

        okKnapp.setText("OK");
        okKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okKnappActionPerformed(evt);
            }
        });

        tillbakaKnapp.setText("Tillbaka");
        tillbakaKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tillbakaKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(anvField)
                            .addComponent(losField))))
                .addGap(22, 158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(okKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tillbakaKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(anvField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(losField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okKnapp)
                    .addComponent(tillbakaKnapp))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anvFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anvFieldActionPerformed

    }//GEN-LAST:event_anvFieldActionPerformed

    private void losFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_losFieldActionPerformed
      
    }//GEN-LAST:event_losFieldActionPerformed

    private void okKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okKnappActionPerformed
        //Inloggning f�r agent. Validerar att v�rden �r angivna i f�lten, f�r att sedan logga in anv�ndaren.
        if(Valideringsklass.v�rdeExisterar(anvField) && Valideringsklass.v�rdeExisterar(losField)){
        try{
            String anv�ndarnamn = anvField.getText();
            String l�senord = losField.getText();
            String inLoggID;
            String l�sen;
            String namn;
            String agentCheck; 
       
        
            inLoggID = mibdb.fetchSingle("SELECT Agent_ID FROM Agent WHERE Namn=" + "'" + anv�ndarnamn + "'");
            l�sen = mibdb.fetchSingle("SELECT Losenord FROM Agent WHERE Agent_ID =" + "'" + inLoggID + "'");
            namn = mibdb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID ="+"'" +inLoggID+"'");
            agentCheck = mibdb.fetchSingle("SELECT administrator FROM agent WHERE Agent_ID = " + "'" + inLoggID + "'");
        
            //L�senords- och administrat�rsstatus- kontroll. Kontrollerar att anv�ndaren inte �r en administrat�r. �r anv�ndaren administrat�r s� f�r man ett felmeddelande som h�nvisar
            //till admin-inloggen.
            if(l�senord.equals(l�sen) && (agentCheck.equals("N"))){
                AgentMeny meny = new AgentMeny(namn);
                meny.setVisible(true);
                inloggadAgentID = inLoggID;
                agentNamn = namn;
                this.dispose();
        }
            else if(agentCheck.equals("J")){
            JOptionPane.showMessageDialog(null, "Du har angett inloggningsuppgifter f�r en administrat�r. V�nligen logga in som Admin.");
        }
            else{
                JOptionPane.showMessageDialog(null, "Du har angett fel l�senord eller anv�ndarnamn. V�nligen f�rs�k igen.");
        }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Kontrollera formatteringen p� f�lten och f�rs�k igen.");
        }
    }//GEN-LAST:event_okKnappActionPerformed
    //Tar anv�ndaren tillbaka till inloggningsrutan med ett knapptryck.
    private void tillbakaKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tillbakaKnappActionPerformed
        this.dispose();
        new Inloggningsruta().setVisible(true);
    }//GEN-LAST:event_tillbakaKnappActionPerformed
    //Getter-metod som returnerar ID:et f�r anv�ndaren.
    public static String getInloggadAgentID(){
    return inloggadAgentID;
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anvField;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField losField;
    private javax.swing.JButton okKnapp;
    private javax.swing.JButton tillbakaKnapp;
    // End of variables declaration//GEN-END:variables
}
