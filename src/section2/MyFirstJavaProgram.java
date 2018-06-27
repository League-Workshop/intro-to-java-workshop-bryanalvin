package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot Seiya= new Robot("batman");
	Seiya.penDown();

	Seiya.setSpeed(100);
	
	for (int i = 0; i < 1000; i++) {
		Seiya.move(130); 
		Seiya.turn(90);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
