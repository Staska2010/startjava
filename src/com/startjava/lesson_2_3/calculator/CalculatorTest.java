package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the first number: ");
			int firstNumber = sc.nextInt();
			System.out.println("Enter the operator: ");
			char operator = sc.next().charAt(0);
			System.out.println("Enter the second number: ");
			int secondNumber = sc.nextInt();
			Calculator.calculate(firstNumber, operator, secondNumber);
	
			do {
				System.out.println("Do you want to continue? (yes/no): ");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while(confirmation.equals("yes"));
	}
}