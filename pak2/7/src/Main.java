package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите индекс: ");

        String str = new Scanner(System.in).nextLine();

        isValid(str);
    }

    public static int isValid(String str)
    {
        if(str.length() != 5)
        {
            System.out.print("false");
            return -1;
        }

        for (int i = 0; i < 5; i++)
        {
            if(str.charAt(i) == ' ')
            {
                System.out.print("false");
                return -2;
            }
            if(!Character.isDigit(str.charAt(i)))
            {
                System.out.print("false");
                return -3;
            }
        }
        System.out.print("true");
        return 0;
    }
}