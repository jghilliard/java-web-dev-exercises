package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class AreaII {
        public static void main(String[] args) {
            double radius;
            double area;
            Scanner input;


            input = new Scanner(System.in);
            System.out.println("What is the radius of your circle?");
            radius = input.nextDouble();
            input.close();
            area = Circle.getArea(radius);
            System.out.println("The area of your circle is " + area + "!");
        }
    }

