// String Compression


import java.io.*;
import java.util.*;

public class Main {
	public static String compression1(String str){
		String res ="";
		char s = str.charAt(0);
		res+=s;
		for(int i =0;i<str.length()-1;i++){
		    char c1 = str.charAt(i);
		    char c2 = str.charAt(i+1);
		    if(c1!=c2){
		        res+=c2;
		    }  
		}
		return res;
	}

	public static String compression2(String str){
		String res ="";
		char s = str.charAt(0);
		res+=s;
		int count=1;
		for(int i =0;i<str.length()-1;i++){
		    char c1 = str.charAt(i);
		    char c2 = str.charAt(i+1);
		    if(c1==c2){
		        count++;
		    }else{
		        if(count>1){
		            res+=count;
		            count=1;
		        }
		        res+=c2;
		    }
		}
		    if(count>1){
		        res+=count;
		        count=1;
		    }
		return res;
		}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
