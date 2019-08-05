public class ConditionalStatement {
    public static void main (String[] args) {
        int yourAge = 18;
        boolean youAreMen = true;
        boolean youAreWomen = false;
        double yourHeight = 1.80;
        char yourNameFirstLetter = 'M';

        if (yourAge > 20) {
            System.out.println("You are over 20 years old");
        }

        if (youAreMen) {
            System.out.println ("You are men");
        }

        if (youAreWomen) {
            System.out.println ("You are women");
        }

        if (yourHeight < 1.80) {
            System.out.println ("Your height is less than 1.80m");
        } else {
            System.out.println ("Your height is more than 1.80m");
        }

        if (yourNameFirstLetter == 'M') {
            System.out.println ("The first letter of your name is 'M' ");
        } else if (yourNameFirstLetter == 'U') {
            System.out.println ("The first letter of your name is 'U' ");
        } else {
            System.out.println ("The first letter of your name is " + yourNameFirstLetter);
        }

    }
}
