public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,23,43,45};
        int start = 0;
        int end = arr.length-1;
        int target = 45;
        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target){
                end = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
    }
}
