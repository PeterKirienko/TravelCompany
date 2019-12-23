import java.util.InputMismatchException;
import java.util.Scanner;

public class TourSeller {
	
	int count;
	boolean inputValid = false;
	
	public void sellTour() {
		
		while (inputValid != true) {
			try {
				Scanner in = new Scanner(System.in);
			    System.out.print("How many people in tour. Please enter: ");
				count = in.nextInt();
				in.close();
				inputValid = true;
			}
			catch(InputMismatchException e) {
				System.out.print("Please enter integer! \r\n");
			}
		}
		     
        System.out.print("Tour costs 1000$. For " + count + " it costs " + 1000*count + "$");
	}
	
}
