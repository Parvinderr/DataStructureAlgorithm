// Toogle Case



import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String s){
	    String res ="";
	for(int i =0;i<s.length();i++){
      String c = s.charAt(i)+"";
      if(isLower(c) == true){
       res +=c.toUpperCase();
      }else{
       res+=c.toLowerCase();
    }
  }
		return res;
	}
	public static boolean isLower(String s){
  if(s==s.toLowerCase()){
    return true;
  }
  return false;
}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}
