package Sorting;

public class selectionsort {
    public static void main(String[] args){
        int []arr = {12,45,323,123,243,4234,2,1,232};
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int idx = i;
            for (int j=i+1; j<n;j++){
                if(arr[j]<arr[idx]){
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}
