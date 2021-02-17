# Big-O is O(n)

// For Finding Archie In A Array Of String




class Main {
  public static void main(String[] args) {
   String[] arr = {"aman","namAn","Raman","ankit","noOb","nooob","noOBb","noOObb","Archie","nemo"};
   findArchie(arr);
  }

  public static void findArchie(String[] arr){
    for (int i =0; i<arr.length;i++){  // --> It Runs N Times
      System.out.println("Running");   // --> Printing How Many Times Our Loop Is Executed.
      if(arr[i].toLowerCase().equals("archie")){  // --> for Findning Archie
        System.out.println("Founded");
      }
    }
  }
}

//Note: In This Program Our Loop is Running N-times whether it finds Archie at first element of array or at last element of array.So Big-O is O(n)




// For Finding Big-O Of This Program We Have To Use The Rule.
// Rule 1 := Find The Worst Case --> In This Case Worst Case is When Archie is at Last Position in Array.
// Rule 2 := Remove Constants --> In This Program There is No Constant.
// Rule 3 := Different Value For Different Inputs --> There is Single Input in this Program.
// Rule 4 := Drop Non Dominant --> No Dominant in this Program.

