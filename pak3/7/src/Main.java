package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");
        int num = new Scanner(System.in).nextInt();

        isKaprekar(num);
    }

    public static void isKaprekar(int num)
    {
        int sum = 0;
        int square = num*num;
        String Num = Integer.toString(square), A = "", B = "";

        if(Num.length() == 1)
            sum = square;

        for(int i = 0; i < Num.length(); i++)
        {
            if(i < Num.length() / 2)
                A += Num.charAt(i);
            else
                B += Num.charAt(i);
        }
        sum = Integer.valueOf(A,10) + Integer.valueOf(B,10);

        if(sum == num)
            System.out.println("true");
        else
            System.out.println("false");
    }
}