/**
 *package des exceptions.
 */
package KOKO.Exceptions;
/**
 * class ErreurSaisieException.
 * @see ErreurSaisieException#ErreurSaisieException()
 */
public class ErreurSaisieException extends Exception {
/**
	 *serialVersionUID.
	 */
	private static final long serialVersionUID = -7500440358432348737L;
	/**
	 * constructeur de la classe.
	 */
	public ErreurSaisieException() {
		super("Erreur de saisie.");
	}

}
