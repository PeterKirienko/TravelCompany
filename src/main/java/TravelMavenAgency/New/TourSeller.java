package TravelMavenAgency.New;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TourSeller {
	private static final Logger LOGGER=Logger.getLogger(Customs.class);
	public static Logger getLogger() {
   return LOGGER;
  }
	int count;
	boolean inputValid = false;
	
	public void sellTour() {
		
		while (inputValid != true) {
			try {
				Scanner in = new Scanner(System.in);
				LOGGER.info("How many people in tour. Please enter: ");
			  /// Executer.getLogger().info("How many people in tour. Please enter: ");
				count = in.nextInt();
				in.close();
				inputValid = true;
			}
			catch(InputMismatchException e) {
				LOGGER.info("Please enter integer! \r\n");
			}
		}
		     
		LOGGER.info("Tour costs 1000$. For " + count + " it costs " + 1000*count + "$");
	}
	
}