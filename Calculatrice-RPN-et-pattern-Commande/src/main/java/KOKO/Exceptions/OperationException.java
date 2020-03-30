/**
 *package des exceptions.
 */
package KOKO.Exceptions;
/**
 * class OperationException.
 * @see OperationException#OperationException()
 */
public class OperationException extends Exception {
	/**
	 *serialVersionUID.
	 */
	private static final long serialVersionUID = -242595565158838525L;
	/**
	 *constructeur de la classe.
	 */
	public OperationException() {
		super("pas assez d'operandes");
	}

}
