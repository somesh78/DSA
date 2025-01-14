public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {3423,4,324,3,1,43,24,43,23,4,34,32,4,3,4,3,432};
        int target = 3;
        for (int i=0; i<arr.length-1; i++){
            if (target == arr[i]){
                System.out.println(i);
            }
        }
    }    
}
