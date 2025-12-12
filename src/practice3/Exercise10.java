package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 10. n ta sonlardan iborat a massiv berilgan.
 * Massivning har bir elementini, uning o'ng qo'shnisi bilan
 * o'rta arifmetigiga almashtiruvchi programma tuzilsin.
 */
public class Exercise10 {
    public static void main(String[] args) {
        double[] numbers = ArrayUtil.getArrayElementsDouble();
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            numbers[i] = (numbers[i] + numbers[i + 1]) / 2;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
