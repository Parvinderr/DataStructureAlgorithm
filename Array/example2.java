// Find Element in an Array

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i =0;i<n;i++){
        int r = scn.nextInt();
        arr[i]=r;
    }
    int d = scn.nextInt();
    int res = findElement(arr,d,n);
    System.out.println(res);
 }
 public static int findElement(int[] arr ,int d,int n){
     int num=0;
    for(int i =0; i<n;i++){
        if(arr[i]==d){
            num= i;
            break;
        }
        else{
            num= -1;
        }
    }
    return num;
 }

}