package Array.Extra;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,100,3,4,5};
        System.out.println(max(arr));
    }

    static int max (int[] arr1)
    {
        int m=0;

        for (int i=0 ; i< arr1.length ; i++)
        {
            if (m<arr1[i])
            {
                m = arr1[i];
            }
        }
        return m;
    }
}
