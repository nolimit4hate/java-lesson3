package com.company;

public class ArrayByDoWhile
{

//  change array of int by "do while"
//  change array: if number beetween 3 < number < 8 then keep it
//      if number <= 13 then replace it into number = 99
//      if number > 13 then replace it into number 11
//  last two numbers in array will keep

    public static void changeArrayByDoWhile(int[] arrayInt)
    {
        int i = -1;
        if (arrayInt.length == 0)
        {
            System.out.println("ERROR - array length is 0");
            return;
        }

// DO while
        do
        {
            i++;
            if (i > arrayInt.length -3)
            {
                break;
            }
            if ((arrayInt[i] > 3) && (arrayInt[i] < 8))
            {
                continue;
            }
// ternary operator
            arrayInt[i] = arrayInt[i] <= 13 ? 99 : 11;
        } while (i < arrayInt.length);
        ArrayOperations.printResult(arrayInt);
    }
}
