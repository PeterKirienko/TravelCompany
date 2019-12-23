import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map.Entry;

public class TourSchedule {
	public HashMap<String, LocalDate> myHashMap = new HashMap<String, LocalDate>();
 
	public void printTour() {
      for(Entry<String, LocalDate> entry: myHashMap.entrySet())
      System.out.println(entry.getKey() + " - " + entry.getValue());
	}
	
	public void addTour(String country, int day, int month, int year) {
		try {
			LocalDate newDate = LocalDate.of(year, month, day);
			LocalDate today = LocalDate.now();
			if (newDate.isAfter(today)) {
				myHashMap.put(country, newDate);
				System.out.println("Tour added!");
			}
			else {				
				 System.out.println("Tour can not be added. Date should be in future.");
			}
		} catch (DateTimeException e) {
			System.out.println("Tour has wrong date");
		} finally {
		      System.out.println("Thanks for using Coral Travel!");
	    }
		
	}
	
 }
