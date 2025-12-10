package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 2. n ta butun sonlardan iborat massiv berilgan.
 * Massivdagi har bir juft sonni birinchi uchragan juft songa orttiruvchi programma tuzilsin.
 * Agar juft sonlar bo'lmasa, massiv o'zgarishsiz qoldirilsin.
 * Namuna: massive = [7, 2, 8, 9];
 * Massivdagi uchragan birinchi juft son 2. Demak massivni har birini 2ta ortiramiz. Natija   [9,4,10,11]
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;
        boolean isFirstEvenElement = false;//this is just a flag only for first even number
        int firstEvenNumber = 0;//this is a first even number

        for (int number : numbers) {
            if (number % 2 == 0) {
                isFirstEvenElement = true;
                firstEvenNumber = number;
                break;
            }
        }

        if (isFirstEvenElement) {
            for (int i = 0; i < arrayLength; i++) {
                numbers[i] = numbers[i] + firstEvenNumber;
            }
            System.out.println("Array that has changed with only one even number: " + Arrays.toString(numbers));
        } else
            System.out.println("Array elements hasn't changed in case of all elements odd numbers: " + Arrays.toString(numbers));
    }
}
