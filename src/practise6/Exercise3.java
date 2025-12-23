package practise6;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 3. n ta elementdan tashkil topgan massiv berilgan.
 * Oddiy qo'shish (insertion sort) algoritmi orqali massivni o'sish tartibida chiqaruvchi programma tuzilsin.
 * Algoritm quyidagicha: a[0]va a[1] elementlar o'sish tartibida joylashtiriladi. Ya'ni zarurat bo'lsa qiymatlari almashtiriladi.
 * Keyin a[2] element saralangan elementlar (a[0], a[1]) orasiga shunday joylashtiriladiki,
 * natijada a[0], a[1], a[2] tartiblangan xolatda bo'ladi.
 * Shu tartibda har bir element tartiblangan elementlar orasiga qo'shib boriladi.
 * Example: [3, 1, 8, 4, 2, 7]
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] nums = ArrayUtil.getArrayElements();
        for (int i = 1; i < nums.length; i++) {
            int j = i - 1;
            int key = nums[i];
            while (j >= 0 && key < nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        System.out.println(Arrays.toString(nums));
    }
}