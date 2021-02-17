# Big-O is O(1)
// Printing First and Last Element of an array


class Main {
  public static void main(String[] args) {
   String[] arr = {"aman","namAn","Raman","ankit","noOb","nooob","noOBb","noOObb","Archie","nemo"};
   printFirst(arr);
   printLast(arr);
   printFirstAndLast(arr);
  }

  public static void printFirst(String[] arr){
    System.out.println(arr[0].toUpperCase());  // --> 1 time
  }
  
  public static void printFirstAndLast(String[] arr){
    System.out.println(arr[0].toUpperCase()); // --> 1 time
    System.out.println(arr[arr.length-1].toUpperCase()); // ---> 1 time
  }

  public static void printLast(String[] arr){
    System.out.println(arr[arr.length-1].toUpperCase()); // --> 1 time
  }
}


// Total is O(1+1+1) =O(3) --> O(1)

/*Note: In This Program We Are Printing First And Last Element Of Array.
According To Removing Constant Rule Big-O is O(1).*/


// For Finding Big-O Of This Program We Have To Use The Rule.
// Rule 1 := Find The Worst Case --> In This Case We Are Not Looping So Accesing Element Of Array Will Take Constant Time.
// Rule 2 := Remove Constants --> By Removing Constant We Get O(1).
// Rule 3 := Different Value For Different Inputs --> There is Single Input in this Program.
// Rule 4 := Drop Non Dominant --> No Dominant in this Program.
