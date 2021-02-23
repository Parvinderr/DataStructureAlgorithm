// Find element in unknown Rotated Array in less than O(n)

public class Main{
  
  public static void main(String[] args) {
     // Find element in unknown rotated array
      int[] arr = {3,4,5,6,7,8,9,1,2};
      int e =4;
     findElement(arr,e);
     }
  public static void findElement(int[] arr,int e){
    int first = arr[0];
    int last = arr[arr.length-1];
    int length = arr.length/2;


    if(e<=arr[length] && e>=first){
    for(int i =0;i<arr.length;i++){
      int res = arr[i];
      if(res ==e){
        System.out.println("Found at index: "+i);
        break;
      }
    }
    }
    else if(e<first || e>arr[length]){
      for(int i =0;i<arr.length;i++){
      int res = arr[i];
      if(res ==e){
        System.out.println("Found at index: "+i);
        break;
      }
      }
      }else{
      System.out.println("Not Found");
    }

    }
    }
