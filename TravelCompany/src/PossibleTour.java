public class PossibleTour {

   String name;
   boolean isTheDateFree;
   boolean  �anWePay;
   boolean areWeInTime;

   public PossibleTour(String name) {
       this.name = name;
   }

   public static void main(String[] args) {

   }

   public void isTheDateFree() {

       System.out.println("Date  is free!");
       this.isTheDateFree = true;
   }

   public void �anWePay() {

       System.out.println("We have money!");
       this.�anWePay = true;
   }

   public void areWeInTime() {
       System.out.println("We have time!");
       this.areWeInTime = true;
   }

   public void travel() throws  InvalidTourDateException {

   System.out.println("Going on a trip!");
   if (isTheDateFree && �anWePay && areWeInTime) {
       System.out.println("Hooray, we're coming! " + name + " very glad!");
   } else {
       throw new InvalidTourDateException("Sorry" + name + " can't go! Check the conditions of the trip!");
   }
 }

}