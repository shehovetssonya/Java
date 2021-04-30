package com.company;
import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку и символ: ");
        String str = new Scanner(System.in).nextLine();
        char sym = new Scanner(System.in).next().charAt(0);

        countUniqueBooks(str, sym);
    }

    public static void countUniqueBooks(String str, char sym)
    {
        int n = 0;
        List S = new ArrayList();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == sym)
            {
                i++;
                for(;str.charAt(i) != sym;i++)
                {
                    if(S.size() == 0)
                    {
                        S.add(str.charAt(i));
                        n++;
                    }
                    else
                        for (int j = 0; j < S.size(); j++)
                        {
                            if((char)S.get(j) == str.charAt(i))
                                break;
                            if(j == S.size()-1)
                            {
                                S.add(str.charAt(i));
                                n++;
                            }
                        }
                }
            }
        }

        System.out.println(n);
    }
}