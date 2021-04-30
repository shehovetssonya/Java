package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        String str = new Scanner(System.in).nextLine();

        System.out.println(longestNonrepeatingSubstring(str));

    }

    public static String longestNonrepeatingSubstring(String str){
        String podstr = "";
        char [] mass = str.toCharArray();
        StringBuilder strBuilder = new StringBuilder();
        for (char c : mass) {
            if (!strBuilder.toString().contains(String.valueOf(c)))
                strBuilder.append(c);
            else {
                if (strBuilder.length() > podstr.length())
                    podstr = strBuilder.toString();
                strBuilder = new StringBuilder("" + c);
            }
        }
        str = strBuilder.toString();
        if (str.length()>podstr.length())
            podstr=str;
        return podstr;
    }
}