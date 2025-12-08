package practice1;

import util.ArrayUtil;

/**
 * 31. n ta elementdan tashkil topgan massiv berilgan.
 * Massivda eng ko'p qatnashgan bir xil qiymatli element sonini chiqaruvchi programma tuzilsin.
 * Berilgan massiv: [7,4,2,7,1,4,7,2,4,7];
 * Natija: 4.  (7 soni 4marta bor)
 */
public class Exercise31 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        int counter = 0;
        int maxCounter = 0;
        int index = 0;
        for (int i = 0; i < arrayLength; i++) {
            for (int number : numbers) {
                if (numbers[i] == number) {
                    counter++;
                }
            }
            if (maxCounter < counter) {
                maxCounter = counter;
                index = i;
            }
            counter = 0;
        }
        System.out.println(maxCounter + " ta. (" + numbers[index] + " soni " + maxCounter + " marta bor" + ")");
    }
}
