package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import KOKO.MoteurRPN;
import KOKO.Operations;

import KOKO.Exceptions.OperationException;


public class MoteurRPNTest {
	private MoteurRPN M;
	@Before
	public void initialize() {
		M = new MoteurRPN();
	}
	
	@Test
	public void testEnregistrerOperande() {
		double val1=1, val2=2,val3=3;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.enregistrerOperande(val3);
		M.enregistrerOperande(val2);
		assertEquals(M.listeOperandes().size(), 4);
	}
	

	@Test
	public void testGetOperandes() {
			M = new MoteurRPN();
			assertTrue(M.listeOperandes().isEmpty());
		}
	
	@Test
	public void TestresultOperationTETE() {
		double val1=5, val2=8,val3=6;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.enregistrerOperande(val3);
		assertTrue(M.listeOperandes().peek()== 6);
	}	

	
	
	@Test
	public void testAppliquerOperationplus() throws OperationException {
		double val1=5, val2=8;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.PLUS);
		assertTrue(M.listeOperandes().get(0)==13);
	}
	@Test
	public void TestresultOperationTETEcomposer() {
		double val1=5, val2=8,val3=6;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.PLUS);
		M.enregistrerOperande(val3);
		assertTrue(M.listeOperandes().peek()== 6);
	}	
	@Test
	public void testAppliquerOperationmoins() throws OperationException {
		double val1=5, val2=-8;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.MOINS);
		assertTrue(M.listeOperandes().get(0)==-13);
	}
	@Test
	public void testAppliquerOperationmult() throws OperationException {
		double val1=5, val2=8;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.MULT);
		assertTrue(M.listeOperandes().get(0)==40);
	}	@Test
	public void testAppliquerOperationDIV() throws OperationException {
		double val1=8, val2=-40;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.DIV);
		assertTrue(M.listeOperandes().get(0)==-5);
	}
	@Test
	public void testAppliquerOperationRZEROdiv() throws OperationException {
		double val1=8, val2=0;
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.DIV);
		assertTrue(M.listeOperandes().get(0)==0);
	}
	@Test
	public void testAppliquerOperationCompisition() throws OperationException {
		double val1=10, val2=6,val3=1, val4=4;
		M.enregistrerOperande(val3);
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.enregistrerOperande(val3);
		M.enregistrerOperande(val4);
		M.appliquerOperation(Operations.DIV);
		M.appliquerOperation(Operations.PLUS);
		M.appliquerOperation(Operations.MULT);
		M.appliquerOperation(Operations.MOINS);
		
		assertTrue(M.listeOperandes().get(0)==99);
	}
	@Test
	public void testAppliquerOperationPosition() throws OperationException {
		double val1=10, val2=6,val3=1, val4=4;
		M.enregistrerOperande(val3);
		M.enregistrerOperande(val1);
		M.enregistrerOperande(val2);
		M.enregistrerOperande(val3);
		M.enregistrerOperande(val4);
		M.appliquerOperation(Operations.DIV);
		M.appliquerOperation(Operations.PLUS);
		M.appliquerOperation(Operations.MULT);
		M.appliquerOperation(Operations.MOINS);
 
		//assertTrue(M.listeOperandes().get(1)==100);
		assertTrue(M.listeOperandes().get(0)==99);
		
		M.enregistrerOperande(val3);
		M.enregistrerOperande(val2);
		M.appliquerOperation(Operations.PLUS);
		M.appliquerOperation(Operations.PLUS);
		assertTrue(M.listeOperandes().get(0)==106);
		
		//assertTrue(M.listeOperandes().get(4)==4);
		//assertTrue(M.listeOperandes().get(3)==10);
		
		
	}
	


	

	

}
