package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 8. n ta butun sonlardan iborat a massiv berilgan.
 * n ta elementdan tashkil topgan b massivni hosil qiling.
 * b massiv elementlari quyidagicha hosil qilinadi: b[k] = a[0] + ... + a[k];
 */
public class Exercise8 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = new int[a.length];

        //[1, -7, 8, 14, 81, 15]
        //b[0] = a[0];
        //b[1] = a[0] + a[1];
        //b[2] = a[0] + a[1] + a[2];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += a[j];
            }
            b[i] = sum;
            System.out.println("b[" + i + "]= " + b[i]);
        }
        System.out.println(Arrays.toString(b));
    }
}
