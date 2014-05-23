import static org.junit.Assert.*;

import org.junit.Test;


public class UpTest {

	@Test
	public void testDoIt() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Up up = new Up();
			up.doIt(testTable);
			assertFalse("A kar nem emelkedett fel!", testTable.getRajzolhat() );
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

	@Test
	public void testToStringNegativeValue() {
		Up up = new Up();
		assertEquals("Hibás output kar felemelés esetén.","UP",up.toString());
	}

}
