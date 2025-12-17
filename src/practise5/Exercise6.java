package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 6. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan bir xil qo'shnilarning birini o'chiruvchi programma tuzilsin.
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        int n = nums.length;

        //shunaqa qilib ancha vaqtda o'zim shug'ullanib ko'rganimda o'xshamadi, keyin internetdan yozdim
        /*int index = 0;
        int[] temp = new int[n];

        //a = [1, 1, 3, -2, -2, 6]
        //b = [1, 3, -2, 6]
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                temp[index] = 0;
                temp[index] = nums[i+1];
            } else {
                temp[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));*/

        if (n <= 1) {
            System.out.println(Arrays.toString(nums));
            return;
        }

        //1. clarifying temp array length
        int tempLength = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                tempLength++;
            }
        }

        int[] temp = new int[tempLength];
        temp[0] = nums[0];
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                temp[index] = nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}
