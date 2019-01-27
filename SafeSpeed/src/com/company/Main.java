package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(safeSpeed(0));
        System.out.println(safeSpeed(14));
        System.out.println(safeSpeed(15));
        System.out.println(safeSpeed(16));
        System.out.println(safeSpeed(55));
    }

    private static int safeSpeed(int neighborSpeed)
    {
        final int NEIGHBOR_OVERAGE = 15;

        int safe;

        if (neighborSpeed >= 15)
        {
            safe = neighborSpeed - NEIGHBOR_OVERAGE;
        }
        else
        {
            safe = 0;
        }

        return safe;
    }
}
