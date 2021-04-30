package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        String rgb = new Scanner(System.in).nextLine();

        System.out.println(validColor(rgb));

    }

    public static boolean validColor (String rgb){
        int num = rgb.indexOf('(');
        if (rgb.contains(" "))
            return false;
        String [] newrgb = rgb.substring(rgb.indexOf('(')+1,rgb.indexOf(')')).split(",");
        double [] n = new double [num];
        for (int i = 0 ; i < num; i++) {
            n[i] = Double.parseDouble(newrgb[i]);
        }
        for (int i = 0 ; i < num; i++) {
            return n[i] >= 0 && n[i] <= 255 && num == newrgb.length;
        }
        return false;
    }
}