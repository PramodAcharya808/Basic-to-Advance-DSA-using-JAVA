/*Ceiling of Number:
Given a target element, we have to find the smallest element in an array,
which is greater than or equal to the TARGET element.

Ex: arr = [2,3,4,6,9,15,79]
    target = 7
    Candidates = [9,15,79]
    The smallest element which is greater or equal to the Target element is ==== 9
*/

package Array.InterviewQuestions.SearchingAlgo.BinarySearch;

public class CeilingNumber {
    public static void main(String[] args){
        int[] arr = {1,3,5,8,10,15,17,19,38};
        int key = 101;
        int ans = Ceil(arr,key);
        System.out.println("The Ceiling of "+key+" in the given array is "+ans);
    }

    public static int Ceil(int[] arr1, int key){
        int start = 0;
        int end = arr1.length-1;

//        If the Key element is greater than the greatest of all the element in the array
        if(key > arr1.length-1){
            return -1;
        }

        while(start <= end){
           int mid = (start+end)/2;

            if (arr1[mid]>key){
                end = mid-1;
            }
            else if(arr1[mid]<key){
                start = mid+1;
            }
            else
                return arr1[mid];
        }
        return arr1[start];
    }
}
