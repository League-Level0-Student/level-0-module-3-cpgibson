
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot rob = new Robot("mini");
		rob.penDown();
		rob.setPenWidth(10);
		String request = JOptionPane.showInputDialog("What color to you want the robot to draw with?");
		if (request.equalsIgnoreCase("red")){
			rob.setPenColor(Color.RED);
		}
		if (request.equalsIgnoreCase("orange")) {
			rob.setPenColor(Color.ORANGE);
		}
		if (request.equalsIgnoreCase("yellow")) {
			rob.setPenColor(Color.YELLOW);
		}
		if (request.equalsIgnoreCase("green")) {
			rob.setPenColor(Color.GREEN);
		}
		if (request.equalsIgnoreCase("blue")) {
			rob.setPenColor(Color.BLUE);
		}
		if (request.equalsIgnoreCase("purple")) {
			rob.setPenColor(Color.MAGENTA);
		}
	 
			rob.move(40);
			rob.setAngle(60);
			rob.move(40);
			rob.setAngle(120);
			rob.move(40);
	}
}
