public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // разделитель между выводами.

        int counter = 6;
        while (counter >= -6) {
            System.out.print(counter + " ");
            counter -= 2;
        }

        System.out.println(); // разделитель между выводами.

        counter = 10;
        int sum = 0;
        do {
            if (counter % 2 != 0) {
<<<<<<< HEAD
                sum += counter;
=======
                    sum += counter;
>>>>>>> 15f4e9f355707219354ec584d21d59227c1632d7
            }
            counter++;
        } while (counter <= 20);
         System.out.println("Сумма нечетных чисел от 10 до 20: " + sum);
    }
}
