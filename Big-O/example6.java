# Big-O is O(a+b) or O(m+n) 

class Main {
  public static void main(String[] args) {
   String[] arr1 = {"aman","namAn","Raman","ankit","noOb","nooob","noOBb","noOObb","Archie","nemo"};
   String[] arr2 = {"aman","noOb","nooob","noOBb","noOObb","Archie","nemo"};
   findArchie(arr1);
   findNoob(arr2);
  }

  public static void findArchie(String[] arr){
    for (int i =0; i<arr.length;i++){  // --> It Runs N Times
      System.out.println("Running");   // --> Printing How Many Times Our Loop Is Executed.
      if(arr[i].toLowerCase().equals("archie")){  // --> for Findning Archie
        System.out.println("Founded");
        break;                          // --> Breaking The Loop When We Found Archie
      }
    }
  }
  
   public static void findNoob(String[] arr){
    for (int i =0; i<arr.length;i++){  // --> It Runs N Times
      System.out.println("Running");   // --> Printing How Many Times Our Loop Is Executed.
      if(arr[i].toLowerCase().equals("noob")){  // --> for Findning Noob
        System.out.println("Founded");
        break;                          // --> Breaking The Loop When We Found Noob
      }
    }
  }
}

// Both Array has Different Sizes and Different Values So Big-O is O(m+n) or O(p+q).


// Note: In This Program Our Both Loops are Running N-times but if it finds archie at 1st position 
// then the loop terminates but for finding Big-O we always Have to find the worst case 
// so if archie is at last position (i.e. last element of array) then loop is executed 
// n-times and same for the find Noob loop. So Big-O is O(m+n).





// For Finding Big-O Of This Program We Have To Use The Rule.
// Rule 1 := Find The Worst Case --> In This Case Worst Case is When Archie is at Last Position in Array and Noob is at Last Position .
// Rule 2 := Remove Constants --> In This Program There is No Constant.
// Rule 3 := Different Value For Different Inputs --> There are two inputs.
// Rule 4 := Drop Non Dominant --> No Dominant in this Program.

