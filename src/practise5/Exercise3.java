package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 3. n ta elementdan tashkil topgan massiv berilgan. Massiv elementlari orasidan toqlarini o'chiruvchi programma tuzilsin. Hosil bo'lgan massiv elementlar soni va elementlari chiqarilsin.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        //nums: [1, 1, 2]
        int counter = 0;
        int k = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]){
                    counter++;

                    if (counter == 1) {
                        nums[i + 1] = 0;
                        k = k - 1;
                    }
                }
            }
//            counter = 0;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
