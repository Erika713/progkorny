import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.ProgramParser} osztály végzi el az XML feldolgozást.
 * Egy {@link rajzGep.ProgramParser} példány egy paraméterként kapott XML fájlt dolgoz fel.
 */
public class ProgramParser {

	/**
	 * Az objektum által feldolgozott XML fájlban leírt parancsok listája.
	 */
	private ArrayList<Command> parancsok = new ArrayList<Command>();
	
	/**
	 * A függvény visszaadja a feldolgozott XML fájlban leírt parancsok listáját.
	 * 
	 * @return parancsok listája.
	 */
	public ArrayList<Command> getCommands() {
		return parancsok;
	}

	/**
	 * Az osztály konstruktora.
	 * A paraméterként kapott XML fájlt dolgozza fel, amelyeket a
	 * {@link rajzGep.ProgramParser.parancsok} listába fûz fel.
	 * 
	 * @param fajl a feldolgozandó XML fájl elérési útvonala.
	 * @throws ParserConfigurationException Hibásan van konfigurálva az XML feldolgozó.
	 * @throws SAXException Hiba következett be az XML feldolgozásakor.
	 * @throws IOException A fájl nem megfelelõ!
	 */	
	public ProgramParser(String fajl) throws ParserConfigurationException, SAXException, IOException {
		File file = new File(fajl);
		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		Document doc = builder.parse(file);
		Node utasitasok = doc.getElementsByTagName("program").item(0);
		NodeList lepesek = utasitasok.getChildNodes();
		for (int i = 0; i < lepesek.getLength(); i++) {
			String lepes = lepesek.item(i).getNodeName();
			if (lepes == "up") {
				parancsok.add(new Up());
			} else if (lepes == "down") {
				parancsok.add(new Down());
			} else if (lepes == "left") {
				NamedNodeMap attributumok = lepesek.item(i).getAttributes();
				double angle = Double.valueOf(attributumok.item(0).getNodeValue());
				parancsok.add(new Left(angle));
			} else if (lepes == "right") {
				NamedNodeMap attributumok = lepesek.item(i).getAttributes();
				double angle = Double.valueOf(attributumok.item(0).getNodeValue());
				parancsok.add(new Right(angle));
			} else if (lepes == "forward") {
				NamedNodeMap attributumok = lepesek.item(i).getAttributes();
				int units = Integer.valueOf(attributumok.item(0).getNodeValue());
				parancsok.add(new Forward(units));
			} else if (lepes == "reset") {
				parancsok.add(new Reset());
			}
		}
	}
	
	/**
	 * A függvény visszatér a parancslista szöveges formájával.
	 * 
	 * @return parancsok szöveges formája.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Command parancs : parancsok) {
			sb.append(parancs + "\n");
		}
		return sb.toString();
	}

}
