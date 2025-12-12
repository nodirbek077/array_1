package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 12. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlarini bir qadam chapga siljituvchi programma tuzilsin.
 * a[n-1] element qiymati a[n-2] ga o'tadi,
 * a[n-2] esa a[n-3] ga, ... massivning 0 - elementi tashlab yuboriladi.
 * Hosil bo'lgan massivning oxirgi elementi qiymati nolga teng bo'lsin.
 */
public class Exercise12 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        /*//1. set i element to i + 1 element
        for (int i = 1; i < n - 1; i++) {
            numbers[i - 1] = numbers[i];
        }*/

        //1. we ignore the last element, so need to open new array
        int newArrayLength = n - 1;
        int[] newArrayNumbers = new int[newArrayLength];
        //manual array copy
        /*
        for (int i = 0; i < n-1; i++) {
            newArrayNumbers[i] = numbers[i + 1];
        }
         */
        System.arraycopy(numbers, 1, newArrayNumbers, 0, n - 1);

        //2. set i element to i + 1 element
        for (int i = 1; i < n - 1; i++) {
            newArrayNumbers[i - 1] = newArrayNumbers[i];
        }

        //3. set to zero last element
        newArrayNumbers[n-2]=0;

        System.out.println(Arrays.toString(newArrayNumbers));
    }
}
