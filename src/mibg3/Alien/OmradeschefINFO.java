package mibg3.Alien;

public class OmradeschefINFO extends javax.swing.JFrame {

    /**
     * Instansierar rutan f�r OmradeschefINFO.
     */
    public OmradeschefINFO() {
        initComponents();
    }
    private static String h�mtaOCTel(){
        //Metod som kallar p� getOCTel() fr�n AlienMeny-klassen f�r att h�mta telefonnumret f�r omr�deschefen f�r
        //den Alien man �r inloggad som. Anv�nds i jLabeln som st�r brevid "Telefon: ".
       AlienMeny tel = new AlienMeny();
       String telefon = tel.getOCTel();
       return telefon;
    }
    
    private static String h�mtaOCNamn(){
        //Metod som kallar p� getOCNamn() fr�n AlienMeny-klassen f�r att h�mta namnet p� omr�deschefen f�r
        //den Alien man �r inloggad som. Anv�nds i jLabeln som st�r brevid "Namn: ".
       AlienMeny namn = new AlienMeny();
       String namnet = namn.getOCNamn();
       return namnet;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ocNamnLabel = new javax.swing.JLabel();
        ocTelLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Min Omr�deschef:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Namn:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Telefon:");

        ocNamnLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ocNamnLabel.setText(h�mtaOCNamn());

        ocTelLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ocTelLabel.setText(h�mtaOCTel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ocNamnLabel)
                            .addComponent(ocTelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ocNamnLabel)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ocTelLabel))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel ocNamnLabel;
    private javax.swing.JLabel ocTelLabel;
    // End of variables declaration//GEN-END:variables
}
