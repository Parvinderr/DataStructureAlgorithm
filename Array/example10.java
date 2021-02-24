// Replace every array element by multiplication of previous and next




class Main {
  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5, 6};
    // System.out.println(4+1<=5);
    int res[]= multiplyTwo(arr);
    for(int i:res){
      System.out.println(i);
    }
  }
  public static int[] multiplyTwo(int[] arr){
    int res[] = new int[arr.length];
    int first =0;
    int last=1;
    for(int i =0;i<arr.length;i++){
      int temp =0;
      if(i-1<=0){
        first=0;
      }
      if(i+1>=arr.length-1){
        last=arr.length-1;
      }
      temp = arr[first] * arr[last];
      first++;
      last++;
      
      res[i]=temp;
}
    
    return res;
  }
}





