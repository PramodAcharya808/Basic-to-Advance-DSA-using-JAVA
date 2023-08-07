package Array.InterviewQuestions.SelectionSort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args){
        int[] arr = {4,6,3,5,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr){
        for (int i=0; i<arr.length ;i++){
            int last = arr.length -1 -i;
            int max = getmax(arr, last );

            //swap the max element to the last index of this array range
            int temp;
            temp = arr[last];
            arr[last] = arr[max];
            arr[max] = temp;
        }
   }

   public static int getmax(int[] arr, int last){
        int max = arr[0];

        for(int i=0;i<=last;i++){
            if(arr[i] > arr[max]){
                max=i;
            }
        }
        return max;
   }
}