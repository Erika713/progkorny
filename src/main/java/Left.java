/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Left} osztály reprezentálja a balra forgatásokat.
 * Egy {@link rajzGep.Left} példány egy balra forgatás mûveletét írja le.
 * Az osztály a {@link rajzGep.Command} interfészt valósítja meg.
 */
public class Left implements Command {
	
	/**
	 * A balra forgatás szögét tárolja valós számként.
	 */
	private double angle;
	
	/**
	 * A függvény visszaadja a balra forgás szögét.
	 * 
	 * @return a balra forgás szögének valós értéke.
	 */
	public double getAngle() {
		return angle;
	}
	
	/**
	 * Az osztály konstruktora.
	 * Itt állítódik be a balra forgás értéke.
	 * 
	 * @param angle megadja a forgási szöget.
	 */
	public Left(double angle) {
		this.angle = angle;
	}
	
	/**
	 * Az eljárás végrehajtja az irányváltoztatást a paraméterként kapott rajztáblán.
	 * A rajztábla tolla a forgatási szöggel módosított rányba mutat, amely majd a
	 * következõ forward parancs esetén ebbe az irányba fog rajzolni.
	 * 
	 * @param rajztabla megadja, hogy melyik rajztáblán végezzük el a mûveletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setIrany( (rajztabla.getIrany() - angle) % 360 );
		if( rajztabla.getIrany() < 0 ) {
			rajztabla.setIrany( 360 + rajztabla.getIrany() );
		}
	}
	
	/**
	 * A függvény visszatér a parancs szöveges megfelelõjével.
	 * 
	 * @return a parancs szöveges alakja.
	 */
	public String toString() {
		return String.format("LEFT(%.2f)", angle);
	}

}
