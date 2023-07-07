package Array.Extra;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={-1,1,2,3,44,55};
        System.out.println("Max number in the array is "+Max(arr));
    }

    static int Max(int[] arr1)
    {
        int max = arr1[0];
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] > max)
                max = arr1[i];
        }
        return max;
    }
}
