package mibg3.Agent;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AlienPåOmråde extends javax.swing.JFrame {
    //initierar  databasen, även modellen bakom de fyra tabellerna.
    private InfDB mibdb;
    private DefaultTableModel modP1;
    private DefaultTableModel modP2;
    private DefaultTableModel modP3;
    private DefaultTableModel modP4;
    private ArrayList<String> listP1;
    private ArrayList<String> listP2;
    private ArrayList<String> listP3;
    private ArrayList<String> listP4;

    //Konstruktor.
    public AlienPåOmråde() {
          
          //Ansluter till databasen, görs i konstruktorn så det ej behöver repeteras i resten av koden.
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");   
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
        
        //Initierar alla Arraylists som innehåller datan från databasen. 
        listP1 = new ArrayList<>();
        listP2 = new ArrayList<>();
        listP3 = new ArrayList<>();
        listP4 = new ArrayList<>();
        
       initComponents();
       
       //Metod som fyller tabellerna med inhämtad data från ArraysLists.
       fyllTabeller();
        
    }
    
    //Setter-metod som tillämpar inhämtad data från databasen till Arraylists.
    private void hamtaData(){
    try{
        listP1 = mibdb.fetchColumn("SELECT Namn from Alien where Plats = 1");
        listP2= mibdb.fetchColumn("SELECT Namn from ALIEN where PLATS = 2");
        listP3 = mibdb.fetchColumn("SELECT NAMN from ALIEN where PLATS = 3");
        listP4 = mibdb.fetchColumn("SELECT NAMN from ALIEN where PLATS = 4");
    }
    catch(InfException E){JOptionPane.showMessageDialog(null, "Finns ingen data att hämta. Fuck you");}
    }
    
    //Setter som tillåter den inhämtade datan att placeras i tabellerna. Görs genom att skapa ett nytt objekt som tilldelas en rad i jFrame-tabellen.
    private void fyllTabeller(){
        hamtaData();
        modP1 = (DefaultTableModel) p1Mod.getModel();
        modP2 = (DefaultTableModel) p2Mod.getModel();
        modP3 = (DefaultTableModel) p3Mod.getModel();
        modP4 = (DefaultTableModel) p4Mod.getModel();
        
        //For-each loop som lägger in objekt i tabellerna. 
        for(String namn : listP1){
        modP1.addRow(new Object[]{namn});
        }
        for(String namn2 : listP2){
        modP2.addRow(new Object[]{namn2});
        }
        for(String namn3 : listP3){
        modP3.addRow(new Object[]{namn3});
        }
        for(String namn4 : listP4){
        modP4.addRow(new Object[]{namn4});
        }
        }
    
    
    //Det som står i jLabel vid start.
    private String message(){
        return "Aliens efter område";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        p1Mod = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        p2Mod = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        p4Mod = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        p3Mod = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        p2Lab = new javax.swing.JLabel();
        p1Lab = new javax.swing.JLabel();
        p4Lab = new javax.swing.JLabel();
        p3Lab = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alieninfo (Område)");

        p1Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(p1Mod);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setText(message());

        p2Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(p2Mod);

        p4Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(p4Mod);

        p3Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(p3Mod);

        p2Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p2Lab.setText("Västerås");

        p1Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p1Lab.setText("Örebro");

        p4Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p4Lab.setText("Borås");

        p3Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p3Lab.setText("Vilhelmina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(p1Lab)))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(p2Lab)
                                        .addGap(69, 69, 69))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(p3Lab)
                                .addGap(194, 194, 194)
                                .addComponent(p4Lab))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2Lab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p1Lab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p4Lab, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(p3Lab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel p1Lab;
    private javax.swing.JTable p1Mod;
    private javax.swing.JLabel p2Lab;
    private javax.swing.JTable p2Mod;
    private javax.swing.JLabel p3Lab;
    private javax.swing.JTable p3Mod;
    private javax.swing.JLabel p4Lab;
    private javax.swing.JTable p4Mod;
    // End of variables declaration//GEN-END:variables
}
