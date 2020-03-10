package uvsq.M1.td1.Exo3_3;

public class RobotMobile extends Robot {

	
	public RobotMobile(int x,int y,char d)
	{
		super(x,y,d);
	}
	
	public void avance() {
		switch(this.direction.getDir())
		{
		case 'g':this.position.setX(this.position.getX()-1);
		case 'd': this.position.setX(this.position.getX()+1);
		case 'h': this.position.setY(this.position.getY()+1);
		case 'b': this.position.setY(this.position.getY()-1);


		}		
		
		
	}
}
