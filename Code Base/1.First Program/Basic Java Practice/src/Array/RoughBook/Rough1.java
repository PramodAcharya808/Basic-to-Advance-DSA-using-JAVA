package Array.RoughBook;

public class Rough1 {
    public static void main(String[] args) {
        int[] bin1 = {2,4,7,9,12,34,56,78,90};
        int key=56;
        System.out.println(key+" is at "+BinarySearch(bin1, key));
    }
    public static int BinarySearch (int[] arr1, int key){
        int start=0;
        int end=arr1.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr1[mid] > key)
                end = mid-1;
            else if(arr1[mid] < key)
                start = mid+1;
            else
                return mid;
        }
        return -1;
    }
}











































































































