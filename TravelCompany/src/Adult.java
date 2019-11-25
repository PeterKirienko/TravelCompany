
public class Adult extends Person implements Payble  {

	public Adult(String name) {
		super(name);
	}

	@Override
	public void pay(int price) {
		System.out.println("My name is " + name + 
				" and I'm paying now " + price);
	}

}
