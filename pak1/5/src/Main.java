package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите a, b и N");
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner N = new Scanner(System.in);
        String rez = operation(a.nextInt(), b.nextInt(), N.nextInt());

        System.out.println(rez);
    }

    public static String operation(int a, int b, int N)
    {
        if (a+b == N)
            return "Сложение";
        if (Math.abs(a-b) == N)
            return "Вычитание";
        if (a*b == N)
            return "Умножение";
        if (a/b == N)
            return "Деление";
        return "Найн";
    }
}