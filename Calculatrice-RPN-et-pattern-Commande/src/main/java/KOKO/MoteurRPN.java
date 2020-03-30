package KOKO;
import java.util.Stack;
/**
*classe MoteurRPN.
*Le but de cette classe est :
*Enregistrement d'une opérande,
*Appliquer une opération sur les opérandes,
*Return lliste des Operandes dans la pile.
* @author Koussaila HAMMOUCHE.
*/
public class MoteurRPN extends Interpreteur {
	/**
	 * constructeur de la classe MoteurRPN.
	 * Elle appel au constructeur de la classe interpreteur avec super
	 * */
	public MoteurRPN() {
		super();
	}
	/**
	 * méthode enregistrerOperande.
	 * elle nous permet enregestrer l'operande et
	 * de grader la trace dans la operandesPrecedent
	 * @param val opérande
	 * */
	public void enregistrerOperande(double val) {
		operandes.add(val);
		Stack<Double> temp = new Stack<Double>();
		temp.addAll(operandes);
		operandesPrecedent.add(temp);
	}
	/**
	 * méthode appliquerOperation.
	 * @throws ArithmeticException
	 * elle nous permet d'effectuer une operation de calcule entre deux
	 * operande grace a la methode eval
	 * si il  manque d'operandes pour effectuer l'operation une exception
	 * @param operation  operandes
	 * */
	public void appliquerOperation(Operations operation)
			throws ArithmeticException {
		if (operandes.size() >= 2) {
			double val1 = operandes.pop();
			double val2 = operandes.pop();
			operandes.add(operation.eval(val1, val2));
			Stack<Double> temp = new Stack<Double>();
			temp.addAll(operandes);
			operandesPrecedent.add(temp);
			} else {
				throw new ArithmeticException("pas assez d'operandes");
				}
		}
   /**
	 * methode listeOperandes.
	 * elle permet d'retourner la liste des oprerandes stockées dans la pile
	 * @return operandes de
	 * la pile
	 * */
	public Stack<Double> listeOperandes() {
				System.out.print("(");
				for (int i = 0; i < operandes.size(); i++) {
					if (i == operandes.size() - 1) {
						System.out.print(operandes.get(i));
						break;
					}
					System.out.print(operandes.get(i) + "|");
				}
				System.out.print(")");

			
		return operandes;
		}
	}
