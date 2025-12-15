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
        int[] tempArr = new int[a.length];

        //[1, 6, 8, 10]
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                tempArr[index] = a[i];
                index++;
            }
        }

        int[] b = new int[index];
        for (int i = 0; i < index; i++) {
            b[i] = tempArr[i];
        }
        System.out.println("New created array: " + Arrays.toString(b));
        System.out.println("Number of elements in array: " + index);
    }
}
