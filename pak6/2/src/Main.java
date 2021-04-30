package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите строку");
        String word = new Scanner(System.in).nextLine();

        if(word.matches("[aeiouyAEIOUY]"))
            System.out.println(translateWord(word));
        else
            System.out.println(translateSentence(word));
    }

    public static String translateWord(String word){
        if (word.matches("[aeiouy]")) {
            word += "yay";
        }
        else {
            String newWord = word.split("[aeiouy]")[0];
            word = word.replaceFirst(newWord,"")+newWord+"ay";
        }
        return word;
    }

    public static String translateSentence(String word){
        String vow = "aeiouyAEIOUY";
        String[] newword = word.substring(0, word.length()-1).split(" ");
        word = "";
        for (String s : newword) {
            for (int j = 0; j < vow.length(); j++) {
                if (vow.indexOf(s.charAt(j)) != -1) {
                    word += s + "yay ";
                    break;
                } else {
                    String newWord = s.split("[aeiyouAEIYOU]")[0];
                    word += s.replaceFirst(newWord, "") + newWord + "ay ";
                    break;
                }
            }
        }
        return word + ".";
    }
}