package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 3. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan toqlarini o'chiruvchi programma tuzilsin.
 * Hosil bo'lgan massiv elementlar soni va elementlari chiqarilsin.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        int n = nums.length;

        int[] temp = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                temp[index] = nums[i];
                index++;
            }
        }

        int[] temp2 = new int[index];
        for (int i = 0; i < index; i++) {
            temp2[i] = temp[i];
        }
        System.out.println("The number of elements in the array: " + index);
        System.out.println("The elements of an array: " + Arrays.toString(temp2));
    }
}
