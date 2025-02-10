package questions;

import java.util.Scanner;

public class permutation_tailsandheads {
    public static void r(String s, int n){
        if (n==0) {
            System.out.println(s);
            return;
        }
        r(s+'T', n-1);
        r(s+'H', n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = new String();
        r(s, n);
        
    }
}