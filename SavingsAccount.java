public class SavingsAccount{

  private int balance;

  public SavingsAccount(){
    balance = 0;
  }
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  public void deposit(int howMuch){
    if(howMuch < 0){
      System.out.println("Error ammount deposited should be non-negative");
    }
    else{
      balance += howMuch;
    }

  }
  public void greet(){
    System.out.println("Hello user");
  }
  public void showBalance(){
    System.out.println(balance);
  }
  public void withdraw(int howMuch){
    if(howMuch < 0){
      System.out.println("Error ammount withdrawn should be non-negative");
    }
    else{
      balance -= howMuch;
    }

  }
}
