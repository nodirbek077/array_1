package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 2. n ta elementdan tashkil topgan a massiv berilgan.
 * b massivni hosil qiling. Agar a[i] < 5 bo'lsa, b[i] = 2 * a[i];
 * aks holda b[i] = a[i]/2;
 */
public class Exercise2 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        double[] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 5)
                b[i] = 2 * a[i];
            else
                b[i] = a[i] / 2.0;
        }
        System.out.println();
        System.out.println("Created array called b = " + Arrays.toString(b));
    }
}
