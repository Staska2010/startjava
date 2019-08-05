import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        int firstNum, secondNum;
        char operator;

        // Ввод исхоодных чисел и оператора
        Scanner sc = new Scanner(System.in);
        System.out.println ("Input first number: ");
        firstNum = sc.nextInt();
        System.out.println ("Input second number: ");
        secondNum = sc.nextInt();
        System.out.println ("Input operator ( + , - , * , / , ^ , % ) : ");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println (firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        } else if (operator == '-') {
            System.out.println (firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
        } else if (operator == '*') {
            System.out.println (firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
        } else if (operator == '/') {
            System.out.println (firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
        } else if (operator == '^') {
            int powResult = firstNum;
            for (int i = 1; i < secondNum; i++) {
                powResult = powResult * firstNum;
            }
            System.out.println (firstNum + " ^ " + secondNum + " = " + powResult);
        } else if (operator == '%') {
            System.out.println (firstNum + " % " + secondNum + " = " + (firstNum % secondNum));
        }

    }
}
