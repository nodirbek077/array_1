package practise6;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 4. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlarini o'zgartirmasdan, uning indekslarini shunday chiqaringki,
 * bu indekslar ketmet-ketligida chiqarilgan massiv o'sish tartibida bo'lib qolsin.
 * Oddiy o'rin almashtirish algoritmidan foydalaning (Array112).
 * Massiv indekslarini o'zida saqlovchi yordamchi massivdan foydalanish mumkin.
 * Example: a: [3, 1, 8, 4, 2, 7],
 * b: [0, 1, 2, 3, 4, 5]
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = i;
        }

        System.out.println("b array with filled indexes: " + Arrays.toString(b));

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[b[i]] > a[b[j]]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        System.out.println("Unchanged a array: " + Arrays.toString(a));
        System.out.println("b array after changing: " + Arrays.toString(b));
    }
}
