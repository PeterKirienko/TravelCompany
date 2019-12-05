
public class BaseTour {
	public String location;
	protected int price;
	public int tripsCount;
	
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
		System.out.println("Simple transfer to location");
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
			public void printTourInfo() {
		System.out.println("Tour location: " + location + "\n" +
				"trips count: " + tripsCount + "\n" +
				"price: " + price);
	}
	
	public void sellTour(Payment customer) {
		System.out.println("We have sold tour. Now someone will pay to us");
		customer.pay(price);
	}
	
	
	public void sellTrip(int countOfSoldTrips) {
		if (countOfSoldTrips <= this.tripsCount) {
			this.tripsCount -= countOfSoldTrips;
			System.out.println("We have sold " + countOfSoldTrips + " trips" );
		}
		else {
			System.out.println("Can not sell " + countOfSoldTrips +
					" trips. We have only " + this.tripsCount );
			}
		
	}
}
