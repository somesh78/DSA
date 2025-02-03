package Sorting;

public class QuickSort {
    public static int partition(int[] arr, int s, int e){
        int pos = s;
        int pivot = arr[e];
        for (int i=s; i<=e;i++){
            if (arr[i]<=pivot){
                // swap(arr[i],arr[pos])
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        return pos-1;
    }
    public static void qs(int[] arr, int s, int e){
        if (s>=e) return;
        int pivot = partition(arr, s, e);
        qs(arr, s, pivot-1);
        qs(arr, pivot+1, e);
    }
    public static void main(String[] args) {
        int[] arr = {5,1,1,2,0,0};
        int s = 0;
        int e = arr.length-1;
        qs(arr, s, e);
        for (int a: arr){
            System.out.print(a);
        }
    }    
}
