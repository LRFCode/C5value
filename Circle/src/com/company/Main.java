package com.company;

public class Main
{
    public static void main(String[] args)
    {
        double area = getArea(4);
        System.out.println(area);

        double diameter = getDiameter(12);
        double circumference = getCircumference(diameter);
        System.out.println(circumference);
    }

    private static double getArea(double radius)
    {
        return 3.14 * radius * radius;
    }

    private static double getDiameter(double radius)
    {
        return 2 * radius;
    }

    private static double getCircumference(double diameter)
    {
        return 3.14 * diameter;
    }
}
