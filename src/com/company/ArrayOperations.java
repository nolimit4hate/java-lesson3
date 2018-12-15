package com.company;

import java.util.Random;

public class ArrayOperations
{
    // Fill array of int by random numbers(1..19)
    public static void fillArrayByRandom(int[] arrayInt)
    {
        Random rand = new Random();
        for(int i = 0; i < arrayInt.length; i++)
        {
            arrayInt[i] = rand.nextInt(19);
        }
        printResult(arrayInt);
        return;
    }

//  print results:
//  add 0 before numbers with 1

    public static void printResult(int[] arrayInt)
    {
        for(int i = 0; i < arrayInt.length; i++)
        {
            if (arrayInt[i] < 10)
            {
                System.out.print("0" + arrayInt[i] + " ");
            }
            else
            {
                System.out.print(arrayInt[i] + " ");
            }
        }
        System.out.println(" ");
        return;
    }

// print how mutch 99 and 11 numbers in array

    public static void printResult2(int[] arrayInt)
    {
        int sum99 = 0;
        int sum11 = 0;
        for(int a : arrayInt)
        {

        // switch
            switch (a)
            {
                case 11:
                    sum11++;
                    break;
                case 99:
                    sum99++;
                    break;
            }

        }
        System.out.println("11 is " + sum11 + "|| 99 is " + sum99);
    }

}
