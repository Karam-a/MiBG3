package mibg3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Valideringsklass {

    public boolean värdeExisterar(String varde) {
        if(varde.isEmpty()) {
            return false;
        }
        else{
        return true;
        }
        }

    
    
    public boolean giltigtLosenod(String losenord){
        if (losenord.length() >= 7){
           
            return false;
        }
        else{
        return true;
        }
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
