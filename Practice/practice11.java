// Prime Factorization 


public class Main{

public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();
    int i =2;
    int s =i;
    while(n!=1)
        
        if (n%s==0){
            n=n/s;
            System.out.print(s+ " ");
        }else {
          s++;
        }
        
 }
}

