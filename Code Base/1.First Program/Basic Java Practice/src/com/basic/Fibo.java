package com.basic;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int fib = 0;
        System.out.println("Enter the number of Fibonacci's to be printed");
        int num = input.nextInt();

        while (num!=0)
        {
            fib = a + b;
            a = b;
            b = fib;
            num--;
            System.out.println(fib);
        }

    }
}
