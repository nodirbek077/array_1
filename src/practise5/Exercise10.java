package practise5;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 10. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan faqat 2 marta uchraganlarini o'chiruvchi programma tuzilsin.
 * Hosil bo'lgan massiv elementlar soni va elementlari chiqarilsin.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        int[] temp = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]){
                    counter++;
                }
            }

            if (counter != 2) {
                temp[index] = nums[i];
                index++;
            }
        }

        int[] temp2 = new int[index];
        for (int i = 0; i < index; i++){
            temp2[i] = temp[i];
        }

        System.out.println(Arrays.toString(temp2));
    }
}
