package com.arichafamily.java;

import java.util.Scanner;

/**
 * Created by Ron on 11/02/2017.
 */
public class Utils {
    static double pi = 3.14;
    static Scanner scanner = new Scanner(System.in);

    public static double getRadius(){
        System.out.println("Enter circle radius");
        return scanner.nextDouble();
    }

    public static double getAreaOfCircle(double rad){
        double areaOfCircle = rad * rad * pi;
        return areaOfCircle;
    }

    public static double getCircumferenceOfCircle(double rad){
        double circumferenceOfCircle = 2 * rad * pi;
        return circumferenceOfCircle;
    }
}