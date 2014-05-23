import static org.junit.Assert.*;
import org.junit.Test;

public class RightTest {

	@Test
	public void testRightConstructor() {
		Right tested = null;
		tested = new Right(0);
		assertFalse("A 'Right' objektum nem j�tt l�tre.",tested == null);
	}
	
	@Test
	public void testGetAngleZeroValue() {
		Right zeroVal = new Right(0);
		assertEquals("Hib�s adat t�rol�sa 0 �rt�k� param�ter eset�n.",0,zeroVal.getAngle(),0);
	}
	
	@Test
	public void testGetAnglePozitiveValue() {
		Right pozVal = new Right(120.111);
		assertEquals("Hib�s adat t�rol�sa pozit�v param�ter eset�n.",120.111,pozVal.getAngle(),0);
	}
	
	@Test
	public void testGetAngleNegativeValue() {
		Right negVal = new Right(-0.9);
		assertEquals("Hib�s adat t�rol�sa negat�v param�ter eset�n.",-0.9,negVal.getAngle(),0);
	}
	
	@Test
	public void testDoItZeroValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(0);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny 0 fokos jobbra forgat�skor.",0,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItPozitiveValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(40);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny jobbra forgat�skor.",40,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItNegativeValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(-10);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny negat�v �rt�k� fokos jobbra forgat�skor.",350,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testDoItBiggerValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(380);
			bigVal.doIt(testTable);
			assertEquals("Hib�s ir�ny 380 fokos jobbra forgat�skor.",20,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}
	
	@Test
	public void testToStringZeroValue() {
		Right zeroVal = new Right(0);
		assertEquals("Hib�s output 0 param�ter eset�n.","RIGHT(0,00)",zeroVal.toString());
	}
	
	@Test
	public void testToStringNegativeZeroValue() {
		Right negZeroVal = new Right(-0);
		assertEquals("Hib�s output -0 param�ter eset�n.","RIGHT(0,00)",negZeroVal.toString());
	}
	
	@Test
	public void testToStringPozitiveValue() {
		Right pozVal = new Right(15.255);
		assertEquals("Hib�s output pozit�v param�ter eset�n.","RIGHT(15,26)",pozVal.toString());
	}
	
	@Test
	public void testToStringNegativeValue() {
		Right negVal = new Right(-51.111);
		assertEquals("Hib�s output negat�v param�ter eset�n.","RIGHT(-51,11)",negVal.toString());
	}

}