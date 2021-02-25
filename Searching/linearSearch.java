// Linear Search


class Main {
  public static void main(String[] args) {
    
    int []num ={11,12,13,14,21,22,23,24,31,32,33,34};
    int n =22;
    linearSearch(num,n);
  }
  public static void linearSearch(int[] arr,int n){
    int count=0;
    for(int i =0;i<arr.length;i++){
      if(n== arr[i]){
        count++;
        break;
      }
    }
    if(count ==1){
      System.out.println(n+" Found");
    }else{
      System.out.println("Not Found");
    }
    
  }
}