package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 3. n ta elementdan tashkil topgan a va b massiv berilgan.
 * c massivni hosil qiling. c[i] = max (a [i], b[i]),
 * ya'ni c massiv elementi a va b massiv elementlaridan kattasini qabul qilsin.
 */
public class Exercise3 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = ArrayUtil.getArrayElements();

        if (a.length != b.length) {
            System.out.println("Arrays are not equal");
            return;
        }

        int[] c = new int[a.length];
        for (int i = 0; i < c.length; i++) {
            if (a[i] > b[i])
                c[i] = a[i];
            else
                c[i] = b[i];
        }
        System.out.println("Created array called c = " + Arrays.toString(c));
    }
}
