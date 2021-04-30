package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();

        nextPrime(num);
    }

    public static int nextPrime(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if(i == num - 1 && num % i != 0)
            {
                System.out.println(num);
                return 1;
            }
            if(num % i == 0)
                break;
        }

        int K = 0;
        for (int i = num+1; K == 0 ; i++)
            for (int j = 2; j < i; j++)
            {
                if (j == i - 1 && i % j != 0)
                {
                    K = i;
                }
                if (i % j == 0)
                    break;
            }

        System.out.println(K);
        return 0;
    }
}