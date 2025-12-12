package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 11. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlarini bir qadam o'ngga siljituvchi programma tuzilsin.
 * a[0] element qiymati a[1] ga o'tadi, a[1] esa a[2] ga, ... massivning oxirgi elementi tashlab yuboriladi.
 * Hosil bo'lgan massivda a[0] = 0 bo'lsin.
 */
public class Exercise11 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

        //1. set i element to i + 1 element
        for (int i = 0; i < n - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        //2, set zero to first element
        numbers[0] = 0;

        //3. we ignore the last element, so need to open new array
        int newArrayLength = n - 1;
        int[] newArrayNumbers = new int[newArrayLength];
        System.arraycopy(numbers, 0, newArrayNumbers, 0, newArrayLength);

        System.out.println(Arrays.toString(newArrayNumbers));
    }
}
