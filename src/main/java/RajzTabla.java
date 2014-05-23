import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.RajzTabla} oszt�ly reprezent�lja a rajzt�bl�kat.
 * Egy {@link rajzGep.RajzTabla} p�ld�ny egy rajzt�bl�t �r le.
 */
public class RajzTabla {
	
	/**
	 * A kar poz�ci�ja az x-tengely ment�n.
	 */
	private int X;
	
	/**
	 * A kar poz�ci�ja az y-tengely ment�n.
	 */
	private int Y;
	
	/**
	 * A toll ir�nya.
	 */
	private double irany;
	
	/**
	 * Rajzol�s �llapota, {@code true}: rajzolunk a t�bl�ra, {@code false}: nem rajzolunk a t�bl�ra.
	 */
	private boolean rajzolhat;
	
	/**
	 * XML feldolgoz�st v�gz� objektum.
	 */
	private ProgramParser parser = null;
	
	/**
	 * Az oszt�ly konstruktora.
	 * Inicializ�lja a rajzt�bl�t �s l�trehozza a hozz� tartoz� XML feldolgoz�t, amely a
	 * param�terk�nt kapott XML f�jlb�l olvassa ki a rajzt�bl�n v�grehajtand� parancsokat. 
	 * 
	 * @param fajl a rajzt�bl�hoz tartoz� XML f�jl el�r�si �tvonala.
	 * @throws ParserConfigurationException Hib�san van konfigur�lva az XML feldolgoz�.
	 * @throws SAXException Hiba k�vetkezett be az XML feldolgoz�sakor.
	 * @throws IOException A f�jl nem megfelel�!
	 */	
	public RajzTabla(String xmlFajl) throws ParserConfigurationException, SAXException, IOException {
		X = 250;
		Y = 250;
		irany = 0;
		rajzolhat = false;
		parser = new ProgramParser(xmlFajl);
	}
	
	/**
	 * Megadja, hogy a rajzt�bla karja hanyadik oszlopban �ll.
	 * 
	 * @return a kar poz�ci�ja az x-tengely ment�n.
	 */
	public int getX() {
		return X;
	}
	
	/**
	 * Megadja, hogy a rajzt�bla karja hanyadik sorban �ll.
	 * 
	 * @return a kar poz�ci�ja az y-tengely ment�n.
	 */
	public int getY() {
		return Y;
	}
	
	/**
	 * Megadja, hogy a rajzt�bla tolla melyik ir�nya n�z.
	 * 
	 * @return a toll ir�nya.
	 */
	public double getIrany() {
		return irany;
	}
	
	/**
	 * Megadja, hogy el�re mozg�skor rajzolunk e a t�bl�ra.
	 * 
	 * @return {@code true}: rajzolunk a t�bl�ra, {@code false}: nem rajzolunk a t�bl�ra.
	 */
	public boolean getRajzolhat() {
		return rajzolhat;
	}
	
	/**
	 * Visszaadja az XML feldolgoz�st v�gz� objektumot.
	 * 
	 * @return XML feldolgoz�.
	 */
	public ProgramParser getParser() {
		return parser;
	}
	
	/**
	 * Be�ll�tja a kar helyzet�t a rajzt�bl�n.
	 * 
	 * @param ujX a kar �j helyzete az x-tengely ment�n.
	 * @param ujY a kar �j helyzete az y-tengely ment�n.
	 */
	public void setKoordinatak(int ujX, int ujY) {
		X = ujX;
		Y = ujY;
	}
	
	/**
	 * Be�ll�tja a toll �j ir�ny�t.
	 * 
	 * @param ujIrany a toll �j ir�nya.
	 */
	public void setIrany(double ujIrany) {
		irany = ujIrany;
	}
	
	/**
	 * M�dos�tja a rajzol�s �llapot�t a rajzt�bl�n.
	 * 
	 * @param valtoztat {@code true}: rajzolhatunk a t�bl�ra, {@code false}: nem rajzolhatunk a t�bl�ra.
	 */
	public void setRajzolhat(boolean valtoztat) {
		rajzolhat = valtoztat;
	}
	
	/**
	 * V�grehajtja a rajzt�bl�n a feldolgozott parancsokat.
	 */
	public void vegrehajt() {
		for( Command muvelet : parser.getCommands() ) {
			muvelet.doIt(this);
		}
	}
	
	/**
	 * Visszat�r a rajzt�bl�hoz tartoz� parancsok sz�veges form�j�val.
	 * 
	 * @return a parancsok sz�veges alakja.
	 */
	public String toString() {
        return parser.toString();
    }
	
}
