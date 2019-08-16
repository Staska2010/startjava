package com.startjava.lesson_4.calculator;

class Calculator {
     void calculate(String[] mathExpression) {
        int firstNum = Integer.parseInt(mathExpression[0]);
        char operator = mathExpression[1].charAt(0);
        int secondNum = Integer.parseInt(mathExpression[2]);
        switch (operator) {
            case '+' :
                System.out.println (firstNum + " + " + secondNum + " = " + Math.addExact(firstNum, secondNum));
                break;
            case '-' :
                System.out.println (firstNum + " - " + secondNum + " = " + Math.subtractExact(firstNum, secondNum));
                break;
            case '*' :
                System.out.println (firstNum + " * " + secondNum + " = " + Math.multiplyExact(firstNum, secondNum));
                break;
            case '/' :
                System.out.println (firstNum + " / " + secondNum + " = " + Math.floorDiv(firstNum, secondNum));
                break;
            case '^' :
                System.out.println(firstNum + " ^ " + secondNum + " = " + Math.pow(firstNum, secondNum));
                break;
            case '%' :
                System.out.println (firstNum + " % " + secondNum + " = " + Math.floorMod(firstNum, secondNum));
                break;
            default :
                System.out.println("Wrong operator");
        }
    }
}