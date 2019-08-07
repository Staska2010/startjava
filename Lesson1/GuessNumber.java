public class GuessNumber {
	public static void main(String[] args) {
		int computer = 10;
		int user1 = 4;
		int user2 = 12;
		int user3 = 10;
		int user4 = 7;
		int user5 = 1;
		boolean result = false;

		do {
			if (user1 > computer) {
				System.out.println("Your number is greater !");
			} else if (user1 < computer) {
				System.out.println("Your number is less !");
			} else {
				result = true;
				System.out.println("You guessed !");
				break;
			}

			if (user2 > computer) {
				System.out.println("Your number is greater !");
			} else if (user2 < computer) {
				System.out.println("Your number is less !");
			} else {
				result = true;
				System.out.println("You guessed !");
				break;
			}

			if (user3 > computer) {
				System.out.println("Your number is greater !");
			} else if (user3 < computer) {
				System.out.println("Your number is less !");
			} else {
				result = true;
				System.out.println("You guessed !");
				break;
			}

			if (user4 > computer) {
				System.out.println("Your number is greater !");
			} else if (user4 < computer) {
				System.out.println("Your number is less !");
			} else {
				result = true;
				System.out.println("You guessed !");
				break;
			}

			if (user5 > computer) {
				System.out.println("Your number is greater !");
			} else if (user5 < computer) {
				System.out.println("Your number is less !");
			} else {
				result = true;
				System.out.println("You guessed !");
				break;
			}
		} while (result != true);
	}
}