package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите a и b");
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        Scanner C = new Scanner(System.in);
        boolean rez = abcmath(A.nextInt(), B.nextInt(), C.nextInt());

        System.out.println(rez);
    }

    public static boolean abcmath(int A, int B, int C)
    {
        int sum = A;
        for(int i = 0; i < B; i++)
            sum *= 2;
        System.out.println(sum);
        if(sum % C == 0)
            return true;
        else
            return false;
    }
}