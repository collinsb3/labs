import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Welcome! What is Your Name?");
			String line = input.nextLine();
			System.out.println("Welcome " + line + "." + " Would you like to play a game?(enter 'yes' or 'no')");
			String answer = input.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println(
						"Excellent! You find a wallet near the curb. What do you do?(pick it up or walk past it)");
				String answer2 = input.nextLine();
				if (answer2.equalsIgnoreCase("pick it up")) {
					System.out.println("You pick up the wallet. Inside is $500 with a note that says 'Enjoy'.");
					System.out.println();
					System.out.println("Would you like to continue?(type 'y' or 'n')");
					choice = input.nextLine();
					System.out.println();
				} else if (answer2.equalsIgnoreCase("walk past it")) {
					System.out.println(
							"You walk past it. You hear a car's radio speak of random wallets being dropped around with money inside. You turn around to go back to the wallet, but it's gone.");
					System.out.println();
					System.out.println("Would you like to continue?(type 'y' or 'n')");
					choice = input.nextLine();
					System.out.println();
				}

			} else if (answer.equalsIgnoreCase("no")) {
				System.out.println("Guess you're too busy. Another time perhaps.");
				break;
			}
			if (choice.equalsIgnoreCase("n")){
			System.out.println("Thanks for playing!");
			}
		}
		

	}
}