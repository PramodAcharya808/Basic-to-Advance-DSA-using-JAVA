package com.basic;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int num = in.nextInt();

        boolean flag = prime(num);
         if (flag == false)
         {
             System.out.println("Number is not Prime");
         }
         else
             System.out.println("Number is Prime");

    }
    static boolean prime (int a)
    {
//        boolean flag = true;
        for (int i = 2 ; i<a ;i++)
        {
            if(a%i == 0)
            {
                return false;
//                break;
            }
        }
        return true;
    }
}
