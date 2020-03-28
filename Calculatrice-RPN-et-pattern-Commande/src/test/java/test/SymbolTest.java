package test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import KOKO.MoteurRPN;
import KOKO.Operations;

public class SymbolTest {
	@Before
	public void initialize() {
		new MoteurRPN();

	}

	
	@Test
	public void testGetSymbolDIV() {
		Operations o = Operations.DIV;
		assertEquals(o.getSymbol(), '/');

	}
	@Test
	public void testGetSymbolMULT() {
		Operations o = Operations.MULT;
		assertEquals(o.getSymbol(), '*');

	}
	@Test
	public void testGetSymbolPLUS() {
		Operations o = Operations.PLUS;
		assertEquals(o.getSymbol(), '+');

	}
	@Test
	public void testGetSymbolMOINS() {
		Operations o = Operations.MOINS;
		assertEquals(o.getSymbol(), '-');

	}

}
