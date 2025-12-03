package practice1;

import util.ArrayUtil;

public class Exercise19 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();

        int arrayLength = numbers.length;
        if (numbers[0] < 0) {
            System.out.print(numbers[0]);
            return;
        }

        if (arrayLength == 2 && numbers[1] > 0) {
            System.out.print(numbers[1]);
            return;
        }

        if (arrayLength == 1) {
            System.out.println(numbers[0]);
            return;
        }

        boolean isNegativePositive = false;

        for (int i = 2; i < arrayLength; i++) {
            int expectedResult = numbers[i] * numbers[i - 1];
            isNegativePositive = expectedResult < 0;
        }

        if (isNegativePositive) {
            System.out.print("Massivning barcha raqamlari (+) va (-) bilan almashib keladi: " + 0);
        }
    }
}
