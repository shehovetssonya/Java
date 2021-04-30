package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите шаг: ");
        int num = new Scanner(System.in).nextInt();

        boxSeq(num);
    }

    public static void boxSeq(int num) {
        int rez = 0;

        for (int i = 0; i < num; i += 2) {
            rez += 2;
        }
        if (num % 2 == 0)
            System.out.println(rez);
        else
            System.out.println(rez + 1);
    }
}