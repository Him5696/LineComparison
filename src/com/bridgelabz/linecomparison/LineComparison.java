package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    static int x1,y1,x2,y2;
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Double length1=getInput();
        Double length2=getInput();
       int result = length1.compareTo(length2);
        System.out.println(result);

        if (result == 0) {
            System.out.println("length1 = length2");
        } else if (result > 0) {
            System.out.println("length1 > length2");
        } else if (result < 0) {
            System.out.println("length1 < length2");
        }
    }
    public static double calculatedLength() {
        double x=Math.pow((x2-x1), 2);
        double y=Math.pow((y2-y1), 2);
        double length = Math.sqrt(x+y);
        System.out.println(length);
        return length;
    }
    public static double getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Line Coordinate for first point");
        x1=sc.nextInt();
        y1=sc.nextInt();
        System.out.println("Enter Line Coordinate for Second point");
        x2=sc.nextInt();
        y2=sc.nextInt();
        calculatedLength();
        return calculatedLength();

    }
}
