package com.basic;

public class Rev {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0, rem;

        while (num!=0)
        {
            rem = num%10;
            rev = (rev*10) + rem;
            num/=10;
        }
        System.out.println(rev);
    }
}
