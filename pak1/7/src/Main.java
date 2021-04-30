package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите a");
        Scanner a = new Scanner(System.in);
        int Sum = addUpTo(a.nextInt());

        System.out.println(Sum);
    }

    public static int addUpTo(int a)
    {
        int sum = 0;
        for(int i = 1; i <= a; i++)
            sum += i;
        return sum;
    }
}