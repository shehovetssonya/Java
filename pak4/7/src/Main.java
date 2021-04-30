package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();

        toStarShorthand(str);
    }

    public static void toStarShorthand(String str)
    {
        String pStr = "";
        pStr = "";
        char sym = str.charAt(0);
        int k = 0;

        for(int i = 0; i < str.length(); i++, k++)
        {
            if(sym != str.charAt(i) || i == str.length()-1)
            {
                if(sym == str.charAt(i) && i == str.length()-1)
                    k++;
                sym = str.charAt(i);
                if(k > 1)
                    pStr += str.charAt(i-1) + "*" + k;
                else
                    pStr += str.charAt(i-1);

                k = 0;
            }
        }

        System.out.println(pStr);
    }
}