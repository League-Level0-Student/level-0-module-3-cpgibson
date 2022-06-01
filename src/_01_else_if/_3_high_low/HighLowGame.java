
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		
		// 2. Print out the random variable above
System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess1 = JOptionPane.showInputDialog("Guess a number between 1 and 5!");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int numguess1 = Integer.parseInt(guess1);	
		if (numguess1 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess1 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess1 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low
		String guess2 = JOptionPane.showInputDialog("Guess a number! Nine guesses left.");
		int numguess2 = Integer.parseInt(guess2);	
		if (numguess2 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess2 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess2 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess3 = JOptionPane.showInputDialog("Guess a number! Eight guesses left.");
		int numguess3 = Integer.parseInt(guess3);	
		if (numguess3 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess3 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess3 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess4 = JOptionPane.showInputDialog("Guess a number! Seven guesses left.");
		int numguess4 = Integer.parseInt(guess4);	
		if (numguess4 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess4 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess4 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess5 = JOptionPane.showInputDialog("Guess a number! Six guesses left.");
		int numguess5 = Integer.parseInt(guess5);	
		if (numguess5 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess5 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess5 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess6 = JOptionPane.showInputDialog("Guess a number! Five guesses left.");
		int numguess6 = Integer.parseInt(guess6);	
		if (numguess6 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess6 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess6 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess7 = JOptionPane.showInputDialog("Guess a number! Four guesses left.");
		int numguess7 = Integer.parseInt(guess7);	
		if (numguess7 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess7 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess7 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess8 = JOptionPane.showInputDialog("Guess a number! Three guesses left");
		int numguess8 = Integer.parseInt(guess8);	
		if (numguess8 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess8 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess8 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess9 = JOptionPane.showInputDialog("Guess a number! Two guesses left.");
		int numguess9 = Integer.parseInt(guess9);	
		if (numguess9 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess9 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess9 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		String guess10 = JOptionPane.showInputDialog("Guess a number! This is your last guess.");
		int numguess10 = Integer.parseInt(guess10);	
		if (numguess10 == random) {
			JOptionPane.showMessageDialog(null, "You win!");
			System.exit(0);
		}
		if (numguess10 > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high!");
		}
		if (numguess10 < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low!");
		}
		JOptionPane.showMessageDialog(null, "You lost. Better luck next time!");
		// 13. Tell them they lose
		
	}

}


