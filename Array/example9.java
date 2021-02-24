//Move zeroes to end of Array


class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 0, 0, 0, 0, 5};
    
    moveZeroes(arr);
  }
  public static void moveZeroes(int[] arr){
    int count=0;
   for(int i =0;i<arr.length;i++){
     if(arr[i]!=0){
     arr[count++]=arr[i];
   }
   }
   while (count < arr.length) {
            arr[count++] = 0; 
    } 
    
    for(int r:arr){
      System.out.println(r);
    }
  }
}
