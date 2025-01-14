public class reverse_array {
    public static void swapping(int first, int last){
        int temp = first;
        first = last;
        last = temp;
    }
    public static int[] revarr(int []arr){
        int start = 0;
        int end = arr.length-1;

        while ((start<=end)) {
            arr = swapping(arr, arr[start],arr[end]);
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args){
        int []arr = {12,43,42,34,123,343,43,432,443};
        int []ans = revarr(arr);
        for(int a: arr){
            System.out.print(a+" ");
        }
        System.out.println();
        for(int a: ans){
            System.out.print(a+" ");
        }
    }   
}
