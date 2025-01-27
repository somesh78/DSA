package Recursion;
public class printing_from_1ton {
    public static void func(int n){
        System.out.println(n);
        if (n == 1) return;
        func(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        func(n);
    }
}