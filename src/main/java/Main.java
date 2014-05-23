import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Main} oszt�ly reprezent�lja a teljes programot.
 */
public class Main {
	
	/**
	 * Megadja, hogy melyik rajzt�bl�hoz tartoznak a m�veletek.
	 */
	private static RajzTabla tabla = null;	
	
	/**
	 * Ez a statikus elj�r�s a program bel�p�si pontj�nak felel meg.
	 * 
	 * @param args a feldolgozand� XML f�jl el�r�si �tvonala.
	 * @throws ParserConfigurationException Hib�san van konfigur�lva az XML feldolgoz�.
	 * @throws SAXException Hiba k�vetkezett be az XML feldolgoz�sakor.
	 * @throws IOException A f�jl nem megfelel�!
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
