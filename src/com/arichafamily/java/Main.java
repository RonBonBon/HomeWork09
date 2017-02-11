package com.arichafamily.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Math squre of 64 is: " + Math.sqrt(64));

        double radius = Utils.getRadius();
        System.out.println("The area of the circle is: " + Utils.getAreaOfCircle(radius));
        System.out.println("The circumference of the circle is: " + Utils.getCircumOfCircle(radius));
    }
}
