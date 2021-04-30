package com.company;
import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите строки: ");
        String str1 = new Scanner(System.in).nextLine();
        String str2 = new Scanner(System.in).nextLine();

        System.out.println(canComplite(str1, str2));
    }

    public static boolean canComplite(String str1, String str2) {
        char[] massstr1 = str1.toCharArray();
        int num = 0;
        for (char c : massstr1) {
            if (str2.indexOf(String.valueOf(c), num) != -1)
                num = str2.indexOf(String.valueOf(c), num) + 1;
            else
                return false;
        }
        return true;
    }

}