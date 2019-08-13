import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	private Player firstPlayer, secondPlayer;
	
	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void setGuessedNumber() {
		computerNumber = (int)(Math.random() * 100 + 1);
		System.out.println("Computer made a number [0; 100]...");
	}

	public int getGuessedNumber() {
		return computerNumber;
	}

	private int getNumberFromPlayer() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}

	private boolean gameNextMove(Player player) {
		boolean isWinner = false;
		System.out.println(player.getName() + " it's your turn: ");
		int inputValue = getNumberFromPlayer();
		player.setNumber(inputValue);
		if (player.getNumber() > computerNumber) {
			System.out.println("You number is greater than computer number");
		}
		else if (player.getNumber() < computerNumber) {	
			System.out.println("You number is less than computer number");
		} else {
			System.out.println("You guessed!");
			isWinner = true;
		}
		return isWinner;
	}

	public void play() {
		Scanner sc = new Scanner(System.in);
		setGuessedNumber();
		System.out.println("Tsss... computer made " + getGuessedNumber());
		while (true) {
			if (gameNextMove(firstPlayer)) {
				break;
			}
			if (gameNextMove(secondPlayer)) {
				break;
			}
		}	
	}
}