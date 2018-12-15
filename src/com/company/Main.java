package com.company;
import java.lang.Math;

public class Main {

    public static void main(String[] args)
    {
    // create two identical array to monitor changes

        int[] intRandomArray  = new int[12];
        int[] intRandomArray2 = new int[intRandomArray.length];
        ArrayOperations.fillArrayByRandom(intRandomArray);
        System.arraycopy(intRandomArray, 0 , intRandomArray2, 0, intRandomArray.length);

    // change array intRandomArray with "FOR"
        ArrayByFor.changeArrayByFor(intRandomArray2);

    // coping old array again
        System.arraycopy(intRandomArray, 0 , intRandomArray2, 0, intRandomArray.length);

    // change array intRandomArray with "DO WHILE"
        ArrayByDoWhile.changeArrayByDoWhile(intRandomArray2);

    //  change array intRandomArray with "WHILE"
        ArrayByWhile.changeArrayByWhile(intRandomArray);

    // print another result
        ArrayOperations.printResult2(intRandomArray);
    }
}
