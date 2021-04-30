package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");

        int num = new Scanner(System.in).nextInt();

        checkPerfect(num);
    }

    public static void checkPerfect(int num)
    {
        int sum = 0;
        for(int i = 1; i < num; i++)
            if(num % i == 0)
                sum += i;
        if(sum == num)
            System.out.println("true");
        else
            System.out.println("false");
    }
}