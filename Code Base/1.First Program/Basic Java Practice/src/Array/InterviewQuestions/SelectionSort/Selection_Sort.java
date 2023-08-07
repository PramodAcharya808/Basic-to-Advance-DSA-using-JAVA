package Array.InterviewQuestions.SelectionSort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
       int[] arr = {3,5,4,2,1};
       Sort(arr);
       System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr){
        for(int i=0 ; i<arr.length ; i++){
            int last_index = arr.length-1-i;
            int max_index = GetMax(arr, last_index);

            int temp = arr[last_index];
            arr[last_index] = arr[max_index];
            arr[max_index] = temp;
        }
    }

    public static int GetMax(int[] arr, int last_index){
        int max_index = 0;
        for (int i=0 ; i<=last_index ; i++){
            if(arr[max_index] < arr[i]){
                max_index = i;
            }
        }
        return max_index;
    }
}






















































