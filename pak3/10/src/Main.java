package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите длину ребер: ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        rightTriangle(a, b, c);
    }

    public static int rightTriangle(int a, int b, int c)
    {
        if (a > b && a > c)
            if (a*a == b*b + c*c)
                System.out.println("true");
            else
                return 0;
        if (b > a && b > c)
            if (b*b == a*a + c*c)
                System.out.println("true");
            else
                return 0;
        if (c > b && c > a)
            if (c*c == b*b + a*a)
                System.out.println("true");
            else
                return 0;

        System.out.println("false");
        return -1;
    }
}