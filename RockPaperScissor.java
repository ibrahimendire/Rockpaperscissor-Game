
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class RockPaperScissor {
	public static void main(String[] args) {
		String rock = """
				    _______
				---'   ____)
				      (_____)
				      (_____)
				      (____)
				---.__(___)
				""";
		String paper = """
				   _______
				---'   ____)____
				          ______)
				          _______)
				         _______)
				---.__________)
				""";
		String scissor = """
				   _______
				---'   ____)____
				          ______)
				       __________)
				      (____)
				---.__(___)
				""";

		Scanner sc = new Scanner(System.in);
		// random number
		Random rn = new Random();
		String randominput = "";

		int answer = rn.nextInt(3) + 1;
		if (answer == 1) {
			randominput = rock;
		} else if (answer == 2) {
			randominput = paper;
		} else if (answer == 3) {
			randominput = scissor;
		}
		System.out.println("========================================");
		System.out.println("please enter 1 rock, 2 for paper, 3 scissors");
		int input1 = 5;
		try {
			input1 = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter number");
		}

		if (input1 == 1) {
			System.out.println("You enter:");
			System.out.println(rock);
			System.out.println("Computer enter:");
			System.out.println(randominput);
		} else if (input1 == 2) {
			System.out.println("You enter:");
			System.out.println(paper);
			System.out.println("Computer enter:");
			System.out.println(randominput);
		} else if (input1 == 3) {
			System.out.println("You enter:");
			System.out.println(scissor);
			System.out.println("Computer enter:");
			System.out.println(randominput);
		} else {
			System.out.println("Please Enter 1 , 2  or 3");
		}
		System.out.println("========================================");
		if (input1 == 1) {
			if (answer == 1) {
				System.out.println("Drow");
			} else if (answer == 2) {
				System.out.println("You loss");
			} else if (answer == 3) {
				System.out.println("You win");
			}
		} else if (input1 == 2) {
			if (answer == 1) {
				System.out.println("You Win");
			} else if (answer == 2) {
				System.out.println("Drow");
			} else if (answer == 3) {
				System.out.println("You loss");
			}
		} else if (input1 == 3) {
			if (answer == 1) {
				System.out.println("You loss");
			} else if (answer == 2) {
				System.out.println("You Win");
			} else if (answer == 3) {
				System.out.println("Drow");
			}
		}

	}
}
