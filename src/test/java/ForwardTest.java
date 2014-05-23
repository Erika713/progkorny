import static org.junit.Assert.*;

import org.junit.Test;


public class ForwardTest {

	@Test
	public void testForwardConstructor() {
		Forward tested = null;
		tested = new Forward(0);
		assertFalse("A 'Forward' objektum nem jött létre.",tested == null);
	}
	
	@Test
	public void testGetAngleZeroValue() {
		Forward zeroVal = new Forward(0);
		assertEquals("Hibás adat tárolása 0 értékû paraméter esetén.",0,zeroVal.getUnits(),0);
	}
	
	@Test
	public void testGetAnglePozitiveValue() {
		Forward pozVal = new Forward(120);
		assertEquals("Hibás adat tárolása pozitív paraméter esetén.",120,pozVal.getUnits(),0);
	}
	
	@Test
	public void testGetAngleNegativeValue() {
		Forward negVal = new Forward(-9);
		assertEquals("Hibás adat tárolása negatív paraméter esetén.",-9,negVal.getUnits(),0);
	}
	
	@Test
	public void testDoItZeroValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Forward zeroVal = new Forward(0);
			zeroVal.doIt(testTable);
			assertEquals("Hibás x pozíció elõre mozgáskor.",250,testTable.getX(),0);
			assertEquals("Hibás y pozíció elõre mozgáskor.",250,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItPozitiveValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Forward pozVal = new Forward(10);
			pozVal.doIt(testTable);
			assertEquals("Hibás x pozíció elõre mozgáskor.",250,testTable.getX(),0);
			assertEquals("Hibás y pozíció elõre mozgáskor.",240,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItNegativeValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Forward negVal = new Forward(-10);
			negVal.doIt(testTable);
			assertEquals("Hibás x pozíció elõre mozgáskor.",250,testTable.getX(),0);
			assertEquals("Hibás y pozíció elõre mozgáskor.",260,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItComboPozValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right pozVal = new Right(90);
			pozVal.doIt(testTable);
			Forward negVal = new Forward(10);
			negVal.doIt(testTable);
			assertEquals("Hibás x pozíció elõre mozgáskor.",260,testTable.getX(),0);
			assertEquals("Hibás y pozíció elõre mozgáskor.",250,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItComboNegValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left pozVal = new Left(90);
			pozVal.doIt(testTable);
			Forward negVal = new Forward(-10);
			negVal.doIt(testTable);
			assertEquals("Hibás x pozíció elõre mozgáskor.",260,testTable.getX(),0);
			assertEquals("Hibás y pozíció elõre mozgáskor.",250,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

	@Test
	public void testToStringZeroValue() {
		Forward zeroVal = new Forward(0);
		assertEquals("Hibás output 0 paraméter esetén.","FORWARD(0)",zeroVal.toString());
	}
	
	@Test
	public void testToStringNegativeZeroValue() {
		Forward negZeroVal = new Forward(-0);
		assertEquals("Hibás output -0 paraméter esetén.","FORWARD(0)",negZeroVal.toString());
	}
	
	@Test
	public void testToStringPozitiveValue() {
		Forward pozVal = new Forward(15);
		assertEquals("Hibás output pozitív paraméter esetén.","FORWARD(15)",pozVal.toString());
	}
	
	@Test
	public void testToStringNegativeValue() {
		Forward negVal = new Forward(-51);
		assertEquals("Hibás output negatív paraméter esetén.","FORWARD(-51)",negVal.toString());
	}

}
