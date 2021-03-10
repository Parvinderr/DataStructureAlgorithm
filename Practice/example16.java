// Defanging IP
// Changing . to [.]


class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    String ip ="1.1.1.1";
    String res ="";
    for(int i=0;i<ip.length();i++){
      char c = ip.charAt(i);
      if(c=='.'){
        res +="["+"."+"]";
      }else{
        res+=c;
      }
    }
    System.out.println(res);
  }
}
