package practice1;

import util.ArrayUtil;

public class Exercise26 {
    public static void main(String[] args) {
        int[] numbers = ArrayUtil.getArrayElements();
        int arrayLength = numbers.length;

        //input: int[] numbers = [1, 2, 3, 4, 5, 6];
        //output: (5, 6)

        if (arrayLength < 2){
            System.out.println("Array length must be 2");
            return;
        }

//        int tempSum = 0;

        int maxSum = numbers[0] + numbers[1];
        int maxIndex = 0;

        for (int i = 0; i < arrayLength - 1; i++) {

            int currentSum = numbers[i] + numbers[i + 1];

            //i = 2, sum = 49
            if (currentSum > maxSum) {
                maxSum = currentSum;
//                System.out.print(sum + " " + "(" + numbers[i] + ", " + numbers[i + 1] + ")");
                maxIndex = i;
            }

            // example array: [1, 2, 4, 45]
//            tempSum = sum;//sum = 3 => tempSum = 3
        }

        int element1 = numbers[maxIndex];
        int element2 = numbers[maxIndex + 1];

        System.out.println("Element 1: " + element1);
        System.out.println("Element 2: " + element2);
    }
}
