package com.basic;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("Enter a number to find the number of redundancies");
        int red = input.nextInt();

        int count = 0;
        while(num!=0)
        {
            if (num%10 == red)
                count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
