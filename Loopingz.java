public class Loopingz{
  public static void main(String[] args){
    Loopingz me = new Loopingz();
    me.woops();
  }
  public void woops(){

    int[] fred = new int[10];
    for(int i= 1; i<=10; i++){
      fred[i-1] =i;
    }
    System.out.println(fred[9]);
  }
}
