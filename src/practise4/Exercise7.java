package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 7. n ta butun sonlardan iborat a massiv berilgan.
 * b massivni hosil qiling.
 * b massiv oldin a massivining juft indeksdagi elementlarini,
 * keyin toq indeksdagi elementlarini o'zlashtirsin (a0, a2, a4, a6..., a1, a3, ...).
 * b massiv elementlarini chiqaruvchi programma tuzing. Shart operatori ishlatilmasin.
 */
public class Exercise7 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i += 2) {
            b[index] = a[i];
            index++;
        }

        for (int i = 1; i < a.length; i += 2) {
            b[index] = a[i];
            index++;
        }

        System.out.println(Arrays.toString(b));
    }
}
