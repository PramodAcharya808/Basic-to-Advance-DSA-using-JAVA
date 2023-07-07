package com.basic;

public class Swap {
    public static void main(String[] args) {
        int a = 10, b = 20;
        Swapping(a,b);
    }
    static void Swapping(int a, int b)
    {
        int temp = b;
        b = a;
        a = temp;

        System.out.println(a+" "+b);
    }
}
