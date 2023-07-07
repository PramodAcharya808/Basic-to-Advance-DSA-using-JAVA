package Array.Extra;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8};
        rev(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void rev(int[] arr1, int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp = arr1[start];
            arr1[start] = arr1[end];
            arr1[end] = temp;
            start++;
            end--;
        }
    }
}
