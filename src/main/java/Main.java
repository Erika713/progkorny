import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Main} osztály reprezentálja a teljes programot.
 */
public class Main {
	
	/**
	 * Megadja, hogy melyik rajztáblához tartoznak a mûveletek.
	 */
	private static RajzTabla tabla = null;	
	
	/**
	 * Ez a statikus eljárás a program belépési pontjának felel meg.
	 * 
	 * @param args a feldolgozandó XML fájl elérési útvonala.
	 * @throws ParserConfigurationException Hibásan van konfigurálva az XML feldolgozó.
	 * @throws SAXException Hiba következett be az XML feldolgozásakor.
	 * @throws IOException A fájl nem megfelelõ!
	 */
	public static void main(String[] args)
	{
		try {
			if( args.length == 1 ) {
				tabla = new RajzTabla(args[0]);
			} else {
				tabla = new RajzTabla("src/main/demo.xml");
			}
			System.out.print(tabla);
		} catch (ParserConfigurationException e) {
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
