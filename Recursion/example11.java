// First Occurence Using Recursion in Array 

import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int x = scn.nextInt();
        int r = firstIndex(arr,0,x);
        System.out.println(r);
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int r = firstIndex(arr,idx+1,x);
        if(arr[idx]==x){
            return idx;
        }else{
            return r;
        }
        
        
    }

}
