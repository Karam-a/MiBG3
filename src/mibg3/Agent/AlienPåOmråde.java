/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mibg3.Agent;

import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.table.DefaultTableModel;


public class AlienP�Omr�de extends javax.swing.JFrame {
    private InfDB mibdb;
    private ArrayList<String> platsLista; 
    private DefaultTableModel modp1;
    private DefaultTableModel modp2;
    private DefaultTableModel modp3;
    private DefaultTableModel modp4;

    /**
     * Creates new form AlienP�Omr�de
     */
    public AlienP�Omr�de() {
        try{
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");   
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
        }
        initComponents();
        
    }

    private void omr�deLista(){
         try{
            platsLista = mibdb.fetchColumn("SELECT Benamning FROM Plats");
            for(String plats : platsLista){
            omr�deCB.addItem(plats);
        }
       }
       catch(InfException e){
           JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
       }
    
    }
    private String message(){
        omr�deLista();
        return "H�r kan du s�ka p� aliens efter omr�de.";
        
    }
    //INTE KLART
    public String getPlats(){
        String tlfOmr;
        String finnsI;
    try{
        tlfOmr = mibdb.fetchSingle("SELECT Plats FROM Omr�de WHERE Namn=" + "'" + aNamn + "'");
        plats = mibdb.fetchSingle("SELECT Benamning FROM Plats WHERE Plats_ID=" + tlfOmr);
        finnsI = mibdb.fetchSingle("SELECT Finns_I FROM Plats WHERE Plats_ID=" + tlfOmr);
        omr�de = mibdb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID=" + finnsI);
    }
    catch(InfException e){
    
    }
    }
  
    //INTE KLART
    public void kollaAliensOmr�de(){
        try{
        String valtOmr�de = omr�deCB.getSelectedItem().toString();
        switch(valtOmr�de){
            case "�rebro":
                mibdb.fetchSingle("SELECT Namn FROM Alien WHERE Plats=");
        }
    }
        catch(InfException e){
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p1Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Alien ID", "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(p1Mod);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel3.setText("Aliens (omr�den)");

        p2Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Alien ID", "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(p2Mod);

        p4Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Alien ID", "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(p4Mod);

        p3Mod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Alien ID", "Namn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(p3Mod);

        p2Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p2Lab.setText("V�ster�s");

        p1Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p1Lab.setText("�rebro");

        p4Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p4Lab.setText("Bor�s");

        p3Lab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        p3Lab.setText("Vilhelmina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(63, 63, 63)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 10, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(p3Lab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p4Lab)
                                        .addGap(85, 85, 85))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(p1Lab)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p2Lab)
                                        .addGap(71, 71, 71))))
                            .addComponent(jSeparator1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Lab)
                    .addComponent(p2Lab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4Lab)
                    .addComponent(p3Lab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlienP�Omr�de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlienP�Omr�de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlienP�Omr�de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlienP�Omr�de.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlienP�Omr�de().setVisible(true);
            }
        });
    }

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
