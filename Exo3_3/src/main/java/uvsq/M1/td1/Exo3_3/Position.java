package uvsq.M1.td1.Exo3_3;
/**
 *La classe Position.
 *@author rachida
 **/
public class Position {
	/**
	 *la corredonée x de rebot. 
	 **/
	private int x;
	/**
	 *La corredonnée y de rebot.
	 **/
	private int y;
	/**
	 * Le constructeur e la classe Position qui initialise les
	 * corredonnée de rebot.
	 * @param x :la corredonée x de rebot.
	 * @param y :la corredonée y de rebot.
	 **/
	public Position(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
/**
 *renvoie la corredonée x de rebot.
 *@return x :la corredonée x de rebot.
 **/
	public final int getX() {
		return x;
	}
	/**
	 *renvoie la corredonée y de rebot.
	 *@return y:la corredonée y de rebot.
	 * */
	public final int getY() {
		return y;

	}

}
