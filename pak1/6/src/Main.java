package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите символ");
        Scanner symbol = new Scanner(System.in);
        int ASCII = ctoa(symbol.next().charAt(0));

        System.out.println(ASCII);
    }

    public static int ctoa(char symbol)
    {
        return (int)symbol;
    }
}
