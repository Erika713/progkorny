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
			assertFalse( "A rajzt�bla nem j�tt l�tre!", tested == null );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testGetX() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertEquals( "A kar nincs megfelel� x poz�ci�ban!", 250, tested.getX(), 0 );
			tested.setKoordinatak(300, 300);
			assertEquals( "A kar nincs megfelel� x poz�ci�ban!", 300, tested.getX(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testGetY() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertEquals( "A kar nincs megfelel� y poz�ci�ban!", 250, tested.getY(), 0 );
			tested.setKoordinatak(300, 300);
			assertEquals( "A kar nincs megfelel� y poz�ci�ban!", 300, tested.getY(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testGetIrany() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertEquals( "A toll nem a megfelel� ir�nyba mutat!", 0, tested.getIrany(), 0 );
			tested.setIrany(30);
			assertEquals( "A toll nem a megfelel� ir�nyba mutat!", 30, tested.getIrany(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
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
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testGetParser() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			assertFalse( "Az XML feldolgoz� nem j�tt l�tre!", tested.getParser() == null );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testSetKoordinatak() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			tested.setKoordinatak(300, 300);
			assertEquals( "A kar nincs megfelel� x poz�ci�ban!", 300, tested.getX(), 0 );
			assertEquals( "A kar nincs megfelel� y poz�ci�ban!", 300, tested.getY(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testSetIrany() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/empty.xml");
			tested.setIrany(100);
			assertEquals( "A toll nem a megfelel� ir�nyba mutat!", 100, tested.getIrany(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
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
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testVegrehajt() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/doSomethingSerious.xml");
			assertEquals( "A kar nincs megfelel� x poz�ci�ban!", 250, tested.getX(), 0 );
			assertEquals( "A kar nincs megfelel� y poz�ci�ban!", 250, tested.getY(), 0 );
			tested.vegrehajt();
			assertEquals( "A kar nincs megfelel� x poz�ci�ban!", 210, tested.getX(), 0 );
			assertEquals( "A kar nincs megfelel� y poz�ci�ban!", 250, tested.getY(), 0 );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

	@Test
	public void testToString() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/doSomething.xml");
			assertEquals( "Hib�s output a parancsok list�z�sa eset�n!", "LEFT(90,24)\nFORWARD(20)\nRESET\n", tested.getParser().toString());
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}
	
	@Test
	public void testToStringEqualsParserToString() {
		RajzTabla tested = null;
		try {
			tested = new RajzTabla("src/test/doSomething.xml");
			assertEquals( "A rajzt�bla �s az XML feldolgoz� outputja nem egyezik!", tested.toString(), tested.getParser().toString() );
		}
		catch (ParserConfigurationException e) {
			System.out.println("Hib�san van konfigur�lva az XML feldolgoz�!");
		}
		catch (SAXException e) {
			System.out.println("Hiba k�vetkezett be az XML feldolgoz�sakor!");
		}
		catch (IOException e) {
			System.out.println("A f�jl nem megfelel�!");
		}
	}

}
