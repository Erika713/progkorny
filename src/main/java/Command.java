/**
 * @author Gyõri László
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Command} interfész garantálja, hogy bármely, õt implementáló
 * osztállyal képesek vagyunk meghívni a {@link rajzGep.Command.doIt} eljárást.
 */
public interface Command {

	/**
	 * Az eljárást minden osztálynak implementálnia kell, amely a {@link rajzGep.Command}
	 * interfész valósítja meg.
	 * 
	 * @param rajztabla megadja, hogy melyik rajztáblán végezzük el a mûveletet.
	 */
	public void doIt(RajzTabla rajztabla);

}
