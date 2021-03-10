// Subsequence of String Using Recursion


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> res = gss(s);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> newList = new ArrayList<>();
            newList.add("");
            return newList;
        }
        char c = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> resList = gss(s);
        ArrayList<String> mList = new ArrayList<>();
        for(String st : resList){
            // System.out.println(st);
            mList.add(""+st);
        }
        for(String st : resList){
            // System.out.println(c+st);
            mList.add(c+st);
        }
        return mList;
    }

}
