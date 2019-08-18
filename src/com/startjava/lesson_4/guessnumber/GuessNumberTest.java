package com.startjava.lesson_4.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player one, enter your name: ");
		Player playerOne = new Player(sc.nextLine());
		System.out.println("Player two, enter your name: ");
		Player playerTwo = new Player(sc.nextLine());
		System.out.println("You have 10 attempts");
		GuessNumber game = new GuessNumber(playerOne, playerTwo);
		
		String confirmation;
		do {
			game.play();
			do {
				System.out.println("Do you want to repeat? (yes/no): ");
				confirmation = sc.next();
			} while (!confirmation.equals("yes") && !confirmation.equals("no"));
		} while(confirmation.equals("yes")); 	
	}	
}