package mibg3;

import java.util.logging.Level;
import java.util.logging.Logger;
import mibg3.Inloggningsruta;
import oru.inf.InfDB;
import oru.inf.InfException;
public class MiBG3 {
private static InfDB idb;


    public static void main(String[] args) {
         {   
          try { idb=new InfDB("mibdb", "3306","mibdba","mibkey");

          } catch (InfException ex)
          {
              Logger.getLogger(MiBG3.class.getName()).log(Level.SEVERE, null, ex);

          }
         }
         new Inloggningsruta().setVisible(true);
         
        } 
    }

