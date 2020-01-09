package TravelMavenAgency.New;

import java.util.HashSet;

import org.apache.log4j.Logger;

public class Catalogue {
	
	private static final Logger LOGGER=Logger.getLogger(Catalogue.class);
	 
	 public static Logger getLogger() {
     return LOGGER;
    }
	
	private HashSet<String> items = new HashSet<String>(); 
	
	
	public void addItem(String newItem) {
		boolean isAdded = items.add(newItem);
		
		if (isAdded==false) {
			LOGGER.info(newItem + " already exists in catalogue");
		}
		else {
			LOGGER.info(newItem + " was added");
		}
	}
	
	 public void printItems() {
		int counter = 1;
	    for(String item : items) {
	    	LOGGER.info(counter + ") " + item);
	    	counter++;
	    }
	    	    	    }
	}
	
