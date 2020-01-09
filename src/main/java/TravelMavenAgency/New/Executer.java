package TravelMavenAgency.New;
//import org.apache.logging.log4j.LogManager;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;
import java.util.Scanner;
import person.Adult;
import person.Child;
import person.Diver;
import tour.BaseTour;
//import tour.DivingTour;
//import tour.FamilyTour;
import tour.InvalidTourDateException;
import tour.LuxuryTour;
import tour.PossibleTour;


public class Executer {
	 private static final Logger LOGGER=Logger.getLogger(Executer.class);
	 
	 public static Logger getLogger() {
		 return LOGGER;
	 }
	    public static void main(String[] args) {
	
//		DivingTour divingTourWithPrices = new DivingTour(5, "Maldives", 2000);  
	//	divingTourWithPrices.sellTourWithDinners(1);
	//	divingTourWithPrices.sellTourWithDinners(2);		
		
		
		//File file = new File("D:/Solvd/Eclipse/TravelMaven/TravelMaven/src/main/java/LuxuryTour.xml");
		//Properties properties = new Properties();
		
		//try {
		//	properties.load(new FileReader(file));
		//} catch (FileNotFoundException e) {
		//	e.printStackTrace();
	//	} catch (IOException e) {
			//e.printStackTrace();
		//}
		//String location = properties.getProperty("location");
		//String insurance = properties.getProperty("insurance");
		//logger.info(location + "   ^   " + insurance);
	
		
		
		
		
		
		TourSeller test = new TourSeller();
		test.sellTour();
				
//		BaseTour trip01 = new BaseTour(10, "Kiev", 220);
	//	trip01.setPrice(240);
	//	trip01.printTourInfo();
	//	trip01.sellTrip(7);
	//	trip01.printTourInfo();
	//	trip01.sellTrip(6);
	//	trip01.printTourInfo();
	//	trip01.transfer();
	//	final int I=2;
	//	final int A=3;
	
	
		PossibleTour possibleTour = new PossibleTour("Vova");
		possibleTour.isTheDateFree();
	    possibleTour.wePay();
	    possibleTour.areWeInTime();	   
     	try {
		possibleTour.travel();
		} catch (InvalidTourDateException e) {
		LOGGER.error(e.getMessage());
		LOGGER.error("Check the possibility of a trip! Date free? " + possibleTour.isTheDateFree + "\r\n Got any money? "
		+ possibleTour.wePay + "\r\n Do you have  any time? " + possibleTour.areWeInTime);
		}	
	
		
	    Catalogue countries = new Catalogue();
		
		countries.addItem("Belarus");
		countries.addItem("Spain");
		countries.addItem("Belarus");
		countries.addItem("Germany");
		countries.printItems();
		
		Catalogue catalogue = new Catalogue();	
		catalogue.addItem("Algeria");
		catalogue.addItem("Argentina");
		catalogue.addItem("Armenia");
		catalogue.addItem("Argentina");
		catalogue.printItems();
							
		TourSchedule tours2 = new TourSchedule();
		tours2.addTour("Zimbabwe",21,12,2021);
		tours2.addTour("Algeria",21,12,2023);
		tours2.addTour("italy",21,12,2010);
		tours2.addTour("france",44,55,2020);
		tours2.addTour("Finland",25,12,2019);
		tours2.printTour();
		
//		Rating rating = new Rating();
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number 1: ");
//        int number1 = in.nextInt();
//        System.out.print("Input a number 2: ");
//        int number2 = in.nextInt();
//        in.close();       
//        int result1 = rating.sum(number1, number2);
//        System.out.print("Sum is: " + result1);
        
   //	    FamilyTour trip02 = new FamilyTour(2);
//		trip02.location = "Tbilisi";
	//	trip02.printTourInfo();
	//	trip02.recalculateOverallPrice();
	//	trip02.transfer();
		
	//	Adult Max = new Adult("Maxim", 35);
	//	Child Daniil = new Child("Daniil", 10, Max);
	//	trip02.sellTour(Max);
	//	logger.info(I+" Boys only in  this Tour");
				
		LuxuryTour trip03 = new LuxuryTour();
		trip03.location = "Cyprus";
		trip03.insurance = "insurance class AA";
		trip03.printTourInfo();
		trip03.transfer();
	//	logger.info(A+" Girls only in  this Tour");
		
	//	DivingTour trip04 = new DivingTour(1, "Maldives", 1500);
	//	Diver Vladimir = new Diver("Vova", 10);
	//	trip04.registerCustomerForTour(Vladimir);
	//	trip04.printTourInfo();
	//	trip03.addPersonToGroupTour(Max);
	//	trip03.addPersonToGroupTour(Daniil);
	//	trip03.addPersonToGroupTour(Vladimir);
		
		
	//    DivingTour trip05 = new DivingTour(1, "Sochi", 1200);
	//	Diver Kostya = new Diver("Kostya", 17);
	//	trip05.registerCustomerForTour(Kostya);
	//	trip05.printTourInfo();
		
	//	DivingTour trip06 = new DivingTour(1, "Melburn", 2222);
	//	Diver Nick = new Diver("Nick", 25);
	//	trip06.registerCustomerForTour(Nick);
	//	trip06.printTourInfo();
		
		
	//	Nick.hasVisa = true;
	//	Vladimir.hasVisa = false;
	//	Kostya.hasVisa = true;
	//	Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Nick);
	//	Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Vladimir);
	//	Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Kostya);
	
	  
	//	trip04.sellTourWithDinners(0);
	//	trip04.sellTourWithDinners(2);
	//	trip04.sellTourWithDinners(55);
			       		
		
        }
}

