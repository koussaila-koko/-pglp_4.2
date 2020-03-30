package KOKO;
import java.util.HashMap;
import java.util.Map;
/**
*classe Invoker.
* @author Koussaila HAMMOUCHE.
*/
public class Invoker {
	 /**
	  * commandes
      * Stack operandes les entiers pour empiler.
      * @see Invoker#getCommandes()
      * @see invoquer#addNewCommande(nomCommande,cmd)
      * @see Invoker#invoquer(nomCommande)
      */
	private Map<String, Command> commandes = new HashMap<String, Command>();
	 /**
	  * Methode getCommandes
      * Stack operandes les entiers pour empiler.
      *@return commandes
      */
	public Map<String, Command> getCommandes() {
		return commandes;
	}
	 /**
	  * Methode addNewCommande.
	  * @param nomCommande .
	  * @param cmd .
     */
	public void addNewCommande(String nomCommande, Command cmd) {
		commandes.put(nomCommande, cmd);
	}
	 /**
	  * constructeur avec nomCommande.
	  * @param nomCommande .
    */
	public void invoquer(String nomCommande) {
		Command cmd = commandes.get(nomCommande);
		if (cmd != null) {
			cmd.execute();
		}
	}
	 /**
	  * constructeur avec Command.
	  * @param cmd .
   */
	 public void invoquer(Command cmd) {
	        cmd.execute();
	    }
	 }
