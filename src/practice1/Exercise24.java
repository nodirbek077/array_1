package practice1;

import util.ArrayUtil;

/**
 * 24. n ta elementdan tashkil topgan massiv berilgan.
 * Massiv elementlari orasidan monoton o'suvchi oraliqlar sonini chiqaruvchi programma tuzilsin.
 * Namuna: [2,3,5,3,1,6]
 * Monoton o'suvchi oraliq 2ta. (2,3,5) (1,6)
 */
public class Exercise24 {
    /**
     * Explanation with simple example:
     *
     * @input: int[] numbers = [2, 3, 5, 6, 2, 8];
     * @output: (2, 3, 5) (2, 8)
     * Step-1. For display all the array elements, we can use for. In here, the iteration of the last element will be (arrayLength - 1)
     * Step-2. Clarify where new intervals will start and count to one increment them from starting point
     * Step-3. Continue to implement another checking part step by step until displaying expected output
     */
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();//get array from special util
        int arrayLength = numbers.length;

        System.out.println();
        System.out.println("--- Result ---");
        System.out.print("Monotonically increasing intervals: ");

        //count intervals: [1, 2, 3] => 1
        int intervalsCount = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            boolean newIntervalStarting;

            //Starting condition: numbers[i] < numbers[i + 1]
            if (numbers[i] < numbers[i + 1])
                newIntervalStarting = i == 0 || numbers[i - 1] >= numbers[i];
            else
                newIntervalStarting = false;

            if (newIntervalStarting){
                intervalsCount++;

                System.out.print("(" + numbers[i]);

                int j = i + 1;

                while (j < arrayLength && numbers[j - 1] < numbers[j]) {
                    System.out.print(", " + numbers[j]);
                    j++;
                }

                System.out.print(")");

                if (j < arrayLength) {
                    System.out.print(" ");
                }

                i = j - 1;
            }
        }

        if (intervalsCount == 0) {
            System.out.print("Does not exist.");
        }

        System.out.println();
        System.out.print("Number of monotonically increasing intervals: " + intervalsCount);

    }
}
