package test;



import org.junit.Test;



import org.junit.Before;


import KOKO.MoteurRPN;
import KOKO.Operations;

public class ExceptionTest {
	private MoteurRPN M;

	@Before
	public void initialize() {
		M = new MoteurRPN();

	}

	
	// On test si le Moteur verifie bien qu'on a pas assez d'operandes
			@Test(expected = ArithmeticException.class)
			public void testEnregistrerOperandeException() {

				double val1 = 3;
				M.enregistrerOperande(val1);

				M.appliquerOperation(Operations.MULT);

			}
			 
			
			@Test (expected = Exception.class)
			public void TestDivisionSurZeroO(){
				
				double val1=77,val2=0;
				M.enregistrerOperande(val2);
				M.enregistrerOperande(val1);
				M.appliquerOperation(Operations.DIV);
			}
			
			
		//	@Test (expected = ArithmeticException.class)
			//public void TestINTERVAL(){
				
		//		double val1=35464677;
				
		//		M.enregistrerOperande(val1);
			
			//}
			
			
			@Test(expected = ArithmeticException.class)
			public void testappliquerOperationException() {
				M.appliquerOperation(Operations.MOINS);
			}

			@Test(expected = ArithmeticException.class)
			public void testAPPLIQUERException() {
				M.enregistrerOperande(5);
				M.appliquerOperation(Operations.MOINS);
				}
			
			
		
			
			
}
