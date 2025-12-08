package practice1;

import util.ArrayUtil;

/*
30. n ta elementdan tashkil topgan massiv berilgan.
  Massivda qatnashgan sonlardan faqat bittadan chiqaruvchi programma tuzilsin.
  Berilgan massiv: [7,4,2,3,1,4,5,2,4,7];
  Natija:           7 4 2 3 1 5
 */
public class Exercise30 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        for (int i = 0; i < arrayLength; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(numbers[i] + " ");
            }
        }
    }
}
