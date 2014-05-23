/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Up} osztály reprezentálja a kar felemelését.
 * Egy {@link rajzGep.Up} példány egy kar felemelést ír le.
 * Az osztály a {@link rajzGep.Command} interfészt valósítja meg.
 */
public class Up implements Command {

	/**
	 * Az eljárás végrehajtja a kar felemelését a paraméterként kapott rajztáblán.
	 * A rajztáblára addig nem lehet rajzolni, amíg le nem engedjük a kart.
	 * 
	 * @param rajztabla megadja, hogy melyik rajztáblán végezzük el a mûveletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setRajzolhat(false);
	}
	
	/**
	 * A függvény visszatér a parancs szöveges megfelelõjével.
	 * 
	 * @return a parancs szöveges alakja.
	 */
	public String toString() {
		return String.format("UP");
	}
	
}
