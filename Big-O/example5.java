# Big-O is O(n!)
// Finding Factorial 


class Main {
  public static void main(String[] args) {
 int num =4;
 findFactorial(num);
  }
  
  public static void findFactorial(int num){
   for (int i =1;i <=num; i++){  // --> n! times
     findFactorial(num-1);
   }
  }
}





/* Note: In This Program Our Loop is Running and Calling Itself with decrementing every time by one so in this Type Of 
Example Big-O(n!). So Big-O is O(n!). */





// For Finding Big-O Of This Program We Have To Use The Rule.
// Rule 1 := Find The Worst Case --> Loop is Running n! times
// Rule 2 := Remove Constants --> In This Program There is No Constant.
// Rule 3 := Different Value For Different Inputs --> There is Single Input in this Program.
// Rule 4 := Drop Non Dominant --> Dropping Dominant in this Program.


