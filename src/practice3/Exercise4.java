package practice3;

import util.ArrayUtil;

import java.util.Arrays;

/**
 * 4. n ta elementdan iborat massiv berilgan.
 * Massivning eng kichik va eng katta elementlari o'rni almashtirilsin.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;
        int min = numbers[0];
        int max = numbers[0];
        int minIndex = 0;
        int maxIndex = 0;

        //1. find the minimum and maximum element
        for (int i = 1; i < arrayLength; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);

        //2. set minimum and maximum number to array
        for (int i = 0; i < arrayLength; i++) {
            numbers[minIndex] = max;
            numbers[maxIndex] = min;
        }

        //3. get all array elements
        System.out.println(Arrays.toString(numbers));
    }
}
