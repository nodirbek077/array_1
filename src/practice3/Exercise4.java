package practice3;

import util.ArrayUtil;

/**
 * 4. n ta elementdan iborat massiv berilgan.
 * Massivning eng kichik va eng katta elementlari o'rni almashtirilsin.
 */
public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;
        int min = numbers[0];

        for (int i = 1; i < arrayLength; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                System.out.println(min);
            }
        }
    }
}
