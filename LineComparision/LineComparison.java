package com.LineComparision;
import java.util.Scanner;

/**
 *
 * @author Puja
 */

public class LineComparison {

    /**
     * Method used for calculate the length of line
     * @param x1 = 1st point at line x
     * @param x2 = 2nd point at line x
     * @param y1 = 1st point at line y
     * @param y2 = 2nd point at line y
     */

    public static void lengthOfLine(double x1, double x2, double y1, double y2) { // UC1 to check the Length of the Line
        double dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance between "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===> "+dis);

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Problem!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1 y1:");
        double x1 = sc.nextDouble();
        double y1 = sc. nextDouble();

        System.out.println("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println("Length of Line is : ");
        lengthOfLine(x1,x2,y1,y2);

    }


}
