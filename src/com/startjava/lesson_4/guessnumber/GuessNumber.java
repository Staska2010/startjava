package com.startjava.lesson_4.guessnumber;

import java.util.Scanner;

class GuessNumber {
	private int computerNumber;
	private Player firstPlayer, secondPlayer;
	private Scanner sc = new Scanner(System.in);

	GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	void play() {
		firstPlayer.clearStatistics();
		secondPlayer.clearStatistics();
		generateGuessedNumber();
		while (firstPlayer.getNumberOfAttempts() < 10 && secondPlayer.getNumberOfAttempts() < 10) {
		    if (compareNumbers(firstPlayer)) {
		        break;
		    } else if (compareNumbers(secondPlayer)) {
                    break;
		    }
		}
		endOfGame();
	}

	private void generateGuessedNumber() {
		computerNumber = (int)(Math.random() * 100 + 1);
		System.out.println("Computer made a number [0; 100]...");
	}

	private boolean compareNumbers(Player player) {
		if (player.getNumberOfAttempts() == 9) {
			System.out.println("\nThis is your last chance!");
		}
		System.out.println(player.getName() + " it's your turn: ");
        inputNumber(player);
        if (player.getNumber() > computerNumber) {
        	System.out.println("You number is greater than computer number");
        } else if (player.getNumber() < computerNumber) {
        	System.out.println("You number is less than computer number");
        } else {
        	System.out.println("You guessed!");
        	return true;
        }
        return false;
	}

	private void inputNumber(Player player) {
		int number = sc.nextInt();
		System.out.println("Player " + player.getName() + " enters number " + number);
		player.setNumber(number);
        System.out.println("Numbers of attempts: " + player.getNumberOfAttempts());
	}

	private void endOfGame() {
		printArrayOfPlayer(firstPlayer);
		printArrayOfPlayer(secondPlayer);
		decisionsSummary(firstPlayer);
		decisionsSummary(secondPlayer);
	}

	private void printArrayOfPlayer(Player player) {
		System.out.println(player.getName() + " your numbers: ");
		for(int i: player.getArrayOfNumbers()) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	private void decisionsSummary(Player player) {
		int decision = player.findDecision(computerNumber);
		if (decision > 0) {
			System.out.println(player.getName() + " guessed right on the " + decision + " try.");
		} else if (decision < 0 && player.getArrayOfNumbers().length == 10) {
			System.out.println(player.getName() + " has run out of attempts");
		}
	}
}