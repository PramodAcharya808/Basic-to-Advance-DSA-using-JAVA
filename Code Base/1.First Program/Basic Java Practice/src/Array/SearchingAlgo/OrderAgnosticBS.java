package Array.SearchingAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = { -9 , -1 , 2 , 4 , 5 , 6 , 7 , 8 };
//        int[] arr = { 10, 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        int key = 8;

        int ans = AgnosticBS(arr, key);

        if (ans == -1)
            System.out.println("Element not found");
        else
            System.out.println(key+" is at "+ans+" index");
    }

    static int AgnosticBS(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        boolean val = arr[start] < arr[end];

        while(start <= end){
            int mid = (start+end)/2;

            if(key == arr[mid])
                return mid;

            if(val)
            {
                if(key > arr[mid])
                    start  = mid+1;
                else
                    end = mid-1;
            }
            else
            {
                if (key > arr[mid])
                    end = mid -1;
                else
                    start = mid +1;
            }
        }
        return -1;
    }
}
