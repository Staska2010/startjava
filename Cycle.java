public class Cycle {
    public static void main (String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // разделитель между выводами

        int i = 6;
        while (i >= -6) {
            System.out.print(i + " ");
            i = i - 2;
        }

        System.out.println(); // разделитель между выводами

        i = 10;
        do {
            i++;
            System.out.print(i++ + " ");
        } while (i < 20);

         System.out.println(); // разделитель между выводами
    }
}
