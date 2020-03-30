package KOKO;
/**
*classe Retourner.
*utilise linterface command
* @author Koussaila HAMMOUCHE.
*/
public class Retourner  implements Command {
	 /**MoteurRPNr.
	    * @see Retourner#Retourner( moteurRPN )
	    * @see Retourner#execute()
	    */
	private MoteurRPN moteurRPN;
	/**
	 * constructeur Retourner.
	 * @param moteurRPN
	 * cest MoteurRPN
	 * */
	public Retourner(MoteurRPN moteurRPN) {
		this.moteurRPN = moteurRPN;
	}
	/**
	 * methode execute.
	 * transmettre la demande à
	 * la méthode listeOperandes de la class moteurRPN.
	 * */
	public void execute() {
		this.moteurRPN.listeOperandes();
	}

}