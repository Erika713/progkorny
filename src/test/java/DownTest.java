import static org.junit.Assert.*;

import org.junit.Test;


public class DownTest {

	@Test
	public void testDoIt() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/empty.xml");
			Down down = new Down();
			down.doIt(testTable);
			assertTrue("A kar nem emelkedett le!", testTable.getRajzolhat() );
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

	@Test
	public void testToStringNegativeValue() {
		Down down = new Down();
		assertEquals("Hibás output kar leengedés esetén.","DOWN",down.toString());
	}

}
