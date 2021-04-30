package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите числа: ");
        String num1 = new Scanner(System.in).nextLine();
        String num2 = new Scanner(System.in).nextLine();

        trouble(num1, num2);
    }

    public static void trouble(String num1, String num2)
    {
        char sym = num1.charAt(0), pSym = ' ';
        int k = 0;

        for(int i = 0; i < num1.length(); i++, k++)
        {
            if(sym != num1.charAt(i))
            {
                if (k == 3)
                    pSym = sym;
                sym = num1.charAt(i);
                k = 0;
            }
        }

        sym = num2.charAt(0);
        k = 0;
        for(int i = 0; i < num2.length(); i++, k++)
        {
            if(sym != num2.charAt(i))
            {
                if(pSym == num2.charAt(i-1) && k == 2)
                    break;
                sym = num2.charAt(i);
                k = 0;
            }
        }
        if (k == 2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}