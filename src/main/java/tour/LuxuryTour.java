package tour;
import java.util.ArrayList;

import org.apache.log4j.Logger;

import TravelMavenAgency.New.Executer;
import person.Person;

public class LuxuryTour extends BaseTour {
	private static final Logger LOGGER=Logger.getLogger(LuxuryTour.class);
	 
	 public static Logger getLogger() {
     return LOGGER;
     }
	
	public String insurance;
	private ArrayList<Person> people;
	private int tourCapacity = 2;
	
	public LuxuryTour() {
		people = new ArrayList<Person>();
	}
	
	@Override
	public void printTourInfo() {
		LOGGER.info("Tour location: " + location + "\n" +
		"trips count: " + tripsCount + "\n" +
		"price: " + price + "\n" +
		"insurace type: " + insurance);
   }
	
	public void addPersonToGroupTour(Person person) {
		if (people.size() < tourCapacity) {
			people.add(person);
			LOGGER.error(person.name + " added to group tour");
		}
		else {
			LOGGER.error("Could not add new person. Group is full");
		}

	}
	
	@Override
	public void transfer() {
		LOGGER.info("Transfer by plane business class");
	}

}
