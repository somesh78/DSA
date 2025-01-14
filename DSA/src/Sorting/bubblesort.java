package Sorting;

public class bubblesort {
    public static void main(String[] args){
        int[] arr = {1,5,2,3,4};
        for(int turns=1; turns<arr.length; turns++){
            for(int i=0;i<(arr.length-turns);i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

// sorting is defined as "Arranging data in particular order/sequence".