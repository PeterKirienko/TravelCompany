public class LuxuryTour extends BaseTour {
	public String insurance;
	
	@Override
	public void printTourInfo() {
		System.out.println("Tour location: " + location + "\n" +
		"trips count: " + tripsCount + "\n" +
		"price: " + price + "\n" +
		"insurace type: " + insurance);
   }
	
	@Override
	public void transfer() {
		System.out.println("Transfer by plane business class");
	}

}
