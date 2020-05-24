package uvsq.M1.td1.Exo3_3;
/**
 * La classe Direction.
 * @author rachida.
 * */
public class Direction {
	/**
	 * La derection de deplacement de rebot.
	 **/
	private char dir;
	/**
	 * le constructeur qui initialise la diraction de rebot
	 * à dir.
	 * @param dir :la diraction de rebot.
	 * */
	public Direction(final char dir) {
		this.dir = dir;
	}
	/**
	 *elle return la deraction de rebot.
	 *@return dir la diraction de rebot.
	 **/
	public final char getDir() {
		return this.dir;
	}
	/**
	 *elle donne la valeur dir a la diraction de rebot.
	 *@param dir : la nouvelle diraction de rebot.
	 **/
	public final void setDir(final char dir) {
		this.dir = dir;
	}

}
