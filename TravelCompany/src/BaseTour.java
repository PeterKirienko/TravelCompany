
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

	public void setPrice(int price) {
		this.price = price;
	}
	

	
	public void printTourInfo() {
		System.out.println("Tour location: " + location + "\n" +
				"trips count: " + tripsCount + "\n" +
				"price: " + price);
	}
	
	public void sellTour(Payble customer) {
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

	//public void saleTours();
	//public void custometSearh();
	//public void ticketReservation();
	//public void arrangeSales();
	
	//public void price();
	//public void location();
	//public void direction();
	//public void numberOfPeople();
}
