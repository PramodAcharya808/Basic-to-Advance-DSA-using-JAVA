/*
Problem Description:
    > Sorted should be accepted from the user
    > Determine weather the array is sorted in ascending or descending
    > Find Ceiling and floor from the given array
* */

package Array.InterviewQuestions.SearchingAlgo.BinarySearch;
import java.util.Scanner;
public class Ceili_Floor_Agnostic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = in.nextInt();

        System.out.println("Enter "+size+" sorted elements in the array");

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Enter the element of which you want to find its Ceiling and floor");
        int key = in.nextInt();

        System.out.println("The Ceiling and floor of "+key+" is "+Ceili(arr,key)+" & "+Floor(arr,key));
    }

    public static int Ceili(int[] arr, int key){
        int start = 0;
        int end=arr.length-1;
        int ans=0;

        while(start <= end){
            int mid = (start+end)/2;

            boolean val =(arr[start] < arr[end]);


            if(val)
            {
                if(arr[mid] == key){
                    return arr[mid];
                }
                else if(arr[mid]>key){
                    ans = arr[mid];
                    end = mid-1;
                }
                else
                    start = mid+1;
            }
            else{
                if(arr[mid]>key){
                    ans=arr[mid];
                    start = mid+1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return ans;
    }


    public static int Floor(int[] arr, int key){
        int start = 0;
        int end = arr .length-1;
        int ans=0;
        while(start <= end){
           int mid = (start+end)/2;

            boolean val = arr[start]>arr[end];

            if(val){
                if(arr[mid] == key){
                    return arr[mid];
                }
                else if(arr[mid]>key){
                    start = mid+1;
                }
                else {
                    ans = arr[mid];
                    end = mid - 1;
                }

            }
            else{
                if(arr[mid]>key){
                    end = mid-1;
                }
                else {
                    ans = arr[mid];
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
