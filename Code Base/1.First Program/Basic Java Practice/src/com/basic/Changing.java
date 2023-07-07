package com.basic;

import java.util.Arrays;

public class Changing {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        String[] students = {"Pramod","Vinay","Darshan","Chandana","Swathi"};
        changing1(arr);
        changing2(students);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(students));
    }

    static void changing1 (int[] arr1)
    {
        arr1[0] = 100;
    }

    static void changing2(String[] arr2)
    {
        arr2[4] = "Manjima";
    }
}
