package co.grandcircus;

import java.util.Scanner;

public class RoShamBoApp {

	public static void main(String[] args) {

		String cont = "y";
		Player opp;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to RoShamBo");
		String userName = Validator.getString(scnr, "Enter your name: ");
		int choice = Validator.getIntBetween(scnr,
				"Would you like to play against \n1. Skater\n2. Indecisive Boyfriend?", 1, 2);

		if (choice == 1) {
			opp = new RockPlayer("Skater");
		} else {
			opp = new RandomPlayer("Indecisive Boyfriend");
		}

		while (cont.equalsIgnoreCase("y")) {

			String input = Validator.getString(scnr, "Rock, Paper, or Scissors");

			UserPlayer user = new UserPlayer(userName);
			user.setUserChoice(input);
			System.out.println(user);
			System.out.println(opp);
			
			Player winner = getWinner(opp,user);

			cont = Validator.getString(scnr, "Play again? (y/n)");
		}

		scnr.close();

	}

	public static Player getWinner(Player player1, Player player2) {

		RoShamBo r1 = player1.generateRoShamBo();
		RoShamBo r2 = player2.generateRoShamBo();

		if (r1.equals("Rock") && (r2.equals("Scissors") || r1.equals("Scissors") && r2.equals("Paper")
				|| r1.equals("Paper") && r2.equals("Rock"))) {
			System.out.println("You won!");
			return player1;
		} else if (r1.equals(r2)) {
			System.out.println("Its a draw!");
		} else {
			System.out.println("You lost!");
			return player2;
		}

		return null;
	}

}
