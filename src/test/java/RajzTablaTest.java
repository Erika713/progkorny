import static org.junit.Assert.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.Test;
import org.xml.sax.SAXException;


public class RajzTablaTest {

	@Test
	public void testRajzTabla() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertFalse( "A rajztábla nem jött létre!", tested == null );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testGetX() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertEquals( "A kar nincs megfelelõ x pozícióban!", 250, tested.getX(), 0 );
			tested.setKoordinatak(300, 300);
			assertEquals( "A kar nincs megfelelõ x pozícióban!", 300, tested.getX(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testGetY() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertEquals( "A kar nincs megfelelõ y pozícióban!", 250, tested.getY(), 0 );
			tested.setKoordinatak(300, 300);
			assertEquals( "A kar nincs megfelelõ y pozícióban!", 300, tested.getY(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testGetIrany() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertEquals( "A toll nem a megfelelõ irányba mutat!", 0, tested.getIrany(), 0 );
			tested.setIrany(30);
			assertEquals( "A toll nem a megfelelõ irányba mutat!", 30, tested.getIrany(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testGetRajzolhat() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertFalse( "A kar nincs felemelve!", tested.getRajzolhat() );
			tested.setRajzolhat(true);
			assertTrue( "A kar nincs leengedve!", tested.getRajzolhat() );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testGetParser() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertFalse( "Az XML feldolgozó nem jött létre!", tested.getParser() == null );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testSetKoordinatak() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			tested.setKoordinatak(300, 300);
			assertEquals( "A kar nincs megfelelõ x pozícióban!", 300, tested.getX(), 0 );
			assertEquals( "A kar nincs megfelelõ y pozícióban!", 300, tested.getY(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testSetIrany() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			tested.setIrany(100);
			assertEquals( "A toll nem a megfelelõ irányba mutat!", 100, tested.getIrany(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testSetRajzolhat() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			tested.setRajzolhat(false);
			assertFalse( "A kar nincs felemelve!", tested.getRajzolhat() );
			tested.setRajzolhat(true);
			assertTrue( "A kar nincs leengedve!", tested.getRajzolhat() );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testVegrehajt() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/doSomethingSerious.xml");
			assertEquals( "A kar nincs megfelelõ x pozícióban!", 250, tested.getX(), 0 );
			assertEquals( "A kar nincs megfelelõ y pozícióban!", 250, tested.getY(), 0 );
			tested.vegrehajt();
			assertEquals( "A kar nincs megfelelõ x pozícióban!", 210, tested.getX(), 0 );
			assertEquals( "A kar nincs megfelelõ y pozícióban!", 250, tested.getY(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

	@Test
	public void testToString() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/doSomething.xml");
			assertEquals( "Hibás output a parancsok listázása esetén!", "LEFT(90,24)\nFORWARD(20)\nRESET\n", tested.getParser().toString());
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}
	
	@Test
	public void testToStringEqualsParserToString() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/doSomething.xml");
			assertEquals( "A rajztábla és az XML feldolgozó outputja nem egyezik!", tested.toString(), tested.getParser().toString() );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hibásan van konfigurálva az XML feldolgozó!");
		}
		catch (SAXException e) {
			System.out.println("Hiba következett be az XML feldolgozásakor!");
		}
		catch (IOException e) {
			System.out.println("A fájl nem megfelelõ!");
		}
	}

}
