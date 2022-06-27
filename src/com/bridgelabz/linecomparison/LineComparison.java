package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to lin Comparison computation Problem");
        System.out.println("Enter the first (x1,y1) point");
        int x1 = getInputFromUser("x1");
        int y1 = getInputFromUser("y1");
        System.out.println("Enter the second (x2, y2) point");
        int x2 = getInputFromUser("x2");
        int y2 = getInputFromUser("y2");
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        Double length = (Math.sqrt(x + y));
        System.out.println("Length of the line : "+length);

        System.out.println("Enter Second line Co-ordinates");
        System.out.println("Enter the first (a1,b1) point");
        int a1 = getInputFromUser("a1");
        int b1 = getInputFromUser("b1");
        System.out.println("Enter the second (a2, b2) point");
        int a2 = getInputFromUser("a2");
        int b2 = getInputFromUser("b2");
        double a = Math.pow((a2 - a1), 2);
        double b = Math.pow((b2 - b1), 2);
        Double length1 = (Math.sqrt(a + b));
        System.out.println("Length of the line : "+length1);
        int result = length.compareTo(length1);
        System.out.println(result);

        if (result == 0) {
            System.out.println("length = length1");
        } else if (result > 0) {
            System.out.println("length > length1");
        } else if (result < 0) {
            System.out.println("length < length1");
        }
    }
    public static int getInputFromUser(String number) {
        System.out.println("Enter the " + number + " line co-ordinates");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
