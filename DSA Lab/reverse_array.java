public class reverse_array {
    // public static void swapping(int first, int last){
    //     int temp = first;
    //     first = last;
    //     last = temp;
    // }
    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end= arr.length-1;
        while (start<=end) {
            // swapping(arr[start],arr[end]);
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = reverseArray(arr);
        for(int i: arr1){
            System.out.println(i);
        }        
    }
}