# Finding Which is Greater Factorial(n!) Power(n^n).
// n! > n^n


class Main {
  public static void main(String[] args) {
    int num =20;
    long value1 =findFactorial(num);
    long value2 = findMultiple(num);
    if(value1>value2){
      System.out.println("Factorial is Greater");
    }else{
      System.out.println("Multiple is Greater");
    }
  }
  
 
 public static long findFactorial(int num){
  long total = 1;
  while(num>1){
    total *=num;
    num--;
  }
  System.out.println(total);
  return total;
  }
public static long findMultiple(int num){
  long total = num;
  for (int i =0;i<num;i++){
    total *=num;
  }
  System.out.println(total);
  return total;
  }

}
