package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите размер массива");
        int n = new Scanner(System.in).nextInt();

        System.out.println("Введите элементы массива");
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = new Scanner(System.in).nextInt();

        cumulativeSum(a.clone(), n);
    }

    public static void cumulativeSum(int[] a, int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                a[i] += a[j];
            }
            System.out.println(a[i]);
        }
    }
}