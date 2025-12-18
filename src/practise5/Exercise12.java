package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 12. n ta elementdan tashkil topgan massiv berilgan.
 * Massivning har bir manfiy elementidan keyin,
 * qiymati nolga teng element qo'shuvchi programma tuzilsin.
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        int newValue = 0;

        //1/ count negative numbers then
        int negativeCount = 0;
        for (int x : nums) {
            if (x < 0) {
                negativeCount++;
            }
        }

        //2. create new expanded array
        int[] result = new int[nums.length + negativeCount];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                result[j++] = nums[i];
                result[j++] = newValue;
            }else {
                result[j++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }
}
