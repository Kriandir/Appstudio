public class Iffy {
   private int anIntProp = 42;
   public static void main(String[] args) {
      Iffy me = new Iffy();
      me.callSomeMethods();
   }

   public void callSomeMethods() {
// print altijd een warning komt omdat onjuiste ifstatement(wordt direct semicoloned)
      warnIfNegative(-5);
      warnIfNegative(5);
// wordt geen argument meegegeven aan resetIfNegative bovendien zet ie getal sowieso op 0
// omdat anIntProp= 0 niet in de if statement staat
      resetIfNegative(-5);
      resetIfNegative(5);
      System.out.println(isInRange(5,10,3));
      System.out.println(isInRange(5,0,6));
      System.out.println(isInRangeIfLess(5,10,3));
      System.out.println(isInRangeIfLess(5,0,6));

   }




   /**
    * Print out a warning if the value is negative
    * otherwise don't do anything.
    */
   public void warnIfNegative(int theValue) {
      if(theValue < 0)
      System.out.println("Caution - negative value given (" + theValue + ")");
   }

   /**
    * Print out a warning if the value of anIntProp is negative
    * and also set the value to zero.
    * Otherwise don't do anything.
    */
   public void resetIfNegative(int anIntProp) {
      if(anIntProp < 0) {
         System.out.println("Caution - negative value given woop(" + anIntProp + ")");
         anIntProp = 0;
      }
      System.out.println("Caution - negative value given(" + anIntProp + ")");
   }

   /**
    * return true if value is between upperBound and LowerBound
    * (or equal to either bound) otherwise return false.
    */
   public boolean isInRange(int value, int upperBound, int lowerBound) {
    if(upperBound <= lowerBound)
       System.out.println("Caution upperBound is lower or equal to lowerBound");

    if(lowerBound <= value && value <= upperBound )
      return true;

    else
      return false;
   }

   public boolean isInRangeIfLess(int value, int upperBound, int lowerBound) {
    return (lowerBound <= value && value <= upperBound);
   }
}
