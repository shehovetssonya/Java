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
        int rez = sumOfCubes(a.clone());

        System.out.println(rez);
    }

    public static int sumOfCubes(int[] a)
    {
        int sum = 0;
        for (var A: a)
        {
            sum += A*A*A;
        }
        return sum;
    }
}