package practise4;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 4. n ta elementdan iborat butun sonlardan tashkil topgan a massiv berilgan.
 * a massivning juft elementlaridan tashkil topgan b massivini hosil qiling.
 * b massiv elementlari soni va elementlari chiqarilsin.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] a = ArrayUtil.getArrayElements();
        int[] b = new int[a.length];

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
