package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/*
6. n ta elementdan iborat massiv berilgan (n juft son).
   Massivning birinchi yarmi va ikkinchi yarmi qiymatlari almashtirilsin.
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        if (arrayLength % 2 != 0) {
            System.out.println("You must enter even number of array length!");
            return;
        }

        int halfArray = arrayLength / 2;
        int temp;

        //1. swap from 1-st part of the array to 2-nd ones
        for (int i = 0; i < halfArray; i++) {
            temp = numbers[i];
            numbers[i] = numbers[i + halfArray];//numbers[1] = numbers[4-1-1]=numbers[]
            numbers[i + halfArray] = temp;
        }

        //2. get array elements
        System.out.println(Arrays.toString(numbers));
    }
}
