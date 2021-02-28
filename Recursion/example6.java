// Power Logarithmic using recursion



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int r = power(x,n);
        System.out.println(r);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int f = power(x,n/2);
        int res = f*f;
        if(n%2==1){
            res = res*x;
            }
        return res;
    }

}
