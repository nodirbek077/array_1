package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 9. n ta butun sonlardan iborat a massiv berilgan.
 * Massivning eng kichik va eng katta elementlari orasidagilarini nolga almashtiruvchi programma tuzilsin.
 * Eng kichik va eng katta elementlari o'zgarishsiz qoldirilsin.
 */
public class Exercise9 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        if (n == 1 || n == 2) {
            System.out.println("Array length must be more than 2.");
            return;
        }

        //1. find minimum and maximum indexes
        for (int i = 0; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        //2. set to zero value between min and max indexes
        for (int i = 0; i < n - 1; i++) {
            if (i > minIndex && i < maxIndex)
                numbers[i] = 0;

            if (i > maxIndex && i < minIndex)
                numbers[i] = 0;

            if (maxIndex + 1 == minIndex || minIndex + 1 == maxIndex) {
                System.out.println("Minimum and maximum elements of an array came subsequently");
                return;
            }
        }

        //3. get array elements that has just changed
        System.out.println(Arrays.toString(numbers));
    }
}
