
/**
 * Number guessing game.
 * 
 * @author Cole Doty
 * @version 07Oct16
 */
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {

		System.out.println("Choose Guessing Game");
		System.out.println();
		System.out.println("Type '1' for First Game and '2' for Second Game");
		System.out.println("Type '3' to Quit");
		System.out.println("------------------------------------------------");
		GuessGame.play();
	}

	public static void play1() { // method to play game 1

		int numReal = (int) ((10 - 1 + 1) * Math.random() + 1);
		boolean win = false;

		Scanner in = new Scanner(System.in);

		System.out.println("Game 1:");
		System.out.println("Guess the random number that has been generated between 1 and 10");
		System.out.println();

		while (win == false) {

			System.out.println("What is your guess?");
			int num = in.nextInt();
			System.out.println(num);
			System.out.println();

			if (num == numReal) {
				win = true;
				System.out.println("Correct!");
				System.out.println("------------------------------------------------");
				System.out.println("Type '1' for First Game and '2' for Second Game");
				System.out.println("Type '3' to Quit");
				System.out.println("------------------------------------------------");
				play();
				return;
			} else if (num < numReal) {
				System.out.println("Bigger!");
			} else if (num > numReal) {
				System.out.println("Smaller!");
			}
		}
	}

	public static void play() {
		Scanner in = new Scanner(System.in);
		int choice2 = -1;

		while (choice2 < 1 || choice2 > 3) {

			if (in.hasNextInt())
				choice2 = in.nextInt();

		}

		switch (choice2) {
		case 1:
			GuessGame.play1();
			break;
		case 2:
			GuessGame.play2();
			break;
		case 3:
			System.out.println("Thanks for playing!");

		}
	}

	public static void play2() { // method to play game 2
		int numReal = (int) ((25 - 5 + 1) * Math.random() + 5);

		Scanner in = new Scanner(System.in);

		System.out.println("Game 2:");
		System.out.println("You have 5 guesses to guess the random number that has been generated between 5 and 25");
		System.out.println();

		for (int numGuess = 1; numGuess < 6; numGuess++) {
			System.out.println("Guess # " + numGuess);
			System.out.println("What is your guess?");
			int num = in.nextInt();
			System.out.println(num);
			System.out.println();

			if (num == numReal) {
				System.out.println("Correct!");
				System.out.println("------------------------------------------------");
				System.out.println("Type '1' for First Game and '2' for Second Game");
				System.out.println("Type '3' to Quit");
				System.out.println("------------------------------------------------");
				play();
				return;
			} else if (num < numReal && numGuess < 5) {
				System.out.println("Bigger!");
			} else if (num > numReal) {
				System.out.println("Smaller!");
			} else if (numGuess == 5 && num != numReal) {
				System.out.println("Exceeded number of guesses.");
				System.out.println("------------------------------------------------");
				System.out.println("Type '1' for First Game and '2' for Second Game");
				System.out.println("Type '3' to Quit");
				System.out.println("------------------------------------------------");
				play();
				return;
			}
		}

	}
}
