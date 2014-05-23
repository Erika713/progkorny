/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Forward} osztály reprezentálja az elõre mozgásokat.
 * Egy {@link rajzGep.Forward} példány egy elõre haladás mûveletét írja le.
 * Az osztály a {@link rajzGep.Command} interfészt valósítja meg.
 */
public class Forward implements Command {
	
	/**
	 * Az elõre mozgás mértékét adja meg egész számként.
	 */
	private int units;

	/**
	 * A függvény visszaadja az elõre mozgás értékét.
	 * 
	 * @return az elõre mozgás egész számbeli értéke.
	 */
	public int getUnits() 
	{
		return units;
	}
	
	/**
	 * Az osztály konstruktora.
	 * Itt állítódik be az elõre mozgás értéke.
	 * 
	 * @param angle megadja az elõre mozgás értékét.
	 */
	public Forward(int units) {
		this.units = units;
	}
	
	/**
	 * Az eljárás végrehajtja az elõre mozgást a paraméterként kapott rajztáblán.
	 * A rajztábla tolla a megadott értékkel kerül elõrébb az aktuális irány mentén.
	 * 
	 * @param rajztabla megadja, hogy melyik rajztáblán végezzük el a mûveletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		int ujX = rajztabla.getX() + (int)(units*Math.sin( Math.toRadians(rajztabla.getIrany()) ));
		int ujY = rajztabla.getY() - (int)(units*Math.cos( Math.toRadians(rajztabla.getIrany()) ));
		rajztabla.setKoordinatak( ujX, ujY );
	}

	 /**
	 * A függvény visszatér a parancs szöveges megfelelõjével.
	 * 
	 * @return a parancs szöveges alakja.
	 */
	public String toString() {
		return String.format("FORWARD(%d)", units);
	}
}
