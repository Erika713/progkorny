/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Command} interf�sz garant�lja, hogy b�rmely, �t implement�l�
 * oszt�llyal k�pesek vagyunk megh�vni a {@link rajzGep.Command.doIt} elj�r�st.
 */
public interface Command {

	/**
	 * Az elj�r�st minden oszt�lynak implement�lnia kell, amely a {@link rajzGep.Command}
	 * interf�sz val�s�tja meg.
	 * 
	 * @param rajztabla megadja, hogy melyik rajzt�bl�n v�gezz�k el a m�veletet.
	 */
	public void doIt(RajzTabla rajztabla);

}
