import person.*;

public class Customs {
	public static class CustomsOffice {
		public static int leavingPeopleCounter;               	       		
		public static void checkIfPersonCanLeaveCountry(Person person) {
			if (person.hasVisa == true) {
				System.out.println("Go. " + person.name +
						" is #" + (leavingPeopleCounter+1) +
						" who has left Belarus");
				leavingPeopleCounter++;
			}
			else {
				System.out.println(person.name + " can not go, no visa");
			}				
		}
	}
}
