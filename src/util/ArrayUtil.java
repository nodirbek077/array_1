package util;

import java.util.Arrays;
import java.util.Scanner;

public final class ArrayUtil {
    public static int[] getArrayElements() {
        Scanner input = new Scanner(System.in);

        System.out.print("Massiv o'lchamini kiriting: ");
        int n = input.nextInt();
        int counter = 0;
        int arrayElement;
        int[] numbers = new int[n];

        while (n != counter) {
            counter++;

            System.out.print("Massivning " + counter + "- elementini kiriting: ");
            arrayElement = input.nextInt();

            numbers[counter - 1] = arrayElement;
        }

        System.out.print("Siz kiritgan massiv elementlari: " + Arrays.toString(numbers));
        System.out.println();
        return numbers;
    }
}
