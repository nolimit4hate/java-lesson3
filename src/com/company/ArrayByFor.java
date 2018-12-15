package com.company;

public class ArrayByFor
{
//  change array of int by "do while"
//  change array: if number beetween 3 < number < 8 then keep it
//      if number <= 13 then replace it into number = 99
//      if number > 13 then replace it into number 11
//  last two numbers in array will keep

    public static void changeArrayByFor(int[] arrayInt)
    {
        for(int i = 0; i < arrayInt.length; i++)
        {
            if (i > arrayInt.length - 3)
            {
                break;
            }
            if ((arrayInt[i] > 3) && (arrayInt[i] < 8))
            {
                continue;
            }
            if (arrayInt[i] <= 13)
            {
                arrayInt[i] = 99;
            }
            else
            {
                arrayInt[i] = 11;
            }

        }
        ArrayOperations.printResult(arrayInt);
    }
}
