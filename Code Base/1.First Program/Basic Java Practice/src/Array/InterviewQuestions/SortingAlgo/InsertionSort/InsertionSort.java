package Array.InterviewQuestions.SortingAlgo.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12,34,56,2,4,1,0,8,3,-9,-5,-1};
        Sort(arr);
        System.out.println (Arrays.toString(arr));
    }
    public static void Sort(int[] arr){
        int temp;
        for (int  i=0 ; i<arr.length-1 ; i++){
            for (int j=i+1 ; j>0 ; j--){
                if (arr[j-1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
    }
}
























































































































