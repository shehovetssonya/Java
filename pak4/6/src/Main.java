package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");
        int n = new Scanner(System.in).nextInt();

        bugger(n);
    }

    public static void bugger(int n)
    {
        int num = 0, sum = 1;
        String Num = Integer.toString(n);

        while(Num.length() > 1)
        {
            for(int i = 0; i < Num.length(); i++)
            {
                sum *= Num.charAt(i)-48;
            }
            Num = Integer.toString(sum);
            sum = 1;
            num++;
        }

        System.out.println(num);
    }
}