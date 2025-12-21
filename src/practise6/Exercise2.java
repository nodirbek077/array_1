package practise6;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 2. n ta elementdan tashkil topgan massiv berilgan. Oddiy tanlash (selection sort) algoritmi orqali massivni o'sish tartibida
 * chiqaruvchi programma tuzilsin.
 * Algoritm quyidagicha: Har bir element o'zidan keyin turgan elementlarning eng kichigi bilan almashtiriladi.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        //[3, 1, 8, 4, 2, 7]
        for (int i = 0; i < nums.length; i++) {
//            System.out.println("i = " + i);
            int min = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    System.out.println(i + ", min:" + min);
                }
            }

//            System.out.println(minIndex);
/*
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[minIndex]) {
                    int temp = nums[i];
                    nums[i] = nums[minIndex];
                    nums[minIndex] = temp;
                }
            }*/
        }
//        System.out.println(Arrays.toString(nums));
    }
}
