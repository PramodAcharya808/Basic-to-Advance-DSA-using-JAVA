package Array;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,4,5,6,7,},
            {8,4,5,7,3,8,4,10}
        };

        int key = 11;

        for(int i=0 ; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == key) {
                    System.out.println("Element Found");
                    System.exit(0);
                }
            }
        }

        System.out.println("Element Not Found");
    }
}
