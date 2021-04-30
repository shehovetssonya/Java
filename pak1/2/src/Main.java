package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите основание и высоту треугольника");
        Scanner h = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        int S = triArea(h.nextInt(), a.nextInt());

        System.out.println(S);
    }

    public static int triArea(int h, int a)
    {
        return h*a/2;
    }
}
