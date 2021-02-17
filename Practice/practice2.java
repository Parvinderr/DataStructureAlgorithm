# Printing Pattern
// ***
// ***
// ***

class Main {
  public static void main(String[] args) {
    int num = 4;
    printPattern(num);
  }
  
  public static void printPattern(int num){
    while(num>0){
    for (int i =0;i<num;i++){
     System.out.print("*");
    }
    System.out.println();
    num--;
  }
}
}
