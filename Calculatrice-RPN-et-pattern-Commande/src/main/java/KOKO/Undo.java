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
	private Interpreteur Interp;
	/**
	 * constructeur de la classe Undo.
	 * @param Interp cest 
	 * Interpreteur
	 * */
	public Undo(Interpreteur Interp){
		this.Interp=Interp;
	}
	/**
	 * methode execute.
	 * la commande qui transmet la demande à la méthode undo de la classe Interpreteur(Interp)
	 * */
	public void execute() {
		this.Interp.undo();
	}

}