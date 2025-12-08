package practice1;

import util.ArrayUtil;

/**
 * 32. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan o'ng qo'shnisidan katta bo'lganlar sonini chiqaruvchi programma tuzilsin.
 */
public class Exercise32 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        int counter = 0;
        for (int i = 1; i < arrayLength; i++) {
            if (numbers[i - 1] > numbers[i]) {
                counter++;
            }
        }
        System.out.println("O'ng qo'shnisidan katta bo'lgan elementlar soni: " + counter);
    }
}
