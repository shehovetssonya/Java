package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите коэффициенты: ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        boxSeq(a, b, c);
    }

    public static int boxSeq(int a, int b,int c)
    {
        if(a == 0)
        {
            System.out.println("а не должно равняться нулю");
            return -1;
        }
        int D = b*b - 4*a*c;
        if(D < 0)
            System.out.println("0");
        if(D == 0)
            System.out.println("1");
        if(D > 0)
            System.out.println("2");
        return 0;
    }
}