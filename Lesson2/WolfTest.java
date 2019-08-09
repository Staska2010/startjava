public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex("male");
		wolfOne.setNickName("Puppy");
		wolfOne.setWeight(3);
		wolfOne.setAge(1);
		wolfOne.setColour("lightgray");

		System.out.println("This wolf's name is " + wolfOne.getNickName() + ", he is " + wolfOne.getAge() + " years old.");
		System.out.println("He is " + wolfOne.getSex() + " and weighs " + wolfOne.getWeight() + " kg, colour is " + wolfOne.getColour());

	 	wolfOne.sit();
	 	wolfOne.walk();
	 	wolfOne.hunt();
	 	wolfOne.howl();
	 	wolfOne.run();
	}
}