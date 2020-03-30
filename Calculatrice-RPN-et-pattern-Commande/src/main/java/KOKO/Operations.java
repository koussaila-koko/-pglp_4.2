package KOKO;
/**
*enum Operations.
*les constantes PLUS, MOINS, MULT et DIV,
* @author Koussaila HAMMOUCHE
* */
public enum Operations {
	/**
	*plus+.
	* */
	PLUS('+') {
		/**
		*eval.
		*@param a .
		*@param b .
		*@return a + b .
		*@see Operations#Operations(val1,val2)
		* */
		public double eval(double a, double b) {
			return a + b;
		}
	},
	/**
	 *moins-.
	 * */
	MOINS('-') {
		/**
		 *eval.
		 *@see Operations#Operations(val1,val2)
		 *@param a .
		 *@param b .
		 *moins-.
		 *@return a - b .
		 * */
		public double eval(double a, double b) {
			return a - b;
		}
	},
	/**
	*Multiplication*.
	* */
	MULT('*') {
		/**
		 *eval*.
		 *@see Operations#Operations(val1,val2)
		 *@param a .
		 *@param b .
		 *@return a * b .
		 * */
		public double eval(double a, double b) {
			return a * b;
		}
	},
	/**
	*la division/.
	* */
	DIV('/') {
		/**
		 *eval/.
		 *@see Operations#Operations(val1,val2)
		 *@param a .
		 *@param b .
		 *@return a / b .
		 *@throws ArithmeticException
		 *Exception pour la division sur zero 0.
		 * */
		public double eval(double a, double b)
				throws ArithmeticException {
			if (b == 0) {
				throw new ArithmeticException
				("denominateur egal 0");
				} else {
				return a / b;
				}
		}
	};
	/**
	 * l’attribut symbole représente le symbole de l’opération (+, -, …​).
	 **/
	private char symbole;
	/**
	 * constructeur Operations.
	 * @param symbole
	 * le symbole de l’opération
	 * @throws IllegalArgumentException.
	 * exception
	 **/
	Operations(char symbole) {
		String symboles = "+-*/";
		if (symboles.indexOf(symbole) == -1) {
			throw new IllegalArgumentException();
			} else {
			this.symbole = symbole;
			}
		}
	/**
	 * methode getSymbol.
	 * @return symbole
	 * elle retourne le symbole de l'operation.
	 * */
	public char getSymbol() {
		return symbole;
	}
	/**
	 * Methode eval.
	 * méthode abstraite qui nous permet de
	 * retournele le résultat de l’évaluation,
	 * de l’opération sur deux opérande
	 * @param val1 1er operand
	 * @param val2 2EME Operand
	 * @throws ArithmeticException .
	 * @return eval
	 *exception
	 * */
	public abstract double eval(double val1, double val2)
			throws ArithmeticException;
}
