package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		do {
			System.out.println("Enter the expression: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			String[] mathExpression = input.split("\\s");
			Calculator calculator = new Calculator();
			calculator.calculate(mathExpression);
			do {
				System.out.println("Do you want to continue? (yes/no): ");
				confirmation = sc.nextLine();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while(confirmation.equals("yes"));
	}
}