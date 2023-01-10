package mibg3;

import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;
public class MiBG3 {
private static InfDB idb;

// Kör programmet via denna klass.

// Main-metoden loggar in användaren till SQL-databasen.
    public static void main(String[] args) {
         {   
          try { idb=new InfDB("mibdb", "3306","mibdba","mibkey");

          } catch (InfException ex)
          {
              Logger.getLogger(MiBG3.class.getName()).log(Level.SEVERE, null, ex);

          }
         }
/** Startar programmet. Kallar på metoden "Inloggningsruta" där användaren 
* sedan väljer om de är en alien, agent eller admin.
*/
         new Inloggningsruta().setVisible(true);
        }
    
}

    


