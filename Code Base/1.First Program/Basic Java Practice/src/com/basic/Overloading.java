package com.basic;

public class Overloading {
    public static void main(String[] args) {
        Sum(1,23,4);
        Sum(1,23);
    }

    static void Sum(int a, int b)
    {
        System.out.println(a+b);
    }

    static void Sum(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}
