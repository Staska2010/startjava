public class Jaeger {
	private String mark; 
	private String origin;
	private float height;
	private int speed;
	private int strenght;
	private int armor;
	private String energyCore;

	
	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getMark(){
		return mark;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOrigin(){
		return origin;
	}	

	public void setHeight(float height) {
		this.height = height;
	}

	public float getHeight(){
		return height;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed(){
		return speed;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getStrenght(){
		return strenght;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getArmor(){
		return armor;
	}

	public void setEnergyCore(String energyCore) {
		this.energyCore = energyCore;
	}

	public String getEnergyCore(){
		return energyCore;
	}	

	boolean drift() {
		System.out.println("Drift mode enabled");
		return true;
	}

	void move() {
		System.out.println("You passed 5 steps");
	}

	String scanKaiju() {
		return "nothing"; 
	}

	void useVortexCannon() {
		System.out.println(energyCore + " activated");
	}
}