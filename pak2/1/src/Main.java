package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите слово и число повторений: ");

        String str = new Scanner(System.in).nextLine();

        int num = new Scanner(System.in).nextInt();

        repeat(str, num);
    }

    public static void repeat(String str, int num)
    {
        int N = str.length();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < num; j++)
            {
                System.out.print(str.charAt(i));
            }
    }
}