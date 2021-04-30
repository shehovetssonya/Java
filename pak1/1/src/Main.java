package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите a и b");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int c = remainder(a.nextInt(), b.nextInt());

        System.out.println(c);
    }

    public static int remainder(int a, int b)
    {
        return a % b;
    }
}
