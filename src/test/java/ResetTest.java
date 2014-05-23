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
			assertEquals("A kar nem ker�lt az x = 250 poz�ci�ra!", 250, testTable.getX(), 0);
			assertEquals("A kar nem ker�lt az y = 250 poz�ci�ra!", 250, testTable.getY(), 0);
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}

	@Test
	public void testToStringNegativeValue() {
		Reset reset = new Reset();
		assertEquals("Hib�s output a kar alaphelyzetbe �ll�t�sakor.","RESET",reset.toString());
	}

}
