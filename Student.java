/* Need to import java.io package to use the BufferedReader and
	 InputStreamReader.
*/
import java.io.*;

public class Student {

  private static BufferedReader stdIn = new BufferedReader(new
		InputStreamReader(System.in));

  private String name;
  private int age;

  public Student () {
    name = "";
    age = 0;
  }
  public void readAge () throws IOException {
    System.out.print("Input your age: ");
    try{
      age = Integer.parseInt(stdIn.readLine());
      if(age<0 || age>150){
        System.out.println("Please try again");
        readAge();
      }
    }
    catch(IOException e){
      System.out.println("Error this is no good");
      System.exit(0);
    }
    catch(NumberFormatException e){
      age = -1;
      System.out.println("nope");
    }
  }
  public void printAge (){
    System.out.println("Age: " + age);
  }

  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }


  public void printName () {
    System.out.println("Name: " + name);
  }

  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.printName();
    me.readAge();
    me.printAge();

  }
}
