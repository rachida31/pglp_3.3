package uvsq.M1.td1.Exo3_3;

public abstract class Robot {
	protected Position position ;
	protected Direction direction ; 
public Robot(int x,int y ,char d)
{
	this.position=new Position(x,y);
	this.direction=new Direction(d);
}
public void tourne()
{
switch(this.direction.getDir())
{
case 'g': this.direction.setDir('d');
case 'd': this.direction.setDir('g');
case 'h': this.direction.setDir('b');
case 'b': this.direction.setDir('h');


}
}

}
