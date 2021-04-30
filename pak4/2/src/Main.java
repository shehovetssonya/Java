package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();

        split(str);
    }

    public static void split(String str)
    {
        String pStr = "";
        pStr += '"';
        int i = 0, l = 0, r = 0;

        while(true)
        {
            while(str.charAt(i) == '(')
            {
                pStr += '(';
                l++;
                i++;
            }
            while(str.charAt(i) == ')')
            {
                pStr += ')';
                r++;
                i++;
                if(i == str.length())
                    break;
            }
            if(l != r)
                continue;
            l = 0;
            r = 0;
            pStr += '"';
            if(i != str.length())
                pStr += ',';

            System.out.print(pStr);
            pStr = "";
            pStr += '"';
            if(i == str.length())
                break;
        }
    }
}