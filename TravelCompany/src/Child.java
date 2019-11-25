
public class Child extends Person {

	public Adult parent;
	public Child(String name, Adult parent) {
		super(name);
		this.parent = parent;
	}

}
