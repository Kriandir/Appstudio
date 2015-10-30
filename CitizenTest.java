class Citizen {

   // Properties of the class...
   private String name;
   private int    salary;
   private int    savings;
   private int    loan;

   // Constructor of the class...
   public Citizen(String aName, int aSalary, int aSavings, int aLoan) {
      name    = aName;
      salary  = aSalary;
      savings = aSavings;
      loan    = aLoan;
   }
   public Citizen(String aName){
     name = aName;
     salary = 0;
     savings = 0;
     loan = 0;
   }
   public void salaryRise(int amount){
     salary += amount;
   }

   // Methods of the class...
   public int getSalary() {
      return salary;
   }
   public void setSalary(int aSalary) {
      salary = aSalary;
   }
   public int netWorth(){
     int worth = (salary - savings);
     return worth;
   }
   public String toString(){
     String string = name +" salary= "+ salary + " savings= " + savings+ " loan= " + loan;
     return string;
   }

}

class CitizenTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      Citizen e = new Citizen("Ernie", 50000, 2000,   0);
      Citizen b = new Citizen("Bert", 100000,10000,5000);
      Citizen f = new Citizen("Fred");

      System.out.println("Ernie's salary is: " + e.getSalary());
      e.salaryRise(10000);
      System.out.println("Ernie's salary is: " + e.getSalary());
      System.out.println("Ernie's worth is: " + e.netWorth());
      System.out.println(e.toString());
      System.out.println(f.toString());
   }

   // question 4: because it completes a calculation? its not like you have to
   // print shit in order to execute it.
}
