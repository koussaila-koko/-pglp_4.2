/**
 *package des exceptions.
 */
package KOKO.Exceptions;
/**
 * class IntervaleException.
 * @see IntervaleException#IntervaleException()
 */
public class IntervaleException extends Exception {
/**
	 *serialVersionUID.
	 */
private static final long serialVersionUID = 7032173410409565137L;
	/**
	 *constructeur de la classe.
	 */
	public IntervaleException() {
		super("opreandes non inclus dans l'intervalle ");
	}

}