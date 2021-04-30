package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");

        int num = new Scanner(System.in).nextInt();

        Fibonacci(num);
    }

    public static void Fibonacci(int num)
    {
        int n1 = 0, n2 = 1, sum = 0;
        for(int i = 0; i < num; i++)
        {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println(sum);
    }
}