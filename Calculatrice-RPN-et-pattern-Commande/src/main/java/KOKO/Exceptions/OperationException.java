package KOKO.Exceptions;

public class OperationException extends Exception {
	
	private static final long serialVersionUID = -242595565158838525L;

	public OperationException() {
		super("verifier vos operande (pas asez d'operandes pour effectuer l'operation) ");
	}

}
