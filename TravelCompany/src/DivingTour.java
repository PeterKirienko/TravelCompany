public class DivingTour extends BaseTour {
	
	public DivingTour(int availableTrips, String location, int price) {
		super(availableTrips, location, price);
	}
	
	public void registerCustomerForTour(Swimmable customer) {
		System.out.println("Client registered");
	}
}
