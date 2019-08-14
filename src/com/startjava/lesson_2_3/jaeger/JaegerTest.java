package com.startjava.lesson_2_3.jaeger;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger alpha = new Jaeger("Mark-1", "Russia", 85.34f, 3, 10, 10, "Stun Core 08");
		Jaeger typhoon = new Jaeger("Mark-4", "China", 76.2f, 9, 8, 6, "Midnight Orb 9");

		alpha.useVortexCannon();
		typhoon.useVortexCannon();

		System.out.println("The speed of Alpha is " + alpha.getSpeed());
		alpha.setSpeed(5);
		System.out.println("The speed of Alpha was increased: " + alpha.getSpeed());
	}
}