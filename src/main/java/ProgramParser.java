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
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.ProgramParser} oszt�ly v�gzi el az XML feldolgoz�st.
 * Egy {@link rajzGep.ProgramParser} p�ld�ny egy param�terk�nt kapott XML f�jlt dolgoz fel.
 */
public class ProgramParser {

	/**
	 * Az objektum �ltal feldolgozott XML f�jlban le�rt parancsok list�ja.
	 */
	private ArrayList<Command> parancsok = new ArrayList<Command>();
	
	/**
	 * A f�ggv�ny visszaadja a feldolgozott XML f�jlban le�rt parancsok list�j�t.
	 * 
	 * @return parancsok list�ja.
	 */
	public ArrayList<Command> getCommands() {
		return parancsok;
	}

	/**
	 * Az oszt�ly konstruktora.
	 * A param�terk�nt kapott XML f�jlt dolgozza fel, amelyeket a
	 * {@link rajzGep.ProgramParser.parancsok} list�ba f�z fel.
	 * 
	 * @param fajl a feldolgozand� XML f�jl el�r�si �tvonala.
	 * @throws ParserConfigurationException Hib�san van konfigur�lva az XML feldolgoz�.
	 * @throws SAXException Hiba k�vetkezett be az XML feldolgoz�sakor.
	 * @throws IOException A f�jl nem megfelel�!
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
	 * A f�ggv�ny visszat�r a parancslista sz�veges form�j�val.
	 * 
	 * @return parancsok sz�veges form�ja.
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Command parancs : parancsok) {
			sb.append(parancs + "\n");
		}
		return sb.toString();
	}

}
