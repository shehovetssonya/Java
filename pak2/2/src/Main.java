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

        differenceMaxMin(a.clone());
    }

    public static void differenceMaxMin(int[] a)
    {
        int max = a[0], min = a[0];
        for (var A: a)
        {
            if(A > max)
                max = A;
            if(A < min)
                min = A;
        }
        System.out.println(max - min);
    }
}