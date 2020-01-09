package person;
import org.apache.log4j.Logger;
import activities.Payment;

public class Adult extends Person implements Payment  {
	private static final Logger LOGGER=Logger.getLogger(Adult.class);
	 
	 public static Logger getLogger() {
    return LOGGER;
    }
	public Adult(String name, int age) {
		super(name, age);
	}

	@Override
	public void pay(int price) {
		LOGGER.info("My name is " + name + 
				" and I'm paying now " + price);
	}

}
