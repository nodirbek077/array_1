package practice1;

import util.ArrayUtil;

/**
 * 20. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv juft indeksli elementlari orasidan kichigini aniqlovchi programma tuzilsin.
 * min(a0, a2, a4, ...)
 */
public class Exercise20 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();

        int n = numbers.length;
        int min = numbers[0];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
        }
        System.out.print("Kichigi: " + min);
    }
}
