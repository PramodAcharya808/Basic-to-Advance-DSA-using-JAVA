package Array.RoughBook;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Rough1 {
    public static void main(String[] args){
        int[] arr1 = {4,5,6,8,9,12,34,46,68};
        int[] arr2 ={24,87,254,985,214,576,-1,-54,0,-367};
        String[] arr3 = {"Pramod", "Vinay", "Darshan","Chandrashekar","Pavan","Jay","Madan"};
        int key1 = 46;
        System.out.println("BINARY SEARCH");
        System.out.println(key1+" is at "+ BinarySearch(arr1, key1));
        BubbleSort(arr2);
        BubbleSortString(arr3);
        System.out.println("\nBUBBLE SORT FOR INTEGERS");
        System.out.println(Arrays.toString(arr2));
        System.out.println("\nBUBBLE SORT FOR STRINGS");
        System.out.println(Arrays.toString(arr3));
        System.out.println("\nSELECTION SORT");
        SelectionSort(arr2);
    }
    public static void SelectionSort(int[] arr){
        
    }
    public static void BubbleSortString(String[] arr){
        for (int i=0; i<arr.length; i++){
            for(int j=1; j< arr.length-i; j++){
                    int res = arr[j-1].compareTo(arr[j]);
                    if (res > 0) {
                        String temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
            }
        }
    }
    public static void BubbleSort(int[] arr){
        for (int i=0; i<arr.length; i++){
            for(int j=1; j< arr.length-i; j++){
                if (arr[j] < arr[j-1]){
                    Swap(arr, j, j-1);
                }
            }
        }
    }

    public static int BinarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] > key){
                end = mid-1;
            }
            else if(arr[mid] < key){
                start = mid+1;
            }
            else return mid;
        }
        return -1;
    }

    public static void Swap(int[] arr, int ind1, int ind2){
        int temp;
        temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}






















