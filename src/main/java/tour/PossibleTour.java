package tour;

import org.apache.log4j.Logger;

public class PossibleTour {
	  private static final Logger LOGGER=Logger.getLogger(PossibleTour.class);
	 
	  public static Logger getLogger() {
      return LOGGER;
    }
	   String name;
	   public boolean isTheDateFree;
	   public boolean  wePay;
	   public boolean areWeInTime;

	   public PossibleTour(String name) {
	       this.name = name;
	   }

	   public void isTheDateFree() {

	       System.out.println("Date  is free!");
	       this.isTheDateFree = true;
	   }

	   public void wePay() {

		   LOGGER.info("We have money!");
	       this.wePay = true;
	   }

	   public void areWeInTime() {
		   LOGGER.info("We have time!");
	       this.areWeInTime = true;
	   }

	   public void travel() throws  InvalidTourDateException {

		   LOGGER.info("Going on a trip!");
	   if (isTheDateFree && wePay && areWeInTime) {
		   LOGGER.info("Hooray, we're coming! " + name + " very glad!");
	   } else {
	       throw new InvalidTourDateException("Sorry" + name + " can't go! Check the conditions of the trip!");
	   }
	 }

	}