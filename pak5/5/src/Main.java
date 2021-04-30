package com.company;
import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите размер массива");
        int n = new Scanner(System.in).nextInt();
        System.out.println("Введите элементы массива");
        String[] str = new String[n];
        for(int i = 0; i < n; i++)
            str[i] = new Scanner(System.in).nextLine();

        System.out.println(sameVowelGroup(str));
    }

    public static String sameVowelGroup (String[] str) {
        String vowel = "aeiouyAEIOUY";
        StringBuilder first = new StringBuilder();
        String second = "";

        ArrayList <String> words = new ArrayList<>();
        Collections.addAll(words, str);

        for (int i = 0; i < words.get(0).length(); i++) {
            if (vowel.indexOf(words.get(0).charAt(i)) != -1)
                first.append(words.get(0).charAt(i));
        }

        for (int i = words.size() - 1; i >= 0; i--) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (vowel.indexOf(words.get(i).charAt(j)) != -1) {
                    second += words.get(i).charAt(j);
                }
            }
            for (int k = 0; k < second.length();) {
                if (first.toString().indexOf(second.charAt(k)) != -1)
                    k++;
                else {
                    words.remove(i);
                    second = "";
                }
            }
        }
        return String.valueOf(words);
    }
}