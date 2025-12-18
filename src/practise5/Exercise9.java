package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 9. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan 2 martadan ko'p uchraganlarini o'chiruvchi programma tuzilsin.
 * Hosil bo'lgan massiv elementlar soni va elementlari chiqarilsin.
 */
public class Exercise9 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        int n = nums.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int counter = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    counter++;
                }
            }

            if (counter <= 2) {
                temp[index] = nums[i];
                index++;
            }
        }

        int[] temp2 = new int[index];
        for (int i = 0; i < index; i++) {
            temp2[i] = temp[i];
        }

        System.out.println(Arrays.toString(temp2));
    }
}
