public class Diver extends Person implements Swimmable {

	public Diver(String name) {
		super(name);
	}

	@Override
	public void swim() {
		System.out.println("I'm " + name + " and I can swim");
	}

}
