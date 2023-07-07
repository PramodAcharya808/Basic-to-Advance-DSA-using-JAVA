package com.basic;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.println(a);

        float b = input.nextFloat();
        System.out.println(b);

        long c = input.nextLong();
        System.out.println(c);


        String d = input.nextLine();
        System.out.println(d);

        double e = input.nextDouble();
        System.out.println(e);

        boolean t = input.nextBoolean();
        System.out.println(!t);
    }
}