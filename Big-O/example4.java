# Big-O is O(n²)
// Finding Multiples Of Given Array


class Main {
  public static void main(String[] args) {
  int[] arr = {1,2,3,4,5,6,7,8,9,10};
  printMultiple(arr);
   
  }

  public static void printMultiple(int[] arr){
    for (int i =0; i<arr.length;i++){  // --> n times
       System.out.println("Printing Multiples");  // --> n times
      for (int j=0; j<arr.length;j++){ // --> n times --> n*n times (Because nested loop)
        int total = arr[i]*arr[j];  // --> n² times
        System.out.print(total +" "); // --> n² times
      }
      System.out.println(); // --> n times
    }
  }
}



// total is )(n² + n) --> O(n²) (i.e. Dropping non dominant)

/* Note: In This Program Our Loop is Running n² because of nested loop. So Big-O is O(n²).  */



// For Finding Big-O Of This Program We Have To Use The Rule.
// Rule 1 := Find The Worst Case --> Because Of nested loop our program is running n² times.
// Rule 2 := Remove Constants --> In This Program There is No Constant.
// Rule 3 := Different Value For Different Inputs --> There is Single Input in this Program.
// Rule 4 := Drop Non Dominant --> By Dropping the non dominant we get Big-O is O(n²).


