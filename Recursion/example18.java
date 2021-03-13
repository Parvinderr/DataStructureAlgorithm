Get Maze Path with Jumps(Recursion)



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
        ArrayList<String> paths = new ArrayList<>();
        for(int i =1;i<=dc-sc;i++){
            ArrayList<String> cpath = getMazePaths(sr,sc+i,dr,dc);
            for(String s: cpath){
                paths.add("h"+i+s);
            }
        }
        for(int i =1;i<=dr-sr;i++){
            ArrayList<String> rpath = getMazePaths(sr+i,sc,dr,dc);
            for(String s: rpath){
                paths.add("v"+i+s);
            }
        }
        
        for(int i =1;i<=dc-sc && i<=dr-sr;i++){
            ArrayList<String> dpath = getMazePaths(sr+i,sc+i,dr,dc);
            for(String s: dpath){
                paths.add("d"+i+s);
            }
        }
        
        
        return paths;
    }
}
