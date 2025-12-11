package practice3;

import util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 8. n ta butun sonlardan iborat a massiv va k, h butun soni berilgan (1 <= k < h <= n).
 * Massivning a[k] va a[h] elementlari orasidagi qiymatlarni almashtiruvchi programma tuzilsin.
 * a[k] va a [h] elementlari bilan birgalikda.
 */
public class Exercise8 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index k: ");
        int k = input.nextInt();

        System.out.print("Enter an index h: ");
        int h = input.nextInt();

        if (k < 1) {
            System.out.print("k must be greater than or equal 1");
            return;
        }

        if (h < 1) {
            System.out.print("h must be greater than or equal 1");
            return;
        }

        if (k > h) {
            System.out.print("k must be less than h");
            return;
        }

        if (k > n) {
            System.out.print("k must be less than n");
            return;
        }

        int temp;
        for (int i = 0; i < n; i++) {
            if (i >= k && i <= h) {
                int l = h-k+1;
                temp = numbers[i];
                numbers[i] = numbers[h-i+1];
                numbers[h-i+1] = temp;
                if (i == l / 2) {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));


    }
}
