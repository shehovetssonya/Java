package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");

        String str = new Scanner(System.in).nextLine();

        flipEndChars(str);
    }

    public static void flipEndChars(String str)
    {
        if(str.length() < 2)
            System.out.println("Слишком короткая строка");
        else if(str.charAt(0) == str.charAt(str.length()-1))
            System.out.println("Символы одинаковые");
        else
            System.out.println(str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0));
    }
}