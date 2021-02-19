// Any base to any base


  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int result = anyToAnyBase(n,sourceBase,destBase);
     System.out.println(result);
   }
   public static int anyToAnyBase(int n,int b1,int b2){
       int count =0;
       int last =0;
       int val1=0;
       while(n!=0){
           last = n%10 * (int)Math.pow(b1,count);
           val1 +=last;
           n = n/10;
           count++;
       }
      
       int count1=0;
       int rem =0;
       int val2=0;
       while(val1!=0){
           rem =val1 %b2;
           val2+= rem*(int)Math.pow(10,count1);
           val1 =val1/b2;
           count1++;
       }
       return val2;
   }
  }