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

	public int getNumberFromPlayer() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}

	public String checkPlayerNumber(Player player) {
		String result;
		if (player.getNumber() > computerNumber) {
			result = "greater";
		}
		else if (player.getNumber() < computerNumber) {
			result = "less";	
		} else {
			result = "win";
		}
		return result;
	}

	public boolean gameNextMove(Player nextPlayer) {
		boolean isWinner = false;
		System.out.println(nextPlayer.getName() + " it's your turn: ");
		int inputValue = getNumberFromPlayer();
		nextPlayer.setNumber(inputValue);
		String result = checkPlayerNumber(nextPlayer);
		switch (result) {
			case "greater" : 
				System.out.println("You number is greater than computer number");
				break;
			case "less" : 
				System.out.println("You number is less than computer number");
				break;
			case "win" : 
				System.out.println("You guessed!");
				isWinner = true;
		}
		return isWinner;
	}

	public void play() {
		String confirmation;
		Scanner sc = new Scanner(System.in);
		do {
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
			do {
				System.out.println("Do you want to repeat? (yes/no): ");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));	
		} while(confirmation.equals("yes")); 
	}
}