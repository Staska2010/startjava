import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player one, enter your name: ");
		Player playerOne = new Player(sc.nextLine());
		System.out.println("Player two, enter your name: ");
		Player playerTwo = new Player(sc.nextLine());
		GuessNumber game = new GuessNumber(playerOne, playerTwo);
		game.play();
	}	
}