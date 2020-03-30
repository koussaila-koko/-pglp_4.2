package KOKO;
/**
*classe Quit.
*utilise linterface command
* @author Koussaila HAMMOUCHE.
*/
public class Quit implements Command {
	/**
	    *interpreteur.
	    * @see Undo#Quit(intrInterpreteur)
	    * @see Undo#execute()
	    * */
	private Interpreteur interpreteur;
	/**
	 * constructeur de la classe Quit.
	 * @param inter
	 * Interpreteur
	 * */
	public Quit(Interpreteur inter) {
		this.interpreteur = inter;
	}
	/**
	 * methode execute.
	 * la commande qui transmet la demande à la méthode quit de Interpreteur
	 * */
	public void execute() {
		this.interpreteur.quit();
	}
}