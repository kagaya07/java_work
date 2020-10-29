package exday3;


public abstract class Bird1 {

	private String name;

	Bird1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	abstract void sing();

}


