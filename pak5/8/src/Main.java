package com.company;
import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строки: ");
        String str1 = new Scanner(System.in).nextLine();
        String str2 = new Scanner(System.in).nextLine();

        doesRhyme(str1, str2);
    }

    public static void doesRhyme(String str1, String str2)
    {
        char[] vowel = {'a','e','i','o','u','y','A','E','I','O','U','Y'};
        List S1 = new ArrayList();
        List S2 = new ArrayList();
        for(int i = str1.length()-1; str1.charAt(i) != ' '; i--)
        {
            for (char t: vowel)
            {
                if(t == str1.charAt(i))
                {
                    S1.add(t);
                    break;
                }
            }
        }

        for(int i = str2.length()-1; str2.charAt(i) != ' '; i--)
        {
            for (char t: vowel)
            {
                if(t == str2.charAt(i))
                {
                    S2.add(t);
                    break;
                }
            }
        }
        int n = 0;
        if(S1.size() == S2.size())
            for(int i = 0; i < S2.size(); i++)
                for (var ch: S1)
                {
                    if(ch == S2.get(i))
                        n++;
                }
        else
            System.out.print("false");

        if(n == S1.size())
            System.out.print("true");
        else
            System.out.print("false");
    }
}