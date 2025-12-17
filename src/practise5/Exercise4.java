package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 4. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan juft indekslilarini o'chiruvchi programma tuzilsin.
 * Hosil bo'lgan massiv elementlar soni va elementlari chiqarilsin. Shart operatori ishlatilmasin.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        int n = nums.length;
        int index = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0){
                temp[index] = nums[i];
                index++;
            }
        }

        int[] temp1 = new int[index];
        for (int i = 0; i < index; i++) {
            temp1[i] = temp[i];
        }
        System.out.println("The number of elements in the array: " + index);
        System.out.println("Array elements: " + Arrays.toString(temp1));
    }
}
