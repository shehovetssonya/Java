package com.company;
import java.util.Scanner;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Введите число");
        int num = new Scanner(System.in).nextInt();

        System.out.println(numToEng(num));
    }

    public static String numToEng(int num) {
        String strnum = "";
        if (num == 0) return "zero";
        // сотни
        switch (num / 100) {
            case 1: {
                strnum += "one hundred ";
                break;
            }
            case 2: {
                strnum += "two hundred ";
                break;
            }
            case 3: {
                strnum += "three hundred ";
                break;
            }
            case 4: {
                strnum += "four hundred ";
                break;
            }
            case 5: {
                strnum += "five hundred ";
                break;
            }
            case 6: {
                strnum += "six hundred ";
                break;
            }
            case 7: {
                strnum += "seven hundred ";
                break;
            }
            case 8: {
                strnum += "eight hundred ";
                break;
            }
            case 9: {
                strnum += "nine hundred ";
                break;
            }
        }
        // десятки до 20
        switch (num / 10 % 10) {
            case 1: {
                switch (num % 10) {
                    case 0: {
                        strnum += "ten";
                        return strnum;
                    }
                    case 1: {
                        strnum += "eleven";
                        return strnum;
                    }
                    case 2: {
                        strnum += "twelve";
                        return strnum;
                    }
                    case 3: {
                        strnum += "thirteen";
                        return strnum;
                    }
                    case 4: {
                        strnum += "fourteen";
                        return strnum;
                    }
                    case 5: {
                        strnum += "fifteen";
                        return strnum;
                    }
                    case 6: {
                        strnum += "sixteen";
                        return strnum;
                    }
                    case 7: {
                        strnum += "seventeen";
                        return strnum;
                    }
                    case 8: {
                        strnum += "eighteen";
                        return strnum;
                    }
                    case 9: {
                        strnum += "nineteen";
                        return strnum;
                    }
                }
            }
            // десятки после 20
            case 2: {
                strnum += "twenty ";
                break;
            }
            case 3: {
                strnum += "thirty ";
                break;
            }
            case 4: {
                strnum += "forty ";
                break;
            }
            case 5: {
                strnum += "fifty ";
                break;
            }
            case 6: {
                strnum += "sixty ";
                break;
            }
            case 7: {
                strnum += "seventy ";
                break;
            }
            case 8: {
                strnum += "eighty ";
                break;
            }
            case 9: {
                strnum += "ninety ";
                break;
            }
        }
        // единицы
        switch (num % 10) {
            case 1: {
                strnum += "one";
                break;
            }
            case 2: {
                strnum += "two";
                break;
            }
            case 3: {
                strnum += "three";
                break;
            }
            case 4: {
                strnum += "four";
                break;
            }
            case 5: {
                strnum += "five";
                break;
            }
            case 6: {
                strnum += "six";
                break;
            }
            case 7: {
                strnum += "seven";
                break;
            }
            case 8: {
                strnum += "eight";
                break;
            }
            case 9: {
                strnum += "nine";
                break;
            }
        }
        return strnum;
    }

    public static String numToRus(int num) {
        String strnum = "";
        if (num == 0) return "ноль";
        // сотни
        switch (num / 100) {
            case 1: {
                strnum += "сто ";
                break;
            }
            case 2: {
                strnum += "двести ";
                break;
            }
            case 3: {
                strnum += "триста ";
                break;
            }
            case 4: {
                strnum += "четыреста ";
                break;
            }
            case 5: {
                strnum += "пятьсот ";
                break;
            }
            case 6: {
                strnum += "шестьсот ";
                break;
            }
            case 7: {
                strnum += "семьсот ";
                break;
            }
            case 8: {
                strnum += "восемьсот ";
                break;
            }
            case 9: {
                strnum += "девятьсот ";
                break;
            }
        }
        // десятки до 20
        switch (num / 10 % 10) {
            case 1: {
                switch (num % 10) {
                    case 0: {
                        strnum += "десять";
                        return strnum;
                    }
                    case 1: {
                        strnum += "одиннадцать";
                        return strnum;
                    }
                    case 2: {
                        strnum += "двенадцать";
                        return strnum;
                    }
                    case 3: {
                        strnum += "тринадцать";
                        return strnum;
                    }
                    case 4: {
                        strnum += "четырнадцать";
                        return strnum;
                    }
                    case 5: {
                        strnum += "пятнадцать";
                        return strnum;
                    }
                    case 6: {
                        strnum += "шестнадцать";
                        return strnum;
                    }
                    case 7: {
                        strnum += "семнадцать";
                        return strnum;
                    }
                    case 8: {
                        strnum += "восемьнадцать";
                        return strnum;
                    }
                    case 9: {
                        strnum += "двадцать";
                        return strnum;
                    }
                }
            }
            // десятки после 20
            case 2: {
                strnum += "двадцать ";
                break;
            }
            case 3: {
                strnum += "тридцать ";
                break;
            }
            case 4: {
                strnum += "сорок ";
                break;
            }
            case 5: {
                strnum += "пятьдесят ";
                break;
            }
            case 6: {
                strnum += "шестьдесят ";
                break;
            }
            case 7: {
                strnum += "семьдесят ";
                break;
            }
            case 8: {
                strnum += "восемьдесят ";
                break;
            }
            case 9: {
                strnum += "девяносто ";
                break;
            }
        }
        // единицы
        switch (num % 10) {
            case 1: {
                strnum += "один";
                break;
            }
            case 2: {
                strnum += "два";
                break;
            }
            case 3: {
                strnum += "три";
                break;
            }
            case 4: {
                strnum += "четыре";
                break;
            }
            case 5: {
                strnum += "пять";
                break;
            }
            case 6: {
                strnum += "шесть";
                break;
            }
            case 7: {
                strnum += "семь";
                break;
            }
            case 8: {
                strnum += "восемь";
                break;
            }
            case 9: {
                strnum += "девять";
                break;
            }
        }
        return strnum;
    }
}