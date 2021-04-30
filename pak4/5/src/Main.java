package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите вес и рост: ");
        float weight = new Scanner(System.in).nextFloat();
        float height = new Scanner(System.in).nextFloat();

        System.out.println("Единица веса(1 - кг, 2 - фунт): ");
        int t1 = new Scanner(System.in).nextInt();
        System.out.println("Единица роста(1 - метр, 2 - дюйм): ");
        int t2 = new Scanner(System.in).nextInt();
        if(t1 == 1)
            if(t2 == 1)
                BMI(weight, height);
            else
                BMI(weight * (float)0.025, height);
        else if(t2 == 1)
            BMI(weight, height * (float)0.45);
        else
            BMI(weight * (float)0.025, height * (float)0.45);
    }

    public static void BMI(float weight, float height)
    {
        float BMI = weight / (height*height);
        if(BMI < 18.5)
            System.out.println(BMI + " - недостаточный вес");
        if(BMI >= 18.5 && BMI <= 25)
            System.out.println(BMI + " - нормальный вес");
        if(BMI > 25)
            System.out.println(BMI + " - избыточный вес");
    }
}