// Digit Frequency (finding how many times a number appears)



public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int c=0;
        int num =n;
        while(num!=0){
            num =num/10;
            c++;
        }
       
        int count =0;
       for (int i =0;i<c;i++){
            int s = n%10;
            if(s==d){
            count++;
        }
        n = n/10;
       }
        
        return count;
    }
}
