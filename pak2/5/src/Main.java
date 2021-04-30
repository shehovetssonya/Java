package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");

        String str = new Scanner(System.in).nextLine();

        getDecimalPlaces(str);
    }

    public static void getDecimalPlaces(String str)
    {
        int N = str.length();
        int sum = 0;

        for (int i = 0; i < N; i++)
        {
            if(str.charAt(i) == '.')
            {
                for (int j = i+1; j < N; j++)
                    sum++;
                break;
            }
        }
        System.out.print(sum);
    }
}