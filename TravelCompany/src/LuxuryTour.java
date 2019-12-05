import java.util.ArrayList;

public class LuxuryTour extends BaseTour {
	public String insurance;
	
	private ArrayList<Person> people;
	private int tourCapacity = 2;
	
	public LuxuryTour() {
		people = new ArrayList<Person>();
	}
	
	@Override
	public void printTourInfo() {
		System.out.println("Tour location: " + location + "\n" +
		"trips count: " + tripsCount + "\n" +
		"price: " + price + "\n" +
		"insurace type: " + insurance);
   }
	
	public void addPersonToGroupTour(Person person) {
		if (people.size() < tourCapacity) {
			people.add(person);
			System.out.println(person.name + " added to group tour");
		}
		else {
			System.out.println("Could not add new person. Group is full");
		}

	}
	
	@Override
	public void transfer() {
		System.out.println("Transfer by plane business class");
	}

}
