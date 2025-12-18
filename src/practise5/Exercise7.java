package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 7. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan bir xil qiymatga ega bo'lganlarini o'chiruvchi programma tuzilsin.
 * Faqat birinchi uchragani qoldirilsin.
 */
public class Exercise7 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (nums[k] == nums[i]) {
                    isDuplicate = true;
                    break;
                }
            }

            //if the element doesn't exist in the array, then we need to write it
            if (!isDuplicate) {
                nums[j] = nums[i];
                j++;
            }
        }
        int[] temp = new int[j];
        for (int i = 0; i < j; i++) {
            temp[i] = nums[i];
        }
        System.out.println(Arrays.toString(temp));
    }
}
