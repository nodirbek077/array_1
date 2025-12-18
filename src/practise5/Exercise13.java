package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 13. n ta elementdan tashkil topgan massiv berilgan.
 * Massivga, massivning juft elementlarini qo'shuvchi programma tuzilsin.
 */
public class Exercise13 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        //[1, 2, 3, 4, 7]
        //[1, 2, 3, 4, 7, 2, 4]

        //1. count even elements in array
        int evenElementCount = 0;
        for (int x : nums) {
            if (x % 2 == 0) {
                evenElementCount++;
            }
        }

        //2. create new array
        int[] result = new int[nums.length + evenElementCount];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            result[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }
}
