package com.company;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите число");
        int n = new Scanner(System.in).nextInt();

        System.out.println(haxLattice(n));
    }

    public static String haxLattice(int n){
        int num = 1;
        int i = 1;
        String res="";
        String str2="";
        while (n>num) {
            i++;
            num = 3 * i * (i - 1) + 1;
        }
        int l = i;

        if (n != num)
            res = "invalid";
        else {
            while (l < i * 2 - 1) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += "  ";
                for (int b = 0; b < l; b++)
                    res += " o  ";
                res += "\n";
                l++;
            }

            while (l >= i) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += "  ";
                for (int b = l; b > 0; b--)
                    res += " o  ";
                res += "\n";
                l--;
            }
        }
        return res;
    }
}