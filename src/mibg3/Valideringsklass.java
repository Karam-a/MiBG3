package mibg3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Valideringsklass {
    /**
     * I den här klassen kollar vi valideringen av saker när man loggar in.
     * @param varde
     * @return 
     */

    public static boolean värdeExisterar(JTextField varde) {
        /**
         * Den här metoden kontrollerar att värdena på fälten man skriver in inte är tomma.
         * Är de tomma så ska den returnera true, annars false.
         */
        boolean fylld;
        if(varde.getText().isEmpty()) {
            fylld = false;
        }
        else{
            fylld = true;
        }
        return fylld;
        }

    
    
    public static boolean giltigtLosenord(String losenord){
        /**
         * Den här metoden ska kolla om lösenordet man skriver in är ett giltigt antal tecken
         * som ska vara 6 baserat på hur vi såg det på databasen. 
         */
       boolean giltigt;
        if(losenord.length() >= 7){
            giltigt = false;
        }
        else{
        giltigt = true;
        }
        return giltigt;
    }
    
    public boolean nummerEjNamn(String nummer) {
        if (nummer == null) {
            return false;
        }

        try {
            double d = Double.parseDouble(nummer);
            return true;

        } catch (NumberFormatException nf) {

            return false;

        }
    }

    public static boolean giltigtDatum(String datum) {

        if (datum.trim().equals("") && !datum.isEmpty()) {
            return true;
        } else {

            SimpleDateFormat datumFormat = new SimpleDateFormat("yyyy-mm-dd");
            datumFormat.setLenient(false);

            try {
                Date jDatum = datumFormat.parse(datum);

            } catch (ParseException e) {

                return false;
            }

            return true;
        }

    }
    
    

    public void main(String args[]) {
    }

}
