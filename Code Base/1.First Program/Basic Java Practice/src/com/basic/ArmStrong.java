package com.basic;

import java.util.Scanner;

public class ArmStrong {
    static int temp;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        boolean flag = Arm(num);

        if(flag)
            System.out.println(temp+" is an ArmStrong Number");
        else
            System.out.println(temp+" is Not an ArmStrong Number");
    }

    static boolean Arm(int num)
    {
        int rem=0, sum = 0, cube=0 ;
        temp = num;
        while(num!=0)
        {
            rem = num%10;
            cube = rem*rem*rem;
            sum = sum+cube;
            num/=10;
        }
//        System.out.println(temp+" "+sum);
        return sum == temp;
    }
}
