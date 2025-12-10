package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 3. n ta butun sonlardan iborat massiv berilgan.
 * Massivdagi har bir toq sonni oxirgi toq songa orttiruvchi programma tuzilsin.
 * Agar toq sonlar bo'lmasa, massiv o'zgarishsiz qoldirilsin.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;
        int lastOddNum = 0;
        boolean isExistOddNum = false;

        //find last odd number
        for (int i = arrayLength - 1; i > 0; i--) {
            if (numbers[i] % 2 != 0) {
                lastOddNum = numbers[i];
                isExistOddNum = true;
                break;
            }
        }

        //add this odd number to every array element
        for (int i = 0; i < arrayLength; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + lastOddNum;
            }
        }

        if (isExistOddNum) {
            System.out.println("Changed array: " + Arrays.toString(numbers));
        } else {
            System.out.println("Unchanged array: " + Arrays.toString(numbers));
        }
    }
}
