package mibg3.Admin;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HanteraUtrustningAdmin extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> utrustningNamn;
    private String utrNamn;
    private String id;

    public HanteraUtrustningAdmin() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
        initComponents();
    }

    //Tar fram all utrustning i databasen och sätter den i en combobox för admin att ta bort. 
      private void utrustningLista(){
          try{
            utrustningNamn = mibdb.fetchColumn("SELECT Benamning FROM Utrustning");
            for(String utrustning : utrustningNamn){
            utrustningCB.addItem(utrustning);
        }
       }
       catch(InfException e){
           JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
       }
    }
    /* Meddelandet som finns på jLabel när man öppnar menyn. Kör även metoden utrustningLista.
      * Anledningen att det inte sker i konstruktorn är då inget initieras, därav skapades denna metod. 
      */
    private String message(){
        utrustningLista();
        String message = "Vänligen välj ett vapen att avregistrera.";
        return message;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hantUtrLabel = new javax.swing.JLabel();
        utrustningCB = new javax.swing.JComboBox<>();
        avregKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hantera Utrustning");

        hantUtrLabel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        hantUtrLabel.setText(message());

        utrustningCB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        avregKnapp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        avregKnapp.setText("Avregistrera");
        avregKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avregKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(hantUtrLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(avregKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(utrustningCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(hantUtrLabel)
                .addGap(18, 18, 18)
                .addComponent(utrustningCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(avregKnapp)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Hämtar utrustningens namn.
    private String getNamn(){
        utrNamn = utrustningCB.getSelectedItem().toString();
        return utrNamn;
    }
    //Uppdaterar menyn efter något skett, exempelvis ett borttaget vapen.
    private void uppdatera(){
        this.dispose();
        HanteraUtrustningAdmin tlf = new HanteraUtrustningAdmin();
        tlf.setVisible(true);
   }
    
    //Setter, tar bort ett vapen från databasen.
    private void delVap(){
        try{
            mibdb.delete("DELETE FROM Vapen WHERE Utrustnings_ID = " + "'" + id + "'");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att avregistrera utrustningen av typen vapen.");
        }
    }
    //Setter, tar bort kommunikationsutrustning från databsen.
    private void delKom(){
        try{
            mibdb.delete("DELETE FROM Kommunikation WHERE Utrustnings_ID = " + "'" + id + "'");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att avregistrera utrustningen av typen kommunikation.");
        }
    }
    //Setter, tar bort teknik från databasen.
    private void delTek(){
        try{mibdb.delete("DELETE FROM Teknik WHERE Utrustnings_ID = " + "'" + id + "'");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att avregistrera utrustningen av typen teknik.");
        }
    }
    //Setter, tar bort utrustning från tabellen "Utrustning".
    private void delUtr(){
        try{
            mibdb.delete("DELETE FROM Utrustning WHERE Utrustnings_ID = " + "'" + id + "'");
        
                }
        catch(InfException e){JOptionPane.showMessageDialog(null, "Det gick inte att avregistrera utrustningen från tabellen Utrustning.");}
    }
    //Setter, tar bort utrustningen från tabellen "Innehar_Utrustning" i databasen.
    private void delInnehar(){
        try{
            mibdb.delete("DELETE FROM innehar_utrustning WHERE Utrustnings_ID = " + "'" + id + "'");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att avregistrera utrustningen från tabellen innehar_utrustning.");
        }
    }
    
    //Vid ett knapptryck tas den valdra utrustningen bort. Genom if/else if kan den önskade typen av utrustning tas bort. 
    private void avregKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avregKnappActionPerformed
       try{
            id = mibdb.fetchSingle("SELECT Utrustnings_ID FROM Utrustning WHERE Benamning =" + "'" + getNamn() + "'");
        
            if(mibdb.fetchColumn("SELECT * FROM Vapen WHERE Utrustnings_ID =" + "'" + id + "'").contains(id) && id !=null){
                delVap();
                delInnehar();
                delUtr();
                JOptionPane.showMessageDialog(null, "Avregistrering lyckad!");
                uppdatera();
            }
            else if (mibdb.fetchColumn("SELECT * FROM Kommunikation WHERE Utrustnings_ID =" + "'" + id + "'").contains(id) && id !=null){
                delKom();
                delInnehar();
                delUtr();
                JOptionPane.showMessageDialog(null, "Avregistrering lyckad!");
                uppdatera();
            }
            else if(mibdb.fetchColumn("SELECT * FROM Teknik WHERE Utrustnings_ID =" + "'" + id + "'").contains(id) && id !=null){
                delTek();
                delInnehar();
                delUtr();
                JOptionPane.showMessageDialog(null, "Avregistrering lyckad!");
                uppdatera();
            }
            else{
                JOptionPane.showMessageDialog(null, "Något gick fel.");
            }
       }
       catch(InfException e){
           JOptionPane.showMessageDialog(null, "Gick inte att ansluta till databasen.");
       }
    }//GEN-LAST:event_avregKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avregKnapp;
    private javax.swing.JLabel hantUtrLabel;
    private javax.swing.JComboBox<String> utrustningCB;
    // End of variables declaration//GEN-END:variables
}
