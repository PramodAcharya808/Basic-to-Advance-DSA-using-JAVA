package com.basic;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to generate its table");
        int num = input.nextInt();

        for (int i=1; i<=10 ; i++)
        {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}

