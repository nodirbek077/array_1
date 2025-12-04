package practice1;

import util.ArrayUtil;

/**
 * 23. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasida, chap qo'shnisidan katta bo'lgan elementlarining indeksini kamayish tartibida chiqaruvchi
 * va ularning sonini chiqaruvchi programma tuzilsin.
 */
public class Exercise23 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;
        int counter = 0;

        System.out.print("Chap qo'shnisidan katta bo'lgan elementlarning indeksi (kamayish tartibida): ");
        for (int i = n - 1; i > 0; i--) {
            if (numbers[i - 1] < numbers[i]) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Ularning soni: " + counter);
    }
}
