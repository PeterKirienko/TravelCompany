package tour;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import activities.Swimming;

public class DivingTour extends BaseTour {
	
private String PriceFile = "D:/Solvd/Eclipse/MavenNew/New/src/main/java";
	
	public static int generalOrder = 1;
	public int orderOfDiving; 
	
	int PRICE_FOR_ONE_TIME_DINNER_TOUR;
	int PRICE_FOR_TWO_TIME_DINNER_TOUR;
	int PRICE_FOR_THREE_TIME_DINNER_TOUR;

	public DivingTour(int availableTrips, String location, int price) {
		super(availableTrips, location, price);
		orderOfDiving = generalOrder;
		generalOrder++;
		readPriceProperty();
	}
	
	private void readPriceProperty() {
		Properties priceProps = new Properties();
		try {
			FileInputStream fis = new FileInputStream(PriceFile);
			priceProps.loadFromXML(fis);
			System.out.println(priceProps);
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		String oneTimePrice = priceProps.getProperty("ONE_TIME_DINNER_TOUR");
	    String twoTimePrice = priceProps.getProperty("TWO_TIME_DINNER_TOUR");
	    String threeTimePrice = priceProps.getProperty("THREE_TIME_DINNER_TOUR");

		try {
			PRICE_FOR_ONE_TIME_DINNER_TOUR = Integer.parseInt(oneTimePrice);		
			PRICE_FOR_TWO_TIME_DINNER_TOUR = Integer.parseInt(twoTimePrice);		
			PRICE_FOR_THREE_TIME_DINNER_TOUR = Integer.parseInt(threeTimePrice);
		} catch (NumberFormatException e) {
			System.out.println("DivingTourPrice is not valid");
           trow InvalidParameterException
		}
	    }
	
	 @Override
	 public void printTourInfo() {
		System.out.println("Tour location: " + location + "\n" +
		"trips count: " + tripsCount + "\n" +
		"price: " + price + "\n" +
	"ORDER: " + orderOfDiving);
     }
	
	public void registerCustomerForTour(Swimming customer) {
		System.out.println("Client registered");
	}
	
	public void sellTour(Swimming customer) {
		System.out.println("Client registered");
	}
		
	public void sellTourWithDinners(int dinnersCount) {
		switch(dinnersCount) {
		  case 1:
			  System.out.println("Price is " + PRICE_FOR_ONE_TIME_DINNER_TOUR);
		    break;
		  case 2:
			  System.out.println("Price is " + PRICE_FOR_TWO_TIME_DINNER_TOUR);
		    break;
		  case 3:
			  System.out.println("Price is " + PRICE_FOR_THREE_TIME_DINNER_TOUR);
		    break;
		  case 0:
			  System.out.println("No need to pay for 0 dinner");
		    break;
		  default:
			  System.out.println("Invalid dinnersCount value. Should be from 0 to 3");
		}
	}
	
	@Override
	public void transfer() {
		System.out.println("Transfer on ship");
		
		
	}

}
