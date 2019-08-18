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
        for (int nextAttempt = 0; nextAttempt < 10; nextAttempt++) {
            if (compareNumbers(firstPlayer)) {
                break;
            } else if (compareNumbers(secondPlayer)) {
                break;
            }
        }
        endOfGame();
    }

    private void initGame() {
        firstPlayer.clearStatistics();
        secondPlayer.clearStatistics();
        generateGuessNumber();
    }

    private void generateGuessNumber() {
        computerNumber = (int) (Math.random() * 100 + 1);
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
        printAttempts(firstPlayer);
        printAttempts(secondPlayer);
        decisionsSummary(firstPlayer);
        decisionsSummary(secondPlayer);
    }

    private void printAttempts(Player player) {
        System.out.println(player.getName() + " your numbers: ");
        for (int attempt : player.getArrayOfNumbers()) {
            System.out.print(attempt + " ");
        }
        System.out.println("\n");
    }

    private void decisionsSummary(Player player) {
        int decision = (player.getNumber() == computerNumber) ? player.getNumberOfAttempts() : -1;
        if (decision > 0) {
            System.out.println(player.getName() + " guessed right on the " + decision + " try.");
        } else {
            System.out.println(player.getName() + " has run out of attempts");
        }
    }
}