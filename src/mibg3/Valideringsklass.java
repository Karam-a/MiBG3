package mibg3;

import javax.swing.JTextField;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Valideringsklass {

    public static boolean värdeExisterar(JTextField varde) {
        //metoden kontrollerar att värdena på fälten man skriver in inte är tomma.
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
        // metoden kollar på antalet tecken som står angivna i textfältet. Är det över 6 tecken returneras false.
       boolean giltigt;
        if(losenord.length() >= 7){
            giltigt = false;
        }
        else{
        giltigt = true;
        }
        return giltigt;
    }

    //Metoden kontrollerar att datum som anges är korrekt formaterat. 
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
