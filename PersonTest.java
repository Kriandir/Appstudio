class Person {

   // Properties of the class...
   private String name;
   public int    age;
   private String street;
   private int older;

   // Constructor of the class...
  //  public Person(String aName, int anAge, String aStreet) {
  //     name = aName;
  //     age  = anAge;
  //     street = aStreet;
  //
  //  }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("my age is " + age);
      System.out.println("and i live at " + street);
      commentAboutAge();
   }
   public void growOlder(){
     age += 1;
   }
   public void giveKnighthood()
   {
     name = "Sir " + name;
   }
   public void growOlderBy(int years){
     age += years;
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }

      if (age > 60) {
        System.out.println("You old bastard");
      }
   }

}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      // Person ls = new Person("Luke Skywalker",3,"Happytown");
      // Person wp = new Person("Winston Peters",48,"Sadtown");
      Person ls = new Person();
      Person wp = new Person();
      System.out.println(ls.age);
      ls.talk();
      wp.talk();
      ls.growOlderBy(10);
      ls.talk();
      wp.growOlder();
      wp.giveKnighthood();
      wp.talk();

   }

}
