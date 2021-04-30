package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");
        String num = new Scanner(System.in).nextLine();

        longestZero(num);
    }

    public static void longestZero(String num)
    {
        String str = "", pStr = "";
        int sum = 0, pSum = 0;

        for(int i = 0; i < num.length(); i++)
            if(num.charAt(i) == '0')
            {
                for(int j = i; j < num.length(); j++)
                {
                    if(num.charAt(j) == '1')
                        break;
                    pStr += num.charAt(j);
                    pSum++;
                    i++;
                }
                if(pSum > sum)
                {
                    sum = pSum;
                    str = pStr;
                }
                pSum = 0;
                pStr = "";
            }

        System.out.println(str);
    }
}