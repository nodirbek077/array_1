package practise6;

import util.ArrayUtil;

/**
 * 2. n ta elementdan tashkil topgan massiv berilgan. Oddiy tanlash (selection sort) algoritmi orqali massivni o'sish tartibida
 * chiqaruvchi programma tuzilsin.
 * Algoritm quyidagicha: Har bir element o'zidan keyin turgan elementlarning eng kichigi bilan almashtiriladi.
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        //[1, -2, 8, 16, -4, 11, 5]
        int minIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] > nums[j]) {

                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
