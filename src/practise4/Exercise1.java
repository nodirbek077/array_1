package practise4;
//Amaliyot4: Birnechta massive bilan ishlash

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 1. n ta elementdan tashkil topgan a va b massiv berilgan.
 * a va b massiv qiymatlarini almashtiruvchi va ekranga oldin a massivni keyin b massivni
 * chiqaruvchi programma tuzilsin.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = ArrayUtil.getArrayElements();

        //explanation:
        //a = [1, 3, 7, 9, 15]
        //b = [2, 31, 17, 91, 151]

        //a = [2, 31, 17, 91, 151]
        //b = [1, 3, 7, 9, 15]
        System.out.println();
        System.out.println("Initial array called a = " + Arrays.toString(a));
        System.out.println("Initial array called b = " + Arrays.toString(b));

        //We solve this problem by considering 2 arrays' length are the same

        //1. Move first array element to another new array called c for example
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        System.out.println();
        System.out.println("Initial new created array called c = " + Arrays.toString(c));

        //2. change array called "a"
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
        System.out.println();
        System.out.println("Initial changed array called a = " + Arrays.toString(a));

        //3. change array called "b"
        for (int i = 0; i < b.length; i++) {
            b[i] = c[i];
        }
        System.out.println("Initial changed array called b = " + Arrays.toString(b));
    }
}
