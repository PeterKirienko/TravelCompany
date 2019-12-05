import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;

public class Executer {
	public static void main(String[] args) {
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
		
		FamilyTour trip02 = new FamilyTour(2, 1100);
		trip02.location = "Tbilisi";
		trip02.printTourInfo();
		trip02.recalculateOverallPrice();
		trip02.transfer();
		
		
		HashSet<String> countrys = new HashSet<String>();
		countrys.add("Belarus");
		countrys.add("France");
		countrys.add("Poland");
		countrys.add("Armenia");
		countrys.add("Albania");
		countrys.add("Brazil");
		countrys.add("China");
		countrys.add("Finland");
		countrys.add("Ireland");
		countrys.add("Monaco");
		countrys.add("Spain");
		countrys.add("Ukraine");
		countrys.add("Zimbabwe");
		countrys.add("Turkey");

        boolean isAdded = countrys.add("France");
        System.out.println(isAdded);       	        
        System.out.printf("Set contains %d elements \n", countrys.size()); 
          
        for(String country : countrys){
          
            System.out.println(country);
        }
		
			
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
		
		Map<Integer, String> states = new HashMap<Integer, String>();
	       states.put(1, "Germany");
	       states.put(2, "Spain");
	       states.put(4, "France");
	       states.put(3, "Italy");
	       String first = states.get(2);
	       System.out.println("Next Tour "+first);
		

		Nick.hasVisa = true;
		Vladimir.hasVisa = false;
		Kostya.hasVisa = true;
		Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Nick);
		Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Vladimir);
		Customs.CustomsOffice.checkIfPersonCanLeaveCountry(Kostya);
		PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();
		myPriorityQueue.add(1);
	    myPriorityQueue.add(2);
	    myPriorityQueue.add(3);
	  
		trip04.sellTourWithDinners(0);
		trip04.sellTourWithDinners(2);
		trip04.sellTourWithDinners(55);
		
		       		
		System.out.println("The number in the queue");
        myPriorityQueue.remove(2);
        System.out.println("After removing:");
        }
			}
