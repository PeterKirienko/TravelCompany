public class Diver extends Person implements Swimming {

	public Diver(String name, int age) {
		super(name, age);
	}

	@Override
	public void swim() {
		System.out.println("I'm " + name + " and I can swim");
	}

}
