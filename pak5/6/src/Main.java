package com.company;
import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите число");
        long cardNum = new Scanner(System.in).nextLong();

        System.out.println(validateCard(cardNum));
    }

    public static boolean validateCard(long cardNum) {
        StringBuilder str= new StringBuilder();
        if ( Long.toString(cardNum).length()>= 14 && Long.toString(cardNum).length() <= 19) {
            // step 1
            long lastNum = cardNum%10;
            StringBuilder cardNumStr = new StringBuilder(Long.toString(cardNum/=10));
            // step 2
            cardNumStr.reverse();
            // step 3
            for (int i = 0; i< cardNumStr.length(); i++){
                if (i%2==0){
                    int c =Character.getNumericValue(cardNumStr.charAt(i))*2;
                    if(c>9){
                        String buf = Integer.toString(c);
                        str.append(Character.getNumericValue(buf.charAt(0)) + Character.getNumericValue(buf.charAt(1)));
                    }
                    else str.append(c);
                }
                else str.append(cardNumStr.charAt(i));
            }
            System.out.println(str);
            int sum=0;
            for (int i=0;i<str.length();i++)
                sum+=Character.getNumericValue(str.charAt(i));
            System.out.println(sum);
            System.out.println(lastNum);
            return lastNum == 10 - sum % 10;
        }
        return false;
    }
}