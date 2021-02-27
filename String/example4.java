// String with difference of two character


import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String s){
	    char ch = s.charAt(0);
		String res ="";
		res+=ch;
		for(int i =0;i<s.length()-1;i++){
      char c = s.charAt(i);
      char c1 = s.charAt(i+1);
      int n =(int) c;
      int n1 = (int) c1;
      int r= n1-n;
      res+=r;
      res+=c1;
    }
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
