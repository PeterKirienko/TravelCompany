package person;

import org.apache.log4j.Logger;

import activities.Swimming;

public class Diver extends Person implements Swimming {
	private static final Logger LOGGER=Logger.getLogger(Diver.class);
	 
	  public static Logger getLogger() {
    return LOGGER;
  }
	
	public Diver(String name, int age) {
		super(name, age);
	}

	@Override
	public void swim() {
		 LOGGER.info("I'm " + name + " and I can swim");
	}

}
