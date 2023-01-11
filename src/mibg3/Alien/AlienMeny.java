package mibg3.Alien;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class AlienMeny extends javax.swing.JFrame {
    private static String ocTel;
    private static String ocNamn;
    private InfDB mibdb;

    /**
     * Instansierar rutan f�r AlienMeny.
     */
    public AlienMeny() {
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
        alienRutaNamn = new javax.swing.JLabel();
        v�lkommenAlien = new javax.swing.JLabel();
        �ndraL�sen = new javax.swing.JButton();
        InfoOmOC = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        alienRutaNamn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        v�lkommenAlien.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        v�lkommenAlien.setText("V�lkommen");

        �ndraL�sen.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        �ndraL�sen.setText("�ndra l�senord");
        �ndraL�sen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraL�senActionPerformed(evt);
            }
        });

        InfoOmOC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        InfoOmOC.setText("Min omr�deschef");
        InfoOmOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoOmOCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InfoOmOC)
                            .addComponent(�ndraL�sen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(v�lkommenAlien)
                        .addGap(52, 52, 52)
                        .addComponent(alienRutaNamn)
                        .addGap(14, 14, 14))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(v�lkommenAlien)
                    .addComponent(alienRutaNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(�ndraL�sen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoOmOC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void �ndraL�senActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraL�senActionPerformed
        // Skapar en ny ruta f�r NyttLosenAlien.
        NyttLosenAlien meny = new NyttLosenAlien();
        meny.setVisible(true);
    }//GEN-LAST:event_�ndraL�senActionPerformed

    private void InfoOmOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoOmOCActionPerformed
        //Metoden k�rs n�r man klickar p� knappen "Min omr�deschef". Skapar lokala variabler som ska tilldelas v�rdena av det vi h�mtar fr�n databasen.
       //Vi kallar p� metoden getInloggadAlien() fr�n AlienInlogg f�r att hitta den specifika omr�deschefen f�r just denna inloggade Alien.
       //Sedan skapas en ny ruta som visar informationen.
        try{
            String plats;
            plats = mibdb.fetchSingle("SELECT Plats FROM Alien WHERE Alien_ID = "+ "'" + (mibg3.Alien.AlienInlogg.getInloggadAlien()) + "'");
            String omrade;
            omrade = mibdb.fetchSingle("SELECT Finns_I FROM Plats WHERE Plats_ID =" + "'"+ plats + "'");
            String omr�deschefID;
            omr�deschefID = mibdb.fetchSingle("SELECT Agent_ID FROM Omradeschef WHERE Omrade = "+ "'" + omrade + "'");
            
            ocNamn = mibdb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID = "+ "'" + omr�deschefID + "'");
            ocTel = mibdb.fetchSingle("SELECT Telefon FROM Agent WHERE Agent_ID = "+ "'" + omr�deschefID + "'");
            
            OmradeschefINFO meny = new OmradeschefINFO();
            meny.setVisible(true);
            
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen, v�nligen f�rs�k igen.");
        }
    }//GEN-LAST:event_InfoOmOCActionPerformed

    public static String getOCTel(){
        //Returnerar omr�deschefens telefonnummer.
        return ocTel;
}
    
    public static String getOCNamn(){
        //Returnerar omr�deschefens namn.
        return ocNamn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InfoOmOC;
    private javax.swing.JLabel alienRutaNamn;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel v�lkommenAlien;
    private javax.swing.JButton �ndraL�sen;
    // End of variables declaration//GEN-END:variables
}
