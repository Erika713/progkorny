import static org.junit.Assert.*;

import org.junit.Test;


public class ResetTest {

	@Test
	public void testDoIt() {
		RajzTabla testTable = null;
		try {
			testTable = new RajzTabla("src/test/doSomething.xml");
			Reset reset = new Reset();
			reset.doIt(testTable);
			assertFalse("A kar nem emelkedett fel!", testTable.getRajzolhat() );
			assertEquals("A kar nem került az x = 250 pozícióra!", 250, testTable.getX(), 0);
			assertEquals("A kar nem került az y = 250 pozícióra!", 250, testTable.getY(), 0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

	@Test
	public void testToStringNegativeValue() {
		Reset reset = new Reset();
		assertEquals("Hibás output a kar alaphelyzetbe állításakor.","RESET",reset.toString());
	}

}
