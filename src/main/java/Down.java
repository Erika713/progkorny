/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Down} oszt�ly reprezent�lja a kar leenged�s�t.
 * Egy {@link rajzGep.Down} p�ld�ny egy kar leenged�st �r le.
 * Az oszt�ly a {@link rajzGep.Command} interf�szt val�s�tja meg.
 */
public class Down implements Command {
	
	/**
	 * Az elj�r�s v�grehajtja a kar leenged�s�st a param�terk�nt kapott rajzt�bl�n.
	 * A rajzt�bl�ra addig lehet rajzolni, am�g fel nem emelj�k a kart.
	 * 
	 * @param rajztabla megadja, hogy melyik rajzt�bl�n v�gezz�k el a m�veletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setRajzolhat(true);
	}
	
	/**
	 * A f�ggv�ny visszat�r a parancs sz�veges megfelel�j�vel.
	 * 
	 * @return a parancs sz�veges alakja.
	 */
	public String toString() {
		return String.format("DOWN");
	}

}
