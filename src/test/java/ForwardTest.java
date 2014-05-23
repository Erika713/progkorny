import static org.junit.Assert.*;

import org.junit.Test;


public class ForwardTest {

	@Test
	public void testForwardConstructor() {
		Forward tested = null;
		tested = new Forward(0);
		assertFalse("A 'Forward' objektum nem j�tt l�tre.",tested == null);
	}
	
	@Test
	public void testGetAngleZeroValue() {
		Forward zeroVal = new Forward(0);
		assertEquals("Hib�s adat t�rol�sa 0 �rt�k� param�ter eset�n.",0,zeroVal.getUnits(),0);
	}
	
	@Test
	public void testGetAnglePozitiveValue() {
		Forward pozVal = new Forward(120);
		assertEquals("Hib�s adat t�rol�sa pozit�v param�ter eset�n.",120,pozVal.getUnits(),0);
	}
	
	@Test
	public void testGetAngleNegativeValue() {
		Forward negVal = new Forward(-9);
		assertEquals("Hib�s adat t�rol�sa negat�v param�ter eset�n.",-9,negVal.getUnits(),0);
	}
	
	@Test
	public void testDoItZeroValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Forward zeroVal = new Forward(0);
			zeroVal.doIt(testTable);
			assertEquals("Hib�s x poz�ci� el�re mozg�skor.",250,testTable.getX(),0);
			assertEquals("Hib�s y poz�ci� el�re mozg�skor.",250,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItPozitiveValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Forward pozVal = new Forward(10);
			pozVal.doIt(testTable);
			assertEquals("Hib�s x poz�ci� el�re mozg�skor.",250,testTable.getX(),0);
			assertEquals("Hib�s y poz�ci� el�re mozg�skor.",240,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItNegativeValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Forward negVal = new Forward(-10);
			negVal.doIt(testTable);
			assertEquals("Hib�s x poz�ci� el�re mozg�skor.",250,testTable.getX(),0);
			assertEquals("Hib�s y poz�ci� el�re mozg�skor.",260,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
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
			assertEquals("Hib�s x poz�ci� el�re mozg�skor.",260,testTable.getX(),0);
			assertEquals("Hib�s y poz�ci� el�re mozg�skor.",250,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
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
			assertEquals("Hib�s x poz�ci� el�re mozg�skor.",260,testTable.getX(),0);
			assertEquals("Hib�s y poz�ci� el�re mozg�skor.",250,testTable.getY(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}

	@Test
	public void testToStringZeroValue() {
		Forward zeroVal = new Forward(0);
		assertEquals("Hib�s output 0 param�ter eset�n.","FORWARD(0)",zeroVal.toString());
	}
	
	@Test
	public void testToStringNegativeZeroValue() {
		Forward negZeroVal = new Forward(-0);
		assertEquals("Hib�s output -0 param�ter eset�n.","FORWARD(0)",negZeroVal.toString());
	}
	
	@Test
	public void testToStringPozitiveValue() {
		Forward pozVal = new Forward(15);
		assertEquals("Hib�s output pozit�v param�ter eset�n.","FORWARD(15)",pozVal.toString());
	}
	
	@Test
	public void testToStringNegativeValue() {
		Forward negVal = new Forward(-51);
		assertEquals("Hib�s output negat�v param�ter eset�n.","FORWARD(-51)",negVal.toString());
	}

}
