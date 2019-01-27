package com.company;

public class Main
{
    public static void main(String[] args)
    {
        String myName = getMyName();
        System.out.println(myName);

        String myFancyName = getMyFancyName("***");
        System.out.println(myFancyName);

        myFancyName = getMyFancyName("*!*");
        System.out.println(myFancyName);
    }

    private static String getMyName()
    {
        return "Fred";
    }

    private static String getMyFancyName(String decoration)
    {
        String fancyName = decoration + getMyName() + decoration;
        return fancyName;

    }
}
