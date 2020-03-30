/**
 * package des classes,interfces et enum
 */
package KOKO;
/**
*enum CalculatriceRPN.
* @author Koussaila_HAMMOUCHE.
*/
public enum CalculatriceRPN {
	/**
	 * le CALCULRPN.
	 * */
	CALCULRPN;
	/**
	 * methode start .
	 *  @param args .
	 * */
	public void start(String[] args) {
		SaisieRPN sa = new SaisieRPN();
		sa.saisie();
		}
	/**
	 * le main.
	 * @param args .
	 * */
	public static void main(String[] args) {
		CALCULRPN.start(args);
	}
}
