package Array.InterviewQuestions.BinarySearch;


//Ceiling of a number using Binary Search
public class Playground {
    public static void main(String[] args){
        int[]  arr = {1,3,4,6,8,9};
        int key = 5;

        int ans = Ceile(arr, key);
        System.out.println(ans);
    }

    public static int Ceile(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > key) {
                res = arr[mid];
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else
                return arr[mid];
        }
        return res;
    }
}
