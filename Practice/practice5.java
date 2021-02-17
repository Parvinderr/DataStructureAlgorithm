// Fibonacci Number


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0;
        int second = 1;

       

        for (int i = 1; i <= n; i++) {
            if (first >= n) {
                break;
            }
            int temp = 0;
            System.out.println(first);
            temp = first+second;
            first = second;
            second = temp;
        }
    }
}
