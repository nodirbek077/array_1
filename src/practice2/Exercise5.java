package practice2;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int n = 9;
        int[] numbers = new int[n];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        System.out.println(Arrays.toString(numbers));
    }
}
