package practice1;

import util.ArrayUtil;

/**
 * 29. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan bir-biriga eng yaniq qo'shnilar indeksini chiqaruvchi programma tuzilsin.
 * (ayirmasining moduli eng kichik bo'lgan elementlari indeksi)
 */
public class Exercise29 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        //[1, 2, 3, 4]
        int initialDifference = Math.abs(numbers[0] - numbers[1]);
        int minIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            int currentDifference = Math.abs(numbers[i] - numbers[i + 1]);
            if (currentDifference < initialDifference) {
                initialDifference = currentDifference;
                minIndex = i;
            }
        }
        System.out.println("(" + minIndex + ", " + (minIndex + 1) + ")");
    }
}
