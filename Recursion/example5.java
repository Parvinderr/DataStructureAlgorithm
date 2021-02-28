// Power-Linear Using Recursion


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
        int res =1;
        if(n>0){
            res= x*power(x,n-1);
        }
        return res;
    }

}
