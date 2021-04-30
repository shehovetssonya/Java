package com.company;
import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Шифрование(1) или дешифрование(2): ");
        int N = new Scanner(System.in).nextInt();

        if(N == 1)
        {
            System.out.println("Введите строку: ");
            String str = new Scanner(System.in).nextLine();
            encrypt(str);
        }
        if(N == 2)
        {
            System.out.println("Введите размер массива");
            int n = new Scanner(System.in).nextInt();
            System.out.println("Введите элементы массива");
            int[] mass = new int[n];
            for(int i = 0; i < n; i++)
                mass[i] = new Scanner(System.in).nextInt();


            dycrypt(mass);
        }
    }

    public static void encrypt(String str)
    {
        int[] mass = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            if (i == 0)
                mass[i] = str.charAt(i);
            else
                mass[i] += str.charAt(i) - (str.charAt(i - 1));
        }
        for (int i = 0; i < str.length(); i++)
            System.out.print(mass[i] + ", ");
    }

    public static void dycrypt(int[] mass)
    {
        char[] str = new char[mass.length];
        for (int i = 0; i < mass.length; i++)
        {
            if (i == 0) {
                str[i] = (char) mass[i];
            } else {
                str[i] = (char) (mass[i - 1] + mass[i]);
                mass[i] = mass[i - 1] + mass[i];
            }
        }
        System.out.print(str);
    }
}