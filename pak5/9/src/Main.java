package com.company;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        String title = new Scanner(System.in).nextLine();

        System.out.println(correctTitle(title));
    }

    public static String correctTitle(String title) {
        String[] text = title.toLowerCase().split(" ");
        title = "";
        String pos = "";
        for (int i = 0; i < text.length; i++) {
            while (text[i].contains("-")) {
                pos += text[i].indexOf("-") + " ";
                text[i] = text[i].substring(0, text[i].indexOf("-")) + " " + text[i].substring(text[i].indexOf("-") + 1);
                System.out.println(text[i].substring(text[i].indexOf("-") + 1));
            }
            if (text[i].equals("in") || text[i].equals("of") || text[i].equals("and") || text[i].equals("the"))
                title += text[i].toLowerCase() + " ";
            else
                title += text[i].substring(0, 1).toUpperCase() + text[i].substring(1) + " ";
        }
        return title;
    }
}