// Permutation of a String


import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
	    int f = factorial(str.length());
		for(int i =0;i<f;i++){
		    StringBuilder sb = new StringBuilder(str);
		    int temp =i;
		    for(int j=sb.length();j>=1;j--){
		        int q = temp/j;
		        int r =temp%j;
		        System.out.print(sb.charAt(r));
		        sb.deleteCharAt(r);
		        temp=q;
		    }
		    System.out.println();
		}
	}
	public static int factorial(int n){
	    int i =1;
	    for(int j=2;j<=n;j++){
	        i *=j;
	    }
	    return i;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
