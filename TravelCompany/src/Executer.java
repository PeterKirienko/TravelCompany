
public class Executer {
	public static void main(String[] args) {
		BaseTour trip01 = new BaseTour(10, "Kiev", 220);
		trip01.setPrice(240);
		trip01.printTourInfo();
		trip01.sellTrip(7);
		trip01.printTourInfo();
		trip01.sellTrip(6);
		trip01.printTourInfo();
		

		FamilyTour trip02 = new FamilyTour(2, 1100);
		trip02.location = "Tbilisi";
		trip02.printTourInfo();
		trip02.recalculateOverallPrice();
		
		Adult Max = new Adult("Maxim");
		Child Daniil = new Child("Daniil", Max);
		trip02.sellTour(Max);
		
		LuxuryTour trip03 = new LuxuryTour();
		trip03.location = "Cyprus";
		trip03.insurance = "insurance class AA";
		trip03.printTourInfo();
		
		DivingTour trip4 = new DivingTour(1, "Maldives", 1500);
		Diver Vladimir = new Diver("Vova");
		trip4.registerCustomerForTour(Vladimir);
		

		
	}
}