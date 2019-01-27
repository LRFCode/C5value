package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int height = 4;
        int width = 5;

        int area = getArea(height, width);
        System.out.println(area);

        int circumference = getCircumference(height, width);
        System.out.println(circumference);
    }

    private static int getArea(int height, int width)
    {
        return height * width;
    }

    private static int getCircumference(int height, int width)
    {
        return (2 * height) + (2 * width);
    }
}
