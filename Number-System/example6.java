// Any Base Multiplication


public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     int res =0;
     int p =1;
     while(n2>0){
         int d2 =n2%10;
         n2 /=10;
         int sprt = getProductOfSingleDigit(b,n1,d2);
         res = getSum(b,res,sprt*p);
         p *=10;
     }
     return res;
     
 }
 
 public static int getProductOfSingleDigit(int b,int n1,int d2){
     int res =0;
     int c =0;
     int p=1;
     while(n1>0 || c>0){
         int d1= n1%10;
         n1 /=10;
         int d = d1 *d2+c;
         c = d/b;
         d = d%b;
         res += d*p;
         p *=10;
     }
     return res;
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
