public class GuessNumber {
	public static void main(String[] args) {
		// значение, которое загадал компьютер
		int computerNumber = 18;
		//Переменные для двоичного поиска
		// left - левая и правые границы интервала [0; 100]
		// qurrent - текущее ("вводимое" пользователем) значение
		int left = 0;
		int right = 100;
		int current = 0;

		// Сам двоичный поиск
		while (left <= right) {
			current = (left + right) / 2;
			System.out.println ("Your choice:" + current);
			if (current == computerNumber) {
				System.out.println ("You won!");
				break;
			} else if (current > computerNumber) {
				right = current;
				System.out.println("Ваше число больше!");
			} else {
				left = current;
				System.out.println("Your number is less!");
			}
		}
	}
}