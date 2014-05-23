/**
 * @author Gy�ri L�szl�
 * @version 1.0
 */ 

/**
 * A {@link rajzGep.Right} oszt�ly reprezent�lja a jobbra forgat�sokat.
 * Egy {@link rajzGep.Right} p�ld�ny egy jobbra forgat�s m�velet�t �rja le.
 * Az oszt�ly a {@link rajzGep.Command} interf�szt val�s�tja meg.
 */
public class Right implements Command {

	/**
	 * A jobbra forgat�s sz�g�t t�rolja val�s sz�mk�nt.
	 */
	private double angle;
	
	/**
	 * A f�ggv�ny visszaadja a jobbra forg�s sz�g�t.
	 * 
	 * @return a jobbra forg�s sz�g�nek val�s �rt�ke.
	 */
	public double getAngle() {
		return angle;
	}
	
	/**
	 * Az oszt�ly konstruktora.
	 * Itt �ll�t�dik be a jobbra forg�s �rt�ke.
	 * 
	 * @param angle megadja a forg�si sz�get.
	 */
	public Right(double angle) {
        this.angle = angle;
    }
	
	/**
	 * Az elj�r�s v�grehajtja az ir�nyv�ltoztat�st a param�terk�nt kapott rajzt�bl�n.
	 * A rajzt�bla tolla a forgat�si sz�ggel m�dos�tott r�nyba mutat, amely majd a
	 * k�vetkez� forward parancs eset�n ebbe az ir�nyba fog rajzolni.
	 * 
	 * @param rajztabla megadja, hogy melyik rajzt�bl�n v�gezz�k el a m�veletet.
	 */
	public void doIt(RajzTabla rajztabla) {
		rajztabla.setIrany( (rajztabla.getIrany() + angle) % 360 );
		if( rajztabla.getIrany() < 0 ) {
			rajztabla.setIrany( 360 + rajztabla.getIrany() );
		}
	}
	
	/**
	 * A f�ggv�ny visszat�r a parancs sz�veges megfelel�j�vel.
	 * 
	 * @return a parancs sz�veges alakja.
	 */
	public String toString() {
        return String.format("RIGHT(%.2f)", angle);
    }

}
