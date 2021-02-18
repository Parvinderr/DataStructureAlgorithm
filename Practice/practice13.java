// Inverse Of a Given Number


public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
   int num= scn.nextInt();
    int count=0;
    int n =num;
   
 while(num!=0){
   num = num/10;
   count++;
 }
 int result=0;
 for (int i =1;i<=count;i++){
   int s= n%10;
   int res =i *(int)Math.pow(10,s-1);
 
 result+=res;
   n= n/10;
 }
 
 System.out.println(result);
  
 }
}
