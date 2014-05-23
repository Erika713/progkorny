/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * Az {@link rajzGep.Reset} oszt�ly reprezent�lja a kar alaphelyzetbe �ll�t�s�t.
 * Egy {@link rajzGep.Reset} p�ld�ny egy kar kezd�helyzetbe �ll�t�st �r le.
 * Az oszt�ly a {@link rajzGep.Command} interf�szt val�s�tja meg.
 */
public class Reset implements Command {

	/**
	 * Az elj�r�s v�grehajtja a kar alaphelyzetbe �ll�t�s�t a param�terk�nt kapott rajzt�bl�n.
	 * A rajzt�bla karja emellett felemelt �llapotba is ker�l.
	 * 
	 * @param rajztabla megadja, hogy melyik rajzt�bl�n v�gezz�k el a m�veletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setRajzolhat(false);
		rajztabla.setKoordinatak(250,250);
	}
	
	/**
	 * A f�ggv�ny visszat�r a parancs sz�veges megfelel�j�vel.
	 * 
	 * @return a parancs sz�veges alakja.
	 */
	public String toString() {
		return String.format("RESET");
	}
	
}
