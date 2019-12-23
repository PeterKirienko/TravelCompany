package person;

import interfaces.Payment;

public class Adult extends Person implements Payment  {

	public Adult(String name, int age) {
		super(name, age);
	}

	@Override
	public void pay(int price) {
		System.out.println("My name is " + name + 
				" and I'm paying now " + price);
	}

}
