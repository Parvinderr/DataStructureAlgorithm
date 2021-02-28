// Factorial Using Recursion

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r =factorial(n);
        System.out.println(r);
    }

    public static int factorial(int n){
    int res=1;
    if(n>1){
      res =n*factorial(n-1);
    }
    return res;
  }
    

}
