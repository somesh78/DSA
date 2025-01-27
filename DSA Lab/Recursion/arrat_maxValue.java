package Recursion;

public class arrat_maxValue {
    public static void maximum(int[] arr, int max, int idx){

        if (idx == arr.length){
            System.out.println(max);
            return;
        }
        if (arr[idx] > max){
            max = arr[idx];
        }
        maximum(arr, max, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {23,3,234,324,3,4,32,423,4,3,4,3,5,345,3,4,314,1};
        Integer max = Integer.MIN_VALUE;
        int idx = 0;
        maximum(arr, max, idx);
    }    
}
	