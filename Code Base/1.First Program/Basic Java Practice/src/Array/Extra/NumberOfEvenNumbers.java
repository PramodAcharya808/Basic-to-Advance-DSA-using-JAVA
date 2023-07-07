package Array.Extra;

public class NumberOfEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,56,7,8,18,4,6,645,453,56,7,78,100};
        int even=0;

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]%2 == 0)
                even++;
        }
        System.out.println("There are "+even+" Even numbers in Array");
    }
}
