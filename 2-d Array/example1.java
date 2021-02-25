// Taking input and printing 2d array


import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int m = scn.nextInt();
    int n = scn.nextInt();
    int[] []arr =new int[m][n];
    for(int i =0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=scn.nextInt();
        }
    }
    for(int i =0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j] +" ");
        }
        System.out.println();
    }
 }

}