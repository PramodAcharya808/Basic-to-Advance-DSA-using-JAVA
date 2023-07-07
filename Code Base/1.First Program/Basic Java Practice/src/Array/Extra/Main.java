package Array.Extra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the number of rows and columns of the matrix");
        r = in.nextInt();
        c = in.nextInt();
        int[][] arr = new int[r][c];

        System.out.println("Enter the "+r+" rows and "+c+" columns of the matrix");

        for (int i = 0 ; i<r; i++)
        {
            for (int j = 0 ; j<c; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0 ; i<r; i++)
        {
            for (int j = 0 ; j<c; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
