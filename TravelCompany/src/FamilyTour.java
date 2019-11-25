
public class FamilyTour extends BaseTour{
	public int familyMembersCount;
	
	public FamilyTour(int familyMembersCount, int price) {
		this.price = price;
		this.familyMembersCount = familyMembersCount;
	}
	
	public void recalculateOverallPrice() {
		this.price = price*familyMembersCount;
		System.out.println("Price for " + familyMembersCount + " is " + price);
	}

}
