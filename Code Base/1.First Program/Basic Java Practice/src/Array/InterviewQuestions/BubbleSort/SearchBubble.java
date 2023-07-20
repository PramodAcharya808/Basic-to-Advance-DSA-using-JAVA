package Array.InterviewQuestions.BubbleSort;

import java.util.Arrays;

public class SearchBubble {
    public static void main (String[] args){
        int[] arr = {2,4,1,5,3,-1,-10,-6,0,100,25};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int temp;
        boolean swapped;
        //Counter variable to reduce the sort space in every iteration
        for (int i=0; i<arr.length ; i++){
            swapped = false;
            for (int j=1 ; j <arr.length-i ; j++)
            {
                swapped = true;
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
//            It is used to stop the iteration in which the array is already sorted
            if(!swapped)
                break;
        }
    }
}
