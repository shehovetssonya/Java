package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку: ");
        String str = new Scanner(System.in).nextLine();

        System.out.println("Введите аргумент: ");
        String arg = new Scanner(System.in).nextLine();

        isPrefix(str, arg);
        isSuffix(str, arg);
    }

    public static int isPrefix(String str, String arg)
    {
        int N1 = str.length();
        int N2 = arg.length();

        for(int i = 0; i < N2; i++)
        {
            if(str.charAt(i) != arg.charAt(i))
            {
                System.out.print("isPrefix - false");
                return -1;
            }
        }
        System.out.println("isPrefix - true");
        return 0;
    }

    public static int isSuffix(String str, String arg)
    {
        int N1 = str.length() - 1;
        int N2 = arg.length() - 1;

        for(int i = N1, j = N2; i > N1-N2; i--, j--)
        {
            if(str.charAt(i) != arg.charAt(j))
            {
                System.out.print("isPrefix - false");
                return -2;
            }
        }
        System.out.println("isPrefix - true");
        return 0;
    }
}
