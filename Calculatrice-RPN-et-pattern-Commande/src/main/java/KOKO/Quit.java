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
	private Interpreteur Interp;
	/**
	 * constructeur de la classe Quit.
	 * @param Interp 
	 * Interpreteur
	 * */
	public Quit(Interpreteur Interp){
		this.Interp=Interp;
	}
	/**
	 * methode execute.
	 * la commande qui transmet la demande à la méthode quit de Interpreteur
	 * */
	public void execute() {
		this.Interp.quit();
	}

}