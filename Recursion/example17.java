Get Maze Paths(Recursion)


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        ArrayList<String> res = getMazePaths(1,1,a,b);
        System.out.println(res);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr ==dr && sc ==dc){
            ArrayList<String> path = new ArrayList<>();
            path.add("");
            return path;
        }
        ArrayList<String> rpath=new ArrayList<>();
        ArrayList<String> cpath=new ArrayList<>();
        if(sr<dr){
            rpath =getMazePaths(sr+1,sc,dr,dc);
        }
        if(sc<dc){
           cpath =getMazePaths(sr,sc+1,dr,dc);
        }
       
        ArrayList<String> paths =new ArrayList<>();
        for(String s : cpath){
            paths.add("h"+s);
        }
        
        for(String s : rpath){
            paths.add("v"+s);
        }
        
        
        
        return paths;
    }

}
