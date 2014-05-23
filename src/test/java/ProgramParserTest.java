import static org.junit.Assert.*;
import org.junit.Test;

public class ProgramParserTest {
	
	@Test
	public void testGetCommands() {
		ProgramParser testedPParser = null;
		try {
			testedPParser = new ProgramParser("src/test/doSomething.xml");
			assertFalse( testedPParser.getCommands() == null );
			assertTrue( "Nem megfelelõ számú tárolt érték!", testedPParser.getCommands().size() == 3 );
			assertEquals( "Hibásan tárolt érték az 1. indexen!", "LEFT(90,24)", testedPParser.getCommands().get(0).toString() );
			assertEquals( "Hibásan tárolt érték a 2. indexen!", "FORWARD(20)", testedPParser.getCommands().get(1).toString() );
			assertEquals( "Hibásan tárolt érték a 3. indexen!", "RESET", testedPParser.getCommands().get(2).toString() );
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

	@Test
	public void testProgramParser() {
		ProgramParser testedPParser = null;
		try {
			testedPParser = new ProgramParser("src/test/empty.xml");
			assertFalse( "Az XML feldolgozó nem jött létre!", testedPParser == null );
			assertFalse( "A parancsok listája nem jött létre!", testedPParser.getCommands() == null );
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

	@Test
	public void testToString() {
		ProgramParser testedPParser = null;
		try {
			testedPParser = new ProgramParser("src/test/doSomething.xml");
			assertEquals( "Hibás output a parancsok listázása esetén!", testedPParser.toString(), "LEFT(90,24)\nFORWARD(20)\nRESET\n");
		} catch (Exception e) {
			System.out.println("Hiba a tesztelõ xml fájl feldolgozásakor!");
		}
	}

}
