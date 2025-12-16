package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 9. n ta butun sonlardan iborat a massiv berilgan.
 * n ta elementdan tashkil topgan b massivni hosil qiling.
 * b massiv elementlari quyidagicha hosil qilinadi: b[k] = (a[0] + +a[k]) / k;
 */
public class Exercise9 {
    public static void main(String[] args) {
        double[] a = ArrayUtil.getArrayElementsDouble();
        double[] b = new double[a.length];

        //a = [1, 17, 8, -15, 61]
        //b[1] = (a[0]) / 0
        //b[1] = (a[0] + a[1]) / 1

        double sum = 0;
        for (int i = 1; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += a[j];
            }
            b[i] = sum / i;
        }

        System.out.println(Arrays.toString(b));
    }
}
