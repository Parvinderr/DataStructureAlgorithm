// Any Base Addition


  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       int result =0;
       int carry =0;
       int p =1;
       while(n1>0 || n2>0 ||carry>0){
           int v1 = n1%10;
           int v2 = n2%10;
           int v = v1+v2+ carry;
           n1 /=10;
           n2 /=10;
           int rem = v%b;
           carry = v/b;
           result += rem*p;
           p *=10;
       }
       return result;
   }
  }
