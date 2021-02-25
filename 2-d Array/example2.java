// Matrix Multiplication


import java.io.*;
import java.util.*;               //100
public class Main{

public static void main(String[] args) throws Exception {
        
 Scanner scn = new Scanner(System.in);
    int m = scn.nextInt();
    int n = scn.nextInt();
    int a1[][]=new int[m][n];
    for(int i=0;i<m;i++){
        for(int j =0;j<n;j++){
            a1[i][j]=scn.nextInt();
        }}
    int p = scn.nextInt();
    int q = scn.nextInt();
    int a2[][]= new int[p][q];
    for(int y=0;y<p;y++){
        for(int z =0;z<q;z++){
            a2[y][z]=scn.nextInt();
        }
    }
   int [][]mul = new int[m][q];
    if(n==p){
        for(int i =0;i<mul.length;i++){     //0
            for(int k=0;k<mul[i].length;k++){//1
                int res =0;
                int temp =0;
                for(int j=0;j<a2.length;j++){//0
                temp= a1[i][j] * a2[j][k];    //10*1
                res +=temp;
            }
            mul[i][k]= res;
            }
        } for(int i =0;i<mul.length;i++){
        for(int j =0;j<mul[i].length;j++){
            System.out.print(mul[i][j]+" ");
        }
        System.out.println();
    }
    }else{
        System.out.println("Invalid input");
    }
   
 }
}