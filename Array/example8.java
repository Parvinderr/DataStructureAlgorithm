// Array Rearrangment


class Main {
  public static void main(String[] args) {
    int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
   int[] res =reArrange(arr);
   for(int i: res){
     System.out.println(i);
   }
}
public static int[] reArrange(int[] arr){
  int[] res = new int[arr.length];
  for(int i =0;i<arr.length;i++){
    for(int j =0;j<arr.length;j++){
      if(i==arr[j]){
        res[i]=arr[j];
        break;
      }else{
        res[i]=-1;
      }
      
    }
    }
    return res;
