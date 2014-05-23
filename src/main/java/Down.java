/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Down} osztály reprezentálja a kar leengedését.
 * Egy {@link rajzGep.Down} példány egy kar leengedést ír le.
 * Az osztály a {@link rajzGep.Command} interfészt valósítja meg.
 */
public class Down implements Command {
	
	/**
	 * Az eljárás végrehajtja a kar leengedésést a paraméterként kapott rajztáblán.
	 * A rajztáblára addig lehet rajzolni, amíg fel nem emeljük a kart.
	 * 
	 * @param rajztabla megadja, hogy melyik rajztáblán végezzük el a mûveletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setRajzolhat(true);
	}
	
	/**
	 * A függvény visszatér a parancs szöveges megfelelõjével.
	 * 
	 * @return a parancs szöveges alakja.
	 */
	public String toString() {
		return String.format("DOWN");
	}

}
