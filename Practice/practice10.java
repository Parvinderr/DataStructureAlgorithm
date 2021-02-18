// pythagoras triplet

  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int c = scn.nextInt();
    
    int x = (int)Math.max(a,(int)Math.max(b,c));
    int y;
    int z;
    if(x==a){
        y=b;
        z=c;
        
    }else if (x==b){
        y=a;
        z=c;
        
    }else{
        y=a;
        z=b;
    }
    int v1 =(int)Math.pow(x,2);
    int v2 = (int)Math.pow(y+z,2);
    if (v1==v2){
        System.out.println("false");
    }else{
        System.out.println("true");
    }
    
   }
  }
