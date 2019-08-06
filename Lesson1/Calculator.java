
public class Calculator {
    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 3;
        char operator = '^';
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
