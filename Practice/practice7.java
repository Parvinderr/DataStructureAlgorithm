// for printing digits of a number
public class Main{
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     int count =0;
     int n = num;
     while(n!=0){
         n=n/10;
         count++;
     }
     int div = (int)Math.pow(10,count-1);
     while(div!=0){
        int digit = num/div;
        System.out.println(digit);
        num =num%div;
        div = div/10;
     }
     }
}
