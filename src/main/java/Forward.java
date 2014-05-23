/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Forward} oszt�ly reprezent�lja az el�re mozg�sokat.
 * Egy {@link rajzGep.Forward} p�ld�ny egy el�re halad�s m�velet�t �rja le.
 * Az oszt�ly a {@link rajzGep.Command} interf�szt val�s�tja meg.
 */
public class Forward implements Command {
	
	/**
	 * Az el�re mozg�s m�rt�k�t adja meg eg�sz sz�mk�nt.
	 */
	private int units;

	/**
	 * A f�ggv�ny visszaadja az el�re mozg�s �rt�k�t.
	 * 
	 * @return az el�re mozg�s eg�sz sz�mbeli �rt�ke.
	 */
	public int getUnits() 
	{
		return units;
	}
	
	/**
	 * Az oszt�ly konstruktora.
	 * Itt �ll�t�dik be az el�re mozg�s �rt�ke.
	 * 
	 * @param angle megadja az el�re mozg�s �rt�k�t.
	 */
	public Forward(int units) {
		this.units = units;
	}
	
	/**
	 * Az elj�r�s v�grehajtja az el�re mozg�st a param�terk�nt kapott rajzt�bl�n.
	 * A rajzt�bla tolla a megadott �rt�kkel ker�l el�r�bb az aktu�lis ir�ny ment�n.
	 * 
	 * @param rajztabla megadja, hogy melyik rajzt�bl�n v�gezz�k el a m�veletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		int ujX = rajztabla.getX() + (int)(units*Math.sin( Math.toRadians(rajztabla.getIrany()) ));
		int ujY = rajztabla.getY() - (int)(units*Math.cos( Math.toRadians(rajztabla.getIrany()) ));
		rajztabla.setKoordinatak( ujX, ujY );
	}

	 /**
	 * A f�ggv�ny visszat�r a parancs sz�veges megfelel�j�vel.
	 * 
	 * @return a parancs sz�veges alakja.
	 */
	public String toString() {
		return String.format("FORWARD(%d)", units);
	}
}
