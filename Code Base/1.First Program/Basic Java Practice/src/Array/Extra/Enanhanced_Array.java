package Array.Extra;

import java.util.Scanner;

public class Enanhanced_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of Rows & Columns");

        int row = in.nextInt();
        int col = in.nextInt();
        int[][] arr1 = new int[row][col];

        System.out.println("Enter "+row+" Rows & "+col+" Columns");

    }
}
