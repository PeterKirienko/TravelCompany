public class DivingTour extends BaseTour {
	
	public static int generalOrder = 1;
	public int orderOfDiving; 
	
	static final int PRICE_FOR_ONE_TIME_DINNER_TOUR = 300;
	static final int PRICE_FOR_TWO_TIME_DINNER_TOUR = 450;
	static final int PRICE_FOR_THREE_TIME_DINNER_TOUR = 550;

	
	public DivingTour(int availableTrips, String location, int price) {
		super(availableTrips, location, price);
		orderOfDiving = generalOrder;
		generalOrder++;
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
