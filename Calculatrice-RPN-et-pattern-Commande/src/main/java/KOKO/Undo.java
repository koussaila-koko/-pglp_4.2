package KOKO;
/**
*classe Undo.
*utilise linterface command
* @author Koussaila HAMMOUCHE.
*/
public class Undo implements Command {
	/** Interpreteur interpreteur.
	    * @see Undo#Undo(Interp)
	    * @see Undo#execute()
	    */
	private Interpreteur interp;
	/**
	 * constructeur de la classe Undo.
	 * @param interpr cest
	 * Interpreteur
	 * */
	public Undo(Interpreteur interpr) {
		this.interp = interpr;
	}
	/**
	 * methode execute.
	 * la commande qui transmet la demande à la méthode undo de la classe Interpreteur(Interp)
	 * */
	public void execute() {
		this.interp.undo();
	}

}