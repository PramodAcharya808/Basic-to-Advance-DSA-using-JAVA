package Array.SearchingAlgo;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr ={12,234,567,2,6,9,2,8,23,8,5,0};
        int key = 10;
        int ans = linear(arr, key);

        if(ans == -1)
            System.out.println("Element not found");
        else
            System.out.println(key+" is at "+ans+" index");
    }

    static int linear(int[] arr, int key){
        for (int i=0 ; i<arr.length ; i++){
            if(key == arr[i])
                return i;
        }
        return -1;
    }
}
