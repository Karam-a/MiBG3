package mibg3.Agent;

import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class sokEfterRas extends javax.swing.JFrame {
    private InfDB mibdb;
    private DefaultTableModel tabellB1;
    private DefaultTableModel tabellW1;
    private DefaultTableModel tabellS1;
    private ArrayList<String> dataB;
    private ArrayList<String> dataW;
    private ArrayList<String> dataS;

    /**
     * Instansierar rutan sokEfterRas.
     */
    public sokEfterRas() {
        //Kopplar till databasen.
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
        //Instansierar fälten av arraylisterna som ska innehålla data från databasen.
        dataB = new ArrayList<>();
        dataW = new ArrayList<>();
        dataS = new ArrayList<>();
        initComponents();
        fyllTabeller();
    }
    
    private void hämtaData(){
        //Hämtar data från databasen och tilldelar till våra arraylister. dataB = boglodite, dataW = worm, dataS = squid.
        try{
        dataB = mibdb.fetchColumn("SELECT Namn FROM Alien WHERE Alien_ID IN(SELECT Alien_ID FROM Boglodite)");
        dataW = mibdb.fetchColumn("SELECT Namn FROM Alien WHERE Alien_ID IN(SELECT Alien_ID FROM Worm)");
        dataS = mibdb.fetchColumn("SELECT Namn FROM Alien WHERE Alien_ID IN(SELECT Alien_ID FROM Squid)");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen.");
        }
    }
    
    private void fyllTabeller(){
       /* Koden hämtar modellen (Inställningar och data) till tabellerna B, W och S och anger dem som varsin enskilda variabel.
        * TabellB, tabellW och tabellS är jTables i rutan. tabellB1, W1 och S1 tilldelas värdena för tabellB, W och S.
         */
        
        
        hämtaData();
        tabellB1 = (DefaultTableModel) tabellB.getModel();
        tabellW1 = (DefaultTableModel) tabellW.getModel();
        tabellS1 = (DefaultTableModel) tabellS.getModel();
        
        //For-each loop som lägger in data i tabellerna.
        for(String namn : dataB){
            tabellB1.addRow(new Object[]{namn});
        }
        for(String namn2 : dataW){
            tabellW1.addRow(new Object[]{namn2});
        }
        for(String namn3 : dataS){
            tabellS1.addRow(new Object[]{namn3});
        }
    }
    
    private String message(){
        return "Aliens efter ras";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meddelande = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellB = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellS = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabellW = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        meddelande.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        meddelande.setText(message());

        tabellB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Boglodite"
            }
        ));
        jScrollPane1.setViewportView(tabellB);

        tabellS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Squid"
            }
        ));
        jScrollPane2.setViewportView(tabellS);

        tabellW.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Worm"
            }
        ));
        jScrollPane3.setViewportView(tabellW);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(meddelande)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(meddelande)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel meddelande;
    private javax.swing.JTable tabellB;
    private javax.swing.JTable tabellS;
    private javax.swing.JTable tabellW;
    // End of variables declaration//GEN-END:variables
}
