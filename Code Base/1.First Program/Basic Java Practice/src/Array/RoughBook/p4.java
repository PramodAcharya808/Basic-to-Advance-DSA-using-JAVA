package Array.RoughBook;

import java.util.Arrays;

public class p4 {
    public static void main(String[] args) {
        int[] arr = {2,4,1,57,7,12,56,9,0,-1};

//        int[] arr = {2,4,6,8,12,15,16,19,24,56};
//        int key = 4;
//        System.out.println("Element "+key+" is at "+Binary(arr, key)+" index");

        Insertion_sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void Insertion_sort(int[] arr) {
        for(int i=0 ;i<arr.length ; i++){
            for (int j=i+1 ; j<0 ; j--){
                if(arr[j] < arr[j-1])
                    
            }
        }
    }

    private static void Selection_sort(int[] arr) {
        for (int i=0 ; i<arr.length ; i++){
            int last_index = arr.length-1-i;
            int max_index = get_max(arr, 0,last_index);
            Swap(arr, last_index, max_index);
        }
    }

    public static int get_max(int[] arr, int start, int end){
        int max_index = start;

        for (int i=0; i<=end ; i++){
            if(arr[i] > arr[max_index])
                max_index = i;
        }
        return max_index;
    }

    public static void Bubble_sort(int[] arr){

        for (int i=0 ; i<arr.length ; i++){
            for (int j=1; j<=arr.length-1-i; j++){
                if(arr[j] < arr[j-1])
                {
                    Swap(arr, j, j-1);
                }
            }
        }
    }

//Binary Search
    public static int Binary(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
           int mid = (start+end)/2;

            if(key < arr[mid]){
                end = mid - 1;
            } else if (key > arr[mid]) {
                start = mid + 1;
            }
            else
                return mid;
        }
        return -1;
    }

    public static void Swap(int[] arr, int elem1, int elem2)
    {
        int temp;
        temp = arr[elem1];
        arr[elem1] = arr[elem2];
        arr[elem2] = temp;
    }
}