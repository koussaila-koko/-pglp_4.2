/**
 *package des exceptions.
 */
package KOKO.Exceptions;
/**
 * class DivisionParZeroException.
 * c'est pour la division sur 0
 * @see DivisionParZeroException#DivisionParZeroException()
 */
public class DivisionParZeroException extends Exception {
	/**
	 *serialVersionUID.
	 */
	private static final long serialVersionUID = 3637787669963394788L;
	/**
	 * constructeur de la classe.
	 */
	public DivisionParZeroException() {
		super("denomitaur egal 0 ");
	}

}
