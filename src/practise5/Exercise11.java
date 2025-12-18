package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 11. n ta elementdan tashkil topgan massiv berilgan.
 * Massivning har bir musbat elementi oldidan, qiymati nolga teng element qo'shuvchi programma tuzilsin.
 */

/**
 * Logikasi: massivning ixtiyoriy elementini olib musbatmi yo'qmi tekshiramiz agar musbat bo'lsa uning yoniga nolni
 * qo'shamiz va keyingi elementni bitta surib qo'yamiz
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        // [1, 2, 3, -1]
        // [0, 1, 0, 2, 0, 3, -1]

        int newValue = 0;

        //1. count positive numbers
        int positiveCount = 0;
        for (int x : nums) {
            if (x > 0) {
                positiveCount++;
            }
        }

        //2.create new expanded array
        int[] result = new int[nums.length + positiveCount];

        int j = 0; //index for new array
        for (int i = 0; i < nums.length; i++) {
            //if the element is positive
            if (nums[i] > 0) {
                result[j++] = newValue;
                result[j++] = nums[i];
            }//if the element is negative
            else {
                result[j++] = nums[i];
            }
        }
        System.out.println("Old array: " + Arrays.toString(nums));
        System.out.println("New array: " + Arrays.toString(result));
    }
}
