package practice3;

import util.ArrayUtil;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 15. n ta elementdan tashkil topgan massiv berilgan.
 * Massivning  elementidan i o'sish tartibi joylashtirilgan.
 */
public class Exercise15 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int n = numbers.length;

/* when I don't know how do I solve this problem, I have tried with this
        int min = numbers[0];
        //[2, -1, 4, 9, -19, 40]
        //[-1,                    4, 9, -19, 40]

        //[-1, 2]
        //1. first we need to find the smallest number in the array
        for (int i = 1; i < n - 1; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Minimum number is " + min);

        numbers[0] = min;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 0; j < n - i; j++) {
                if (numbers[j] > numbers[i]) {
                    numbers[i] = numbers[j];
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
*/

        //this is a sorting algorithm. We now try to solve this by using selection sort algorithm
        /*int minIndex = numbers[0];
        for (int i = 0; i < n; i++) {
            if (numbers[i] < minIndex) {
                minIndex = numbers[i];
            }
        }*/

        for (int i = 0; i < n; i++) {
            int minIndex = i;

            //search from next element to last element (i + 1)
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
