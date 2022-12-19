import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

public class MiBG3 {

    /**
     * @param args the command line arguments
     */
    private static InfDB idb;

    public static void main(String[] args) {
         {      // TODO code application logic here
          try { idb=new InfDB("mibdb", "3306","mibdba","mibkey");

          } catch (InfException ex)
          {
              Logger.getLogger(MiBG3.class.getName()).log(Level.SEVERE, null, ex);

          }
        }
    }
}
