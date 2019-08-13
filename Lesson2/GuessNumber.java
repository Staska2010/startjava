import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	private Player firstPlayer, secondPlayer;
	private Scanner sc = new Scanner(System.in);
	
	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void play() {
		generateGuessedNumber();
		while (true) {
			if (compareNumbers(firstPlayer)) {
				break;
			} else if (compareNumbers(secondPlayer)) {
				break;
			}
		}	
	}

	private void generateGuessedNumber() {
		computerNumber = (int)(Math.random() * 100 + 1);
		System.out.println("Computer made a number [0; 100]...");
	}

	private boolean compareNumbers(Player player) {
		System.out.println(player.getName() + " it's your turn: ");
		inputNumber(player);
		if (player.getNumber() > computerNumber) {
			System.out.println("You number is greater than computer number");
		} else if (player.getNumber() < computerNumber) {	
			System.out.println("You number is less than computer number");
		} else {
			System.out.println("You guessed!");
			return true;
		}
		return false;
	}

	private void inputNumber(Player player) {
		int number = sc.nextInt();
		System.out.println("Player " + player.getName() + " enters number " + number);
		player.setNumber(number);
	}
}