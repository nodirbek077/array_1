package practice3;//Amaliyot3:massivni elementlarini o'zgartirish

import java.util.Arrays;

/**
 * 1. n ta butun sonlardan iborat a massiv va k butun soni berilgan (1 < k <= n).
 * Massivning har bir elementini a[k] ga orttiruvchi programma tuzilsin.
 * Namuna: massive = {1, 2, 7, 9};     k=2
 * Natija:  [3,4,9,11]
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 9};
        int k = 3;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] + k;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
