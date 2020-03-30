/**
 * package des classes,interfces et enum
 */
package KOKO;
/**
*class Appliquer.
* @author Koussaila_HAMMOUCHE.
*/
public class Appliquer implements Command {
	/** MoteurRPN.
	    * @see Appliquer#Appliquer(MoteurRPN,Operations)
	    * @see Appliquer#execute()
	    * utilisation de linterface Command
	    */
	private MoteurRPN moteurRPN;
	/** MoteurRPN.
	    * @see Appliquer#Appliquer(MoteurRPN,Operations)
	    * @see Appliquer#execute()
	    */
	private Operations operation;
	/**
	 * constructeur de la classe Appliquer .
	 * @param moteurRPN c'est notre moteur.
	 * @param operation  c'est l'operande a ajouter a la plie + * -  .
	 * */
public Appliquer(MoteurRPN moteurRPN, Operations operation) {
		this.moteurRPN = moteurRPN;
		this.operation = operation;
	}
	/**
	 * méthode execute.
	 * la méthode pour openFile.
	 * */
	public void execute() {
		this.moteurRPN.appliquerOperation(operation);
	}

}