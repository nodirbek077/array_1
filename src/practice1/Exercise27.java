package practice1;

import util.ArrayUtil;

import java.util.Scanner;

/**
 * 27. n ta elementdan tashkil topgan massiv va R butun soni berilgan.
 * Massiv elementlari orasidan R soniga yig'indisi eng yaqin 2 ta qo'shni elementni chiqaruvchi programma tuzilsin.
 */
public class Exercise27 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number r: ");
        int r = input.nextInt();

        // r = 1, sum = 3
        int maxSum = numbers[0] + numbers[1];
        int maxIndex = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            int currentSum = numbers[i] + numbers[i + 1];
            int currentSumWithR = currentSum - r;
            maxIndex = i;
            System.out.print(currentSumWithR + " ");
//            System.out.print(maxIndex);
        }
//
//        int element1 = numbers[maxIndex];
//        int element2 = numbers[maxIndex + 1];
//
//        System.out.println("Element 1: " + element1);
//        System.out.println("Element 2: " + element2);

    }
}
