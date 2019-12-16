import java.util.Scanner;

public class TourSeller {
	
	int count;
	
	public void sellTour() {
		Scanner in = new Scanner(System.in);
		      
		try {
	      System.out.print("How many people in tour. Please enter: ");
		  count = in.nextInt();
		  in.close();
		}
		catch(Exception e) {
	      System.out.print("Please enter integer!");
	      count = in.nextInt();
		  in.close();
		}
   
            System.out.print("Tour costs 1000$. For " + count + " it costs " + 1000*count + "$");
	}
}
