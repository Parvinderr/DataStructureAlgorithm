// Max Element Using Recursion


import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int res = maxOfArray(arr,arr.length-1);
        System.out.println(res);
    }

    public static int maxOfArray(int[] arr, int i){
         if(i==0){
            return arr[i];
        }
        int res= maxOfArray(arr,i-1);
        res = res>arr[i]?res:arr[i];
   
        return res;
    }

}
