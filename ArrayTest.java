class ArrayTest {

   public static void main(String[] args) {
      ArrayTest x = new ArrayTest();
      x.doStuff();
   }

   public void doStuff() {

      // creates the array fred of ten integers.
      int[] fred = new int[10];
      double[] nums = new double[10];
      // sets the values of the fred array
      for (int i=0; i<10; i++) {
         fred[i] = i;
      }
      double a = 1.0;
      for(int i =0; i<10;i++){
        nums[i] = a;
        a += 0.1;
      }
      ArrayPrint.printArray(nums);
      // prints the values of the fred array
      for (int i=0; i<10; i++) {
         System.out.println(fred[i]);
      }
      for (int i=0; i<10; i++) {
         System.out.println(nums[i]);
      }

      // insert your code for the nums array here:

   }
}
class ArrayPrint{

  public static void printArray(int[] x){
    for (int i=0; i<x.length; i++) {
       System.out.println(x[i]);
    }

  }
  public static void printArray(double[] x){
    for (int i=0; i<x.length; i++) {
       System.out.println(x[i]);
    }
  }
}
