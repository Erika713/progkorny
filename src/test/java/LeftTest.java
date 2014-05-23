import static org.junit.Assert.*;
import org.junit.Test;

public class LeftTest {

	@Test
	public void testLeftConstructor() {
		Left tested = null;
		tested = new Left(0);
		assertFalse("A 'Left' objektum nem j�tt l�tre.",tested == null);
	}
	
	@Test
	public void testGetAngleZeroValue() {
		Left zeroVal = new Left(0);
		assertEquals("Hib�s adat t�rol�sa 0 �rt�k� param�ter eset�n.",0,zeroVal.getAngle(),0);
	}
	
	@Test
	public void testGetAnglePozitiveValue() {
		Left pozVal = new Left(120.111);
		assertEquals("Hib�s adat t�rol�sa pozit�v param�ter eset�n.",120.111,pozVal.getAngle(),0);
	}
	
	@Test
	public void testGetAngleNegativeValue() {
		Left negVal = new Left(-0.9);
		assertEquals("Hib�s adat t�rol�sa negat�v param�ter eset�n.",-0.9,negVal.getAngle(),0);
	}
	
	@Test
	public void testDoItZeroValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(0);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny 0 fokos balra forgat�skor.",0,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItPozitiveValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(40);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny balra forgat�skor.",320,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItNegativeValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(-10);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny negat�v �rt�k� fokos balra forgat�skor.",10,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItBiggerValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(380);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny 380 fokos balra forgat�skor.",340,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testToStringZeroValue() {
		Left zeroVal = new Left(0);
		assertEquals("Hib�s output 0 param�ter eset�n.","LEFT(0,00)",zeroVal.toString());
	}
	
	@Test
	public void testToStringNegativeZeroValue() {
		Left negZeroVal = new Left(-0);
		assertEquals("Hib�s output -0 param�ter eset�n.","LEFT(0,00)",negZeroVal.toString());
	}
	
	@Test
	public void testToStringPozitiveValue() {
		Left pozVal = new Left(15.255);
		assertEquals("Hib�s output pozit�v param�ter eset�n.","LEFT(15,26)",pozVal.toString());
	}
	
	@Test
	public void testToStringNegativeValue() {
		Left negVal = new Left(-51.111);
		assertEquals("Hib�s output negat�v param�ter eset�n.","LEFT(-51,11)",negVal.toString());
	}

}
