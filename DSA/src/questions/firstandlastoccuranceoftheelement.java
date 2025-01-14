package questions;

public class firstandlastoccuranceoftheelement {
    public static void main(String[] args) {
        int []arr = {12,423,432,4,23,4,32,1,23,34,2,4,34,43,4};
        int key = 4;
        int first = -1;
        int last = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == key){
                if (first == -1){
                    first = i;
                }
                last = i;
            }
        }
        int[] ans = {first, last};
        for (int i: ans){
            System.out.print(i+" ");
        }
    }
}
