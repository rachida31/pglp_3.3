package uvsq.M1.td1.Exo3_3;
/**
 *La classe Robot.
 *@author rachida.
 **/
public abstract class Robot {
	/***
	 *la position de rebot.
	 */
	protected Position position;
	/**
	 *La direction de rebot.
	 **/
	protected Direction direction;
	/**
	 *Le constructeur  Robot qui va crée un objet Possition
	 *on lui passant les cordonnéé de rebot x et y.
	 *Et crée l'objet Diraction on lui passantla diraction
	 *de rebot d.
	 *@param x : l'ordonnée x de rebot.
	 *@param y :l'ordonnée y de rebot.
	 *@param d :la diraction de rebot.
	 **/
	public Robot(final int x, final int y, final char d) {
		this.position = new Position(x, y);
		this.direction = new Direction(d);
	}
	/**
	 *Cette méthode permet de tourner un rebot.
	 **/
	public final void tourne() {
		switch (this.direction.getDir()) {
		case 'g':
			this.direction.setDir('d');
		case 'd':
			this.direction.setDir('g');
		case 'h':
			this.direction.setDir('b');
		case 'b':
			this.direction.setDir('h');

		}
	}

}
