package util;

import java.util.Arrays;
import java.util.Scanner;

public final class ArrayUtil {
    public static int[] getArrayElements() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int counter = 0;
        int arrayElement;
        int[] numbers = new int[n];

        while (n != counter) {
            counter++;

            System.out.print("Enter the " + counter + " - element of the array: ");
            arrayElement = input.nextInt();

            numbers[counter - 1] = arrayElement;
        }

        System.out.print("Array elements that you entered: " + Arrays.toString(numbers));
        System.out.println();
        return numbers;
    }

    public static double[] getArrayElementsDouble() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int counter = 0;
        double arrayElement;
        double[] numbers = new double[n];

        while (n != counter) {
            counter++;

            System.out.print("Enter the " + counter + " - element of the array: ");
            arrayElement = input.nextDouble();

            numbers[counter - 1] = arrayElement;
        }

        System.out.print("Array elements that you entered: " + Arrays.toString(numbers));
        System.out.println();
        return numbers;
    }

    public static int[] getArrayElementsWithAscendingOrder() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();
        int counter = 0;
        int arrayElement;
        int[] numbers = new int[n];
        boolean isAscending = true;

        while (n != counter) {
            counter++;

            System.out.print("Enter the " + counter + " - element of the array: ");
            arrayElement = input.nextInt();

            numbers[counter - 1] = arrayElement;

            if (counter == 2) {
                if (numbers[counter - 1] < numbers[counter - 2]) {
                    System.out.println(numbers[counter - 1] + " is less than " + numbers[counter - 2] + ". Please enter array elements in ascending order!");
                    isAscending = false;
                    break;
                }
            }
        }

        if (!isAscending) {
            return new int[1];
        }

        System.out.print("Array elements that you entered: " + Arrays.toString(numbers));
        System.out.println();
        return numbers;
    }
}
