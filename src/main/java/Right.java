/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Right} osztály reprezentálja a jobbra forgatásokat.
 * Egy {@link rajzGep.Right} példány egy jobbra forgatás mûveletét írja le.
 * Az osztály a {@link rajzGep.Command} interfészt valósítja meg.
 */
public class Right implements Command {

	/**
	 * A jobbra forgatás szögét tárolja valós számként.
	 */
	private double angle;
	
	/**
	 * A függvény visszaadja a jobbra forgás szögét.
	 * 
	 * @return a jobbra forgás szögének valós értéke.
	 */
	public double getAngle() {
		return angle;
	}
	
	/**
	 * Az osztály konstruktora.
	 * Itt állítódik be a jobbra forgás értéke.
	 * 
	 * @param angle megadja a forgási szöget.
	 */
	public Right(double angle) {
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
		rajztabla.setIrany( (rajztabla.getIrany() + angle) % 360 );
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
        return String.format("RIGHT(%.2f)", angle);
    }

}
