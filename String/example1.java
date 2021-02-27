// All Pallindrome in String

import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
	int l = str.length();
	for(int i =0;i<=l;i++){
	    for(int j =i+1;j<=l;j++){
	        String ss =str.substring(i,j);
	        if(isPalindrome(ss)==true){
	            System.out.println(ss);
	        }}
	}	
	}
	public static boolean isPalindrome(String s){
	    int i =0;
	    int j = s.length()-1;
	    while(i<=j){
	       char c = s.charAt(i);
	       char c1 = s.charAt(j);
	       if(c!=c1){
	           return false;
	       }
	       i++;
	       j--;
	    }
	    return true;
	    
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}