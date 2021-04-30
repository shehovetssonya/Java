package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите кол-во слов, слов на строку, текст: ");
        int n = new Scanner(System.in).nextInt();
        int k = new Scanner(System.in).nextInt();
        String str = new Scanner(System.in).nextLine();

        Text(n, k, str);
    }

    public static void Text(int n, int k, String str)
    {
        String pStr = "";
        int t = 0;
        int ind;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                System.out.print(pStr);
                pStr = " ";
                continue;
            }

            pStr += str.charAt(i);
            t++;
            if(t % (k+1) == 0)
            {
                pStr = pStr.substring(1, pStr.length());
                System.out.println();
                t = 0;
            }
        }
        System.out.println(pStr);
    }
}