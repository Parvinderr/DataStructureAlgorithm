// Rotate a Number 
  
  
public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int num = scn.nextInt();
     int step = scn.nextInt();
     int n = num;
     
     int div = (int)Math.pow(10,step);
     int front = num%div;
     int last = num/div;
     System.out.print(front);
     System.out.print(last);
    
    }
   }
