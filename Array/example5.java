// Rotate An Array n-times


public class Main{
  
  public static void main(String[] args) {
      
      int[] arr = {1,2,3,4,5,6,7,8,9};
      int rotations= 2;
      rotateArray(arr,rotations);
        
        }
  public static void rotateArray(int[] arr,int d){
    int[] temp;
    temp = new int[d];
    for(int i =0;i<d;i++){
      temp[i] = arr[i];
    }
    for(int j =0;j<arr.length;j++){
      
      if(arr.length-d>j){
        arr[j]=arr[j+d];
      }else{
         arr[j]= temp[j-(arr.length-d)];
    }
    }
    //for printing array
    for(int k=0;k<arr.length;k++){
      System.out.println(arr[k]);
    }
  }
  }
  
