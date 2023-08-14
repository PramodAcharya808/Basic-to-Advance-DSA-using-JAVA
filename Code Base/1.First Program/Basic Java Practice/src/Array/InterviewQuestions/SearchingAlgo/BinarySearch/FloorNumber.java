/*
FLOOR OF A NUMBER
The Greatest number in an array which is less than or equal the Key element

EX: arr=[1,3,5,8,9,12,34,456,789]
    Key = 50
    Candidates = [1,3,5,8,9,12,34]
    The greatest element among the candidates is ==== 34
    Floor = 34
    * */

package Array.InterviewQuestions.SearchingAlgo.BinarySearch;
public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,7,15,17,19,28,29,49,68,70};
//        Candidates : 1,4,7,15,17,19
        int  key = 27;
        int ans = Floor(arr, key);
        System.out.println("The Floor of "+key+" is "+ans);
    }

    private static int Floor(int[] arr, int key) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid]>key){
                end = mid-1;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }
            else
                return arr[mid];
        }
        return arr[end];
    }


}
