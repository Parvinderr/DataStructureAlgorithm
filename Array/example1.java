// Span of Array by finding maximum and minimum value.

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i =0;i<n;i++){
        int num = scn.nextInt();
        arr[i] = num;
    }
    int max = maxNum(arr,n);
    int min = minNum(arr,n);
    System.out.println(max - min);
 }
 public static int maxNum(int[] arr,int n){
    int max =arr[0];
     for (int i =1;i<n-1;i++){
         int r = (int) Math.max(arr[i],arr[i+1]);
         max = (int)Math.max(max,r);
     }
     return max;
 }
  public static int minNum(int[] arr,int n){
    int min =arr[0];
     for (int i =1;i<n-1;i++){
         int r = (int) Math.min(arr[i],arr[i+1]);
         min = (int)Math.min(min,r);
     }
     return min;
 }
}