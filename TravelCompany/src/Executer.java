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
		
		
		//public static  void main (String[] args) {
			//Tourist tourist = new Tourist("Anton",21);	
			//Tourist traveler=new Traveler("Gleb",25);
			//List <Tourist>tour = Arrays.asList(tourist,traveler);
			//for (Tourist d : tour) {
				//d.travel();
			//}
			//}
		 
		
	}
}