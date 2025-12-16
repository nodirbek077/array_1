package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 13. 5 ta elementdan tashkil topgan a va b massivlari berilgan.
 * Har bir massiv elementlari o'sish tartibida kiritiladi.
 * 10 ta elementdan tashkil topgan c massivini hosil qilingki, c massiv elementlari o'sish tartibida joylashtirilgan bo'lsin.
 * Masalan: a = {1, 2, 3, 4}; b = {5, 6, 7, 8}; Natija c = {1, 2, 3, 4, 5, 6, 7, 8}
 */
public class Exercise13 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElementsWithAscendingOrder();
        int[] b = ArrayUtil.getArrayElementsWithAscendingOrder();

        if (a[a.length - 1] > b[0]) {
            System.out.println("Enter b array beginning with greater that a array last element. That's to say in ascending order!");
            return;
        }

        int[] c = new int[a.length + b.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            c[index] = a[i];
            index++;
        }

        for (int i = 0; i < b.length; i++) {
            c[index] = b[i];
            index++;
        }

        System.out.println(Arrays.toString(c));
    }
}
