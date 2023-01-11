package mibg3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Valideringsklass {

    public static boolean v�rdeExisterar(JTextField varde) {
        /**
         * Den h�r metoden kontrollerar att v�rdena p� f�lten man skriver in inte �r tomma.
         * �r de tomma s� ska den returnera true, annars false.
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
        // metoden kollar p� antalet tecken som st�r angivna i textf�ltet. �r det �ver 6 tecken returneras false.
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

    
    public static boolean giltigtDatum(JTextField textField) {
    String dateString = textField.getText();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
    try {
        LocalDate date = LocalDate.parse(dateString, formatter);
        return true;
    } catch (DateTimeParseException e) {
        return false;
    }
}
    
}
