package com.basic;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Grerating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name !");
        String name = input.nextLine();
        String out;
        out = greating(name);
        System.out.println(out);
    }

    static String greating(String name) {
        return "Hello "+name + " !";
    }
}
