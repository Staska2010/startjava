public class Person {
	int height = 180;
	int weight = 80;
	int age = 20;
	boolean isMan = true;
	String name = "John Smith";
	String hairColor = "dark";

	public Person(int height, int weight, int age, boolean isMan, String name, String hairColor) {
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.isMan = isMan;
		this.name = name;
		this.hairColor = hairColor; 
	}

	public void run(int meters) {

	}

	public void say(String somethingToSay) {
		System.out.println(somethingToSay);

	}

	public void sleep(int howManyTime) {

	}

	public void learnJava(int howManyHours) {

	}
}