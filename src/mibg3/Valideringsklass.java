package mibg3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Valideringsklass {

    public boolean nameNotNumber(String name) {
        if (name.isEmpty()) {
            return false;
        }

        try {
            double d = Double.parseDouble(name);
            return false;

        } catch (NumberFormatException nfe) {

            return true;

        }

    }
    
    public boolean validPassword(String password){
        if (password.length() >= 7){
           
            return false;
        }
        else{
        return true;
        }
    }
    
    public boolean numberNotName(String number) {
        if (number == null) {
            return false;
        }

        try {
            double d = Double.parseDouble(number);
            return true;

        } catch (NumberFormatException nfe) {

            return false;

        }
    }

    public static boolean validDatum(String datum) {

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
        //validDatum("yyyy-mm-dd");
    }

}
