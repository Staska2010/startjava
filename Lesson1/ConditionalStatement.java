public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 18;
        if (age > 20) {
            System.out.println("You are over 20 years old");
        }

        boolean isMen = true;
        if (isMen) {
            System.out.println ("You are men");
        }

        if (!isMen) {
            System.out.println ("You are women");
        }

        double height = 1.80;
        if (height < 1.80) {
            System.out.println ("Your height is less than 1.80m");
        } else {
            System.out.println ("Your height is more than 1.80m");
        }

        char nameLetter = 'M';
        if (nameLetter == 'M') {
            System.out.println ("The first letter of your name is 'M' ");
        } else if (nameLetter == 'U') {
            System.out.println ("The first letter of your name is 'U' ");
        } else {
            System.out.println ("The first letter of your name is " + nameLetter);
        }
    }
}
