public class GuessNumber {
	public static void main(String[] args) {
		// computer - значение, которое загадал компьютер
		int computer = 74;
		//Переменные для двоичного поиска
		// left - левая и правые границы интервала [0; 100]
		// qurrent - текущее ("вводимое" пользователем) значение
		int left = 0;
		int right = 100;
		int qurrent = 0;

		// Сам двоичный поиск
		while (left <= right) {
			qurrent = (left + right) / 2;
			System.out.println ("Your choice:" + qurrent);
			if (qurrent == computer) {
				System.out.println ("You won!");
				break;
			} else if (qurrent > computer) {
				right = qurrent;
				System.out.println("You number is greater!");
			} else {
				left = qurrent;
				System.out.println("Your number is less!");
			}
		}
	}
}