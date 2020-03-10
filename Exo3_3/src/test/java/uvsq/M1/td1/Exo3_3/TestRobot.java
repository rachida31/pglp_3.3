package uvsq.M1.td1.Exo3_3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import  java.util.ArrayList ;
import  java.util.List ;
import org.junit.*;


public class TestRobot {
	 private List  <Robot> robot;

	@Before()
	public void setUp() {
		this.robot=new ArrayList();
	}
	
	
	
				@Test
	public void TestRobotAvance()
	{
					RobotMobile r=new RobotMobile(1,0,'d');
					robot.add(new RobotMobile(70,10,'b'));
					robot.add(new RobotStatique(300,40,'h'));
					robot.add(new RobotMobile(60,100,'d'));
					robot.add(new RobotStatique(5,6,'g'));
					System.out.println(robot.get(0).getClass());
					System.out.println(r.position.getX());

					r.avance();
					assertTrue(r.position.getX() ==2);
					assertTrue(r.position.getY() ==0);
					assertTrue(r.direction.getDir() =='d');
	}
}
