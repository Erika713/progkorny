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
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}

	@Test
	public void testToStringNegativeValue() {
		Up up = new Up();
		assertEquals("Hib�s output kar felemel�s eset�n.","UP",up.toString());
	}

}
