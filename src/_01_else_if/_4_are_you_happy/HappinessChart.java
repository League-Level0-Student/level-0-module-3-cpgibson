package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class HappinessChart {
	

	public static void main(String[] args) {
		
		
		String happy = JOptionPane.showInputDialog("Are you happy?");
		
	if (happy.equalsIgnoreCase("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
		
	else if (happy.equalsIgnoreCase("no")) {
		String want = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if (want.equalsIgnoreCase("no")){
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
			else if (want.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
		}
	}
	
	
	
	
	
	}
}
