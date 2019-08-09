public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.sex = "male";
		wolfOne.nickName = "Puppy";
		wolfOne.weight = 3;
		wolfOne.age = 1;
		wolfOne.colour = "lightgray";

		System.out.println("This wolf's name is " + wolfOne.nickName + ", he is " + wolfOne.age + " years old.");
		System.out.println("He is " + wolfOne.sex + " and weighs " + wolfOne.weight + " kg, colour is " + wolfOne.colour);

	 	wolfOne.sit();
	 	wolfOne.walk();
	 	wolfOne.hunt();
	 	wolfOne.howl();
	 	wolfOne.run();
	}
}