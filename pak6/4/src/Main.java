package com.company;
import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите размер массива");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Введите элементы массива");
        int[] mass = new int[n];
        for(int i = 0; i < n; i++)
            mass[i] = new Scanner(System.in).nextInt();

        System.out.println(sumDigProd(mass.clone()));
    }

    public static int sumDigProd(int[] mass)
    {
        int sum = 0;
        for (int value : mass)
        {
            sum += value;
        }
        while (sum > 9)
        {
            int mult = 1;
            while (sum > 0)
            {
                mult *= sum % 10;
                sum /= 10;
            }
            sum = mult;
        }
        return sum;
    }
}