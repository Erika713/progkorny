import static org.junit.Assert.*;
import org.junit.Test;

public class ProgramParserTest {
	
	@Test
	public void testGetCommands() {
		ProgramParser testedPParser = null;
		try {
			testedPParser = new ProgramParser("src/test/doSomething.xml");
			assertFalse( testedPParser.getCommands() == null );
			assertTrue( "Nem megfelel� sz�m� t�rolt �rt�k!", testedPParser.getCommands().size() == 3 );
			assertEquals( "Hib�san t�rolt �rt�k az 1. indexen!", "LEFT(90,24)", testedPParser.getCommands().get(0).toString() );
			assertEquals( "Hib�san t�rolt �rt�k a 2. indexen!", "FORWARD(20)", testedPParser.getCommands().get(1).toString() );
			assertEquals( "Hib�san t�rolt �rt�k a 3. indexen!", "RESET", testedPParser.getCommands().get(2).toString() );
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}

	@Test
	public void testProgramParser() {
		ProgramParser testedPParser = null;
		try {
			testedPParser = new ProgramParser("src/test/empty.xml");
			assertFalse( "Az XML feldolgoz� nem j�tt l�tre!", testedPParser == null );
			assertFalse( "A parancsok list�ja nem j�tt l�tre!", testedPParser.getCommands() == null );
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}

	@Test
	public void testToString() {
		ProgramParser testedPParser = null;
		try {
			testedPParser = new ProgramParser("src/test/doSomething.xml");
			assertEquals( "Hib�s output a parancsok list�z�sa eset�n!", testedPParser.toString(), "LEFT(90,24)\nFORWARD(20)\nRESET\n");
		} catch (Exception e) {
			System.out.println("Hiba a tesztel� xml f�jl feldolgoz�sakor!");
		}
	}

}
