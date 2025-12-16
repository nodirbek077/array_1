package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 12. n ta butun sonlardan iborat a massiv berilgan.
 * a massivning musbat elementlaridan tashkil topgan b va manfiy elementlaridan tashkil topgan c massivni hosil qiling.
 * Oldin b massiv elementlari soni va elementlarini, keyin c massiv elementlari soni va elementlarini chiqaruvchi programma tuzilsin
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();

        int[] temp = new int[a.length];

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                temp[index] = a[i];
                index++;
            }
        }

        int[] b = new int[index];
        for (int i = 0; i < index; i++) {
            b[i] = temp[i];
        }
        System.out.println("The number of elements in b array: " + index);
        System.out.println("The elements of b array: " + Arrays.toString(b));

        //c array started
        index = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0){
                temp[index] = a[i];
                index++;
            }
        }

        int[] c = new int[index];
        for (int i = 0; i < index; i++) {
            c[i] = temp[i];
        }
        System.out.println("The number of elements in c array: " + index);
        System.out.println("The elements of c array: " + Arrays.toString(c));
    }
}
