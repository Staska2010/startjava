public class JaegerTest {
	public static void main(String[] args){
		Jaeger alpha = new Jaeger();
		alpha.setMark("Mark-1");
		alpha.setOrigin("Russia");
		alpha.setHeight(85.34f);
		alpha.setSpeed(3);
		alpha.setStrenght(10);
		alpha.setArmor(10);
		alpha.setEnergyCore("Stun Core 08");

		Jaeger typhoon = new Jaeger();
		typhoon.setMark("Mark-4");
		typhoon.setOrigin("China");
		typhoon.setHeight(76.2f);
		typhoon.setSpeed(9);
		typhoon.setStrenght(8);
		typhoon.setArmor(6);
		typhoon.setEnergyCore("Midnight Orb 9");

		alpha.useVortexCannon();
		typhoon.useVortexCannon();

		System.out.println("The speed of Alpha is " + alpha.getSpeed());
		alpha.setSpeed(5);
		System.out.println("The speed of Alpha was increased: " + alpha.getSpeed());
	}
}