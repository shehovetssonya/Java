package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите элементы массива");
        float[] arr = new float[4];

        for(int i = 0; i < 4; i++)
            arr[i] = new Scanner(System.in).nextFloat();

        overTime(arr.clone());
    }

    public static void overTime(float[] arr)
    {
        float time1 = 0, time2 = 0;
        if(arr[1] >= 17)
        {
            time1 = 17 - arr[0];
            time2 = arr[1] - 17;
        }
        else
            time1 = arr[1] - arr[0];

        System.out.println(time1 * arr[2] + time2  * arr[2] * arr[3]);
    }
}