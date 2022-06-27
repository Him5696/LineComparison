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
    }
    public static int getInputFromUser(String number) {
        System.out.println("Enter the " + number + " line co-ordinates");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }
}
