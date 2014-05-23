import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.RajzTabla} osztály reprezentálja a rajztáblákat.
 * Egy {@link rajzGep.RajzTabla} példány egy rajztáblát ír le.
 */
public class RajzTabla {
	
	/**
	 * A kar pozíciója az x-tengely mentén.
	 */
	private int X;
	
	/**
	 * A kar pozíciója az y-tengely mentén.
	 */
	private int Y;
	
	/**
	 * A toll iránya.
	 */
	private double irany;
	
	/**
	 * Rajzolás állapota, {@code true}: rajzolunk a táblára, {@code false}: nem rajzolunk a táblára.
	 */
	private boolean rajzolhat;
	
	/**
	 * XML feldolgozást végzõ objektum.
	 */
	private ProgramParser parser = null;
	
	/**
	 * Az osztály konstruktora.
	 * Inicializálja a rajztáblát és létrehozza a hozzá tartozó XML feldolgozót, amely a
	 * paraméterként kapott XML fájlból olvassa ki a rajztáblán végrehajtandó parancsokat. 
	 * 
	 * @param fajl a rajztáblához tartozó XML fájl elérési útvonala.
	 * @throws ParserConfigurationException Hibásan van konfigurálva az XML feldolgozó.
	 * @throws SAXException Hiba következett be az XML feldolgozásakor.
	 * @throws IOException A fájl nem megfelelõ!
	 */	
	public RajzTabla(String xmlFajl) throws ParserConfigurationException, SAXException, IOException {
		X = 250;
		Y = 250;
		irany = 0;
		rajzolhat = false;
		parser = new ProgramParser(xmlFajl);
	}
	
	/**
	 * Megadja, hogy a rajztábla karja hanyadik oszlopban áll.
	 * 
	 * @return a kar pozíciója az x-tengely mentén.
	 */
	public int getX() {
		return X;
	}
	
	/**
	 * Megadja, hogy a rajztábla karja hanyadik sorban áll.
	 * 
	 * @return a kar pozíciója az y-tengely mentén.
	 */
	public int getY() {
		return Y;
	}
	
	/**
	 * Megadja, hogy a rajztábla tolla melyik iránya néz.
	 * 
	 * @return a toll iránya.
	 */
	public double getIrany() {
		return irany;
	}
	
	/**
	 * Megadja, hogy elõre mozgáskor rajzolunk e a táblára.
	 * 
	 * @return {@code true}: rajzolunk a táblára, {@code false}: nem rajzolunk a táblára.
	 */
	public boolean getRajzolhat() {
		return rajzolhat;
	}
	
	/**
	 * Visszaadja az XML feldolgozást végzõ objektumot.
	 * 
	 * @return XML feldolgozó.
	 */
	public ProgramParser getParser() {
		return parser;
	}
	
	/**
	 * Beállítja a kar helyzetét a rajztáblán.
	 * 
	 * @param ujX a kar új helyzete az x-tengely mentén.
	 * @param ujY a kar új helyzete az y-tengely mentén.
	 */
	public void setKoordinatak(int ujX, int ujY) {
		X = ujX;
		Y = ujY;
	}
	
	/**
	 * Beállítja a toll új irányát.
	 * 
	 * @param ujIrany a toll új iránya.
	 */
	public void setIrany(double ujIrany) {
		irany = ujIrany;
	}
	
	/**
	 * Módosítja a rajzolás állapotát a rajztáblán.
	 * 
	 * @param valtoztat {@code true}: rajzolhatunk a táblára, {@code false}: nem rajzolhatunk a táblára.
	 */
	public void setRajzolhat(boolean valtoztat) {
		rajzolhat = valtoztat;
	}
	
	/**
	 * Végrehajtja a rajztáblán a feldolgozott parancsokat.
	 */
	public void vegrehajt() {
		for( Command muvelet : parser.getCommands() ) {
			muvelet.doIt(this);
		}
	}
	
	/**
	 * Visszatér a rajztáblához tartozó parancsok szöveges formájával.
	 * 
	 * @return a parancsok szöveges alakja.
	 */
	public String toString() {
        return parser.toString();
    }
	
}
