package Recursion;

public class printing_array {
    public static void rec(int[] arr, int n){
            if (n>=arr.length) return;
            System.out.print(arr[n]+" ");
            rec(arr,n+1);
        }
        public static void main(String[] args) {
            int[] arr = {34,324,234,32,41,3,213,43,243};
            System.out.print("Iterative method: ");
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("---------------------------------");
            System.out.print("Recursive method: ");
            rec(arr,0);
    }
}
