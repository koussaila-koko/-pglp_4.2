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
		public double eval(double a,double b) {
			
			return a + b;
		}
	},
	
	/**
	*moins-.
	* */
	MOINS('-') {
		public double eval(double a,double b) {
			return a - b;
		}
	},
	/**
	*Multiplication*.
	* */
	MULT('*') {
		public double eval(double a,double b) {
			return a * b;
		}
	},
	/**
	*la division/.
	*Exception pour la division sur zero 0.
	* */
	DIV('/') {
		public double eval(double a,double b) throws ArithmeticException {
			if (b == 0)
				throw new ArithmeticException("denominateur egal 0");
			else
				return a / b;
			
		}
	};
	/**
	 * l’attribut symbole représente le symbole de l’opération (+, -, …​)
	 **/
	private char symbole;
	/**
	 * constructeur Operations.
	 * @param symbole
	 * le symbole de l’opération
	 **/

	Operations(char symbole){
		
		String symboles = "+-*/";
		if (symboles.indexOf(symbole)==-1)
			throw new IllegalArgumentException();
		else
			this.symbole = symbole;
	}
	/**
	 * methode getSymbol.
	 * @return symbole
	 * elle retourne le symbole de l'operation.
	 * */
	public char getSymbol(){
		return symbole;
	}
	/** 
	 * Methode eval.
	 * méthode abstraite qui nous permet de 
	 * retournele le résultat de l’évaluation de l’opération sur deux opérande
	 * @param val1 1er operand
	 * @param val2 2EME Operand
	 *exception si OperationException(manque operandes), div sur zero, MAX_VALUE,
	 *MIN_VALUE et ErreurSaisieException.
	 * */

	public abstract double eval(double val1, double val2) throws ArithmeticException;
}
