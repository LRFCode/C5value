package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int sum = getTotal(10,20);
        System.out.println("sum: " + sum);

        sum = getTotal(5,4);
        System.out.println("sum: " + sum);

        sum = getTotal(12,12);
        System.out.println("sum: " + sum);

        int max = max(10,9);
        System.out.println("max: " + max);

        max = max(4,5);
        System.out.println("max: " + max);

        max = max(2,2);
        System.out.println("max: " + max);

        boolean thunderdome = isThunderdome(2,1);
        System.out.println("thunderdome: " + thunderdome);

        thunderdome = isThunderdome(1,2);
        System.out.println("thunderdome: " + thunderdome);

        thunderdome = isThunderdome(2,2);
        System.out.println("thunderdome: " + thunderdome);
    }

    private static int getTotal(int firstNumber, int secondNumber)
    {
        int sum = firstNumber + secondNumber;

        return sum;
    }

    private static int max(int a, int b)
    {
        int max;

        if (a > b)
        {
            max = a;
        }
        else
        {
            max = b;
        }

        return max;
    }

    private static boolean isThunderdome(int enteredCount, int leavingCount)
    {
        boolean thunderdome;

        if (enteredCount == 2 && leavingCount == 1)
        {
            thunderdome = true;
        }
        else
        {
            thunderdome = false;
        }

        return thunderdome;
    }
}
