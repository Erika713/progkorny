/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Up} oszt�ly reprezent�lja a kar felemel�s�t.
 * Egy {@link rajzGep.Up} p�ld�ny egy kar felemel�st �r le.
 * Az oszt�ly a {@link rajzGep.Command} interf�szt val�s�tja meg.
 */
public class Up implements Command {

	/**
	 * Az elj�r�s v�grehajtja a kar felemel�s�t a param�terk�nt kapott rajzt�bl�n.
	 * A rajzt�bl�ra addig nem lehet rajzolni, am�g le nem engedj�k a kart.
	 * 
	 * @param rajztabla megadja, hogy melyik rajzt�bl�n v�gezz�k el a m�veletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setRajzolhat(false);
	}
	
	/**
	 * A f�ggv�ny visszat�r a parancs sz�veges megfelel�j�vel.
	 * 
	 * @return a parancs sz�veges alakja.
	 */
	public String toString() {
		return String.format("UP");
	}
	
}
