/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Reset} osztály reprezentálja a kar alaphelyzetbe állítását.
 * Egy {@link rajzGep.Reset} példány egy kar kezdõhelyzetbe állítást ír le.
 * Az osztály a {@link rajzGep.Command} interfészt valósítja meg.
 */
public class Reset implements Command {

	/**
	 * Az eljárás végrehajtja a kar alaphelyzetbe állítását a paraméterként kapott rajztáblán.
	 * A rajztábla karja emellett felemelt állapotba is kerül.
	 * 
	 * @param rajztabla megadja, hogy melyik rajztáblán végezzük el a mûveletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setRajzolhat(false);
		rajztabla.setKoordinatak(250,250);
	}
	
	/**
	 * A függvény visszatér a parancs szöveges megfelelõjével.
	 * 
	 * @return a parancs szöveges alakja.
	 */
	public String toString() {
		return String.format("RESET");
	}
	
}
