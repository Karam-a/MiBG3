package mibg3.Agent;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.ArrayList;
import static mibg3.Agent.AgentInlogg.getInloggadAgentID;
import mibg3.Valideringsklass;

// Instansiering av variabler som presenteras i framens utvalda labels. �ven databasen.
public class AlienInfoAgent extends javax.swing.JFrame {

    private InfDB mibdb;
    private String aNamn;
    private String aID;
    private String aRegDat;
    private String aTelNr;
    private String ansvAg;
    private String nuvPlats;
    private String faktOmr;
    private String aRas;
    private String aArm;
    private static String agentInloggad;
    private ArrayList<String> namn;


    public AlienInfoAgent() {
        
        try{
            //Ansluter till databasen.
            mibdb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Kunde inte ansluta till databasen, v�nligen f�rs�k igen.");
        }
        initComponents();
        
        agentInloggad = getInloggadAgentID();
            if(agentInloggad != null){
                taBortAlienKnapp.setEnabled(false);
                logInSomAdmKnapp.setVisible(true);
        }
            else{
                logInSomAdmKnapp.setVisible(false);
        }
         
 }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alienInformationMainLabel = new javax.swing.JLabel();
        alienValCB = new javax.swing.JComboBox<>();
        alienLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        alienNamnLabel = new javax.swing.JLabel();
        alienIDLabel = new javax.swing.JLabel();
        regDatumAlienLabel = new javax.swing.JLabel();
        telNrLabel = new javax.swing.JLabel();
        ansvarigAgentLabel = new javax.swing.JLabel();
        nuvarandePlatsLabel = new javax.swing.JLabel();
        returnAlienNamnLabel = new javax.swing.JLabel();
        returnAlienIDLabel = new javax.swing.JLabel();
        returnAlienRegDatumLabel = new javax.swing.JLabel();
        returnAlienTelNrLabel = new javax.swing.JLabel();
        returnAlienAnsAgentLabel = new javax.swing.JLabel();
        returnAlienNuvPlatsLabel = new javax.swing.JLabel();
        �ndraNamn = new javax.swing.JButton();
        �ndraReg = new javax.swing.JButton();
        �ndraTel = new javax.swing.JButton();
        �ndraAgent = new javax.swing.JButton();
        �ndraPlats = new javax.swing.JButton();
        �ndraNamnField = new javax.swing.JTextField();
        �ndraRegField = new javax.swing.JTextField();
        �ndraTelField = new javax.swing.JTextField();
        �ndraAgentField = new javax.swing.JTextField();
        �ndraPlatsField = new javax.swing.JTextField();
        rasLabel = new javax.swing.JLabel();
        returnAlienRasLabel = new javax.swing.JLabel();
        alienIDLabel1 = new javax.swing.JLabel();
        �ndraRasCB = new javax.swing.JComboBox<>();
        �ndraRas = new javax.swing.JButton();
        �ndraRasAntalArmBoog = new javax.swing.JTextField();
        rasLabel1 = new javax.swing.JLabel();
        returnArmBoogLabel = new javax.swing.JLabel();
        taBortAlienKnapp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logInSomAdmKnapp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alieninformation");

        alienInformationMainLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        alienInformationMainLabel.setText("H�r kan du se och �ndra information om aliens.");

        alienValCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alienValCBActionPerformed(evt);
            }
        });
        alienValCB.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                alienValCBPropertyChange(evt);
            }
        });

        alienLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        alienLabel.setText("Alien:");

        alienNamnLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienNamnLabel.setText("Namn:");

        alienIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienIDLabel.setText("Alien ID:");

        regDatumAlienLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        regDatumAlienLabel.setText("Registreringsdatum:");

        telNrLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        telNrLabel.setText("Telefonnummer:");

        ansvarigAgentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ansvarigAgentLabel.setText("Ansvarig Agent:");

        nuvarandePlatsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuvarandePlatsLabel.setText("Nuvarande plats:");

        returnAlienNamnLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienNamnLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienNamnLabel.setText(getAlienNamn());

        returnAlienIDLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienIDLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienIDLabel.setText(getAlienID());

        returnAlienRegDatumLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienRegDatumLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienRegDatumLabel.setText(getRegDat());

        returnAlienTelNrLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienTelNrLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienTelNrLabel.setText(getTelNr());

        returnAlienAnsAgentLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienAnsAgentLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienAnsAgentLabel.setText(getAnsvarAg());

        returnAlienNuvPlatsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienNuvPlatsLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienNuvPlatsLabel.setText(getNuvPlats());

        �ndraNamn.setText("�ndra");
        �ndraNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraNamnActionPerformed(evt);
            }
        });

        �ndraReg.setText("�ndra");
        �ndraReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraRegActionPerformed(evt);
            }
        });

        �ndraTel.setText("�ndra");
        �ndraTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraTelActionPerformed(evt);
            }
        });

        �ndraAgent.setText("�ndra");
        �ndraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraAgentActionPerformed(evt);
            }
        });

        �ndraPlats.setText("�ndra");
        �ndraPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraPlatsActionPerformed(evt);
            }
        });

        rasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rasLabel.setText("Ras:");

        returnAlienRasLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnAlienRasLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnAlienRasLabel.setText(getRas());

        alienIDLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alienIDLabel1.setText("ID kan ej redigeras.");

        �ndraRasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));
        �ndraRasCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                �ndraRasCBItemStateChanged(evt);
            }
        });

        �ndraRas.setText("�ndra");
        �ndraRas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraRasActionPerformed(evt);
            }
        });

        �ndraRasAntalArmBoog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                �ndraRasAntalArmBoogActionPerformed(evt);
            }
        });

        rasLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rasLabel1.setText("Antal Armar/Boogies:");

        returnArmBoogLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        returnArmBoogLabel.setForeground(new java.awt.Color(255, 51, 51));
        returnArmBoogLabel.setText(getArmBoog());

        taBortAlienKnapp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        taBortAlienKnapp.setForeground(new java.awt.Color(255, 51, 51));
        taBortAlienKnapp.setText("Ta bort alien");
        taBortAlienKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortAlienKnappActionPerformed(evt);
            }
        });

        logInSomAdmKnapp.setText("Ej inloggad som Admin");
        logInSomAdmKnapp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel2.setText("Ange plats ID:");

        jLabel3.setText("Ange agent ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ansvarigAgentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienAnsAgentLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(regDatumAlienLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnAlienRegDatumLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alienNamnLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnAlienNamnLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telNrLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnAlienTelNrLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rasLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnAlienRasLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(alienIDLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnAlienIDLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rasLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(returnArmBoogLabel)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nuvarandePlatsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnAlienNuvPlatsLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraAgentField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraTelField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraTel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(�ndraRegField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(�ndraReg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(alienIDLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(�ndraRasAntalArmBoog, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(�ndraRasCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(�ndraPlatsField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(�ndraPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(�ndraRas, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(alienLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alienValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(logInSomAdmKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(taBortAlienKnapp)
                                .addGap(16, 16, 16)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alienInformationMainLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(alienInformationMainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienLabel)
                    .addComponent(alienValCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBortAlienKnapp)
                    .addComponent(jLabel1)
                    .addComponent(logInSomAdmKnapp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienNamnLabel)
                    .addComponent(returnAlienNamnLabel)
                    .addComponent(�ndraNamn)
                    .addComponent(�ndraNamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alienIDLabel)
                    .addComponent(returnAlienIDLabel)
                    .addComponent(alienIDLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regDatumAlienLabel)
                    .addComponent(returnAlienRegDatumLabel)
                    .addComponent(�ndraReg)
                    .addComponent(�ndraRegField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telNrLabel)
                    .addComponent(returnAlienTelNrLabel)
                    .addComponent(�ndraTel)
                    .addComponent(�ndraTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansvarigAgentLabel)
                    .addComponent(returnAlienAnsAgentLabel)
                    .addComponent(�ndraAgent)
                    .addComponent(�ndraAgentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuvarandePlatsLabel)
                    .addComponent(returnAlienNuvPlatsLabel)
                    .addComponent(�ndraPlats)
                    .addComponent(�ndraPlatsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rasLabel)
                    .addComponent(returnAlienRasLabel)
                    .addComponent(�ndraRasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(�ndraRas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(�ndraRasAntalArmBoog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rasLabel1)
                    .addComponent(returnArmBoogLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void errorLol(){
            JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen");}
   
        private void namnLista(){
            //H�mtar ut alla aliennamn i databasen och s�tter in dem i en arraylist.
            try{
                    namn = mibdb.fetchColumn("SELECT Namn FROM Alien");
                    for(String alienNamn : namn){
                    alienValCB.addItem(alienNamn);
        }
       }
            catch(InfException e){
                    JOptionPane.showMessageDialog(null, "Det gick inte att ansluta till databasen.");
       }
    }
   
        private void uppdatera(){
            //Uppdaterar combo-boxen och �ppnar om rutan p� nytt s� att den visar alla aktuella namn i databasen om 
            //man exempelvis �ndrat en aliens namn eller tagit bort an alien.
            this.dispose();
            AlienInfoAgent aIA = new AlienInfoAgent();
            aIA.setVisible(true);
    }
   
        private String getAlienNamn(){
            //Fyller combo-boxen samt h�mtar den valda agentens namn. 
            //Anledningen till att namnLista() anv�nds h�r och inte i konstruktorn �r att den helt enkelt
            //inte instansieras i konstruktorn och verkar bara fungera h�r.
            namnLista();        
            aNamn = alienValCB.getSelectedItem().toString();
            return aNamn;
    }
      
    
        private String getAlienID(){
            //Getter-metod, h�mtar den valda aliens ID.
            try{
                aID = mibdb.fetchSingle("SELECT Alien_ID FROM Alien WHERE Namn=" + "'" + aNamn + "'");
         }
            catch(InfException e){
                errorLol();
            }
                return aID;
    }
    
        private String getRegDat(){
            //Getter metod, h�mtar den valda aliens registreringsdatum.
            try{
                aRegDat = mibdb.fetchSingle("SELECT Registreringsdatum FROM Alien WHERE Namn=" + "'" + aNamn + "'");
        }
            catch(InfException e){errorLol();
            }
                return aRegDat;
    }
   
   
        private String getTelNr(){
            //Getter-metod, h�mtar den valda aliens telefonnummer.
            try{
                aTelNr = mibdb.fetchSingle("SELECT Telefon FROM Alien WHERE Namn=" + "'" + aNamn + "'");
    }
            catch(InfException e){errorLol();
            }
                return aTelNr;
    }
    
        private String getAnsvarAg(){
            //Getter-metod, h�mtar den valda aliens ansvariga agent.
            String tlfAag;
            try{
                tlfAag = mibdb.fetchSingle("SELECT Ansvarig_Agent FROM Alien WHERE Namn=" + "'" + aNamn+ "'");
                ansvAg = mibdb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID=" + tlfAag);}
            catch(InfException e){
                errorLol();
            }
                return ansvAg;
    }
    
        private String getNuvPlats(){
            //Getter-metod, h�mtar den valda aliens nuvarande plats samt omr�de.
            String tlfOmr;
            String finnsI;
        try{
                tlfOmr = mibdb.fetchSingle("SELECT Plats FROM Alien WHERE Namn=" + "'" + aNamn + "'");
                nuvPlats = mibdb.fetchSingle("SELECT Benamning FROM Plats WHERE Plats_ID=" + tlfOmr);
                finnsI = mibdb.fetchSingle("SELECT Finns_I FROM Plats WHERE Plats_ID=" + tlfOmr);
                faktOmr = mibdb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID=" + finnsI);
    }
        catch(InfException e){
                errorLol();
    }
                return nuvPlats + ", " + faktOmr;
    }

        private String getRas(){
            //Getter-metod, h�mtar den valda aliens ras.
            try{
                    if(mibdb.fetchColumn("SELECT * FROM Squid WHERE Alien_ID=" + "'" + aID + "'").contains(aID) && aID !=null){
                        aRas = "Squid";
                    }
                    else if (mibdb.fetchColumn("SELECT * FROM Boglodite WHERE Alien_ID=" + "'" + aID + "'").contains(aID) && aID !=null){
                        aRas = "Boglodite";
                    }
                    else if(mibdb.fetchColumn("SELECT * FROM Worm WHERE Alien_ID = "+ "'" + aID + "'").contains(aID) && aID !=null){
                        aRas="Worm";
                    }
                    else{
                        aRas = "Alien Saknar Ras.";
                    }
    }
            catch(InfException e){
                    errorLol();
    }
                return aRas;
    }
    
        private String getArmBoog(){
            //Getter-metod, h�mtar antal armar/boogies ifall man �r squid eller boglodite och returnerar 0
            //ifall man �r worm alternativt att alien saknar ras ifall den inte har n�gon registrerad.
            try{
            String ras = getRas();
            switch (ras){
                case "Squid":
                    aArm = mibdb.fetchSingle("SELECT Antal_Armar FROM Squid WHERE Alien_ID=" + getAlienID());
                    break;
                case "Boglodite":
                    aArm = mibdb.fetchSingle("SELECT Antal_Boogies FROM Boglodite WHERE Alien_ID=" + getAlienID());
                    break;
                case "Worm":
                    aArm = "0";
                    break;
                case "Alien Saknar Ras.":
                    aArm = "Ras Saknas.";
        }
    }
            catch(InfException e){errorLol();
            }
                return aArm;
    }
    
        private void taBortFranRas(){
            //Metod f�r att ta bort en alien fr�n en ras n�r man �ndrar dess ras till en annan.
            try{
                    String rasCheck = getRas();
                    if("Alien Saknar Ras.".equals(rasCheck)){
            }
            else switch(rasCheck){
                case "Squid":
                    mibdb.delete("DELETE FROM Squid WHERE Alien_ID=" + aID);
                    break;
                case "Boglodite":
                    mibdb.delete("DELETE FROM Boglodite WHERE Alien_ID=" + aID);
                    break;
                case "Worm":
                    mibdb.delete("DELETE FROM Worm WHERE Alien_ID=" + aID);
                    break;
       }
   }
            catch(InfException e){JOptionPane.showMessageDialog(null, "N�got gick fel med �ndring av rasen, f�rs�k igen.");
            }
    }
    
 
  //Efter �ndring k�rs metoden igen, och uppdaterar den nuvarande sidan.
    private void alienValCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alienValCBActionPerformed
            aNamn = alienValCB.getSelectedItem().toString();
            returnAlienAnsAgentLabel.setText(getAnsvarAg());
            returnAlienIDLabel.setText(getAlienID());
            returnAlienNamnLabel.setText(aNamn);
            returnAlienNuvPlatsLabel.setText(getNuvPlats());
            returnAlienRegDatumLabel.setText(getRegDat());
            returnAlienTelNrLabel.setText(getTelNr());
            returnAlienRasLabel.setText(getRas());
            returnArmBoogLabel.setText(getArmBoog());
       
    }//GEN-LAST:event_alienValCBActionPerformed

    private void alienValCBPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_alienValCBPropertyChange
       
    }//GEN-LAST:event_alienValCBPropertyChange

    private void �ndraNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraNamnActionPerformed
        //Validerar att det finns ett v�rde i f�ltet och �ndrar en aliens namn samt uppdaterar rutan s� att namnet visas direkt i combo-boxen.
            if(Valideringsklass.v�rdeExisterar(�ndraNamnField)){
                try{
                        String namn = �ndraNamnField.getText();
                        mibdb.update("UPDATE Alien SET Namn ="+ "'" + namn + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
                        JOptionPane.showMessageDialog(null, "Namnet �r �ndrat.");
                        �ndraNamnField.setText(aNamn);
                        uppdatera();
            }
                catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Det gick inte att �ndra namnet.");
        }
        }
    }//GEN-LAST:event_�ndraNamnActionPerformed

    private void �ndraRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraRegActionPerformed
        //Validerar att ett v�rde finns i f�ltet och sedan �ndrar registreringsdatumet f�r en alien samt uppdaterar jLabel som visar det datumet.
            if(Valideringsklass.v�rdeExisterar(�ndraRegField)){
                try{
                        String reg = �ndraRegField.getText();
                        mibdb.update("UPDATE Alien SET Registreringsdatum ="+ "'" + reg + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
                        JOptionPane.showMessageDialog(null, "Registreringsdatumet �r �ndrat.");
                        returnAlienRegDatumLabel.setText(getRegDat());
        }
                catch(InfException e){
                JOptionPane.showMessageDialog(null, "Det gick inte att �ndra registreringsdatumet.");
        }
        }
    }//GEN-LAST:event_�ndraRegActionPerformed

    private void �ndraTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraTelActionPerformed
        //Validerar att ett v�rde finns i f�ltet och �ndrar telefonnumret f�r en alien samt uppdaterar jLabeln som visar det numret.
            if(Valideringsklass.v�rdeExisterar(�ndraTelField)){
                try{
                        String telefon = �ndraTelField.getText();
                        mibdb.update("UPDATE Alien SET Telefon ="+ "'" + telefon + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
                        JOptionPane.showMessageDialog(null, "Telefonnumret �r �ndrat.");
                        returnAlienTelNrLabel.setText(getTelNr());
        }
                catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Det gick inte att �ndra telefonnumret.");
        }
        }
    }//GEN-LAST:event_�ndraTelActionPerformed

    private void �ndraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraAgentActionPerformed
        //Validerar att ett v�rde finns i f�ltet och �ndrar den ansvariga agenten f�r en alien samt uppdaterar jLabeln som visar agentens namn.
            if(Valideringsklass.v�rdeExisterar(�ndraAgentField)){
                try{
                        String agent = �ndraAgentField.getText();
                        mibdb.update("UPDATE Alien SET Ansvarig_Agent ="+ "'" + agent + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
                        JOptionPane.showMessageDialog(null, "Ansvarig agent �r �ndrad.");
                        returnAlienAnsAgentLabel.setText(getAnsvarAg());
            
        }
                catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Det gick inte att �ndra ansvarig agent.");
        }
        }
    }//GEN-LAST:event_�ndraAgentActionPerformed

    private void �ndraPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraPlatsActionPerformed
        //Validerar att ett v�rde finns i f�ltet och �ndrar platsen en alien befinner sig i samt uppdaterar jLabeln som visar platens namn.
            if(Valideringsklass.v�rdeExisterar(�ndraPlatsField)){
                try{
                        String plats = �ndraPlatsField.getText();
                        mibdb.update("UPDATE Alien SET Plats ="+ "'" + plats + "'" + "WHERE Namn ="+ "'" + aNamn + "'");
                        JOptionPane.showMessageDialog(null, "Nuvarande plats �r �ndrad.");
                        returnAlienNuvPlatsLabel.setText(getNuvPlats());
        }
                catch(InfException e){
                        JOptionPane.showMessageDialog(null, "Det gick inte att �ndra den nuvarande platsen.");
        }
        }
    }//GEN-LAST:event_�ndraPlatsActionPerformed

    private void �ndraRasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraRasActionPerformed
            //Denna metod �ndrar rasen f�r en alien. Om du f�rs�ker registrera samma ras och antal armar/boogies kommer ett felmeddelande som s�ger
            //att den redan �r registrerad som den rasen med/eller antalet armar/boogies. Annars �ndrar den rasen och tar �ven bort den fr�n den rasen den var
            //innan genom att kalla p� taBortFranRas() via ett intert metodanrop. Dessutom uppdateras alla jLabels s� att informationen �r aktuell.
            if (�ndraRasCB.getSelectedItem().equals(getRas()) && �ndraRasAntalArmBoog.getText().equals(getArmBoog())){
                JOptionPane.showMessageDialog(null, "Alien " + getAlienNamn() + " �r redan registrerad som en " + getRas() + " med " + getArmBoog() +" armar/boogies.");
                return;
        }
            else if(�ndraRasCB.getSelectedItem().equals(getRas())){
                JOptionPane.showMessageDialog(null, "Alien " + getAlienNamn() + " �r redan registrerad som en " + getRas() + ".");
                return;
        }  
            else try{
                int antAB = Integer.parseInt(�ndraRasAntalArmBoog.getText());
                String valdRas = �ndraRasCB.getSelectedItem().toString();
                switch (valdRas){
                    case "Boglodite":
                        taBortFranRas();
                        mibdb.insert("INSERT INTO Boglodite(Alien_ID,Antal_Boogies) VALUES(" + aID + "," + "'" + antAB + "'" + ")");
                        break;
                    case "Squid":
                        taBortFranRas();
                        mibdb.insert("INSERT INTO Squid (Alien_ID,Antal_armar) VALUES(" + aID +"," +"'" + antAB + "'"+ ")");
                        break;
                    case "Worm":
                        taBortFranRas();
                        mibdb.insert("INSERT INTO Worm (Alien_ID) VALUES(" + aID + ")");
                        break;
            }
            
        }
            catch(InfException e){JOptionPane.showMessageDialog(null, "Ras�ndring misslyckades, v�nligen f�rs�k igen.");}
                JOptionPane.showMessageDialog(null, "Rasbyte lyckades! Alien " + aNamn+ " �r nu "+ getRas() + "!");
                �ndraRasAntalArmBoog.setText("");
                returnArmBoogLabel.setText(getArmBoog());
                returnAlienRasLabel.setText(getRas());
    }//GEN-LAST:event_�ndraRasActionPerformed

    private void �ndraRasAntalArmBoogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_�ndraRasAntalArmBoogActionPerformed
        //-//
    }//GEN-LAST:event_�ndraRasAntalArmBoogActionPerformed

    private void �ndraRasCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_�ndraRasCBItemStateChanged
            //Metod som g�r att man inte kan skriva in antal armar/boogies om man v�ljer worm d� den rasen inte har den egenskapen.
            if(�ndraRasCB.getSelectedItem().equals("Worm")){
                �ndraRasAntalArmBoog.setText("0");
                �ndraRasAntalArmBoog.setEnabled(false);}
            else{
                �ndraRasAntalArmBoog.setEnabled(true);}
    }//GEN-LAST:event_�ndraRasCBItemStateChanged

    private void taBortAlienKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortAlienKnappActionPerformed
        //Metod som tar bort en alien med en knapp. Klickar man p� den f�r man upp en JOptionPane som fr�gar om man �r s�ker p� att man vill ta bort alien
        //och klickar man YES s� tas den bort fr�n rasen samt alientabellen.
        String tlfNamn = getAlienNamn();
        int bekr = JOptionPane.showConfirmDialog(null, "�r du s�ker p� att du vill ta bort " + getAlienNamn() + " fr�n systemet? DET G�R INTE ATT �NGRA!"  , "Bekr�fta borttagning av " + tlfNamn, JOptionPane.YES_NO_OPTION);
        if (bekr == JOptionPane.YES_OPTION){
            try{            
                taBortFranRas();
                mibdb.delete("DELETE FROM Alien WHERE Alien_ID="+getAlienID());
                JOptionPane.showMessageDialog(null, tlfNamn + " �r nu borttagen fr�n systemet.");
                //Vid genomf�rande startar den om f�nstret, som p� nytt g�r igenom databasen och h�mtar alla Aliens.
                uppdatera();
                }
            catch(InfException e){
                JOptionPane.showMessageDialog(null, "N�got gick fel, f�rs�k igen.");
            }
        }
        //Vid ett "nej" returnerar den till menyn. Inget f�r�ndras i databasen eller programmet. 
        else{
                JOptionPane.showMessageDialog(null, "Ingen alien har tagits bort fr�n systemet.");
                uppdatera();
        }
    }//GEN-LAST:event_taBortAlienKnappActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alienIDLabel;
    private javax.swing.JLabel alienIDLabel1;
    private javax.swing.JLabel alienInformationMainLabel;
    private javax.swing.JLabel alienLabel;
    private javax.swing.JLabel alienNamnLabel;
    private javax.swing.JComboBox<String> alienValCB;
    private javax.swing.JLabel ansvarigAgentLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logInSomAdmKnapp;
    private javax.swing.JLabel nuvarandePlatsLabel;
    private javax.swing.JLabel rasLabel;
    private javax.swing.JLabel rasLabel1;
    private javax.swing.JLabel regDatumAlienLabel;
    private javax.swing.JLabel returnAlienAnsAgentLabel;
    private javax.swing.JLabel returnAlienIDLabel;
    private javax.swing.JLabel returnAlienNamnLabel;
    private javax.swing.JLabel returnAlienNuvPlatsLabel;
    private javax.swing.JLabel returnAlienRasLabel;
    private javax.swing.JLabel returnAlienRegDatumLabel;
    private javax.swing.JLabel returnAlienTelNrLabel;
    private javax.swing.JLabel returnArmBoogLabel;
    private javax.swing.JButton taBortAlienKnapp;
    private javax.swing.JLabel telNrLabel;
    private javax.swing.JButton �ndraAgent;
    private javax.swing.JTextField �ndraAgentField;
    private javax.swing.JButton �ndraNamn;
    private javax.swing.JTextField �ndraNamnField;
    private javax.swing.JButton �ndraPlats;
    private javax.swing.JTextField �ndraPlatsField;
    private javax.swing.JButton �ndraRas;
    private javax.swing.JTextField �ndraRasAntalArmBoog;
    private javax.swing.JComboBox<String> �ndraRasCB;
    private javax.swing.JButton �ndraReg;
    private javax.swing.JTextField �ndraRegField;
    private javax.swing.JButton �ndraTel;
    private javax.swing.JTextField �ndraTelField;
    // End of variables declaration//GEN-END:variables
}
