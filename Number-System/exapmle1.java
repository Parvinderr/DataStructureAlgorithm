// Converting Decimal to any base


  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int count =0;
       int val =0;
       while(n!=0){
          int  rem =n%b;
          n=n/b;
          val += rem*(int)Math.pow(10,count);
          count++;
       }
       return val;
       
   }
  }