package practice3;

import util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 13. n ta elementdan tashkil topgan massiv va k butun soni berilgan (1 < k < n).
 * Massiv elementlarini k ta o'rin o'ngga siljituvchi programma tuzilsin.
 * a[0] element qiymati a[k] ga o'tadi, a[1] esa a[k + 1] ga, ...
 * massivning oxirgi k ta elementi tashlab yuboriladi.
 * Hosil bo'lgan massivning dastlabki k ta elementi qiymati nolga teng bo'lsin.
 */
public class Exercise13 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number k: ");
        int k = input.nextInt();

        if (k >= n) {
            System.out.println("K must be less than n");
            return;
        }

        if (k <= 1 && k != 0) {
            System.out.println("K must be greater than 1");
            return;
        }

        if (k == 0) {
            System.out.println(Arrays.toString(numbers));
            return;
        }

        //1. create temporary array far saving last K ta element
        int[] temp = new int[k];

        //2. move to last k element ([0, 1, 2, 3, 4])
        for (int i = 0; i < k; i++) {
            temp[i] = numbers[n - k + i];
        }

        //3. remaining elements to move k ta
        for (int i = n - 1; i >= k; i--) {
            numbers[i] = numbers[i - k];
        }

        //4. need to move the elements that are in the temp array to the beginning of an array
        for (int i = 0; i < k; i++) {
            numbers[i] = temp[i];
        }

        //new changed array length
        int newArrayLength = n - k;
        int[] newArrayNumbers = new int[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            newArrayNumbers[i] = numbers[k + i];
        }

        //set to zero if counter reaches to k (k including)
        int counter = 0;
        for (int i = 0; i < newArrayLength; i++) {
            counter++;

            if (counter <= k) {
                newArrayNumbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(newArrayNumbers));
    }
}
