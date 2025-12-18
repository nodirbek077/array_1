package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 13. n ta elementdan tashkil topgan massiv berilgan.
 * Massivga, massivning toq elementlarini 2 marta qo'shuvchi programma tuzilsin.
 */
public class Exercise14 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        //1. count odd elements in array
        int countOddElement = 0;
        for (int x : nums) {
            if (x % 2 == 1) {
                countOddElement++;
            }
        }

        //2. create new array
        int[] result = new int[nums.length + countOddElement];

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            result[j++] = nums[i];

            if (nums[i] % 2 != 0) {
                result[j++] = nums[i];
            }
        }

        System.out.println("Old array: " + Arrays.toString(nums));
        System.out.println("New array: " + Arrays.toString(result));
    }
}
