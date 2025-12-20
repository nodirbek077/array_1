package practise6;
//Amaliyot: Massivni saralash

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 1. n ta elementdan tashkil topgan massiv berilgan.
 * Oddiy o'rin almashtirish (pufaksimon saralash) algoritmi orqali massivni o'sish tartibida chiqaruvchi programma tuzilsin.
 * Algoritm quyidagicha: Har bir element o'zidan keyin turgan elementlar bilan solishtiriladi.
 * Agar o'zidan keyin turgan element undan kichik bo'lsa ularni qiymati almashtiriladi.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        //[1, -2, 8, 16, -4, 11, 5]
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
