package practise6;

import util.ArrayUtil;

import java.util.Arrays;

public class Exercise3 {
    //1089. Duplicate Zeros leetcode
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();

        int zeroes = 0;
        int n = nums.length - 1;

        //1. qancha nol sig'ishini hisoblab olishimiz kerak
        for (int i = 0; i <= n - zeroes; i++) {
            if (nums[i] == 0) {
                if (i == n - zeroes) {
                    nums[n] = 0;
                    n--;
                    break;
                }
                zeroes++;
            }
        }

        System.out.println("before z: " + zeroes);
        int last = n - zeroes;
        for (int i = last; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i + zeroes] = 0;
                zeroes--;
                nums[i + zeroes] = 0;
            } else {
                nums[i + zeroes] = nums[i];
            }
        }

        System.out.println("n: " + n);
        System.out.println("zeroes: " + zeroes);
        System.out.println(Arrays.toString(nums));
    }
}