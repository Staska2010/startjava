package com.startjava.lesson_4.calculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CalculatorTest {
	public static void main(String[] args) {
		String confirmation;
		do {
			System.out.println("Enter the expression: ");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
				String[] splitInput = input.split("\\s");
				Calculator.calculate(Integer.parseInt(splitInput[0]), splitInput[1].charAt(0), Integer.parseInt(splitInput[2]));
				do {
					System.out.println("Do you want to continue? (yes/no): ");
					confirmation = sc.nextLine();
				} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while(confirmation.equals("yes"));
	}
}