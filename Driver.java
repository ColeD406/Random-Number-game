
/**
 * Driver for Inlab6.
 * 
 * @author Cole Doty
 * @version 07Oct16
 */
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Choose Guessing Game");
		System.out.println("Type '1' for First Game and '2' for Second Game");
		System.out.println("Type '3' to Quit");
		System.out.println("----------------");
		int choice = in.nextInt();

		switch (choice) { // allows the user to choose what he/she would like to
							// play Game 1, Game 2 or Quit
		case 1:
			System.out.println();
			GuessGame.play1();
			break;
		case 2:
			System.out.println();
			GuessGame.play2();
			break;
		case 3:
			System.out.println();
			System.out.println("Thanks for playing!");
			return;
		}
	}
}