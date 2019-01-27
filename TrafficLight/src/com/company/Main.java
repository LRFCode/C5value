package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(response('R'));
        System.out.println(response('Y'));
        System.out.println(response('G'));
        System.out.println(response('B'));

        System.out.println(nextColor('R'));
        System.out.println(nextColor('Y'));
        System.out.println(nextColor('G'));
        System.out.println(nextColor('B'));
    }

    public static char response(char color)
    {
        char message;

        if (color == 'R')
        {
            message = 'S';
        }
        else if (color == 'Y')
        {
            message = 'C';
        }
        else if (color == 'G')
        {
            message = 'G';
        }
        else
        {
            message = 'E';
        }

        return message;
    }

    private static char nextColor(char color)
    {
        char next;

        if (color == 'R')
        {
            next = 'G';
        }
        else if (color == 'Y')
        {
            next = 'R';
        }
        else if (color == 'G')
        {
            next = 'Y';
        }
        else
        {
            next = 'E';
        }

        return next;
    }
}
