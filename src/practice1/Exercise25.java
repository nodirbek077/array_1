package practice1;

import util.ArrayUtil;

public class Exercise25 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();//get array from special util
        int arrayLength = numbers.length;

        System.out.println();
        System.out.println("--- Result ---");
        System.out.print("Monotonically decreasing intervals: ");

        //count intervals: [1, 2, 3] => 1
        int intervalsCount = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            boolean newIntervalStarting;

            //Starting condition: numbers[i] < numbers[i + 1]
            if (numbers[i] > numbers[i + 1])
                newIntervalStarting = i == 0 || numbers[i - 1] <= numbers[i];
            else
                newIntervalStarting = false;

            if (newIntervalStarting) {
                intervalsCount++;

                System.out.print("(" + numbers[i]);

                int j = i + 1;

                while (j < arrayLength && numbers[j - 1] > numbers[j]) {
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
        System.out.print("Number of monotonically decreasing intervals: " + intervalsCount);
    }
}
