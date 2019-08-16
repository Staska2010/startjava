package com.startjava.lesson_4.calculator;

public class Calculator {
    public static void calculate(int firstNum, char operator, int secondNum) {
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