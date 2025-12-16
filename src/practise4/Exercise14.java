package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 14. n ta elementdan tashkil topgan a, b, c massivlari berilgan.
 * Har bir massiv elementlari mos ravishda o'sish tartibida kiritiladi.
 * 3*n ta elementdan tashkil topgan d massivini hosil qilingki, d massiv elementlari o'sish tartibida joylashtirilgan bo'lsin.
 */
public class Exercise14 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElementsWithAscendingOrder();
        int[] b = ArrayUtil.getArrayElementsWithAscendingOrder();
        int[] c = ArrayUtil.getArrayElementsWithAscendingOrder();

        if (a[a.length - 1] > b[0]) {
            System.out.println("Last element of a array is less than first element of b array. That's to say enter elements in ascending order!");
            return;
        }

        if (b[b.length - 1] > c[0]) {
            System.out.println("Last element of b array is less than first element of c array. That's to say enter elements in ascending order!");
            return;
        }

        int[] d = new int[a.length + b.length + c.length];
        int index = 0;

        for (int i = 0; i < a.length; i++) {
            d[index] = a[i];
            index++;
        }

        for (int i = 0; i < b.length; i++) {
            d[index] = b[i];
            index++;
        }

        for (int i = 0; i < c.length; i++) {
            d[index] = c[i];
            index++;
        }
        System.out.println(Arrays.toString(d));
    }
}
