package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 6. n ta butun sonlardan iborat a massiv berilgan (n<= 15).
 * a massivining 3 ga karrali indeksdagi elementlaridan b massivni hosil qiling (a3, a6, ...).
 * b massiv elementlari soni va elementlarini chiqaruvchi programma tuzing.
 * Shart operatori ishlatilmasin.
 */
public class Exercise6 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] temp = new int[a.length];
        int index = 0;

        for (int i = 0; i < a.length; i += 3) {
            temp[index] = a[i];
            index++;
        }
        System.out.println("Temporary array elements: " + Arrays.toString(temp));

        int[] b = new int[index];
        for (int i = 0; i < index; i++) {
            b[i] = temp[i];
        }
        System.out.println("b array elements: " + Arrays.toString(b));
        System.out.println("Number of elements in array: " + index);
    }
}
