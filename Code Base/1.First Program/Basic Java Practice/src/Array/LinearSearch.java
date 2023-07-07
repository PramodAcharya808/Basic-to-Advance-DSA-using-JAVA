package Array;

import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 5;
        int res;
        res = Search(arr,key);
        System.out.println(res);
    }

    static int Search(int[] arr, int key)
    {
        for(int i=0; i<arr.length ; i++)
        {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
