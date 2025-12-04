package practice1;

import util.ArrayUtil;

/**
 * 24. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan monoton o'suvchi oraliqlar sonini chiqaruvchi programma tuzilsin.
 * Namuna: [2,3,5,3,1,6]
 * Monoton o'suvchi oraliq 2ta. (2,3,5) (1,6)
 */
public class Exercise24 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

//        System.out.print(numbers[0] + " ");
        for (int i = 1; i < n - 1; i++) {
            if (numbers[i - 1] < numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
