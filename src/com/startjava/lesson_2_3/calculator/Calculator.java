package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public static void calculate(int firstNum, char operator, int secondNum) {   
        switch (operator) {
            case '+' : 
                System.out.println (firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
                break;
            case '-' : 
                System.out.println (firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
                break;
            case '*' : 
                System.out.println (firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
                break;
            case '/' : 
                System.out.println (firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                break;
            case '^' : 
                int powResult = 1;
                for (int i = 1; i <= secondNum; i++) {
                    powResult *= firstNum;
                }
                System.out.println(firstNum + " ^ " + secondNum + " = " + powResult);
                break;
            case '%' : 
                System.out.println (firstNum + " % " + secondNum + " = " + (firstNum % secondNum));
                break;
            default : 
                System.out.println("Wrong operator");
        }
    }
}