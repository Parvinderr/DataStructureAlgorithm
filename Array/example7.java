// Find Sum of Multiples by rotating array



public static void main(String[] args) {
    int[] arr ={8,3,1,2};
    int sum=29;
    boolean re=false;
    int count=0;
    
    for(int k =0;k<arr.length;k++){
      int res =multipleSum(arr);
      if(res==sum){
        System.out.println("Found By Rotating "+count+" Time");
        re =true;
        break;
      }
      arr = rotateByN(arr, 1);
      count++;
    }
   if(re ==false){
     System.out.println("Not Found");
   }
    
    }

public static int multipleSum(int[] arr){
  int res=0;
  for(int i =0;i<arr.length;i++){
    int temp =arr[i]*i;
    res+=temp;
  }
  return res;
}
public static int[] rotateByN(int[] arr,int r){
  

    int temp = arr[0];
    for(int i=0;i<arr.length-1;i++){
    arr[i]=arr[i+1];
  }
  arr[arr.length-1]=temp;
  
  return arr;
}
}
