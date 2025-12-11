package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 5. n ta elementdan iborat massiv berilgan (n juft son).
 * Massivning nolinchi bilan birinchi,
 * ikkinchi bilan uchinchi, ..., elementlari o'rni almashtirilsin.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;
        int temp;

        if (arrayLength % 2 != 0) {
            System.out.println("You must enter even number of array length!");
            return;
        }

        //[2, 3, 15, 7]
        for (int i = 0; i < arrayLength - 1; i++) {
            if (i % 2 == 0) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
