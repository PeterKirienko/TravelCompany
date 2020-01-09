package tour;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.apache.log4j.Logger;

import activities.Payment;

public class BaseTour {
	public String location;
	protected int price;
	public int tripsCount;
	//private String BaseTourPrice = "D:/Solvd/Eclipse/TravelMaven/TravelMaven/src/main/java/BaseTourPrice.xml";
	 private static final Logger LOGGER=Logger.getLogger(PossibleTour.class);
	 
	 public static Logger getLogger() {
     return LOGGER;
   }
	public BaseTour(int availableTrips, String location, int price) {
		this.location = location;
		this.tripsCount = availableTrips;
		this.price = price;
	}
	
	public BaseTour() {
	}
	
	public int getPrice() {
		return price;
	}
	
	public void transfer() {
		LOGGER.info("Simple transfer to location");
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//private void readPriceProperty() {
	//	Properties priceProps = new Properties();
	//	try {
		//	FileInputStream fis = new FileInputStream(BaseTourPrice);
			//priceProps.loadFromXML(fis);
			//System.out.println(priceProps);
	//	} catch (InvalidPropertiesFormatException e) {
		//	e.printStackTrace();
	//	} catch (IOException e) {
		//	e.printStackTrace();
	//	}
		

	//	String fixPriceFromFile = priceProps.getProperty("FixPrice");
		
	//	try {
		//	this.price = Integer.parseInt(fixPriceFromFile);	
	//	} catch (NumberFormatException e) {
	//		LOGGER.info("FixPrice is not valid");
			//trow InvalidParameterException
	//	}
//	}
	public void printTourInfo() {
    LOGGER.info("Tour location: " + location + "\n" +
	    "trips count: " + tripsCount + "\n" +
	    "price: " + price);
	}
	
	public void sellTour(Payment customer) {
		LOGGER.info("We have sold tour. Now someone will pay to us");
		customer.pay(price);
	}
	
	
	public void sellTrip(int countOfSoldTrips) {
		if (countOfSoldTrips <= this.tripsCount) {
			this.tripsCount -= countOfSoldTrips;
			LOGGER.info("We have sold " + countOfSoldTrips + " trips" );
		}
		else {
			LOGGER.info("Can not sell " + countOfSoldTrips +
					" trips. We have only " + this.tripsCount );
		}
		
	}
}
