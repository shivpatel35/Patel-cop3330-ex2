package org.ex2;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("What is the input string?");
        String str2;
        str2 = str.next();
        if (str2.length() == 0) {
            System.out.println("You must enter characters to make the program work!");
        } else {
            System.out.println("The length of the string is : " + str2.length());
        }
    }
}

