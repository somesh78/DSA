package Recursion;

public class printing_revarray {
    public static void rec(int[] arr, int n){
        if (n<0) return;
        System.out.print(arr[n]+" ");
        rec(arr,n-1);
    }
    public static void main(String[] args) {
        int[] arr = {34,324,234,32,41,3,213,43,243};
        System.out.print("Iterative method: ");
        for(int i=arr.length-1; i>=0; i--){




            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.print("Recursive method: ");
        rec(arr, arr.length-1);
    }
    
}
