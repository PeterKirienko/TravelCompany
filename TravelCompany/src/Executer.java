import java.util.Scanner;
import tour.*;
import person.*;

public class Executer {
	public static void main(String[] args) {
		TourSeller test = new TourSeller();
		test.sellTour();
		
		
		BaseTour trip01 = new BaseTour(10, "Kiev", 220);
		trip01.setPrice(240);
		trip01.printTourInfo();
		trip01.sellTrip(7);
		trip01.printTourInfo();
		trip01.sellTrip(6);
		trip01.printTourInfo();
		trip01.transfer();
		final int I=2;
		final int A=3;
	
		PossibleTour possibleTour = new PossibleTour("Vova");
		possibleTour.isTheDateFree();

	    possibleTour.ñanWePay();

	    possibleTour.areWeInTime();
		   
     	try {
		possibleTour.travel();
		} catch (InvalidTourDateException e) {
		System.out.println(e.getMessage());
		System.out.println("Check the possibility of a trip! Date free? " + possibleTour.isTheDateFree + "\r\n Got any money? "

		+ possibleTour.ñanWePay + "\r\n Do you have  any time? " + possibleTour.areWeInTime);
		
		TourSeller seller = new TourSeller();
	    seller.sellTour();
		
		
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
		
		Rating rating = new Rating();
    Scanner in = new Scanner(System.in);
    System.out.print("Input a number 1: ");
    int number1 = in.nextInt();
    System.out.print("Input a number 2: ");
    int number2 = in.nextInt();
    in.close();

    int result1 = rating.sum(number1, number2);
    System.out.print("Sum is: " + result1);

    FamilyTour trip02 = new FamilyTour(2, 1100);
		trip02.location = "Tbilisi";
		trip02.printTourInfo();
		trip02.recalculateOverallPrice();
		trip02.transfer();
		
		Adult Max = new Adult("Maxim", 35);
		Child Daniil = new Child("Daniil", 10, Max);
		trip02.sellTour(Max);
		System.out.println(I+" Boys only in  this Tour");
				
		LuxuryTour trip03 = new LuxuryTour();
		trip03.location = "Cyprus";
		trip03.insurance = "insurance class AA";
		trip03.printTourInfo();
		trip03.transfer();
		System.out.println(A+" Girls only in  this Tour");
		
		DivingTour trip04 = new DivingTour(1, "Maldives", 1500);
		Diver Vladimir = new Diver("Vova", 10);
		trip04.registerCustomerForTour(Vladimir);
		trip04.printTourInfo();
		trip03.addPersonToGroupTour(Max);
		trip03.addPersonToGroupTour(Daniil);
		trip03.addPersonToGroupTour(Vladimir);
		
	  DivingTour trip05 = new DivingTour(1, "Sochi", 1200);
		Diver Kostya = new Diver("Kostya", 17);
		trip05.registerCustomerForTour(Kostya);
		trip05.printTourInfo();
		
		DivingTour trip06 = new DivingTour(1, "Melburn", 2222);
		Diver Nick = new Diver("Nick", 25);
		trip06.registerCustomerForTour(Nick);
		trip06.printTourInfo();
				
		Nick.hasVisa = true;
		Vladimir.hasVisa = false;
		Kostya.hasVisa = true;
		Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Nick);
		Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Vladimir);
		Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Kostya);
	
	  
		trip04.sellTourWithDinners(0);
		trip04.sellTourWithDinners(2);
		trip04.sellTourWithDinners(55); 
    }
  }
}
