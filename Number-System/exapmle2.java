// any base to decimal

public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
       int count=0;
       int val=0;
       int last=0;
      while(n!=0){
          last = n%10* (int)Math.pow(b,count);
          val+=last;
          n=n/10;
          count++;
      }
      return val;
   }
  }