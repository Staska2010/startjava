public class Wolf {
	private String sex = "male";
	private String nickName = "Wolfy";
	private int weight = 10;
	private int age = 3;
	private String colour = "gray";

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int newWeight) {
		weight = newWeight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge){
		if (newAge <= 8) {
			age = newAge;
		} else {
			System.out.println("Wrong value: age");
		}
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void walk() {
		System.out.println(nickName + " is going");
	}

	public void sit() {
		System.out.println(nickName + " is sitting");
	}

	public void run() {
		System.out.println(nickName + " is running");
	}

	public void howl() {
		System.out.println(nickName + " is howling");
	}

	public void hunt() {
		System.out.println(nickName + " is hunting");
	}
}