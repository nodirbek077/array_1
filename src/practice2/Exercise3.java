package practice2;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int n = 5;
        int A = 2;
        int D = 3;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = A;
            A += D;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
