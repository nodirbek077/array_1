package practice2;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        int n = 7;
        int[] numbers = new int[n];
        int A = 2;
        int B = 4;
        numbers[0] = A;
        numbers[1] = B;
        int num = A + B;
        numbers[2] = num;

        for (int i = 3; i < n; i++) {
            num = 2 * num;
            numbers[i] = num;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
