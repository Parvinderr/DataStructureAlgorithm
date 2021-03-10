// KeyPad Combination using Recursion


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        ArrayList<String> res =getKPC(s);
        System.out.println(res);

    }
    static String[] l = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> mList = new ArrayList<>();
            mList.add("");
            return mList;
        }
        char c = str.charAt(0);
        String s = str.substring(1);
        ArrayList<String> bList = getKPC(s);
        ArrayList<String> rList = new ArrayList<>();
        String code = l[c-'0'];
        for(int i =0;i<code.length();i++){
            char ch = code.charAt(i);
            for(String sr : bList){
                rList.add(ch+sr);
            }
        }
        return rList;
    }

}
