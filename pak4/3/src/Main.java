package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();

        toCamelCase(str);
        toSnakeCase(str);
    }

    public static void toCamelCase(String str)
    {
        String pStr = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '_')
            {
                pStr += str.substring(i+1, i+2).toUpperCase();
                i+=2;
            }
            pStr += str.charAt(i);
        }

        System.out.println(pStr);
    }

    public static void toSnakeCase(String str)
    {
        String pStr = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                pStr += "_" + str.substring(i, i+1).toLowerCase();
                i++;
            }
            pStr += str.charAt(i);
        }

        System.out.println(pStr);
    }
}