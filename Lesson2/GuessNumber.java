import java.util.Scanner;

public class GuessNumber {
	private int computerNumber;
	
	public GuessNumber() {
		computerNumber = 0;
	}

	public void setGuessedNumber() {
		computerNumber = (int)(Math.random()*100+1);
		System.out.println("Computer made a number...");
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
}