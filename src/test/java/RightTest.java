import static org.junit.Assert.*;
import org.junit.Test;

public class RightTest {

	@Test
	public void testRightConstructor() {
		Right tested = null;
		tested = new Right(0);
		assertFalse("A 'Right' objektum nem jött létre.",tested == null);
	}
	
	@Test
	public void testGetAngleZeroValue() {
		Right zeroVal = new Right(0);
		assertEquals("Hibás adat tárolása 0 értékû paraméter esetén.",0,zeroVal.getAngle(),0);
	}
	
	@Test
	public void testGetAnglePozitiveValue() {
		Right pozVal = new Right(120.111);
		assertEquals("Hibás adat tárolása pozitív paraméter esetén.",120.111,pozVal.getAngle(),0);
	}
	
	@Test
	public void testGetAngleNegativeValue() {
		Right negVal = new Right(-0.9);
		assertEquals("Hibás adat tárolása negatív paraméter esetén.",-0.9,negVal.getAngle(),0);
	}
	
	@Test
	public void testDoItZeroValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(0);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány 0 fokos jobbra forgatáskor.",0,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItPozitiveValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(40);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány jobbra forgatáskor.",40,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItNegativeValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(-10);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány negatív értékû fokos jobbra forgatáskor.",350,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItBiggerValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Right bigVal = new Right(380);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány 380 fokos jobbra forgatáskor.",20,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testToStringZeroValue() {
		Right zeroVal = new Right(0);
		assertEquals("Hibás output 0 paraméter esetén.","RIGHT(0,00)",zeroVal.toString());
	}
	
	@Test
	public void testToStringNegativeZeroValue() {
		Right negZeroVal = new Right(-0);
		assertEquals("Hibás output -0 paraméter esetén.","RIGHT(0,00)",negZeroVal.toString());
	}
	
	@Test
	public void testToStringPozitiveValue() {
		Right pozVal = new Right(15.255);
		assertEquals("Hibás output pozitív paraméter esetén.","RIGHT(15,26)",pozVal.toString());
	}
	
	@Test
	public void testToStringNegativeValue() {
		Right negVal = new Right(-51.111);
		assertEquals("Hibás output negatív paraméter esetén.","RIGHT(-51,11)",negVal.toString());
	}

}