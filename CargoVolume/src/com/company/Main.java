package com.company;

public class Main
{
    public static void main(String[] args)
    {
        boolean STANDARD = false;
        boolean HEAVY_DUTY = true;

        double volume = getCargoVolume(10.5, 12.5, 15.5, STANDARD);
        System.out.println("Standard: " + volume);

        volume = getCargoVolume(10.5, 12.5, 15.5, HEAVY_DUTY);
        System.out.println("Heavy Duty: " + volume);
    }

    private static double getCargoVolume(double height, double length, double depth, boolean heavyDuty)
    {
        final double STANDARD_MATERIAL_THICKNESS = 0.25;

        //Must account for two sides
        double totalMaterialThickness = STANDARD_MATERIAL_THICKNESS * 2;

        if (heavyDuty)
        {
            totalMaterialThickness = totalMaterialThickness * 2;
        }

        double interiorVolume = (height - totalMaterialThickness) *
                                (length - totalMaterialThickness) *
                                (depth  - totalMaterialThickness);

        return interiorVolume;
    }
}
