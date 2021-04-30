package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");

        String str = new Scanner(System.in).nextLine();

        findZip(str);
    }

    public static int findZip(String str)
    {
        int zip = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'z' && str.charAt(i+1) == 'i' && str.charAt(i+2) == 'p')
            {
                zip++;
                if(zip == 2)
                {
                    System.out.println(i);
                    return 0;
                }
            }
        }
        System.out.println(-1);
        return -1;
    }
}