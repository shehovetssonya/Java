package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите размер массива 1");
        int n1 = new Scanner(System.in).nextInt();

        System.out.println("Введите элементы массива 1");
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++)
            arr1[i] = new Scanner(System.in).nextInt();

        System.out.println("Введите размер массива 2");
        int n2 = new Scanner(System.in).nextInt();

        System.out.println("Введите элементы массива 2");
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++)
            arr2[i] = new Scanner(System.in).nextInt();

        same(arr1.clone(), arr2.clone());
    }

    public static void same(int[] arr1, int[] arr2)
    {
        int sum1 = 0, sum2 = 0;
        int[] arrT1 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for(int i = 0; i < arr1.length; i++)
            for(int j = 0; j < 10; j++)
            {
                if(arr1[i] == arrT1[j])
                    break;
                if(j == 9)
                {
                    arrT1[arr1[i]] = arr1[i];
                    sum1++;
                }
            }

        int[] arrT2 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        for(int i = 0; i < arr2.length; i++)
            for(int j = 0; j < 10; j++)
            {
                if(arr2[i] == arrT2[j])
                    break;
                if(j == 9)
                {
                    arrT2[arr2[i]] = arr2[i];
                    sum2++;
                }
            }

        if(sum1 == sum2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}