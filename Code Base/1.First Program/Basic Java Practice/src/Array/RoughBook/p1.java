package Array.RoughBook;

import java.util.Arrays;

public class p1 {
    public static void main(String[] args){
        int[] arr = {34,5,12,4,7,9,2};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble(int[] arr){
        int temp;
        for(int i=0; i<arr.length;i++){
            for (int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
