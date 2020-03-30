package KOKO;
import java.util.Scanner;
/**
*classe SaisieRPN.
*
* @author Koussaila HAMMOUCHE.
*/
public class SaisieRPN {
	/** Scanner.
	 * */
	private Scanner sc;
	/** moteurRPN.
	 * @see SaisieRPN#SaisieRPN() .
	 * @see SaisieRPN#invoqueMoteurRPN(x) .
	 * @see SaisieRPN#init() .
	    */
	private MoteurRPN moteurRPN;
	/** MAX_VALUE.
	 * @see SaisieRPN#invoqueMoteurRPN(x) .
	  */
	private final static int MAX_VALUE = 1000;
	/** MIN_VALUE.
	 * @see SaisieRPN#invoqueMoteurRPN(x) .
	  */
	private final static int MIN_VALUE = 1000;
	/** moteurRPN.
	 * @see SaisieRPN#SaisieRPN() .
	 * @see SaisieRPN#invoqueMoteurRPN(x) .
	 * @see SaisieRPN#init() .
	 * @see SaisieRPN#saisie () .
	    */
	private Invoker invoqueur;
	/**constructeur SaisieRPN.
	 * constructeur pour initialiser le moteur
	 * Creating the receiver object
	 * Creating invoker and associating with Command
	    */
	public SaisieRPN() {
		moteurRPN = new MoteurRPN();
		invoqueur = new Invoker();
		init();
		sc = new Scanner(System.in);
		}
	/**methode invoqueMoteurRPN.
	 * @param x .
	 *la methode qui consiste a
	 *invoquer le moteur rpn
	 *(si l'utlisateur tape qlqchose)
	 *operateur on applique operation
	 *qui correspond
	 * @see SaisieRPN#saisie () .
	 * perform action on invoker object
	 *verifie le nombre saisie
	 *@throws ArithmeticException .
	 *@throws NumberFormatException .
	 * s'il est bien dans l'iterval
	 * */
public void invoqueMoteurRPN(String x) throws ArithmeticException, NumberFormatException {
	switch (x) {
		case "+":
			invoqueur.invoquer("plus");
			invoqueur.invoquer("retourner");
			break;
		case "-":
			invoqueur.invoquer("moins");
			invoqueur.invoquer("retourner");
			break;
		case "*":
			invoqueur.invoquer("mult");
			invoqueur.invoquer("retourner");
			break;
		case "/":
			invoqueur.invoquer("div");
			invoqueur.invoquer("retourner");
			break;
			case "undo":
			invoqueur.invoquer("undo");
			invoqueur.invoquer("retourner");
			break;
			case "quit":
			invoqueur.invoquer("quit");
			break;
		default:
			double operande = Double.parseDouble(x);
			if (operande > MAX_VALUE || operande < -MIN_VALUE) {
				throw new ArithmeticException("denominateur egal 0");
			}
			if ((Math.abs(operande) > -MIN_VALUE) && (operande < MAX_VALUE)) {
				this.invoqueur.invoquer(new Enregistrer(moteurRPN, operande));
				invoqueur.invoquer("retourner");
			} else {
				throw new ArithmeticException("opreandes non inclus dans l'intervalle");
			}
			break;
		}
}
/**methode saisie.
 * interface homme machine
 * */
public void saisie() {
	    System.out.println("  *******CALCULATRICE RPN*******");
		System.out.println("Saisir nombre, opération ou exit pour quitter");
		while (true) {
			String str = sc.nextLine();
			try {
				invoqueMoteurRPN(str);
			} catch (ArithmeticException | NumberFormatException msg) {
				System.out.println("incorrecte car : " + msg.getMessage());
				invoqueur.invoquer("retourner");
			}
		}
	}


/**methode init.
 * creating command and associating with receiver
 * ajouter les commandes
 * plus moins mult dive
 * */
	public void init() {
		Appliquer plus = new Appliquer(moteurRPN, Operations.PLUS);
		this.invoqueur.addNewCommande("plus", plus);
		Appliquer moins = new Appliquer(moteurRPN, Operations.MOINS);
		this.invoqueur.addNewCommande("moins", moins);
		Appliquer div = new Appliquer(moteurRPN, Operations.DIV);
		this.invoqueur.addNewCommande("div", div);
		Appliquer mult = new Appliquer(moteurRPN, Operations.MULT);
		this.invoqueur.addNewCommande("mult", mult);
		Undo undo = new Undo(moteurRPN);
		this.invoqueur.addNewCommande("undo", undo);
		Quit quit = new Quit(moteurRPN);
		this.invoqueur.addNewCommande("quit", quit);
		Retourner retourner = new Retourner(moteurRPN);
		this.invoqueur.addNewCommande("retourner", retourner);
	}

}