package KOKO;
import java.util.Stack;
/**
*classe Interpreteur.
*Implémentation d'un interpréteur on utilisant les pattern Commandes suivants:
*undo supprime la dernière action.
*quit pour quitter le programme.
*la class est utilser pas les classes Undo Quit MoteurRPN
* @author Koussaila HAMMOUCHE.
*/
public class Interpreteur {
    /**
     * Stack operandes les entiers pour empiler.
     * @see Interpreteur#Interpreteur()
     * @see Interpreteur#undo()
     */
	protected Stack<Double> operandes;
	/**
     * Stack operandesPrecedent pour garder la trace de les operandes .
     * @see Interpreteur#Interpreteur()
     * @see Interpreteur#undo()
     */
	protected Stack<Stack<Double>> operandesPrecedent;
	/**
	 * constructeur Interpreteur.
	 *operandes:
	 *l'ensemble des operande aempiler
	 *operandesPrecedent:
	 * la liste qui contiens la trace des derniers operations
	 * */
	public Interpreteur() {
		operandes = new Stack<Double>();
		operandesPrecedent = new Stack<Stack<Double>>();
	}
	/**
	 * Methode quit.
	 * quitter le programme.
	 * */
	public void quit() {
		System.exit(0);
		}
	/**
	 * Methode undo.
	 * supprime la dernière action.
	 * */
	public void undo() {
		if (operandesPrecedent.size() > 1) {
			operandesPrecedent.pop();
			operandes = operandesPrecedent.peek();
			} else {
			operandesPrecedent.clear();
			operandes.clear();
		}
	}
}
