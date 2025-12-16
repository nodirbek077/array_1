package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 11. n ta butun sonlardan iborat a massiv berilgan. n ta elementdan tashkil topgan b massivni hosil qiling.
 * b massiv elementlari quyidagicha hosil qilinadi: b[k] a massivning k – elementdan boshlab massiv oxirigacha
 * bo'lgan elementlari yig'indisining o'rta arifmetigiga teng.
 */
public class Exercise11 {
    public static void main(String[] args) {
        double[] a = ArrayUtil.getArrayElementsDouble();
        double[] b = new double[a.length];

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                sum += a[j];
            }
            b[i] = sum / (a.length - i);
            sum = 0;
        }

        System.out.println(Arrays.toString(b));
    }
}
