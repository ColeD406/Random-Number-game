
/**
 * Driver for Random Number Game.
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
		GuessGame.play();
	}
}
