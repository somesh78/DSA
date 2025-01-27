package Sorting;

public class mergeSort {
    public static void merge(int[] arr, int start, int mid, int end){
        int left = start;
        int right = mid+1;
        int[] temp = new int[end-start+1];
        int idx =0;
        while(left<=mid && right<=end){
            if (arr[left]<arr[right]){
                temp[idx++] = arr[left++];
            }
            else{
                temp[idx++] = arr[right++];
            }
        }
        while (left<=mid) {
            temp[idx++] = arr[left++];
        }
        while ((right<=end)) {
            temp[idx++] = arr[right++];
        }
        for (int i=0; i<temp.length; i++){
            arr[start+i]=temp[i];
        }
    }
    public static void split(int[] arr, int start, int end){
        if(start>=end) return;
        int mid = start+(end-start)/2;
        split(arr, start, mid);
        split(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    public static void main(String[] args) {
        int[] arr = {43,234,34,212,334,32};
        int start = 0;
        int end = arr.length-1;
        split(arr, start, end);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
