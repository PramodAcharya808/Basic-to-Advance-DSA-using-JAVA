package Array.SearchingAlgo;

public class BinarySearch {
    public static void main(String[] args){
//      INDEX        {0, 1, 2,  3, 4, 5, 6, 7, 8, 9, 10}
        int[] arr = {-8,-5,-4, -1, 1, 4, 5, 6 ,78,89,90};
        int key = 5;
        int ans=binary(arr, key);

        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println(key+" is at "+ans+" index");
    }

    static int binary( int[] arr, int key){
        int start = 0;
        int end = arr.length;

        while(start <= end){
            int mid = (start+end)/2;

            if(key > arr[mid])
                start = mid +1;
            else if (key < arr[mid])
                end = mid-1;
            else
                return mid;
        }
        return -1;
    }
}
