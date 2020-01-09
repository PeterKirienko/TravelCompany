package person;

public class Child extends Person {

	public Adult parent;
	public Child(String name, int age, Adult parent) {
		super(name, age);
		this.parent = parent;
	}

}
