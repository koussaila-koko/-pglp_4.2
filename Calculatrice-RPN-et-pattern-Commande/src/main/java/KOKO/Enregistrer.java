package KOKO;
/**
*class Enregistrer
* Utilise linterface Appliquer et moteurRPN.enregistrerOperande.
* @author Koussaila HAMMOUCHE.
*/
public class Enregistrer implements Command {
	/** MoteurRPN.
	    * @see Appliquer#Appliquer(MoteurRPN,Operations)
	    * @see Appliquer#execute()
	    */
	private MoteurRPN moteurRPN;
	/** val la valeur qui vas etre enregester dans la pile.
	    * @see MoteurRPN#MoteurRPN(MoteurRPN,Double)
	    * @see MoteurRPN#execute()
	    */
	private Double val;
	/**
	 * constructeur de la cEnregistrer .
	 * @param moteurRPN
	 *  c'est notre moteur.
	 * @param val
	 * c'est la valeur a enregster dans la pile.
	 * */
public Enregistrer(MoteurRPN moteurRPN, Double val) {
		this.moteurRPN = moteurRPN;
		this.val = val;
		}
/**
 * méthode execute.
 * la méthode pour openFile.
 * enregistrer la valeur grace a la methode,
 * enregistrerOperande de la classe moteurRPN
 * */
public void execute() {
		this.moteurRPN.enregistrerOperande(val);
	}

}