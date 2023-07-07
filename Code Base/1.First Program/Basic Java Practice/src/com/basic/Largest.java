package com.basic;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3 ;
        System.out.println("Enter 3 numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if (n1 > n2)
        {
            if (n1>n3)
                System.out.println(n1+" is Greater");
            else
                System.out.println(n3+" is Greater");
        }
        else if (n2 > n3)
            System.out.println(n2+" is Greater");
        else
            System.out.println(n3+" is Greater");

    }
}
