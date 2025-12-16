package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 10. n ta butun sonlardan iborat a massiv berilgan.
 * n ta elementdan tashkil topgan b massivni hosil qiling.
 * b massiv elementlari quyidagicha hosil qilinadi: b[k] = a[k] + ... + a[n-1],
 * ya'ni a massivning k-elementdan boshlab massiv oxirigacha bo'lgan elementlari yig'indisiga teng.
 */
public class Exercise10 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = new int[a.length];

        //a = [1, 17, 8, 15, -61]
        //b[0] = a[0] + a[1] + a[2] + a[3] + a[4] = -20
        //b[1] = a[1] + a[2] + a[3] + a[4] = -21
        //b[2] = a[2] + a[3] + a[4] = -38
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum += a[j];
            }
            b[i] = sum;
            sum = 0;
        }

        System.out.println(Arrays.toString(b));
    }
}
