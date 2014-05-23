import static org.junit.Assert.*;
import org.junit.Test;

public class LeftTest {

	@Test
	public void testLeftConstructor() {
		Left tested = null;
		tested = new Left(0);
		assertFalse("A 'Left' objektum nem jött létre.",tested == null);
	}
	
	@Test
	public void testGetAngleZeroValue() {
		Left zeroVal = new Left(0);
		assertEquals("Hibás adat tárolása 0 értékû paraméter esetén.",0,zeroVal.getAngle(),0);
	}
	
	@Test
	public void testGetAnglePozitiveValue() {
		Left pozVal = new Left(120.111);
		assertEquals("Hibás adat tárolása pozitív paraméter esetén.",120.111,pozVal.getAngle(),0);
	}
	
	@Test
	public void testGetAngleNegativeValue() {
		Left negVal = new Left(-0.9);
		assertEquals("Hibás adat tárolása negatív paraméter esetén.",-0.9,negVal.getAngle(),0);
	}
	
	@Test
	public void testDoItZeroValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(0);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány 0 fokos balra forgatáskor.",0,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItPozitiveValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(40);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány balra forgatáskor.",320,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItNegativeValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(-10);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány negatív értékû fokos balra forgatáskor.",10,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testDoItBiggerValue() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Left bigVal = new Left(380);
			bigVal.doIt(testTable);
			assertEquals("Hibás irány 380 fokos balra forgatáskor.",340,testTable.getIrany(),0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}
	
	@Test
	public void testToStringZeroValue() {
		Left zeroVal = new Left(0);
		assertEquals("Hibás output 0 paraméter esetén.","LEFT(0,00)",zeroVal.toString());
	}
	
	@Test
	public void testToStringNegativeZeroValue() {
		Left negZeroVal = new Left(-0);
		assertEquals("Hibás output -0 paraméter esetén.","LEFT(0,00)",negZeroVal.toString());
	}
	
	@Test
	public void testToStringPozitiveValue() {
		Left pozVal = new Left(15.255);
		assertEquals("Hibás output pozitív paraméter esetén.","LEFT(15,26)",pozVal.toString());
	}
	
	@Test
	public void testToStringNegativeValue() {
		Left negVal = new Left(-51.111);
		assertEquals("Hibás output negatív paraméter esetén.","LEFT(-51,11)",negVal.toString());
	}

}
