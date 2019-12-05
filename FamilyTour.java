
public class FamilyTour extends BaseTour{
	public int familyMembersCount;
	
	public FamilyTour(int familyMembersCount, int price) {
		this.price = price;
		this.familyMembersCount = familyMembersCount;
	}
	
	@Override
	public void transfer() {
		System.out.println("Transfer by bus");
	}
	
	public void recalculateOverallPrice() {
		this.price = price*familyMembersCount;
		System.out.println("Price for " + familyMembersCount + " is " + price);
	}

}
