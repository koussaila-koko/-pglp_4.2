package KOKO;

import java.util.HashMap;
import java.util.Map;


public class Invoker {

	private Map<String, Command> commandes = new HashMap<String, Command>();

	public Map<String, Command> getCommandes() {
		return commandes;
	}

	public void addNewCommande(String nomCommande, Command cmd) {
		commandes.put(nomCommande, cmd);
	}
	
	 
	public void invoquer(String nomCommande) {
		Command cmd = commandes.get(nomCommande);
		if (cmd != null) {
			cmd.execute();
		}
	}
	
	 public void invoquer(Command cmd) {
	        cmd.execute();
	    }
	// c'est a verifier c'est n'est pas encore valider !!!!!!!!!!!!!!
		/*public void affiche_pile() {
			for(int i=0;i<commandes.size();i++) {
				System.out.print(commandes.get(i) + " ");
			}
			System.out.print("\n");
		}*/

}
