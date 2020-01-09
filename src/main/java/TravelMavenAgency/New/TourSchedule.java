package TravelMavenAgency.New;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class TourSchedule {
	private static final Logger LOGGER=Logger.getLogger(Customs.class);
	 
	 public static Logger getLogger() {
    return LOGGER;
   }
	public HashMap<String, LocalDate> myHashMap = new HashMap<String, LocalDate>();
 
	public void printTour() {
      for(Entry<String, LocalDate> entry: myHashMap.entrySet())
    	  LOGGER.info(entry.getKey() + " - " + entry.getValue());
	}
	
	public void addTour(String country, int day, int month, int year) {
		try {
			LocalDate newDate = LocalDate.of(year, month, day);
			LocalDate today = LocalDate.now();
			if (newDate.isAfter(today)) {
				myHashMap.put(country, newDate);
				LOGGER.info("Tour added!");
			}
			else {				
				LOGGER.info("Tour can not be added. Date should be in future.");
			}
		} catch (DateTimeException e) {
			    LOGGER.info("Tour has wrong date");
		} finally {
			    LOGGER.info("Thanks for using Coral Travel!");
	    }
		
	}
	
 }
