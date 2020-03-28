package test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import KOKO.Enregistrer;
import KOKO.MoteurRPN;
import KOKO.Operations;








public class OperationsTest {
	private MoteurRPN M;

	@Before
	public void initialize() {
		M = new MoteurRPN();

	}

	@Test
	public void testOperationplus() {
		double val1 = 10, val2 = 90;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.PLUS);
		assertTrue(M.listeOperandes().get(0) == 100);

	}

	@Test
	public void testOperationmoins() {
		double val1 = 10, val2 = 90;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.MOINS);
		assertTrue(M.listeOperandes().get(0) == 80);

	}

	@Test
	public void testOperationmult() {
		double val1 = 10, val2 = 90;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.MULT);
		assertTrue(M.listeOperandes().get(0) == 900);

	}

	@Test
	public void testOperationdiv() {
		double val1 = 10, val2 = 90;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.DIV);
		assertTrue(M.listeOperandes().get(0) == 9);

	}
	@Test
	public void TestRETOURNEROperandes() {
		assertEquals(M.listeOperandes().size(), 0);
	}	
	
	

	
	

	@Test
	public void TestAenregesterOperande() {
		double val1 = 10, val2 = 90,val3 = 50,val4 = 34;
		Enregistrer A=new Enregistrer(M,val2);
		Enregistrer B=new Enregistrer(M,val1);
		Enregistrer C=new Enregistrer(M,val3);
		Enregistrer D=new Enregistrer(M,val4);
		A.execute();
		B.execute();
		C.execute();
		D.execute();
		
		assertEquals(M.listeOperandes().size(), 4);
	}
	@Test
	public void TestAenregesterTETEOperande() {
		double val1 = 10, val2 = 90,val3 = 50,val4 = 34;
		Enregistrer A=new Enregistrer(M,val2);
		Enregistrer B=new Enregistrer(M,val1);
		Enregistrer C=new Enregistrer(M,val3);
		Enregistrer D=new Enregistrer(M,val4);
		A.execute();
		B.execute();
		C.execute();
		D.execute();
		assertTrue(M.listeOperandes().peek()== 34);
	}

}






