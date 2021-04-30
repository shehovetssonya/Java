package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число: ");

        String str = new Scanner(System.in).nextLine();

        flipEndChars(str);
    }

    public static int flipEndChars(String str)
    {
        char alf[] = {'a', 'b', 'c', 'd', 'e', 'f', 'A', 'B', 'C', 'D', 'E', 'F'};
        if(str.charAt(0) != '#')
            System.out.println("false");
        else if (str.length() != 7)
            System.out.println("false");
        else
            for(int i = 1; i < str.length(); i++)
                if (Character.isDigit(str.charAt(i)))
                    continue;
                else
                    for(int j = 0; j < 12;j++)
                    {
                        if(str.charAt(i) == alf[j])
                            break;
                        if(j == 11)
                        {
                            System.out.println("false");
                            return -1;
                        }
                    }

        System.out.println("true");
        return 0;
    }
}