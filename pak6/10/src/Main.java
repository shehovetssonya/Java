package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите число");
        int num = new Scanner(System.in).nextInt();

        System.out.println(palindromedescendant(num));
    }

    public static boolean palindromedescendant(int num){
        boolean bul = false;
        StringBuffer nuum =new StringBuffer(num);
        StringBuffer nuuum =new StringBuffer(num);
        if (nuum.length()%2!=0)
            return false;
        else{
            while (!bul){
                if(nuum != nuum.reverse()){
                    for(int i=0; i<nuum.length();i+=2){
                        int a = Integer.parseInt(String.valueOf(nuum.charAt(i)));
                        int b = Integer.parseInt(String.valueOf(nuum.charAt(i+1)));
                        nuuum.append(a+b);
                    }
                }
                else
                    bul = true;
            }
        }
        return bul;
    }
}