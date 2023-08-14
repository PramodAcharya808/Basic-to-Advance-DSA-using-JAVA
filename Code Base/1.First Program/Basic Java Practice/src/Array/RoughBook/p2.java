package Array.RoughBook;

import java.util.Arrays;

public class p2 {
    public static void main(String[] args) {
        int[] arr={23,5,78,1,9,24,7,3,45};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Selection(int[] arr){
        for (int i=0 ; i<arr.length; i++){
            int lastindex = arr.length-1-i;
            int maxnumindex = GetMax(arr, 0, lastindex);
            int temp = arr[maxnumindex];
            arr[maxnumindex] = arr[lastindex];
            arr[lastindex] = temp;
        }
    }

    public static int GetMax(int[] arr, int start, int end){
        int maxindex=0;
        for (int i = start; i<=end; i++){
            if(arr[i] > arr[maxindex])
                maxindex = i;
        }
        return maxindex;
    }
}


























































































