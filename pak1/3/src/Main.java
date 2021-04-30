package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Сколько куриц, коров и свиней у фермера?");
        Scanner chickens = new Scanner(System.in);
        Scanner cows = new Scanner(System.in);
        Scanner pigs = new Scanner(System.in);
        int Sum = animals(chickens.nextInt(), cows.nextInt(), pigs.nextInt());

        System.out.println(Sum);
    }

    public static int animals(int chickens, int cows, int pigs)
    {
        return chickens*2 + cows*4 + pigs*4;
    }
}