import java.util.HashSet;

public class Catalogue {
	
	private HashSet<String> items = new HashSet<String>(); 
	
	
	public void addItem(String newItem) {
		boolean isAdded = items.add(newItem);
		
		if (isAdded==false) {
			System.out.println(newItem + " already exists in catalogue");
		}
		else {
			System.out.println(newItem + " was added");
		}
	}
	
	 public void printItems() {
		int counter = 1;
	    for(String item : items) {
	    	System.out.println(counter + ") " + item);
	    	counter++;
	    }
	    	    	    }
	}
	




