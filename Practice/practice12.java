// finding lcm and gcm of a given number


public class Main{
    
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
            int a = (int) Math.max(m,n);
      int b;
      if(a==m){
        b=n;
      }else{
        b=m;
      }
      while(a!=0){
        if (a%b==0){
          break;
        }else{
          int z = a%b;
        
          a=b;
          b=z;
        }
      
      }
      System.out.println(b);

int c = n*m/b;
System.out.println(c);
    
     }
    }
