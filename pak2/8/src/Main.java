package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите 1 строку: ");
        String str1 = new Scanner(System.in).nextLine();

        System.out.println("Введите 2 строку: ");
        String str2 = new Scanner(System.in).nextLine();

        isStrangePair (str1, str2);
    }

    public static void isStrangePair (String str1, String str2)
    {
        int N1 = str1.length();
        int N2 = str2.length();

        if((str1.charAt(0) == str2.charAt(N2-1)) && (str1.charAt(N1-1) == str2.charAt(0)))
            System.out.print("true");
        else
            System.out.print("false");
    }
}