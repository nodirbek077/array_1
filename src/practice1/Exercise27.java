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
        int index = 0;
        int min = Math.abs(r - (numbers[0] + numbers[1]));
        System.out.println("The minimum number is " + min);

        for (int i = 0; i < arrayLength - 1; i++) {
            int currentSum = numbers[i] + numbers[i + 1];
            int currentSumWithR = Math.abs(r - currentSum);
            if (currentSumWithR < min) {
                min = currentSumWithR;
                index = i;
            }
        }

        System.out.println();
        System.out.println("(" + numbers[index] + "," + numbers[index + 1] + ")");
    }
}
