package com.startjava.lesson_4.guessnumber;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int[] inputtedNumbers = new int[10];
	private int attempts = 0;

	Player(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name; 
	}

	public void setNumber(int number) {
		inputtedNumbers[attempts] = number;
		attempts++;
	}

	public int getNumber() {
		return inputtedNumbers[attempts - 1];
	}

	public void clearStatistics() {
	    Arrays.fill(inputtedNumbers, 0, attempts, 0);
	    attempts = 0;
	}

	public int getNumberOfAttempts() {
		return attempts;
	}

	public int[] getArrayOfNumbers() {
		return Arrays.copyOf(inputtedNumbers, attempts);
	}
}