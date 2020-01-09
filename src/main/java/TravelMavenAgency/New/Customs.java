package TravelMavenAgency.New;
import org.apache.log4j.Logger;

import person.Person;

public class Customs {
	public static class CustomsOffice {
		private static final Logger LOGGER=Logger.getLogger(Customs.class);
		 
		 public static Logger getLogger() {
	     return LOGGER;
	    }
			public static int leavingPeopleCounter;               	       		
			public static void checkIfPersonCanLeaveCountry(Person person) {
			if (person.hasVisa == true) {
				LOGGER.debug("Go. " + person.name +
						" is #" + (leavingPeopleCounter+1) +
						" who has left Belarus");
				leavingPeopleCounter++;
			}
			else {
				 LOGGER.info(person.name + " can not go, no visa");
			}				
			}
	}
}
