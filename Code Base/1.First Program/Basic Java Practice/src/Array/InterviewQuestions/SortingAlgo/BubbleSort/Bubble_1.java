package Array.InterviewQuestions.SortingAlgo.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter "+size+" numbers");
        for (int i=0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr)
    {
        int temp;
        for (int i=0 ; i<arr.length; i++){
            for (int j=1 ; j<arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}