package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Choose_adventure {

	public static void main(String[] args) {
		
		String qone = JOptionPane.showInputDialog(null, "You are in a spooky path. You see one path on the right that \n is green and one on the left that is orange. Turn left or right?");
		
		if (qone.equalsIgnoreCase("right")) {
			String greenq = JOptionPane.showInputDialog(null, "On this path, it forks into three different ones. On the left, the floor \n has green goo splattered all over. In the middle, there's a small walkway over a \n huge pit. On the right, there's a moving pile of green goo. Turn left, middle or right?");
			if (greenq.equalsIgnoreCase("left")) {
				JOptionPane.showMessageDialog(null, "You step into the green goo... and sink into the floor, never to be seen again.");
			if (greenq.equalsIgnoreCase("middle")) {
				JOptionPane.showMessageDialog(null, "As you balance your way through the walkway, it randomly folds under you, and you fall into the pit!");
			}
			else if (greenq.equalsIgnoreCase("right")) {
				JOptionPane.showMessageDialog(null, "The green goo materializes a hand, and waves you forward. Ahead of you is a golden city.");
			}
				}
			}
		
		if (qone.equalsIgnoreCase("left")){
			JOptionPane.showMessageDialog(null, "As you enter the glowing orange, you see a large pumpkin man. He grabs you and you never see anything again.");
		
		
		}
	}
	
	
}
